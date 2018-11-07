/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areebassosiates;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;


/**
 *
 * @author Babar
 */
public class addRecord extends javax.swing.JFrame {
    /**
     * Creates new form NewJFrame
     */
    public addRecord() {
        initComponents();
        setIcon();
        getContentPane().setBackground(Color.WHITE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        soldPurhaseDate.setFormats(dateFormat);
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
        jLabel2 = new javax.swing.JLabel();
        propertyCombo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        addressTextBox = new javax.swing.JTextField();
        blockSectorCombo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        societyCombo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        demandSoldPriceTextBox = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        soldPurhaseDate = new org.jdesktop.swingx.JXDatePicker();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        remarksTextArea = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        customerNameTextBox = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        CustomerCnicTextbox = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        CustomerContactTextBox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        statusCombo = new javax.swing.JComboBox();
        dealTypeCombo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Areeb Associates - Add Record");
        setBackground(new java.awt.Color(102, 102, 102));
        setForeground(java.awt.Color.gray);
        setIconImages(null);
        setName("Areeb Associates - Login"); // NOI18N
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Malgun Gothic Semilight", 1, 28)); // NOI18N
        jLabel1.setText("ADD NEW RECORD");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/areebassosiates/Logo3.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel2.setText("Property:");

        propertyCombo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        propertyCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "House", "Flat", "Plot", "Shop" }));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel3.setText("Address:");

        addressTextBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        addressTextBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        addressTextBox.setPreferredSize(new java.awt.Dimension(10, 34));

        blockSectorCombo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        blockSectorCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "15/A-2", "15/A-3", "15/A-4", "15/A-5", "Block A", "Block B", "Block C", "Block D", "Block H", "Block I", "Block J", "Block M", "Block N", "Block B", "Block A", "Other", " " }));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel4.setText("Block/Sector:");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel6.setText("Society:");

        societyCombo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        societyCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Scheme 33", "Kaneez Fatima", "Railway Society", "Baharia", "ASF", " " }));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel7.setText("Demand/Sold Price: ");

        demandSoldPriceTextBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        demandSoldPriceTextBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        demandSoldPriceTextBox.setPreferredSize(new java.awt.Dimension(10, 34));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel8.setText("Purchase/Sold Date:");

        soldPurhaseDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soldPurhaseDateActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel9.setText("Remarks:");

        remarksTextArea.setColumns(20);
        remarksTextArea.setRows(5);
        remarksTextArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jScrollPane1.setViewportView(remarksTextArea);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/areebassosiates/buyerSeller.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel11.setText("Name:");

        customerNameTextBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        customerNameTextBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        customerNameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNameTextBoxActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel12.setText("CNIC (Optional):");

        CustomerCnicTextbox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        CustomerCnicTextbox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        CustomerCnicTextbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerCnicTextboxActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel13.setText("Contact Number:");

        CustomerContactTextBox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        CustomerContactTextBox.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/areebassosiates/submitButton.png"))); // NOI18N
        jButton1.setAlignmentY(0.0F);
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel14.setText("Deal Type:");

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 15)); // NOI18N
        jLabel15.setText("Status:");

        statusCombo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        statusCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "New", "Reopened", "Closed" }));

        dealTypeCombo.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        dealTypeCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Buying", "Selling" }));
        dealTypeCombo.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(300, 300, 300))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(142, 142, 142)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel6)
                                .addComponent(jLabel9)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel2))
                                    .addGap(50, 50, 50)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(CustomerContactTextBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                                .addComponent(customerNameTextBox, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel12)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(CustomerCnicTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jButton1)
                                                    .addGap(63, 63, 63))))
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(propertyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(blockSectorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(societyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(soldPurhaseDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(demandSoldPriceTextBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                                                .addComponent(addressTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(statusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(dealTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(0, 0, Short.MAX_VALUE))))))
                        .addGap(310, 310, 310))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(dealTypeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(statusCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(propertyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(blockSectorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(societyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(demandSoldPriceTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(soldPurhaseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(customerNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(CustomerCnicTextbox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(CustomerContactTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(20, 20, 20))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void soldPurhaseDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soldPurhaseDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soldPurhaseDateActionPerformed

    private void customerNameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNameTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerNameTextBoxActionPerformed

    private void CustomerCnicTextboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerCnicTextboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CustomerCnicTextboxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/areebassociates","root","babarihs");
            if(con!=null){
                System.out.println("Connection established");
                String deal = dealTypeCombo.getSelectedItem().toString();
                String status = statusCombo.getSelectedItem().toString();
                String property = propertyCombo.getSelectedItem().toString();
                String address = addressTextBox.getText();
                String streetBlock = blockSectorCombo.getSelectedItem().toString();
                String society = societyCombo.getSelectedItem().toString();
                int demandSoldPrice=0;
                if(demandSoldPriceTextBox.getText()!=null || demandSoldPriceTextBox.getText()!=""){
                    demandSoldPrice = Integer.parseInt(demandSoldPriceTextBox.getText());
                }
                SimpleDateFormat formater = new SimpleDateFormat("dd-MMM-yyyy");
                String purchaseSoldDate = formater.format(soldPurhaseDate.getDate());
                
                String remarks = remarksTextArea.getText();
                String custName = customerNameTextBox.getText();
                String custCnic = CustomerCnicTextbox.getText();
                String custNummber = CustomerContactTextBox.getText();
                
                String query = "insert into newrecord values(default,'" +deal+"','"+status+"','"+property+"','"+address+"','"+streetBlock+"','"+society+"',"+demandSoldPrice+",STR_TO_DATE('"+purchaseSoldDate+"', '%d-%M-%Y'),'"+remarks+"','"+custName+"','"+custCnic+"','"+custNummber+"')";
                Statement st = con.createStatement();
                int n =  st.executeUpdate(query);
                if(n>0){
                    JOptionPane optionPane = new JOptionPane("Record has been added succesfully",JOptionPane.INFORMATION_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Record Added!");
                    dialog.setAlwaysOnTop(true); // to show top of all other application
                    dialog.setVisible(true); // to visible the dialog
                    dealTypeCombo.setSelectedIndex(0);
                    statusCombo.setSelectedIndex(0);
                    propertyCombo.setSelectedIndex(0);
                    addressTextBox.setText(null);
                    blockSectorCombo.setSelectedIndex(0);
                    societyCombo.setSelectedIndex(0);
                    demandSoldPriceTextBox.setText(null);
                    soldPurhaseDate.setDate(new Date());
                    remarksTextArea.setText(null);
                    customerNameTextBox.setText(null);
                    CustomerCnicTextbox.setText(null);
                    CustomerContactTextBox.setText(null);
                            
                }else{
                    JOptionPane optionPane = new JOptionPane("Failed to add new record",JOptionPane.ERROR_MESSAGE);
                    JDialog dialog = optionPane.createDialog("Failed!");
                    dialog.setAlwaysOnTop(true); // to show top of all other application
                    dialog.setVisible(true); // to visible the dialog
                }
               }else{
                JOptionPane optionPane = new JOptionPane("Can not connect to Database",JOptionPane.ERROR_MESSAGE);
                JDialog dialog = optionPane.createDialog("Error!");
                dialog.setAlwaysOnTop(true); // to show top of all other application
                dialog.setVisible(true); // to visible the dialog
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addRecord.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(addRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addRecord().setVisible(true);
                
                // iconURL is null when not found
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CustomerCnicTextbox;
    private javax.swing.JTextField CustomerContactTextBox;
    private javax.swing.JTextField addressTextBox;
    private javax.swing.JComboBox blockSectorCombo;
    private javax.swing.JTextField customerNameTextBox;
    private javax.swing.JComboBox dealTypeCombo;
    private javax.swing.JTextField demandSoldPriceTextBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox propertyCombo;
    private javax.swing.JTextArea remarksTextArea;
    private javax.swing.JComboBox societyCombo;
    private org.jdesktop.swingx.JXDatePicker soldPurhaseDate;
    private javax.swing.JComboBox statusCombo;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("newLogo.png")));
    }
}
