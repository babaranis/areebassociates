/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areebassosiates;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;



/**
 *
 * @author Babar
 */
public class manageReports extends javax.swing.JFrame {
    Connection con;
        PreparedStatement pst;
        ResultSet rs;
        String sql;
    /**
     * Creates new form NewJFrame
     */
    public manageReports() {
        initComponents();
        setIcon();
        getContentPane().setBackground(Color.WHITE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        jPanel1.setVisible(false);
   }

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        dealTypeCombo = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        statusCombo = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        blockSectorCombo = new javax.swing.JComboBox();
        propertyCombo = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        societyCombo = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        filterButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Areeb Associates - Manage Records");
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(java.awt.Color.gray);
        setIconImages(null);
        setName("Areeb Associates - Login"); // NOI18N
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 28)); // NOI18N
        jLabel1.setText("MANAGE RECORS");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/areebassosiates/Logo3.png"))); // NOI18N

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.setGridColor(new java.awt.Color(204, 204, 204));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 963, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        dealTypeCombo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        dealTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Buying", "Selling" }));
        dealTypeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dealTypeComboActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel15.setText("Status:");

        statusCombo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        statusCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "New", "Reopened", "Closed" }));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel14.setText("Deal Type:");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel4.setText("Block/Sector:");

        blockSectorCombo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        blockSectorCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "15/A-2", "15/A-3", "15/A-4", "15/A-5", "Block A", "Block B", "Block C", "Block D", "Block H", "Block I", "Block J", "Block M", "Block N", "Block B", "Block A", "Other" }));

        propertyCombo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        propertyCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "House", "Flat", "Plot", "Shop" }));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel2.setText("Property:");

        societyCombo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        societyCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Scheme 33", "Kaneez Fatima", "Railway Society", "Baharia", "ASF" }));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel6.setText("Society:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(10, 10, 10)
                .addComponent(dealTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(propertyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blockSectorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(societyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel3))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(propertyCombo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(blockSectorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel2)
                        .addComponent(societyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(dealTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)))
                .addGap(16, 16, 16))
        );

        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/areebassosiates/update-button.png"))); // NOI18N
        updateButton.setBorder(null);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/areebassosiates/delete-button.png"))); // NOI18N
        deleteButton.setBorder(null);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        filterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/areebassosiates/filter-buttn.png"))); // NOI18N
        filterButton.setBorder(null);
        filterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(150, 150, 150)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(filterButton)
                        .addGap(80, 80, 80)
                        .addComponent(updateButton)
                        .addGap(80, 80, 80)
                        .addComponent(deleteButton)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deleteButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(updateButton)
                            .addComponent(filterButton))))
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dealTypeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dealTypeComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dealTypeComboActionPerformed

    private void filterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterButtonActionPerformed
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/areebassociates","root","babarihs");
            String sql="";
            String queryFilter="";
            if(!dealTypeCombo.getSelectedItem().equals("")){
                if(queryFilter.equals("")){
                    queryFilter = queryFilter + "dealtype=\""+dealTypeCombo.getSelectedItem()+ "\"";
                }else{
                    queryFilter = queryFilter +" and dealtype=\""+dealTypeCombo.getSelectedItem()+"\"";
                }
            }
            
            if(!statusCombo.getSelectedItem().equals("")){
                if(queryFilter.equals("")){
                    queryFilter = queryFilter + "status=\""+statusCombo.getSelectedItem()+"\"";
                }else{
                    queryFilter = queryFilter +" and status=\""+statusCombo.getSelectedItem()+"\"";
                }
            }
            
            if(!propertyCombo.getSelectedItem().equals("")){
                if(queryFilter.equals("")){
                    queryFilter = queryFilter +"property=\""+propertyCombo.getSelectedItem()+"\"";
                }else{
                    queryFilter = queryFilter +" and property=\""+propertyCombo.getSelectedItem()+"\"";
                }
            }
            
            if(!blockSectorCombo.getSelectedItem().equals("")){
                if(queryFilter.equals("")){
                    queryFilter = queryFilter +"blocksector=\""+blockSectorCombo.getSelectedItem()+"\"";
                }else{
                    queryFilter = queryFilter +" and blocksector=\""+blockSectorCombo.getSelectedItem()+"\"";
                }
            }
            
            if(!societyCombo.getSelectedItem().equals("")){
                if(queryFilter.equals("")){
                    queryFilter = queryFilter + "society=\""+societyCombo.getSelectedItem()+"\"";
                }else{
                    queryFilter = queryFilter +" and society=\""+societyCombo.getSelectedItem()+"\"";
                }
            }
            if(queryFilter.length()>0){
                sql = "select * from newrecord where " + queryFilter;
            }else{
                sql = "select * from newrecord";
            }
            pst=con.prepareStatement(sql);
            rs=pst.executeQuery();
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            jPanel1.setVisible(true);
            jTable2.setRowHeight(20);
            if(jTable2.getRowCount()==0){
                 JOptionPane optionPane = new JOptionPane("No record found!",JOptionPane.WARNING_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Alert!");
                    dialog.setAlwaysOnTop(true); // to show top of all other application
                    dialog.setVisible(true); // to visible the dialog
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(manageReports.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(manageReports.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_filterButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        try {
            if(jPanel2.isVisible()==true && jTable2.getSelectedRow()!=-1){
                int dialogResult = JOptionPane.showConfirmDialog (this, "Do you want to delete record?","Confirmation",JOptionPane.YES_NO_OPTION);
                
                if(dialogResult == JOptionPane.YES_OPTION){
                    int i = jTable2.getSelectedRow();
                    int id = Integer.parseInt(jTable2.getValueAt(i, 0).toString());
                    pst=con.prepareStatement("delete from newrecord where sno="+id);
                    pst.executeUpdate();
                    pst=con.prepareStatement("select * from newrecord");
                    rs=pst.executeQuery();
                    jTable2.setModel(DbUtils.resultSetToTableModel(rs));            
                }   
            }else{
                JOptionPane optionPane = new JOptionPane("Failed to delete record, Please select record to delete",JOptionPane.ERROR_MESSAGE);
                JDialog dialog = optionPane.createDialog("Failed!");
                dialog.setAlwaysOnTop(true); // to show top of all other application
                dialog.setVisible(true); // to visible the dialog
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(manageReports.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
            if(jPanel2.isVisible()==true && jTable2.getSelectedRow()!=-1){
                int i = jTable2.getSelectedRow();
                int id = Integer.parseInt(jTable2.getValueAt(i, 0).toString());
                String dealType = jTable2.getValueAt(i, 1).toString();
                String status = jTable2.getValueAt(i, 2).toString();
                String property = jTable2.getValueAt(i, 3).toString();
                String address = jTable2.getValueAt(i, 4).toString();
                String blockSector = jTable2.getValueAt(i, 5).toString();
                String society = jTable2.getValueAt(i, 6).toString();
                int demandSoldPrice = 0;
                if(!jTable2.getValueAt(i, 7).toString().equalsIgnoreCase("") || jTable2.getValueAt(i, 7)!=null ){
                      demandSoldPrice = Integer.parseInt(jTable2.getValueAt(i, 7).toString());
                }
                String date = jTable2.getValueAt(i, 8).toString();
                String remarks = jTable2.getValueAt(i, 9).toString();
                String name = jTable2.getValueAt(i, 10).toString();
                String contact = jTable2.getValueAt(i, 11).toString();
                String cnic = jTable2.getValueAt(i, 12).toString();
                try {
                    updateRecord frame = new updateRecord(id,dealType,status,property,address,blockSector,society,demandSoldPrice,date,remarks,name,contact,cnic);
                    frame.setVisible(true);
                    frame.setAlwaysOnTop(true);
                    dispose();
                } catch (ParseException ex) {
                    Logger.getLogger(manageReports.class.getName()).log(Level.SEVERE, null, ex);
                }
                        
                
            }else{
                 JOptionPane optionPane = new JOptionPane("Unable to update record. Please select record to update",JOptionPane.ERROR_MESSAGE);
                JDialog dialog = optionPane.createDialog("Failed!");
                dialog.setAlwaysOnTop(true); // to show top of all other application
                dialog.setVisible(true); // to visible the dialog
            }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
         
    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(manageReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageReports.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageReports().setVisible(true);
                
                // iconURL is null when not found
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox blockSectorCombo;
    private javax.swing.JComboBox dealTypeCombo;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton filterButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox propertyCombo;
    private javax.swing.JComboBox societyCombo;
    private javax.swing.JComboBox statusCombo;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("newLogo.png")));
    }
    
    
}
