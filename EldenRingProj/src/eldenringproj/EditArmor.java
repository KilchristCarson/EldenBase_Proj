package eldenringproj;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import bo.Armor;
import dao.InventoryHandler;
import dao.ArmorHandler;
import java.util.Iterator;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import utils.SQLUtil;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author kilch
 */
public class EditArmor extends javax.swing.JFrame {

    List<Armor> ArmorE;
    
    private void populateData(String keyword) {
        String[] colNames = new String[]{"Inventory ID", "Defence Stat"};
        DefaultTableModel tm = new DefaultTableModel(colNames, 0) {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        ArmorE = new ArmorHandler().getArmor(keyword);
        ArmorE.forEach((s) -> {
            tm.addRow(s.getRow());
        });
        tblArmor.setModel(tm);
    }
    /**
     * Creates new form EditArmor
     */
    public EditArmor() {
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtiID = new javax.swing.JTextField();
        txtDefenceStat = new javax.swing.JTextField();
        aUpdateBttn = new javax.swing.JButton();
        aDeleteBttn = new javax.swing.JButton();
        aMenuBttn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblArmor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel4.setFont(new java.awt.Font("Gabriola", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(213, 174, 88));
        jLabel4.setText("Edit Armor");

        jLabel5.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(213, 174, 88));
        jLabel5.setText("Inventory ID:");

        jLabel1.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(213, 174, 88));
        jLabel1.setText("Defense Stat:");

        txtiID.setBackground(new java.awt.Color(213, 174, 88));
        txtiID.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N

        txtDefenceStat.setBackground(new java.awt.Color(213, 174, 88));
        txtDefenceStat.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N

        aUpdateBttn.setBackground(new java.awt.Color(213, 174, 88));
        aUpdateBttn.setFont(new java.awt.Font("Gabriola", 2, 14)); // NOI18N
        aUpdateBttn.setText("Update Data");
        aUpdateBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aUpdateBttnActionPerformed(evt);
            }
        });

        aDeleteBttn.setBackground(new java.awt.Color(213, 174, 88));
        aDeleteBttn.setFont(new java.awt.Font("Gabriola", 2, 14)); // NOI18N
        aDeleteBttn.setText("Delete Data");
        aDeleteBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aDeleteBttnActionPerformed(evt);
            }
        });

        aMenuBttn.setBackground(new java.awt.Color(213, 174, 88));
        aMenuBttn.setFont(new java.awt.Font("Gabriola", 2, 14)); // NOI18N
        aMenuBttn.setText("Menu");
        aMenuBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aMenuBttnActionPerformed(evt);
            }
        });

        tblArmor.setAutoCreateRowSorter(true);
        tblArmor.setBackground(new java.awt.Color(0, 0, 0));
        tblArmor.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        tblArmor.setForeground(new java.awt.Color(213, 174, 88));
        tblArmor.setModel(new javax.swing.table.DefaultTableModel(
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
        tblArmor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblArmor.setGridColor(new java.awt.Color(27, 69, 75));
        tblArmor.setRowHeight(30);
        tblArmor.setRowSelectionAllowed(false);
        tblArmor.setSelectionBackground(new java.awt.Color(27, 69, 75));
        tblArmor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblArmorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblArmor);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(txtDefenceStat))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtiID))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(aMenuBttn)
                    .addComponent(aUpdateBttn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(aDeleteBttn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtiID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDefenceStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(aUpdateBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(aDeleteBttn)
                        .addGap(180, 180, 180)
                        .addComponent(aMenuBttn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblArmorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblArmorMouseClicked
        int selectedRow = tblArmor.getSelectedRow();
        if (selectedRow != -1) {
                    // Get values from the selected row
                    Object iIDValue = tblArmor.getValueAt(selectedRow, 0);
                    Object DefenceStatValue = tblArmor.getValueAt(selectedRow, 1);

                    // Set text fields with the retrieved values
                    txtiID.setText(String.valueOf(iIDValue));
                    txtDefenceStat.setText(String.valueOf(DefenceStatValue));
                    
                }
    }//GEN-LAST:event_tblArmorMouseClicked

    private void aMenuBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aMenuBttnActionPerformed
        this.setVisible(false);
        new EldenRingProj().setVisible(true);
    }//GEN-LAST:event_aMenuBttnActionPerformed

    private void aUpdateBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aUpdateBttnActionPerformed
// Create instances of the necessary classes for handling armor
ArmorHandler ArmorHand = new ArmorHandler();

// Get values from text fields for weapon ID and defense statistic
String WeaponID = txtiID.getText();
String DefStat = txtDefenceStat.getText();

try {
    // Convert string inputs to integers for weapon ID and defense statistic
    int weaponID = Integer.parseInt(WeaponID);
    int DefenceStat = Integer.parseInt(DefStat);

    // Call the updateArmor method
    int result = ArmorHand.updateArmor(weaponID, weaponID, DefenceStat);

    // Check if armor was successfully updated
    if (result > 0) {
        // If successful, refresh armor table and show success message
        refreshArmorTable();
        JOptionPane.showMessageDialog(this, "Updated");
    } else {
        // If updating failed, display a failure message
        JOptionPane.showMessageDialog(this, "Update failed");
    }
} catch (NumberFormatException e) {
    // Handle the exception for invalid integer input
    e.printStackTrace();
}

    }//GEN-LAST:event_aUpdateBttnActionPerformed

    private void aDeleteBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aDeleteBttnActionPerformed
// Create an instance of the InventoryHandler class
InventoryHandler InvHand = new InventoryHandler();

// Get the weapon ID from the text field and convert it to an integer
String WeaponID = txtiID.getText();
int weaponID = Integer.parseInt(WeaponID);

// Call the deleteInventory method to delete the armor
int result2 = InvHand.deleteInventory(weaponID);

// Check if the armor was deleted successfully
if (result2 > 0) {
    // If successful, show a success message and refresh the armor table
    JOptionPane.showMessageDialog(this, "Armor deleted successfully.");
    refreshArmorTable();
} else {
    // If deletion failed, show a failure message
    JOptionPane.showMessageDialog(this, "Armor deletion failed.");
}


    }//GEN-LAST:event_aDeleteBttnActionPerformed
    public void refreshArmorTable(){
        populateData("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aDeleteBttn;
    private javax.swing.JButton aMenuBttn;
    private javax.swing.JButton aUpdateBttn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblArmor;
    private javax.swing.JTextField txtDefenceStat;
    private javax.swing.JTextField txtiID;
    // End of variables declaration//GEN-END:variables

}

