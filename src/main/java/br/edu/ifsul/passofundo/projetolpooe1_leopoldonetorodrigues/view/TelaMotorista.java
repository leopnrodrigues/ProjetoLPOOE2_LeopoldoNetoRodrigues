/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifsul.passofundo.projetolpooe1_leopoldonetorodrigues.view;

import br.edu.ifsul.passofundo.projetolpooe1_leopoldonetorodrigues.dao.PersistenciaJPA;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import model.Motorista;

/**
 *
 * @author leo
 */
public class TelaMotorista extends javax.swing.JFrame {
    
    PersistenciaJPA jpa;
    /**
     * Creates new form TelaFunc
     */
    public TelaMotorista() {
        initComponents();
        jpa = new PersistenciaJPA();
        carregarPessoasCadastradas();
        
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
        areaListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstPessoas = new javax.swing.JList<>();
        areaBotoes = new javax.swing.JPanel();
        btnNovaPessoa = new javax.swing.JButton();
        btnEditarPessoa = new javax.swing.JButton();
        btnRemoverPessoa = new javax.swing.JButton();
        areaFiltros = new javax.swing.JPanel();
        lblBuscaNome = new javax.swing.JLabel();
        txtBuscaNome = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Motoristas");

        jScrollPane1.setViewportView(lstPessoas);

        javax.swing.GroupLayout areaListagemLayout = new javax.swing.GroupLayout(areaListagem);
        areaListagem.setLayout(areaListagemLayout);
        areaListagemLayout.setHorizontalGroup(
            areaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        areaListagemLayout.setVerticalGroup(
            areaListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaListagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        btnNovaPessoa.setText("Novo");
        btnNovaPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaPessoaActionPerformed(evt);
            }
        });

        btnEditarPessoa.setText("Editar");
        btnEditarPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPessoaActionPerformed(evt);
            }
        });

        btnRemoverPessoa.setText("Remover");
        btnRemoverPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverPessoaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout areaBotoesLayout = new javax.swing.GroupLayout(areaBotoes);
        areaBotoes.setLayout(areaBotoesLayout);
        areaBotoesLayout.setHorizontalGroup(
            areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaBotoesLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnNovaPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditarPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRemoverPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addContainerGap())
        );
        areaBotoesLayout.setVerticalGroup(
            areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaBotoesLayout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(areaBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovaPessoa)
                    .addComponent(btnEditarPessoa)
                    .addComponent(btnRemoverPessoa))
                .addGap(29, 29, 29))
        );

        lblBuscaNome.setText("Nome: ");

        txtBuscaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscaNomeKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscaNomeKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout areaFiltrosLayout = new javax.swing.GroupLayout(areaFiltros);
        areaFiltros.setLayout(areaFiltrosLayout);
        areaFiltrosLayout.setHorizontalGroup(
            areaFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, areaFiltrosLayout.createSequentialGroup()
                .addComponent(lblBuscaNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscaNome)
                .addContainerGap())
        );
        areaFiltrosLayout.setVerticalGroup(
            areaFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(areaFiltrosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(areaFiltrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscaNome)
                    .addComponent(txtBuscaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(397, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(areaFiltros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(areaListagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(areaBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(326, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addComponent(areaFiltros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(areaListagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(areaBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoverPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverPessoaActionPerformed
        Motorista pessoaSel = lstPessoas.getSelectedValue();
        if (pessoaSel != null) {
            System.out.println("Pessoa: " + pessoaSel.getId());
            try {
                jpa.conexaoAberta();

                int delOp = JOptionPane.showConfirmDialog(this,
                    "Tem certeza que deseja remover " + pessoaSel.getNome() + "?");
                if (delOp == JOptionPane.YES_OPTION) {
                    jpa.remover(pessoaSel);
                }

                jpa.fecharConexao();
                carregarPessoasCadastradas();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this,
                    "Erro ao remover pessoa " + pessoaSel + "\n" + e);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma pessoa para remover");
        }
    }//GEN-LAST:event_btnRemoverPessoaActionPerformed

    private void btnEditarPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPessoaActionPerformed
        Motorista pessoaSel = lstPessoas.getSelectedValue();
        if (pessoaSel != null) {
            TelaCadMotorista telaEdt = new TelaCadMotorista(this, rootPaneCheckingEnabled);
            telaEdt.setMot(pessoaSel);
            telaEdt.setVisible(true);
            carregarPessoasCadastradas();

        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma pessoa para Editar");
        }
    }//GEN-LAST:event_btnEditarPessoaActionPerformed

    private void btnNovaPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaPessoaActionPerformed
        TelaCadMotorista telaCadastro
        = new TelaCadMotorista(this, rootPaneCheckingEnabled);
        telaCadastro.setVisible(true);

                carregarPessoasCadastradas();
    }//GEN-LAST:event_btnNovaPessoaActionPerformed

    private void txtBuscaNomeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeKeyReleased
        if(txtBuscaNome.getText().trim().isEmpty()){
                        carregarPessoasCadastradas();
        } else{
            jpa.conexaoAberta();
            DefaultListModel modeloLista = new DefaultListModel();
                        modeloLista.addAll(jpa.getMotoristas(txtBuscaNome.getText().trim()));
                        System.out.println("Pessoas carregadas: "+jpa.getMotoristas(txtBuscaNome.getText().trim()));
            lstPessoas.setModel(modeloLista);

            jpa.fecharConexao();
        }
    }//GEN-LAST:event_txtBuscaNomeKeyReleased

    private void txtBuscaNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscaNomeKeyPressed

    }//GEN-LAST:event_txtBuscaNomeKeyPressed

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
            java.util.logging.Logger.getLogger(TelaMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMotorista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMotorista().setVisible(true);
            }
        });
    }
    
    public void carregarPessoasCadastradas() {
        jpa.conexaoAberta();

        DefaultListModel modeloLista = new DefaultListModel();
        modeloLista.addAll(jpa.getMotoristas());
        lstPessoas.setModel(modeloLista);

        jpa.fecharConexao();

    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel areaBotoes;
    private javax.swing.JPanel areaFiltros;
    private javax.swing.JPanel areaListagem;
    private javax.swing.JButton btnEditarPessoa;
    private javax.swing.JButton btnNovaPessoa;
    private javax.swing.JButton btnRemoverPessoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBuscaNome;
    private javax.swing.JList<Motorista> lstPessoas;
    private javax.swing.JTextField txtBuscaNome;
    // End of variables declaration//GEN-END:variables
}
