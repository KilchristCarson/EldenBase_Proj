/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eldenringproj;

import bo.Weapon;
import dao.WeaponHandler;
import dao.InventoryHandler;
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
public class EditWeapons extends javax.swing.JFrame {
    
    List<Weapon> WeaponL;
    
    private void populateData(String keyword) {
        String[] colNames = new String[]{"Inventory ID", "Weapon Damage","Weapon Type"};
        DefaultTableModel tm = new DefaultTableModel(colNames, 0) {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        WeaponL = new WeaponHandler().getWeapon(keyword);
        WeaponL.forEach((s) -> {
            tm.addRow(s.getRow());
        });
        tblWeapon.setModel(tm);
    }

    /**
     * Creates new form EditWeapons
     */
    public EditWeapons() {
        initComponents();
        populateData("");
    }


    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        wUpdateBttn = new javax.swing.JButton();
        wDeleteBttn = new javax.swing.JButton();
        wMenuBttn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWeapon = new javax.swing.JTable();
        txtiID = new javax.swing.JTextField();
        txtWeaponDMG = new javax.swing.JTextField();
        txtWeaponType = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(27, 69, 75));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(27, 69, 75));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setBackground(new java.awt.Color(213, 174, 88));
        jLabel5.setFont(new java.awt.Font("Gabriola", 3, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(213, 174, 88));
        jLabel5.setText("Edit Weapons");

        jLabel1.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(213, 174, 88));
        jLabel1.setText("Inventory ID:");

        jLabel2.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(213, 174, 88));
        jLabel2.setText("Weapon Damage:");

        jLabel3.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(213, 174, 88));
        jLabel3.setText("Weapon Type:");

        wUpdateBttn.setBackground(new java.awt.Color(213, 174, 88));
        wUpdateBttn.setFont(new java.awt.Font("Gabriola", 0, 14)); // NOI18N
        wUpdateBttn.setText("Update Data");
        wUpdateBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wUpdateBttnActionPerformed(evt);
            }
        });

        wDeleteBttn.setBackground(new java.awt.Color(213, 174, 88));
        wDeleteBttn.setFont(new java.awt.Font("Gabriola", 0, 14)); // NOI18N
        wDeleteBttn.setText("Delete Data");
        wDeleteBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wDeleteBttnActionPerformed(evt);
            }
        });

        wMenuBttn.setBackground(new java.awt.Color(213, 174, 88));
        wMenuBttn.setFont(new java.awt.Font("Gabriola", 0, 14)); // NOI18N
        wMenuBttn.setText("Menu");
        wMenuBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wMenuBttnActionPerformed(evt);
            }
        });

        tblWeapon.setBackground(new java.awt.Color(0, 0, 0));
        tblWeapon.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        tblWeapon.setForeground(new java.awt.Color(213, 174, 88));
        tblWeapon.setModel(new javax.swing.table.DefaultTableModel(
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
        tblWeapon.setRowHeight(30);
        tblWeapon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblWeaponMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblWeapon);

        txtiID.setBackground(new java.awt.Color(213, 174, 88));
        txtiID.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N

        txtWeaponDMG.setBackground(new java.awt.Color(213, 174, 88));
        txtWeaponDMG.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N

        txtWeaponType.setBackground(new java.awt.Color(213, 174, 88));
        txtWeaponType.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWeaponType))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWeaponDMG))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtiID))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(wUpdateBttn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wDeleteBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addComponent(wMenuBttn, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtiID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtWeaponDMG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtWeaponType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(wUpdateBttn)
                        .addGap(18, 18, 18)
                        .addComponent(wDeleteBttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(wMenuBttn)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 292, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 292, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 292, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 292, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 250, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 250, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 250, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 250, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblWeaponMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblWeaponMouseClicked
        int selectedRow = tblWeapon.getSelectedRow();
        if (selectedRow != -1) {
                    // Get values from the selected row
                    Object iIDValue = tblWeapon.getValueAt(selectedRow, 0);
                    Object weaponDMGValue = tblWeapon.getValueAt(selectedRow, 1);
                    Object weaponTypeValue = tblWeapon.getValueAt(selectedRow, 2);

                    // Set text fields with the retrieved values
                    txtiID.setText(String.valueOf(iIDValue));
                    txtWeaponDMG.setText(String.valueOf(weaponDMGValue));
                    txtWeaponType.setText(String.valueOf(weaponTypeValue));
                    
                }
    }//GEN-LAST:event_tblWeaponMouseClicked

    private void wUpdateBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wUpdateBttnActionPerformed
// Create instances of the WeaponHandler classes
WeaponHandler WeaponHand = new WeaponHandler();

// Get values from text fields for weapon ID, damage, and type
String WeaponID = txtiID.getText();
String WeaponDMG = txtWeaponDMG.getText();
String WeaponType = txtWeaponType.getText();

try {
    // Convert weapon ID and damage to integers
    int weaponID = Integer.parseInt(WeaponID);
    int weaponDMG = Integer.parseInt(WeaponDMG);

    // Call the updateWeapon method to update weapon information
    int result = WeaponHand.updateWeapon(weaponID, weaponID, weaponDMG, WeaponType);

    // Check if the weapon was updated successfully
    if (result > 0) {
        // If successful, refresh the weapon table and show a success message
        refreshWeaponTable();
        JOptionPane.showMessageDialog(this, "Updated");
    } else {
        // If update failed, show a failure message
        JOptionPane.showMessageDialog(this, "Update failed");
    }
} catch (NumberFormatException e) {
    // Handle the exception for invalid integer input
    e.printStackTrace();
}

    }//GEN-LAST:event_wUpdateBttnActionPerformed

    private void wDeleteBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wDeleteBttnActionPerformed
        InventoryHandler InvHand = new InventoryHandler();
        String WeaponID = txtiID.getText();
        int weaponID = Integer.parseInt(WeaponID);
        
        
        int result2 = InvHand.deleteInventory(weaponID);
                
        if (result2>0) {
            JOptionPane.showMessageDialog(this, "Armor deleted successfully.");
            refreshWeaponTable();}
        else{
            JOptionPane.showMessageDialog(this, "Armor deletion failed.");     
                    }

    }//GEN-LAST:event_wDeleteBttnActionPerformed

    private void wMenuBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wMenuBttnActionPerformed
        this.setVisible(false);
        new EldenRingProj().setVisible(true);
    }//GEN-LAST:event_wMenuBttnActionPerformed
    public void refreshWeaponTable(){
        populateData("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblWeapon;
    private javax.swing.JTextField txtWeaponDMG;
    private javax.swing.JTextField txtWeaponType;
    private javax.swing.JTextField txtiID;
    private javax.swing.JButton wDeleteBttn;
    private javax.swing.JButton wMenuBttn;
    private javax.swing.JButton wUpdateBttn;
    // End of variables declaration//GEN-END:variables
}
