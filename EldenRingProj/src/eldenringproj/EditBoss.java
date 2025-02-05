/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eldenringproj;

import bo.Boss;
import dao.BossHandler;
import dao.EnemyHandler;
import java.util.Iterator;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import utils.SQLUtil;

/**
 *
 * @author kilch
 */
public class EditBoss extends javax.swing.JFrame {

    
    List<Boss> BossL;
    
    private void populateData(String keyword) {
        String[] colNames = new String[]{"Enemy ID","Ability Type"};
        DefaultTableModel tm = new DefaultTableModel(colNames, 0) {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        BossL = new BossHandler().getBoss(keyword);
        BossL.forEach((s) -> {
            tm.addRow(s.getRow());
        });
        tblBoss.setModel(tm);
    }
    /**
     * Creates new form EditBoss
     */
    public EditBoss() {
        initComponents();
        populateData("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bUpdateBttn = new javax.swing.JButton();
        bDeleteBttn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txteID = new javax.swing.JTextField();
        txtAbilitySet = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBoss = new javax.swing.JTable();
        bCreateBttn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Gabriola", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(213, 174, 88));
        jLabel1.setText("Edit Boss");

        jLabel2.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(213, 174, 88));
        jLabel2.setText("Enemy ID:");

        jLabel3.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(213, 174, 88));
        jLabel3.setText("Ability Set: ");

        bUpdateBttn.setBackground(new java.awt.Color(213, 174, 88));
        bUpdateBttn.setFont(new java.awt.Font("Gabriola", 0, 14)); // NOI18N
        bUpdateBttn.setText("Update Data");
        bUpdateBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUpdateBttnActionPerformed(evt);
            }
        });

        bDeleteBttn.setBackground(new java.awt.Color(213, 174, 88));
        bDeleteBttn.setFont(new java.awt.Font("Gabriola", 0, 14)); // NOI18N
        bDeleteBttn.setText("Delete Data");
        bDeleteBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteBttnActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(213, 174, 88));
        jButton3.setFont(new java.awt.Font("Gabriola", 0, 14)); // NOI18N
        jButton3.setText("Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txteID.setBackground(new java.awt.Color(213, 174, 88));
        txteID.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N

        txtAbilitySet.setBackground(new java.awt.Color(213, 174, 88));
        txtAbilitySet.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N

        tblBoss.setBackground(new java.awt.Color(0, 0, 0));
        tblBoss.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        tblBoss.setForeground(new java.awt.Color(213, 174, 88));
        tblBoss.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblBoss.setRowHeight(30);
        tblBoss.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBossMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBoss);

        bCreateBttn.setBackground(new java.awt.Color(213, 174, 88));
        bCreateBttn.setFont(new java.awt.Font("Gabriola", 0, 14)); // NOI18N
        bCreateBttn.setText("Create Boss");
        bCreateBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCreateBttnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(172, 172, 172)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAbilitySet))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txteID, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 100, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bUpdateBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bDeleteBttn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bCreateBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(106, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txteID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAbilitySet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(bCreateBttn)
                .addGap(18, 18, 18)
                .addComponent(bUpdateBttn)
                .addGap(18, 18, 18)
                .addComponent(bDeleteBttn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(16, 16, 16))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(196, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bUpdateBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUpdateBttnActionPerformed
// Create an instance of the BossHandler class
BossHandler BossHand = new BossHandler();

// Get values from text fields for inventory ID and ability set
String InvID = txteID.getText();
String InvAbilSet = txtAbilitySet.getText();

try {
    // Convert inventory ID to an integer
    int IntInvID = Integer.parseInt(InvID);

    // Call the updateBoss method
    int result = BossHand.updateBoss(IntInvID, IntInvID, InvAbilSet);

    // Check if the boss was updated successfully
    if (result > 0) {
        // If successful, refresh the boss table and show a success message
        refreshBossTable();
        JOptionPane.showMessageDialog(this, "Updated");
    } else {
        // If update failed, show a failure message
        JOptionPane.showMessageDialog(this, "Update Failed!");
    }
} catch (NumberFormatException e) {
    // Handle the exception for invalid integer input
    e.printStackTrace();
}


    }//GEN-LAST:event_bUpdateBttnActionPerformed

    private void tblBossMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBossMouseClicked
        int selectedRow = tblBoss.getSelectedRow();
        if (selectedRow != -1) {
                    // Get values from the selected row
                    Object eIDValue = tblBoss.getValueAt(selectedRow, 0);
                    Object abilitySetValue = tblBoss.getValueAt(selectedRow, 1);

                    // Set text fields with the retrieved values
                    txteID.setText(String.valueOf(eIDValue));
                    txtAbilitySet.setText(String.valueOf(abilitySetValue));

                    
                }
    }//GEN-LAST:event_tblBossMouseClicked

    private void bDeleteBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteBttnActionPerformed
        EnemyHandler EnemyHand = new EnemyHandler();
        String ArmorID = txteID.getText();
        
        int enemyID = Integer.parseInt(ArmorID);
        
        int result = EnemyHand.deleteEnemy(enemyID);
                
        if (result>0) {
            JOptionPane.showMessageDialog(this, "Boss deleted successfully.");
            refreshBossTable();}
        else{
            JOptionPane.showMessageDialog(this, "Boss deletion failed.");     
                    }
    }//GEN-LAST:event_bDeleteBttnActionPerformed

    private void bCreateBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCreateBttnActionPerformed
        this.setVisible(false);
        new BossOrMob().setVisible(true);
    }//GEN-LAST:event_bCreateBttnActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.setVisible(false);
        new EldenRingProj().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    public void refreshBossTable(){
        populateData("");
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCreateBttn;
    private javax.swing.JButton bDeleteBttn;
    private javax.swing.JButton bUpdateBttn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBoss;
    private javax.swing.JTextField txtAbilitySet;
    private javax.swing.JTextField txteID;
    // End of variables declaration//GEN-END:variables
}
