/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package eldenringproj;
import bo.Inventory;
import dao.InventoryHandler;
import dao.ArmorHandler;
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
public class EditInventory extends javax.swing.JFrame {
    List<Inventory> InvE;
    
    private void populateData(String keyword) {
        String[] colNames = new String[]{"Inventory ID", "Inventory Name"};
        DefaultTableModel tm = new DefaultTableModel(colNames, 0) {
            @Override
            public boolean isCellEditable(int i, int i1) {
                return false;
            }
        };
        InvE = new InventoryHandler().getInventory(keyword);
        InvE.forEach((s) -> {
            tm.addRow(s.getRow());
        });
        tblInventory.setModel(tm);
    }
    /**
     * Creates new form EditInventory
     */
    public EditInventory() {
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
        jButton1 = new javax.swing.JButton();
        iUpdateBttn = new javax.swing.JButton();
        iDeleteBttn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtiID = new javax.swing.JTextField();
        txtiName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInventory = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Gabriola", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(213, 174, 88));
        jLabel1.setText("Edit Inventory");

        jLabel2.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(213, 174, 88));
        jLabel2.setText("Inventory ID:");

        jLabel3.setFont(new java.awt.Font("Gabriola", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(213, 174, 88));
        jLabel3.setText("Inventory Name:");

        jButton1.setBackground(new java.awt.Color(213, 174, 88));
        jButton1.setFont(new java.awt.Font("Gabriola", 0, 14)); // NOI18N
        jButton1.setText("Create New Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        iUpdateBttn.setBackground(new java.awt.Color(213, 174, 88));
        iUpdateBttn.setFont(new java.awt.Font("Gabriola", 0, 14)); // NOI18N
        iUpdateBttn.setText("Update Data");
        iUpdateBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iUpdateBttnActionPerformed(evt);
            }
        });

        iDeleteBttn.setBackground(new java.awt.Color(213, 174, 88));
        iDeleteBttn.setFont(new java.awt.Font("Gabriola", 0, 14)); // NOI18N
        iDeleteBttn.setText("Delete Data");
        iDeleteBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iDeleteBttnActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(213, 174, 88));
        jButton4.setFont(new java.awt.Font("Gabriola", 0, 14)); // NOI18N
        jButton4.setText("Menu");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        txtiID.setBackground(new java.awt.Color(213, 174, 88));
        txtiID.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N

        txtiName.setBackground(new java.awt.Color(213, 174, 88));
        txtiName.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N

        tblInventory.setBackground(new java.awt.Color(0, 0, 0));
        tblInventory.setFont(new java.awt.Font("Gabriola", 0, 18)); // NOI18N
        tblInventory.setForeground(new java.awt.Color(213, 174, 88));
        tblInventory.setModel(new javax.swing.table.DefaultTableModel(
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
        tblInventory.setRowHeight(30);
        tblInventory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblInventoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblInventory);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtiID, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtiName, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton4))
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(iUpdateBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(iDeleteBttn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(332, 332, 332))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtiID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtiName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(iUpdateBttn)
                        .addGap(18, 18, 18)
                        .addComponent(iDeleteBttn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 167, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblInventoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblInventoryMouseClicked
        int selectedRow = tblInventory.getSelectedRow();
        if (selectedRow != -1) {
                    // Get values from the selected row
                    Object iIDValue = tblInventory.getValueAt(selectedRow, 0);
                    Object iNameValue = tblInventory.getValueAt(selectedRow, 1);

                    // Set text fields with the retrieved values
                    txtiID.setText(String.valueOf(iIDValue));
                    txtiName.setText(String.valueOf(iNameValue));
                }
    }//GEN-LAST:event_tblInventoryMouseClicked

    private void iUpdateBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iUpdateBttnActionPerformed
// Create an instance of the InventoryHandler class
InventoryHandler InvHand = new InventoryHandler();

// Get values from text fields for inventory ID and inventory name
String InvID = txtiID.getText();
String InvName = txtiName.getText();

try {
    // Convert inventory ID to an integer
    int IntInvID = Integer.parseInt(InvID);

    // Call the updateInventory method to update inventory information
    int result = InvHand.updateInventory(IntInvID, IntInvID, InvName);

    // Check if the inventory was updated successfully
    if (result > 0) {
        // If successful, refresh the inventory table and show a success message
        refreshInventoryTable();
        JOptionPane.showMessageDialog(this, "Updated");
    } else {
        // If update failed, show a failure message
        JOptionPane.showMessageDialog(this, "Update Failed!");
    }
} catch (NumberFormatException e) {
    // Handle the exception for invalid integer input
    e.printStackTrace();
}

    }//GEN-LAST:event_iUpdateBttnActionPerformed

    private void iDeleteBttnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iDeleteBttnActionPerformed
        ArmorHandler ArmHand = new ArmorHandler();
        InventoryHandler InvHand = new InventoryHandler();
        String ArmorID = txtiID.getText();
        int armorID = Integer.parseInt(ArmorID);
        
        int result = InvHand.deleteInventory(armorID);
                
        if (result>0) {
            JOptionPane.showMessageDialog(this, "Armor deleted successfully.");
            refreshInventoryTable();}
        else{
            JOptionPane.showMessageDialog(this, "Armor deletion failed.");     
                    }

    }//GEN-LAST:event_iDeleteBttnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        new EldenRingProj().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new WeaponOrArmor().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    public void refreshInventoryTable(){
        populateData("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton iDeleteBttn;
    private javax.swing.JButton iUpdateBttn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInventory;
    private javax.swing.JTextField txtiID;
    private javax.swing.JTextField txtiName;
    // End of variables declaration//GEN-END:variables
}
