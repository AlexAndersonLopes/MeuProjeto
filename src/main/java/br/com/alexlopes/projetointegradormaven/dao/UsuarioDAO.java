package br.com.alexlopes.projetointegradormaven.dao;

import br.com.alexlopes.projetointegradormaven.fabrica.FabricaJPA;
import br.com.alexlopes.projetointegradormaven.model.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.TypedQuery;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class UsuarioDAO {

    public void cadastrar(Usuario a) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    /**
     * Metodo que verifica se o nomeUsuario e a senha são da mesma pessoa
     *
     * @param nomeUsuario
     * @param senha
     * @return
     */
    public Usuario verificarCredenciais(String nomeUsuario, String senha) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            // Consulta o banco de dados para encontrar um usuário com o nome fornecido
            TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.nome = :nomeUsuario", Usuario.class);
            query.setParameter("nomeUsuario", nomeUsuario);
            Usuario usuario = query.getSingleResult();

            // Converte a senha fornecida em formato MD5
            String senhaMD5 = calculateMD5(senha.toCharArray());

            // Verifica se a senha fornecida em formato MD5 corresponde à senha do usuário encontrado
            if (senhaMD5.equals(usuario.getSenha())) {
                return usuario; // Credenciais válidas, retorna o objeto Usuario
            } else {
                return null; // Senha incorreta, retorna null
            }
        } catch (NoResultException e) {
            // Usuário não encontrado, retorna null
            return null;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public String calculateMD5(char[] password) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(new String(password).getBytes());
            byte[] digest = md.digest();
            BigInteger no = new BigInteger(1, digest);
            String hash = no.toString(16);
            while (hash.length() < 32) {
                hash = "0" + hash;
            }
            return hash;
        } catch (NoSuchAlgorithmException e) {
            // Trate a exceção adequadamente
            System.out.println(e);
        }
        return null;
    }

    /**
     * Verifica se o cpf já está cadastrado
     *
     * @param cpf
     * @return
     */
    public boolean verificarExistenciaUsuario(String cpf) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            // Consulta o banco de dados para encontrar um usuário com o nome fornecido
            TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.cpf = :cpf", Usuario.class);
            query.setParameter("cpf", cpf);
            List<Usuario> usuarios = query.getResultList();
            // Verifica se algum usuário foi encontrado
            return !usuarios.isEmpty();
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    /**
     * Busca um usuario pelo nome
     *
     * @param nomeUsuario
     * @return
     */
    public Usuario buscarPorNome(String nomeUsuario) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.nome = :nomeUsuario", Usuario.class);
            query.setParameter("nomeUsuario", nomeUsuario);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null; // Usuário não encontrado, retorna null
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    /**
     * Verifica se o banco de dados esta vazio
     *
     * @return
     */
    public boolean verificarBancoDeDadosVazio() {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            // Consulta o banco de dados para contar o número de usuários
            TypedQuery<Long> query = em.createQuery("SELECT COUNT(u) FROM Usuario u", Long.class);
            Long quantidadeUsuarios = query.getSingleResult();
            // Verifica se a quantidade de usuários é igual a zero
            return quantidadeUsuarios == 0;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    /**
     * Alterar a permissão de um usuario pesquisado pelo ID
     *
     * @param idUsuario
     * @param novaPermissao
     */
    public void alterarPermissaoUsuario(long idUsuario, String novaPermissao) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            em.getTransaction().begin();
            Usuario usuario = em.find(Usuario.class, idUsuario);
            if (usuario != null) {
                usuario.setPermissao(novaPermissao);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw e;
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public Usuario verificarCpfEmail(String cpf, String email) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            TypedQuery<Usuario> query = em.createQuery(
                    "SELECT u FROM Usuario u WHERE u.cpf = :cpf AND u.email = :email",
                    Usuario.class
            );
            query.setParameter("cpf", cpf);
            query.setParameter("email", email);
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null; // Usuário com o CPF ou e-mail fornecido não encontrado, retorna null
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

    public boolean alterarSenhaPorCpfEmail(String cpf, String email, String novaSenha) {
        EntityManager em = FabricaJPA.getEntityManager();
        try {
            TypedQuery<Usuario> query = em.createQuery(
                    "SELECT u FROM Usuario u WHERE u.cpf = :cpf AND u.email = :email",
                    Usuario.class
            );
            query.setParameter("cpf", cpf);
            query.setParameter("email", email);

            Usuario usuario = query.getSingleResult();

            if (usuario != null) {
                em.getTransaction().begin();
                usuario.setSenha(calculateMD5(novaSenha.toCharArray())); // Atualiza a senha com o novo valor
                em.getTransaction().commit();
                return true; // Senha alterada com sucesso
            } else {
                return false; // Usuário não encontrado com o CPF e e-mail fornecidos
            }
        } catch (NoResultException e) {
            return false; // Usuário não encontrado com o CPF e e-mail fornecidos
        } finally {
            FabricaJPA.closeEtityManager();
        }
    }

}
