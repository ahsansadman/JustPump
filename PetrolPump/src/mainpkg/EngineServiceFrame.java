/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.basic.BasicButtonUI;
import myclasses.Customer;

/**
 *
 * @author Sadman's Den
 */
public class EngineServiceFrame extends javax.swing.JFrame {

    /**
     * Creates new form EngineServiceFrame
     */
    Customer activeUser = null;
    
    public EngineServiceFrame() {
        initComponents();
        generatePriceBtn.setUI((ButtonUI) BasicButtonUI.createUI(generatePriceBtn));
        proceedBtn.setUI((ButtonUI) BasicButtonUI.createUI(proceedBtn));
        homeBtn.setUI((ButtonUI) BasicButtonUI.createUI(homeBtn));
        this.setLocationRelativeTo(null);
    }
     public EngineServiceFrame(Customer c) {
        initComponents();
        activeUser = c;
        generatePriceBtn.setUI((ButtonUI) BasicButtonUI.createUI(generatePriceBtn));
        proceedBtn.setUI((ButtonUI) BasicButtonUI.createUI(proceedBtn));
        homeBtn.setUI((ButtonUI) BasicButtonUI.createUI(homeBtn));
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        proceedBtn = new javax.swing.JButton();
        priceTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        airFilterCheckBox = new javax.swing.JCheckBox();
        pickUpCheckBox = new javax.swing.JCheckBox();
        oilFilterCheckBox = new javax.swing.JCheckBox();
        engineOilCheckBox = new javax.swing.JCheckBox();
        regularCheckBox = new javax.swing.JCheckBox();
        generatePriceBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(248, 148, 6));

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        proceedBtn.setBackground(new java.awt.Color(34, 167, 240));
        proceedBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        proceedBtn.setForeground(new java.awt.Color(255, 255, 255));
        proceedBtn.setText("Proceed");
        proceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBtnActionPerformed(evt);
            }
        });

        priceTxt.setBackground(new java.awt.Color(108, 122, 107));
        priceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTxtActionPerformed(evt);
            }
        });

        airFilterCheckBox.setBackground(new java.awt.Color(44, 62, 80));
        airFilterCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        airFilterCheckBox.setText("Air Filter Change");
        airFilterCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airFilterCheckBoxActionPerformed(evt);
            }
        });

        pickUpCheckBox.setBackground(new java.awt.Color(44, 62, 80));
        pickUpCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        pickUpCheckBox.setText("Car Pick Up/Delivery Service");
        pickUpCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickUpCheckBoxActionPerformed(evt);
            }
        });

        oilFilterCheckBox.setBackground(new java.awt.Color(44, 62, 80));
        oilFilterCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        oilFilterCheckBox.setText("Changing Oil Filter");
        oilFilterCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oilFilterCheckBoxActionPerformed(evt);
            }
        });

        engineOilCheckBox.setBackground(new java.awt.Color(44, 62, 80));
        engineOilCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        engineOilCheckBox.setText("Changin Engine Oil");

        regularCheckBox.setBackground(new java.awt.Color(44, 62, 80));
        regularCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        regularCheckBox.setText("Regular Maintance");

        generatePriceBtn.setBackground(new java.awt.Color(255, 51, 51));
        generatePriceBtn.setText("Generate Price (BDT) :");
        generatePriceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePriceBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(airFilterCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pickUpCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(regularCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(engineOilCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(oilFilterCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(generatePriceBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(proceedBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regularCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(engineOilCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oilFilterCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pickUpCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(airFilterCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(generatePriceBtn))
                .addGap(26, 26, 26)
                .addComponent(proceedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        homeBtn.setBackground(new java.awt.Color(255, 51, 51));
        homeBtn.setText("Home");
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(homeBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(homeBtn)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void oilFilterCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oilFilterCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_oilFilterCheckBoxActionPerformed

    private void pickUpCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickUpCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pickUpCheckBoxActionPerformed

    private void airFilterCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airFilterCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_airFilterCheckBoxActionPerformed

    private void proceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBtnActionPerformed
            File file = new File("EngineServiceSalesList.txt");
            BufferedWriter bw = null;
            try {
                if(!file.exists()) bw = new BufferedWriter(new FileWriter(file));
                else  {
                bw = new BufferedWriter(new FileWriter("EngineServiceSalesList.txt",true));
                }
            }   
            catch (IOException ex) {
                Logger.getLogger(BuyFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        int value;
        value = JOptionPane.showConfirmDialog(null, "Your Bill is : "+ totalPrice);
        if(value == 0){
                activeUser.payBill(totalPrice);
                     try {
             bw.write(activeUser.getId()+","+totalPrice);
             bw.newLine();
             bw.close();
         }  catch (IOException ex) {
             Logger.getLogger(BuyFrame.class.getName()).log(Level.SEVERE, null, ex);
         }
            }
       
    }//GEN-LAST:event_proceedBtnActionPerformed

    private void priceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceTxtActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        customerFrame c = new customerFrame(activeUser);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_homeBtnActionPerformed

    private void generatePriceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePriceBtnActionPerformed

       int value;
       if(airFilterCheckBox.isSelected())   totalPrice += 2500;
       if(engineOilCheckBox.isSelected())   totalPrice += 2000;
       if(regularCheckBox.isSelected())     totalPrice += 3000;
       if(pickUpCheckBox.isSelected())      totalPrice += 1000;
       if(oilFilterCheckBox.isSelected())   totalPrice += 2000;
       
       priceTxt.setText(""+totalPrice);
    }//GEN-LAST:event_generatePriceBtnActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EngineServiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EngineServiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EngineServiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EngineServiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EngineServiceFrame().setVisible(true);
            }
        });
    }
    float totalPrice = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox airFilterCheckBox;
    private javax.swing.JCheckBox engineOilCheckBox;
    private javax.swing.JButton generatePriceBtn;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox oilFilterCheckBox;
    private javax.swing.JCheckBox pickUpCheckBox;
    private javax.swing.JTextField priceTxt;
    private javax.swing.JButton proceedBtn;
    private javax.swing.JCheckBox regularCheckBox;
    // End of variables declaration//GEN-END:variables
}