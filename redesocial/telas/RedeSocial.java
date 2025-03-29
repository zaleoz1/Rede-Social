/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package redesocial.telas;

import java.util.ArrayList;
import redesocial.classes.Empresa;
import redesocial.classes.Pessoa;
import redesocial.classes.Usuario;

/**
 *
 * @author cliente
 */
public class RedeSocial extends javax.swing.JFrame {

    Pessoa pessoa_sessao;//facilitei na hora de puxar os dados de quem ta na sessão
    Empresa empresa_sessao;
    int quem;
    int id_sessao;

    Usuario admRS = new Usuario();
    String RedeSocial;

    /**
     * Creates new form RedeSocial
     */
    public RedeSocial() {
        initComponents();
    }

    public String emailA;

    public void RedeSocial() {
    }

    public String getEmail() {
        emailA = lblUsuario.getText();
        return emailA;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnUserList = new javax.swing.JButton();
        btnListaEmpresas = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        btnFriendList = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        btnAdcProd = new javax.swing.JButton();
        lblOutro = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("JavaBook");

        btnUserList.setText("Lista de pessoas");
        btnUserList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserListActionPerformed(evt);
            }
        });

        btnListaEmpresas.setText("Lista de empresas");
        btnListaEmpresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaEmpresasActionPerformed(evt);
            }
        });

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        jButton5.setText("Excluir Conta");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        lblUsuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblUsuario.setText("...");
        lblUsuario.setToolTipText("");

        btnFriendList.setText("Lista de amigos");
        btnFriendList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFriendListActionPerformed(evt);
            }
        });

        jButton1.setText("Produtos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEmail.setText("...");
        lblEmail.setToolTipText("");

        btnAdcProd.setText("Adicionar Produtos");
        btnAdcProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdcProdActionPerformed(evt);
            }
        });

        lblOutro.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lblOutro.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOutro.setText("...");
        lblOutro.setToolTipText("");
        lblOutro.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 24, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(lblEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblOutro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnAdcProd, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFriendList, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListaEmpresas)
                    .addComponent(btnUserList, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblOutro, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnUserList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnListaEmpresas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFriendList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdcProd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVoltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 569, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1)
                        .addContainerGap(279, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDesktopPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public Empresa getEmpresa_sessao() {
        return empresa_sessao;
    }

    private void btnUserListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserListActionPerformed
        Userlist u = new Userlist();
        u.admU = admRS;
        u.model.ListaDePessoas = (ArrayList) admRS.getListaPessoa().clone();
        jDesktopPane1.add(u);
        u.setVisible(true);
    }//GEN-LAST:event_btnUserListActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.admL = admRS;
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnListaEmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaEmpresasActionPerformed
        EnterpriseList e = new EnterpriseList();
        e.model.ListaDeEmpresas = (ArrayList) admRS.getListaEmpresa().clone();
        e.admE = admRS;
        jDesktopPane1.add(e);
        e.setVisible(true);
    }//GEN-LAST:event_btnListaEmpresasActionPerformed

    private void btnFriendListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFriendListActionPerformed
        PFriendList f = new PFriendList();
        f.model.amigos = (ArrayList) admRS.listaAmigo.clone();
        f.admA = admRS;
        jDesktopPane1.add(f);
        f.setVisible(true);
    }//GEN-LAST:event_btnFriendListActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:

    }//GEN-LAST:event_formWindowActivated

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Produtos p = new Produtos();
        p.model.listaProdutos = (ArrayList) admRS.getListaEmpresa().clone();
        jDesktopPane1.add(p);
        p.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        switch (quem) {
            case 0:
                admRS.removerPessoa(pessoa_sessao);
                Login plogin = new Login();
                plogin.admL = admRS;
                plogin.setVisible(true);
                this.dispose();
                break;
            case 1:
                admRS.removerEmpresa(empresa_sessao);
                Login elogin = new Login();
                elogin.admL = admRS;
                elogin.setVisible(true);
                this.dispose();
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        if (admRS.getPessoa_sessao() != null) {
            quem = 0;
            pessoa_sessao = admRS.getPessoa_sessao();
            btnAdcProd.setEnabled(false);
            btnAdcProd.setVisible(false);
            lblUsuario.setText("Usuario: "+pessoa_sessao.nomeUsuario);
            lblEmail.setText("Email: "+pessoa_sessao.email);
            lblOutro.setText("<html>"+"desc:"+pessoa_sessao.getDescr()+"</html>");
            System.out.printf("\n+++++++++++++++++++\nPessoa sessao agora: %s\ntipo: %d\n+++++++++++++++++++\n", pessoa_sessao.toString(), quem);
        } else {
            quem = 1;
            empresa_sessao = admRS.getEmpresa_sessao();
            lblUsuario.setText("Usuario: "+empresa_sessao.nomeUsuario);
            lblEmail.setText("Email: "+empresa_sessao.email);
            lblOutro.setText("ramo:"+empresa_sessao.getRamo());
            System.out.printf("\n+++++++++++++++++++\nEmpresa sessao agora: %s\ntipo: %d\n+++++++++++++++++++\n", empresa_sessao.toString(), quem);
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnAdcProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdcProdActionPerformed
        // TODO add your handling code here:
        AdicionarProduto adicionarProduto = new AdicionarProduto();
        adicionarProduto.admAP= admRS;
        adicionarProduto.empresa_sessaoAP= empresa_sessao;
        adicionarProduto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAdcProdActionPerformed

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
            java.util.logging.Logger.getLogger(RedeSocial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RedeSocial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RedeSocial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RedeSocial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RedeSocial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdcProd;
    private javax.swing.JButton btnFriendList;
    private javax.swing.JButton btnListaEmpresas;
    private javax.swing.JButton btnUserList;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JLabel lblEmail;
    public javax.swing.JLabel lblOutro;
    public javax.swing.JLabel lblUsuario;
    // End of variables declaration//GEN-END:variables
}
