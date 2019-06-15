/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Usuario;
import Model.UsuarioDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jerte
 */
public class JFCadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public JFCadastro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        btn_confirmar_cadastro = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        lb_logo = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jSeparator19 = new javax.swing.JSeparator();
        lb_smartstock = new javax.swing.JLabel();
        lb_catchfrase = new javax.swing.JLabel();
        txtApelido = new javax.swing.JTextField();
        lb_telefone = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lb_apelido = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        lb_nome = new javax.swing.JLabel();
        sp_nome = new javax.swing.JSeparator();
        txtTelefone = new javax.swing.JTextField();
        lb_pg_title = new javax.swing.JLabel();
        sp_telefone = new javax.swing.JSeparator();
        txtEndereco = new javax.swing.JTextField();
        sp_endereco = new javax.swing.JSeparator();
        lb_endereco = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        sp_email = new javax.swing.JSeparator();
        lb_email = new javax.swing.JLabel();
        lb_senha = new javax.swing.JLabel();
        lb_cf_senha = new javax.swing.JLabel();
        sp_password = new javax.swing.JSeparator();
        sp_cf_password = new javax.swing.JSeparator();
        btn_voltar = new javax.swing.JButton();
        txtCfPassword = new javax.swing.JPasswordField();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(810, 550));

        bg.setBackground(new java.awt.Color(36, 47, 65));
        bg.setMinimumSize(new java.awt.Dimension(0, 0));
        bg.setPreferredSize(new java.awt.Dimension(810, 550));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_confirmar_cadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/plus_32.png"))); // NOI18N
        btn_confirmar_cadastro.setText("Cadastrar");
        btn_confirmar_cadastro.setMaximumSize(new java.awt.Dimension(140, 45));
        btn_confirmar_cadastro.setMinimumSize(new java.awt.Dimension(140, 45));
        btn_confirmar_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmar_cadastroActionPerformed(evt);
            }
        });
        bg.add(btn_confirmar_cadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 140, 40));

        jPanel8.setBackground(new java.awt.Color(1, 163, 164));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lb_logo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lb_logo.setForeground(new java.awt.Color(204, 204, 204));
        lb_logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/diet.png"))); // NOI18N
        jPanel8.add(lb_logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jSeparator18.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 260, 10));

        jSeparator19.setForeground(new java.awt.Color(255, 255, 255));
        jPanel8.add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 440, 280, 10));

        lb_smartstock.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        lb_smartstock.setForeground(new java.awt.Color(255, 255, 255));
        lb_smartstock.setText("Smart Stock");
        jPanel8.add(lb_smartstock, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, -1, -1));

        lb_catchfrase.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lb_catchfrase.setForeground(new java.awt.Color(255, 255, 255));
        lb_catchfrase.setText("Planeje sua geladeira");
        jPanel8.add(lb_catchfrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        bg.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 550));

        txtApelido.setBackground(new java.awt.Color(36, 47, 65));
        txtApelido.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtApelido.setForeground(new java.awt.Color(204, 204, 204));
        txtApelido.setText("Digite Seu Apelido");
        txtApelido.setBorder(null);
        txtApelido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtApelido.setFocusCycleRoot(true);
        txtApelido.setMaximumSize(new java.awt.Dimension(1, 1));
        txtApelido.setMinimumSize(new java.awt.Dimension(1, 1));
        txtApelido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtApelidoMouseClicked(evt);
            }
        });
        txtApelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApelidoActionPerformed(evt);
            }
        });
        txtApelido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtApelidoKeyPressed(evt);
            }
        });
        bg.add(txtApelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 240, 20));

        lb_telefone.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lb_telefone.setForeground(new java.awt.Color(255, 255, 255));
        lb_telefone.setText("TELEFONE");
        bg.add(lb_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, -1, -1));

        txtNome.setBackground(new java.awt.Color(36, 47, 65));
        txtNome.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNome.setForeground(new java.awt.Color(204, 204, 204));
        txtNome.setText("Digite Seu Nome");
        txtNome.setBorder(null);
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNome.setFocusCycleRoot(true);
        txtNome.setMaximumSize(new java.awt.Dimension(1, 1));
        txtNome.setMinimumSize(new java.awt.Dimension(1, 1));
        txtNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNomeMouseClicked(evt);
            }
        });
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });
        bg.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 240, 20));

        lb_apelido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lb_apelido.setForeground(new java.awt.Color(255, 255, 255));
        lb_apelido.setText("APELIDO");
        bg.add(lb_apelido, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));

        jSeparator12.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 240, 10));

        lb_nome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lb_nome.setForeground(new java.awt.Color(255, 255, 255));
        lb_nome.setText("NOME");
        bg.add(lb_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, -1, -1));

        sp_nome.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(sp_nome, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 240, 10));

        txtTelefone.setBackground(new java.awt.Color(36, 47, 65));
        txtTelefone.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(204, 204, 204));
        txtTelefone.setText("Digite Seu Telefone");
        txtTelefone.setBorder(null);
        txtTelefone.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtTelefone.setFocusCycleRoot(true);
        txtTelefone.setMaximumSize(new java.awt.Dimension(1, 1));
        txtTelefone.setMinimumSize(new java.awt.Dimension(1, 1));
        txtTelefone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTelefoneMouseClicked(evt);
            }
        });
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        txtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefoneKeyPressed(evt);
            }
        });
        bg.add(txtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 240, 20));

        lb_pg_title.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lb_pg_title.setForeground(new java.awt.Color(204, 204, 204));
        lb_pg_title.setText("Cadastrar");
        bg.add(lb_pg_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));

        sp_telefone.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(sp_telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 240, 10));

        txtEndereco.setBackground(new java.awt.Color(36, 47, 65));
        txtEndereco.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtEndereco.setForeground(new java.awt.Color(204, 204, 204));
        txtEndereco.setText("Digite Seu Endereço");
        txtEndereco.setBorder(null);
        txtEndereco.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEndereco.setFocusCycleRoot(true);
        txtEndereco.setMaximumSize(new java.awt.Dimension(1, 1));
        txtEndereco.setMinimumSize(new java.awt.Dimension(1, 1));
        txtEndereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEnderecoMouseClicked(evt);
            }
        });
        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });
        txtEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEnderecoKeyPressed(evt);
            }
        });
        bg.add(txtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, 240, 20));

        sp_endereco.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(sp_endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 240, 10));

        lb_endereco.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lb_endereco.setForeground(new java.awt.Color(255, 255, 255));
        lb_endereco.setText("ENDEREÇO");
        bg.add(lb_endereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        txtEmail.setBackground(new java.awt.Color(36, 47, 65));
        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(204, 204, 204));
        txtEmail.setText("Digite Seu E-mail");
        txtEmail.setBorder(null);
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.setFocusCycleRoot(true);
        txtEmail.setMaximumSize(new java.awt.Dimension(1, 1));
        txtEmail.setMinimumSize(new java.awt.Dimension(1, 1));
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmailMouseClicked(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });
        bg.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 240, 20));

        sp_email.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(sp_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 240, 10));

        lb_email.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lb_email.setForeground(new java.awt.Color(255, 255, 255));
        lb_email.setText("E-MAIL");
        bg.add(lb_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        lb_senha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lb_senha.setForeground(new java.awt.Color(255, 255, 255));
        lb_senha.setText("SENHA");
        bg.add(lb_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        lb_cf_senha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lb_cf_senha.setForeground(new java.awt.Color(255, 255, 255));
        lb_cf_senha.setText("CONFIRMAR SENHA");
        bg.add(lb_cf_senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));

        sp_password.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(sp_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 350, 190, 10));

        sp_cf_password.setForeground(new java.awt.Color(255, 255, 255));
        bg.add(sp_cf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 390, 190, 20));

        btn_voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/cancel_32.png"))); // NOI18N
        btn_voltar.setText("Cancelar");
        btn_voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_voltarActionPerformed(evt);
            }
        });
        bg.add(btn_voltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, 130, -1));
        bg.add(txtCfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 370, 180, -1));
        bg.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 180, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_voltarActionPerformed
         this.setVisible(false);
         new JFLogin().setVisible(true);
    }//GEN-LAST:event_btn_voltarActionPerformed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseClicked
       txtEmail.setText("");
    }//GEN-LAST:event_txtEmailMouseClicked

    private void txtEnderecoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEnderecoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoKeyPressed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtEnderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEnderecoMouseClicked
        txtEndereco.setText("");
    }//GEN-LAST:event_txtEnderecoMouseClicked

    private void txtTelefoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefoneKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneKeyPressed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtTelefoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefoneMouseClicked
        txtTelefone.setText("");
    }//GEN-LAST:event_txtTelefoneMouseClicked

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed

    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNomeMouseClicked
        txtNome.setText("");
    }//GEN-LAST:event_txtNomeMouseClicked

    private void txtApelidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApelidoKeyPressed
        
    }//GEN-LAST:event_txtApelidoKeyPressed

    private void txtApelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApelidoActionPerformed

    private void txtApelidoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApelidoMouseClicked
        txtApelido.setText("");
    }//GEN-LAST:event_txtApelidoMouseClicked

    private void btn_confirmar_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmar_cadastroActionPerformed
        
        if(txtPassword.getText().equals(txtCfPassword.getText()))
        {
            Usuario usuario = new Usuario();
        usuario.setNome(txtNome.getText());
        usuario.setApelido(txtApelido.getText());
        usuario.setTelefone(txtTelefone.getText());
        usuario.setEndereco(txtEndereco.getText());
        usuario.setEmail(txtEmail.getText());
        usuario.setSenha(txtPassword.getText());
        
        UsuarioDAO userDao = new UsuarioDAO();
            try {
                userDao.Inserir(usuario);
                this.setVisible(false);
                new JFLogin().setVisible(true);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro no Banco de dados"+"\n"+ex);
            }
        }else
        {
            JOptionPane.showMessageDialog(null, "Confirme sua senha corretamente" );
        }
        
        
        
    }//GEN-LAST:event_btn_confirmar_cadastroActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_confirmar_cadastro;
    private javax.swing.JButton btn_voltar;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JLabel lb_apelido;
    private javax.swing.JLabel lb_catchfrase;
    private javax.swing.JLabel lb_cf_senha;
    private javax.swing.JLabel lb_email;
    private javax.swing.JLabel lb_endereco;
    private javax.swing.JLabel lb_logo;
    private javax.swing.JLabel lb_nome;
    private javax.swing.JLabel lb_pg_title;
    private javax.swing.JLabel lb_senha;
    private javax.swing.JLabel lb_smartstock;
    private javax.swing.JLabel lb_telefone;
    private javax.swing.JSeparator sp_cf_password;
    private javax.swing.JSeparator sp_email;
    private javax.swing.JSeparator sp_endereco;
    private javax.swing.JSeparator sp_nome;
    private javax.swing.JSeparator sp_password;
    private javax.swing.JSeparator sp_telefone;
    private javax.swing.JTextField txtApelido;
    private javax.swing.JPasswordField txtCfPassword;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
