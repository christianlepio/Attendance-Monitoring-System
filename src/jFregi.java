

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ian
 */
public class jFregi extends javax.swing.JFrame {

    /**
     * Creates new form jFregi
     */
    public jFregi() {
        initComponents();
        //this.setLocationRelativeTo(null);
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
        jLabelclose = new javax.swing.JLabel();
        jLmini = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTxtid = new javax.swing.JTextField();
        jtxtlname = new javax.swing.JTextField();
        jtxtfname = new javax.swing.JTextField();
        jtxtcrs = new javax.swing.JTextField();
        jtxtmi = new javax.swing.JTextField();
        jtxtsec = new javax.swing.JTextField();
        jtxtyr = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jbtnsubmt = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbtnrst = new javax.swing.JButton();
        jComboBoxgen = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("REGISTRATION AREA");

        jLabelclose.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelclose.setText("X");
        jLabelclose.setToolTipText("close tab");
        jLabelclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelcloseMouseClicked(evt);
            }
        });

        jLmini.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLmini.setText("-");
        jLmini.setToolTipText("minimize tab");
        jLmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLminiMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLmini)
                .addGap(18, 18, 18)
                .addComponent(jLabelclose, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelclose)
                    .addComponent(jLmini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student ID:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Last Name:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Section:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("First Name:");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Middle Initial:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Course:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Year:");

        jTxtid.setBackground(new java.awt.Color(153, 153, 153));
        jTxtid.setForeground(new java.awt.Color(255, 255, 255));

        jtxtlname.setBackground(new java.awt.Color(153, 153, 153));
        jtxtlname.setForeground(new java.awt.Color(255, 255, 255));

        jtxtfname.setBackground(new java.awt.Color(153, 153, 153));
        jtxtfname.setForeground(new java.awt.Color(255, 255, 255));

        jtxtcrs.setBackground(new java.awt.Color(153, 153, 153));
        jtxtcrs.setForeground(new java.awt.Color(255, 255, 255));

        jtxtmi.setBackground(new java.awt.Color(153, 153, 153));
        jtxtmi.setForeground(new java.awt.Color(255, 255, 255));

        jtxtsec.setBackground(new java.awt.Color(153, 153, 153));
        jtxtsec.setForeground(new java.awt.Color(255, 255, 255));

        jtxtyr.setBackground(new java.awt.Color(153, 153, 153));
        jtxtyr.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Gender:");

        jbtnsubmt.setText("SUBMIT");
        jbtnsubmt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsubmtActionPerformed(evt);
            }
        });

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jbtnrst.setText("RESET");
        jbtnrst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnrstActionPerformed(evt);
            }
        });

        jComboBoxgen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTxtid, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtcrs, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtmi, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtsec, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtyr, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxgen, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jbtnrst, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jbtnsubmt)
                        .addGap(20, 20, 20))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTxtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtxtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtxtmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jComboBoxgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtcrs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtyr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtsec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnsubmt)
                    .addComponent(jButton2)
                    .addComponent(jbtnrst))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelcloseMouseClicked
        att_GUI eww = new att_GUI();
        eww.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jLabelcloseMouseClicked

    private void jLminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLminiMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLminiMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        att_GUI obj = new att_GUI();
        obj.setVisible(true);
        obj.jPvatt.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    static int bilan =0 ;
    static int bo=0,c=0,h=0,r=0,boo=0,s=0,t=0,n=0,wew=0;
    private void jbtnsubmtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsubmtActionPerformed

        
        
        String genValue = jComboBoxgen.getSelectedItem().toString();
        String idd = jTxtid.getText();
        String lnn = jtxtlname.getText();
        String fnn = jtxtfname.getText();
        String mnn = jtxtmi.getText();
        String yrr = jtxtyr.getText();
        String secc = jtxtsec.getText();
        String crss = jtxtcrs.getText();
        
        String id[] = new String[100] , ln[] = new String[100] , fn[] = new String[100] , mn[] = new String[100] , gen[] = new String[100] , crs[] = new String[100] , yr[] = new String[100] , sec[] = new String[100] ;
        
        if(bilan == 1){
            if(idd.isBlank()||lnn.isBlank()||fnn.isBlank()||mnn.isBlank()||yrr.isBlank()||secc.isBlank()||crss.isBlank()){
            JOptionPane.showMessageDialog(null , "You must fill out all the entries." , "ERROR" , JOptionPane.INFORMATION_MESSAGE);
        }
            else{
            lnn = lnn.toUpperCase();
            mnn = mnn.toUpperCase();
            secc = secc.toUpperCase();
            crss = crss.toUpperCase();
            
            att_GUI aobj = new att_GUI();
            //test...
            //JOptionPane.showMessageDialog(null,aobj.sIDD,"mess",JOptionPane.PLAIN_MESSAGE );
            
            File fil = new File("BOBO.txt");
            
            try {
                BufferedReader brr = new BufferedReader(new FileReader(fil));
                
                String fline = brr.readLine().trim();
                String[] col = fline.split(",");
                DefaultTableModel mod = (DefaultTableModel)aobj.jtbdatabase.getModel();
                mod.setColumnIdentifiers(col);
                
                Object[] tbl = brr.lines().toArray();
                for(int i=0 ; i<tbl.length ; i++){
                    String line = tbl[i].toString().trim();
                    String[] row = line.split("/");
                    
                    for(int x=0 ; x<row.length ; x++){
                        if(x == 0){
                            id[bo] = row[x];
                            bo++;
                            wew++;
                        }
                        else if(x == 1){
                            ln[c] = row[x];
                            c++;
                        }
                        else if(x == 2){
                            fn[h] = row[x];
                            h++;
                        }
                        else if(x == 3){
                            mn[r] = row[x];
                            r++;
                        }
                        else if(x == 4){
                            gen[boo] = row[x];
                            boo++;
                        }
                        else if(x == 5){
                            crs[s] = row[x];
                            s++;
                        }
                        else if(x == 6){
                            yr[t] = row[x];
                            t++;
                        }
                        else if(x == 7){
                            sec[n] = row[x];
                            n++;
                        }
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(jFregi.class.getName()).log(Level.SEVERE, null, ex);
            }
            int pp=0;
            
            for(int i=0 ; i<wew ; i++){
                if(aobj.sIDD.equals(id[i])){
                    pp=i;
                    id[pp] = idd;
                    ln[pp] = lnn;
                    fn[pp] = fnn;
                    mn[pp] = mnn;
                    gen[pp] = genValue;
                    crs[pp] = crss;
                    yr[pp] = yrr;
                    sec[pp] = secc;
                    
                    try {
                        int ii = JOptionPane.showConfirmDialog(null, "Are you sure you want to submit updated data?","UPDATE",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(ii == JOptionPane.YES_OPTION){        
                FileOutputStream fos = new FileOutputStream("BOBO.txt");
                PrintWriter pw = new PrintWriter(fos);
                pw.print("Stud_ID,L_name,F_name,M_ini,Gender,Course,Year,Section\n");
                for(int j=0 ; j<wew ; j++){
                    pw.println(id[j]+"/"+ln[j]+"/"+fn[j]+"/"+mn[j]+"/"+gen[j]+"/"+crs[j]+"/"+yr[j]+"/"+sec[j]);
                }
                pw.close();
                aobj.setVisible(true);
                this.dispose();
                }
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(att_GUI.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
                }
            }
            wew = 0;
            bo=0 ;
            c=0 ;
            h=0 ;
            r=0 ;
            boo=0 ;
            s=0 ;
            t=0 ;
            n=0 ;
            wew=0;
            bilan = 0;
            }
        }
        
        
        else if(bilan != 1){
        
        if(idd.isBlank()||lnn.isBlank()||fnn.isBlank()||mnn.isBlank()||yrr.isBlank()||secc.isBlank()||crss.isBlank()){
            JOptionPane.showMessageDialog(null , "You must fill out all the entries." , "ERROR" , JOptionPane.INFORMATION_MESSAGE);
        }
        else{
        lnn = lnn.toUpperCase();
        mnn = mnn.toUpperCase();
        secc = secc.toUpperCase();
        crss = crss.toUpperCase();
        
        try {
            int op = JOptionPane.showConfirmDialog(null, "Are you sure you want to submit data? " , "SAVE" ,JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE );
            if(op == JOptionPane.YES_OPTION){
            FileOutputStream fos = new FileOutputStream("BOBO.txt" , true);
                try (PrintWriter sulat = new PrintWriter(fos)) {
                    sulat.println(idd + "/" + lnn + "/" + fnn+"/" + mnn +"/" + genValue + "/"+ crss+"/"+yrr + "/" +secc );
                }
            att_GUI obj = new att_GUI();
            obj.setVisible(true);
            this.dispose();
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(jFregi.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        }   
     bilan = 0;   
    }//GEN-LAST:event_jbtnsubmtActionPerformed

    private void jbtnrstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnrstActionPerformed
        jTxtid.setText("");
        jtxtlname.setText("");
        jtxtfname.setText("");
        jtxtmi.setText("");
        jtxtcrs.setText("");
        jtxtyr.setText("");
        jtxtsec.setText("");
    }//GEN-LAST:event_jbtnrstActionPerformed

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
            java.util.logging.Logger.getLogger(jFregi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFregi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFregi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFregi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFregi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    public javax.swing.JComboBox<String> jComboBoxgen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelclose;
    private javax.swing.JLabel jLmini;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField jTxtid;
    private javax.swing.JButton jbtnrst;
    private javax.swing.JButton jbtnsubmt;
    public javax.swing.JTextField jtxtcrs;
    public javax.swing.JTextField jtxtfname;
    public javax.swing.JTextField jtxtlname;
    public javax.swing.JTextField jtxtmi;
    public javax.swing.JTextField jtxtsec;
    public javax.swing.JTextField jtxtyr;
    // End of variables declaration//GEN-END:variables
}