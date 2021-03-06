/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.basic.BasicButtonUI;
import javax.swing.table.DefaultTableModel;
import myclasses.Fuel;

/**
 *
 * @author Sadman's Den
 */
public class StorageInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form StorageInternalFrame
     */
    public StorageInternalFrame() {
        initComponents();
        updateBtn.setUI((ButtonUI) BasicButtonUI.createUI(updateBtn));
        loadStorageTableBtn.setUI((ButtonUI) BasicButtonUI.createUI(loadStorageTableBtn));

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
        loadStorageTableBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        storageTable = new javax.swing.JTable();
        updateBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(44, 62, 80));

        loadStorageTableBtn.setBackground(new java.awt.Color(255, 51, 51));
        loadStorageTableBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loadStorageTableBtn.setText("Load Storage Table");
        loadStorageTableBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadStorageTableBtnActionPerformed(evt);
            }
        });

        storageTable.setBackground(new java.awt.Color(204, 204, 204));
        storageTable.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        storageTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Type", "Amount (liters)"
            }
        ));
        jScrollPane4.setViewportView(storageTable);

        updateBtn.setBackground(new java.awt.Color(34, 167, 240));
        updateBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateBtn.setText("Update Storage");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loadStorageTableBtn)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(loadStorageTableBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadStorageTableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadStorageTableBtnActionPerformed
       float sPetrol = 0, sOctane = 0, sDiesel = 0, sKerosene = 0;
       
       
       File file = new File("myTempFuelSalesList.txt");
       if(file.exists()){
       ArrayList<String> list = new ArrayList();
        Scanner s = null;
        try {
            s = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CarWashInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
           while (s.hasNextLine()){
                list.add(s.nextLine());
            }
            s.close();
        
        for(String ss : list){
            String[] str = ss.split(",");
            if(str[1].equals("Petrol")) sPetrol+= Float.parseFloat(str[3]);
            if(str[1].equals("Octane")) sOctane+= Float.parseFloat(str[3]);
            if(str[1].equals("Diesel")) sDiesel+= Float.parseFloat(str[3]);
            if(str[1].equals("Kerosene")) sKerosene+= Float.parseFloat(str[3]);
        }
    
           Scanner sc = null;
        try {
            sc = new Scanner(new File("FuelStorageList.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CarWashInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
           while (sc.hasNextLine()){
                fuelList.add(sc.nextLine());
            }
            sc.close();
        
         for(String ss : fuelList){
             String[] str = ss.split(",");
             if(str[0].equals("Petrol")) {
                 rPetrol = Float.parseFloat(str[1]) - sPetrol;
             }
             if(str[0].equals("Octane")) {
                 rOctane = Float.parseFloat(str[1]) - sOctane;
             }
             if(str[0].equals("Diesel")) {
                 rDiesel = Float.parseFloat(str[1]) - sDiesel;
             }
             if(str[0].equals("Kerosene")) {
                 rKerosene = Float.parseFloat(str[1]) - sKerosene;
             }
             
        }
     
         DefaultTableModel dm = new DefaultTableModel();
         dm = (DefaultTableModel)storageTable.getModel();
         dm.addRow(new Object[]{"Petrol" , rPetrol});
         dm.addRow(new Object[]{"Octane" , rOctane});
         dm.addRow(new Object[]{"Diesel" , rDiesel});
         dm.addRow(new Object[]{"Kerosene" , rKerosene});
         
        boolean success = file.delete();
    }
       else{
           
           File f1 = new File("FuelStorageList.txt");
           ArrayList<String> list2 = new ArrayList();
           Scanner sx = null;
        try {
            sx = new Scanner(f1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CarWashInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
           while (sx.hasNextLine()){
                list2.add(sx.nextLine());
            }
            sx.close();
       
       
       DefaultTableModel dm2 = new DefaultTableModel();
         dm2 = (DefaultTableModel)storageTable.getModel();
         
         for(String sr : list2){
             String [] sf = sr.split(",");
             dm2.addRow(new Object[]{sf[0] , sf[1]});
         }
       
       } 
    }//GEN-LAST:event_loadStorageTableBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
      
        Fuel petrol = new Fuel("Petrol", 85 , rPetrol) ;
        Fuel diesel = new Fuel("Diesel", 55 , rOctane) ;
        Fuel octane = new Fuel("Octane", 90 , rDiesel) ;
        Fuel kerosene = new Fuel("Kerosene", 45 , rKerosene) ;
        newList.add(petrol);newList.add(octane);newList.add(diesel);newList.add(kerosene);
         
        
         File file1 = new File ("FuelStorage.bin");
         File file2 = new File ("myTempFuelStorage.bin");
         
         if(file1.delete()) 
        { 
            System.out.println(file1.getName() + "File deleted successfully"); 
        } 
        else
        { 
           System.out.println(file1.getName() +" Failed to delete the file"); 
        }
        
         boolean append=true;
        try{
            ObjectOutputStream out=null;
            if (!file2.exists () || !append) out =
                new ObjectOutputStream (new FileOutputStream (file2));
            else out = 
                new AppendableObjectOutputStream (new FileOutputStream (file2, append));
           //ObjectOutputStream out   = new ObjectOutputStream (new FileOutputStream ("studentObjects.bin",true));
            for(Fuel f: newList) out.writeObject(f);
            out.close();
        }
        catch(Exception e){}
        boolean successful = file2.renameTo(file1);
        
        File f1 = new File("FuelStorageList.txt");
        File f2 = new File("myTempFuelStorageList.txt");
        BufferedWriter bw2 = null;
            try {
                if(!f2.exists()) bw2 = new BufferedWriter(new FileWriter(f2));
                else  {
                bw2 = new BufferedWriter(new FileWriter(f2,true));
                }
            }   
            catch (IOException ex) {
                Logger.getLogger(BuyFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        boolean success = f1.delete();
        try{
        for(Fuel ss : newList){
             if(ss.getfName().equals("Petrol")) {
                 bw2.write(ss.getfName()+","+rPetrol);
                 bw2.newLine();
             }
             if(ss.getfName().equals("Octane")){
                bw2.write(ss.getfName()+","+rOctane);
                bw2.newLine();
             }
             if(ss.getfName().equals("Diesel")) {
                  bw2.write(ss.getfName()+","+rDiesel);
                  bw2.newLine();
             }
             if(ss.getfName().equals("Kerosene")){
                  bw2.write(ss.getfName()+","+rKerosene);
                  bw2.newLine();
             }
         }
        bw2.close();
        } catch (IOException ex) {
            Logger.getLogger(StorageInternalFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        boolean done = f2.renameTo(f1);
        
        JOptionPane.showMessageDialog(null, "Storage has been updated.");
    }//GEN-LAST:event_updateBtnActionPerformed
    
    
    float rPetrol = 0, rOctane = 0, rDiesel = 0, rKerosene = 0;
     ArrayList<String> fuelList = new ArrayList();
     ArrayList<Fuel> newList = new ArrayList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton loadStorageTableBtn;
    private javax.swing.JTable storageTable;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
