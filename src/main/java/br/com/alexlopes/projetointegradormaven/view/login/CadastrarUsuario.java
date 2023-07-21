package br.com.alexlopes.projetointegradormaven.view.login;

import br.com.alexlopes.projetointegradormaven.dao.UsuarioDAO;
import br.com.alexlopes.projetointegradormaven.model.Usuario;
import br.com.alexlopes.projetointegradormaven.util.ClasseEmail;
import br.com.alexlopes.projetointegradormaven.util.Janelas;
import br.com.alexlopes.projetointegradormaven.util.Mensagem;
import br.com.alexlopes.projetointegradormaven.util.ValidarCPF;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class CadastrarUsuario extends javax.swing.JFrame {

    private boolean senhaVisivel = false;
    private boolean senhaVisivel2 = false;
    private final UsuarioDAO dao = new UsuarioDAO();
    private final Usuario usuario = new Usuario();

    public CadastrarUsuario() {
        initComponents();
        txtNome.requestFocus();
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                confirmarSaida();
            }
        });
    }

    private void confirmarSaida() {
        Object[] options = {"Sim", "Não"};
        int option = JOptionPane.showOptionDialog(this, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (option == JOptionPane.YES_OPTION) {
            dispose();
        } else {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane(){
            ImageIcon icon = new ImageIcon(getClass().getResource("/Imagem/fundoClaro.jpg"));
            Image image = icon.getImage();
            public void paintComponent(Graphics g){
                super.paintComponent(g); // Chama o método paintComponent da superclasse
                g.drawImage(image, 0,0, getWidth(), getHeight(),this);
            }
        };
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        txtConfirmarSenha = new javax.swing.JPasswordField();
        txtCPF = new javax.swing.JFormattedTextField();
        botaoVoltar = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        mostrarSenha = new javax.swing.JLabel();
        mostrarConfirmar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Cadastre-se");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Email:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Senha:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 0));
        jLabel6.setText("Confirmar Senha:");

        txtNome.setBackground(new java.awt.Color(255, 255, 255));
        txtNome.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(255, 255, 255));
        txtEmail.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        txtSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtSenha.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 0, 0));
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });

        txtConfirmarSenha.setBackground(new java.awt.Color(255, 255, 255));
        txtConfirmarSenha.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtConfirmarSenha.setForeground(new java.awt.Color(51, 0, 0));
        txtConfirmarSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmarSenhaKeyPressed(evt);
            }
        });

        txtCPF.setBackground(new java.awt.Color(255, 255, 255));
        txtCPF.setForeground(new java.awt.Color(0, 0, 0));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        txtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCPFKeyPressed(evt);
            }
        });

        botaoVoltar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botaoVoltar.setForeground(new java.awt.Color(0, 0, 0));
        botaoVoltar.setText("Voltar");
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoCadastrar.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        mostrarSenha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/mostrarSenha.png"))); // NOI18N
        mostrarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarSenhaMouseClicked(evt);
            }
        });

        mostrarConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagem/mostrarSenha.png"))); // NOI18N
        mostrarConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarConfirmarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome)
                            .addComponent(txtEmail)
                            .addComponent(txtCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSenha)
                                    .addComponent(txtConfirmarSenha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mostrarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(mostrarConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(17, 17, 17)))))
                .addGap(126, 126, 126))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNome)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPF)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmail)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostrarSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSenha)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostrarConfirmar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtConfirmarSenha)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleParent(this);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validaCpf() {
        String cpf = txtCPF.getText();
        cpf = cpf.replaceAll("[.\\-]", "");
        boolean a = ValidarCPF.validarCPF(cpf);
        if (!a) {
            Mensagem.mensagemErro("Este CPF não é válido");
            txtCPF.setText("");
            txtCPF.requestFocus();
            return false;
        } else {
            return true;
        }
    }

    private boolean validarCampos() {
        boolean cpfExiste = dao.verificarExistenciaUsuario(txtNome.getText());
        if (txtNome.getText().isEmpty()) {
            Mensagem.mensagemAlerta("O Campo Usuario não pode estar vazio");
            txtNome.requestFocus();
            return false;
        }
        if (txtCPF.getText().equals("   .   .   -  ")) {
            Mensagem.mensagemAlerta("O Campo CPF não pode estar vazio");
            txtCPF.requestFocus();
            return false;
        }
        if (txtEmail.getText().isEmpty()) {
            Mensagem.mensagemAlerta("O Campo Email não pode estar vazio");
            txtEmail.requestFocus();
            return false;
        }
        if (txtSenha.getPassword().length == 0) {
            Mensagem.mensagemAlerta("O Campo Senha não pode estar vazio");
            txtSenha.requestFocus();
            return false;
        } else if (txtSenha.getPassword().length > 0) {
            char[] senha1 = txtSenha.getPassword();
            boolean a = validarSenha(senha1);
            return a;
        }
        if (txtConfirmarSenha.getPassword().length == 0) {
            Mensagem.mensagemAlerta("O Campo Confirmar Senha não pode estar vazio");
            txtConfirmarSenha.requestFocus();
            return false;
        }
        if (!Arrays.equals(txtSenha.getPassword(), txtConfirmarSenha.getPassword())) {
            Mensagem.mensagemAlerta("O Campo Senha e Confirmar Senha não são iguais");
            return false;
        }
        if (cpfExiste) {
            Mensagem.mensagemAlerta("Este Usuário já está cadastrado");
            return false;
        }
        return true;
    }

    public static boolean validarSenha(char[] senha) {
        // Verifica se a senha tem pelo menos 8 caracteres
        if (senha.length < 8) {
            Mensagem.mensagemErro("A senha deve conter pelo menos 8 caracteres.");
            return false;
        }
        // Verifica se a senha contém pelo menos uma letra e um número
        String senhaString = new String(senha);
        Pattern padrao = Pattern.compile("(?=.*[a-zA-Z])(?=.*[0-9])[a-zA-Z0-9]+");
        Matcher matcher = padrao.matcher(senhaString);
        if (!matcher.matches()) {
            Mensagem.mensagemErro("A senha deve conter letra e número.");
            return false;
        }
        return true;
    }

    private boolean validarEmail() {
        ClasseEmail email = new ClasseEmail();
        String to = txtEmail.getText();
        String subject = "Cadastro de Usuário";
        String content = "";
        String a = email.emailValidarCadastro(to, subject, content);
        String b = JOptionPane.showInputDialog("Abra o seu email e copie o codigo.\n"
                + "Digite o codigo aqui:\n ");
        return a.equals(b);
    }

    private void mostrarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarSenhaMouseClicked
        txtSenha.setEchoChar('•');
        if (senhaVisivel) {
            txtSenha.setEchoChar('•');
            senhaVisivel = false;
        } else {
            txtSenha.setEchoChar((char) 0);
            senhaVisivel = true;
        }
    }//GEN-LAST:event_mostrarSenhaMouseClicked

    private void mostrarConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarConfirmarMouseClicked
        txtConfirmarSenha.setEchoChar('•');
        if (senhaVisivel2) {
            txtConfirmarSenha.setEchoChar('•');
            senhaVisivel2 = false;
        } else {
            txtConfirmarSenha.setEchoChar((char) 0);
            senhaVisivel2 = true;
        }
    }//GEN-LAST:event_mostrarConfirmarMouseClicked

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        this.dispose();
        Janelas.irEntrar();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        try {
            usuario.setNome(txtNome.getText());
            usuario.setCpf(txtCPF.getText());
            usuario.setEmail(txtEmail.getText());
            char[] senhaChars = txtSenha.getPassword();
            String senhamd5 = dao.calculateMD5(senhaChars);
            usuario.setSenha(senhamd5);

            if (validarCampos()) {
                if (validaCpf()) {
                    if (dao.verificarBancoDeDadosVazio()) {//SE O BD ESTIVER VAZIO O PRIMEIRO CADASTRO TERÁ A PERMISSÃO DE ADMINISTRADOR
                        usuario.setPermissao("Administrador");
                        if (validarEmail()) {
                            dao.cadastrar(usuario);
                            Mensagem.mensagemExito("Cadastro efetuado com Sucesso!");
                            this.dispose();
                            Janelas.irEntrar();
                        } else {
                            Mensagem.mensagemErro("Codigo Inválido");
                        }
                    } else {
                        usuario.setPermissao("Usuario");
                        if (validarEmail()) {
                            dao.cadastrar(usuario);
                            Mensagem.mensagemExito("Cadastro efetuado com Sucesso!");
                            this.dispose();
                            Janelas.irEntrar();
                        } else {
                            Mensagem.mensagemErro("Codigo Inválido");
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtCPF.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtCPFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCPFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtEmail.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtNome.requestFocus();
        }
    }//GEN-LAST:event_txtCPFKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtSenha.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtCPF.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER || evt.getKeyCode() == KeyEvent.VK_DOWN) {
            txtConfirmarSenha.requestFocus();
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void txtConfirmarSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmarSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            java.awt.event.ActionEvent evts = null;
            botaoCadastrarActionPerformed(evts);
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            txtSenha.requestFocus();
        }
    }//GEN-LAST:event_txtConfirmarSenhaKeyPressed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mostrarConfirmar;
    private javax.swing.JLabel mostrarSenha;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JPasswordField txtConfirmarSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
