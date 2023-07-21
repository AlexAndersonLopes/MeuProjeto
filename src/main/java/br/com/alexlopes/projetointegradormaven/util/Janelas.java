package br.com.alexlopes.projetointegradormaven.util;

import br.com.alexlopes.projetointegradormaven.model.Usuario;
import br.com.alexlopes.projetointegradormaven.view.login.CadastrarUsuario;
import br.com.alexlopes.projetointegradormaven.view.login.Entrar;
import br.com.alexlopes.projetointegradormaven.view.login.EsqueciSenha;
import br.com.alexlopes.projetointegradormaven.view.programa.MenuPrincipal;
import javax.swing.JFrame;

public class Janelas {

    private static Usuario usuario;

    public static void irEntrar() {
        Entrar a = new Entrar();
        a.setTitle("Tela de Login");
        a.setLocationRelativeTo(null);
        a.pack();
        a.setVisible(true);
    }

    public static void irCadastrarUsuario() {
        CadastrarUsuario a = new CadastrarUsuario();
        a.setTitle("Cadastro de Usuário");
        a.setLocationRelativeTo(null);
        a.pack();
        a.setVisible(true);
    }

    public static void irEsqueciSenha() {
        EsqueciSenha a = new EsqueciSenha();
        a.setTitle("Esqueci a Senha");
        a.setLocationRelativeTo(null);
        a.pack();
        a.setVisible(true);
    }

    public static void irMenuPrincipal(Usuario usu) {
        usuario = usu;
        MenuPrincipal a = new MenuPrincipal(usu);
        a.setTitle("Menu Principal");
        a.setExtendedState(JFrame.MAXIMIZED_BOTH);
        a.pack();
        a.setVisible(true);
    }

}
