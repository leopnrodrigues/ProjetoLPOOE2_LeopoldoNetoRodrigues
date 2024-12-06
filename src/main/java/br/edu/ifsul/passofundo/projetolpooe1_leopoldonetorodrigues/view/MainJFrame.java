/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifsul.passofundo.projetolpooe1_leopoldonetorodrigues.view;

import br.edu.ifsul.passofundo.projetolpooe1_leopoldonetorodrigues.dao.PersistenciaJPA;
import java.time.LocalDateTime;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Passagem;

/**
 *
 * @author leo
 */
public class MainJFrame extends javax.swing.JFrame {

    PersistenciaJPA jpa;
    
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
        initComponents();
        jpa = new PersistenciaJPA();
        carregarHistorico();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnExc = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuCad = new javax.swing.JMenu();
        ItemFunc = new javax.swing.JMenuItem();
        ItemMotorista = new javax.swing.JMenuItem();
        ItemVei = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MenuPedagio = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuSobre = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Motorista", "Veículo", "Data", "Funcionário", "Valor"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Histórico");

        btnExc.setText("Excluir");
        btnExc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcActionPerformed(evt);
            }
        });

        btnEdit.setText("Editar");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        MenuCad.setText("Cadastros");

        ItemFunc.setText("Funcionário");
        ItemFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemFuncActionPerformed(evt);
            }
        });
        MenuCad.add(ItemFunc);

        ItemMotorista.setText("Motorista");
        ItemMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemMotoristaActionPerformed(evt);
            }
        });
        MenuCad.add(ItemMotorista);

        ItemVei.setText("Veículo");
        ItemVei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemVeiActionPerformed(evt);
            }
        });
        MenuCad.add(ItemVei);

        jMenuBar1.add(MenuCad);

        jMenu2.setText("Pedágio");

        MenuPedagio.setText("Adicionar registro");
        MenuPedagio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPedagioActionPerformed(evt);
            }
        });
        jMenu2.add(MenuPedagio);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ajuda");

        MenuSobre.setText("Sobre");
        MenuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSobreActionPerformed(evt);
            }
        });
        jMenu3.add(MenuSobre);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 888, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExc)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExc)
                    .addComponent(btnEdit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSobreActionPerformed
        TelaSobre telaSobre = new TelaSobre(this, rootPaneCheckingEnabled);
        telaSobre.setVisible(true);
    }//GEN-LAST:event_MenuSobreActionPerformed

    private void MenuPedagioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPedagioActionPerformed
        TelaPedagio telaPedagio = new TelaPedagio(this, rootPaneCheckingEnabled);
        telaPedagio.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent e) {
                carregarHistorico();
            }
        });
        telaPedagio.setVisible(true);
    }//GEN-LAST:event_MenuPedagioActionPerformed

    private void ItemFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemFuncActionPerformed
        TelaFunc telaFunc = new TelaFunc();
        telaFunc.setVisible(true);
    }//GEN-LAST:event_ItemFuncActionPerformed

    private void ItemMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemMotoristaActionPerformed
        TelaMotorista telaMotorista = new TelaMotorista();
        telaMotorista.setVisible(true);
    }//GEN-LAST:event_ItemMotoristaActionPerformed

    private void ItemVeiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemVeiActionPerformed
        TelaVei telaVei = new TelaVei();
        telaVei.setVisible(true);
    }//GEN-LAST:event_ItemVeiActionPerformed

    private void btnExcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcActionPerformed
        Passagem passagemSel = getPassagemSelecionada();  // Obter a passagem selecionada
        if (passagemSel != null) { 
            int confirm = JOptionPane.showConfirmDialog(
                this,
                "Tem certeza que deseja remover a passagem com ID " + passagemSel.getId() + "?",
                "Confirmar Remoção",
                JOptionPane.YES_NO_OPTION
            );

            if (confirm == JOptionPane.YES_OPTION) {  // Se o usuário confirmou a remoção
                try {
                    jpa.conexaoAberta();  // Abre a conexão com o banco de dados
                    jpa.remover(passagemSel);  // Remove a passagem do banco
                    jpa.fecharConexao();  // Fecha a conexão
                    JOptionPane.showMessageDialog(this, "Passagem removida com sucesso!");
                    carregarHistorico();  // Atualiza a tabela após remoção
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Erro ao remover passagem: " + e.getMessage());
                    e.printStackTrace();
                } finally {
                    jpa.fecharConexao();  // Garante que a conexão seja fechada
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma passagem para remover.");
        }
    }//GEN-LAST:event_btnExcActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        Passagem passagemSel = getPassagemSelecionada(); 
        if (passagemSel != null) {
            TelaPedagio tela = new TelaPedagio(this, rootPaneCheckingEnabled); 
            tela.setPassagem(passagemSel);
            tela.setVisible(true);
            carregarHistorico();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma passagem para editar.");
        }
    }//GEN-LAST:event_btnEditActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    
    public void carregarHistorico() {
        List<Passagem> movimentacoes = jpa.getMovimentacoes(); 

        
        DefaultTableModel model = new DefaultTableModel(
            new Object[][]{}, 
            new String[]{"Motorista", "Veículo", "Data", "Funcionário", "Valor"} 
        );
        
        for (Passagem passagem : movimentacoes) {
            Object[] row = new Object[5];
            row[0] = passagem.getMotorista().getNome();
            row[1] = passagem.getVeiculo().getPlaca(); 
            row[2] = passagem.getDataHora().toString(); 
            row[3] = passagem.getFuncionario().toString(); 
            row[4] = passagem.getValorPago(); 
            model.addRow(row); 
        }

        jTable1.setModel(model);
    }
    
    private Passagem getPassagemSelecionada() {
        int linhaSelecionada = jTable1.getSelectedRow();
        if (linhaSelecionada >= 0) {
            
            String motoristaNome = (String) jTable1.getValueAt(linhaSelecionada, 0);
            String veiculoPlaca = (String) jTable1.getValueAt(linhaSelecionada, 1);
            LocalDateTime dataHora = LocalDateTime.parse((String) jTable1.getValueAt(linhaSelecionada, 2));

            try {
            
                return jpa.findPassagemByDetails(motoristaNome, veiculoPlaca, dataHora);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao buscar passagem selecionada: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return null;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ItemFunc;
    private javax.swing.JMenuItem ItemMotorista;
    private javax.swing.JMenuItem ItemVei;
    private javax.swing.JMenu MenuCad;
    private javax.swing.JMenuItem MenuPedagio;
    private javax.swing.JMenuItem MenuSobre;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnExc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
