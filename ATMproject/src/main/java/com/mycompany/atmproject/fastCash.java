/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.atmproject;

//import import java.time.Clock;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JOptionPane;


/**
 *
 * @author saiko_stores
 */
public class fastCash extends javax.swing.JFrame {
String file = "G:\\jo.dat";
   ATM atm = new ATM();
   String accNum ;
   String pinCode;
   String balance;
    /**
     * Creates new form fastCash
     */
    public fastCash() {
        initComponents();
    }
     public fastCash(String accNum , String pinCode , String balance) {
        initComponents();
        this.accNum=accNum;
        this.pinCode=pinCode;
        this.balance=balance;
        jLabel2.setText("your balance = "+balance);
        
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Fast Cash");

        jLabel2.setText("balance");

        jButton1.setText("500 pound");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2000 pound");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("10000 pound");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("100 pound");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("1000 pound");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("5000 pound");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton5)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton7)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton5))
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (2000>Double.parseDouble(atm.getBalance(file, accNum, pinCode)))
        {
            JOptionPane.showMessageDialog(null,"balance not enough", "Report" , JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
        double newBalance = Double.parseDouble(atm.getBalance(file, accNum, pinCode))-2000;
        atm.modifyBalance(file, Double.toString(newBalance), accNum, pinCode);
        JOptionPane.showMessageDialog(null,"balance updated", "Report" , JOptionPane.INFORMATION_MESSAGE);
        DateTimeFormatter formatter =
        DateTimeFormatter.ofLocalizedDateTime( FormatStyle.SHORT )
                     .withLocale( Locale.UK )
                     .withZone( ZoneId.systemDefault() );
        Instant instant = Instant.now();
        String output = formatter.format( instant );
        System.out.println(output);
        atm.miniStatement(file, accNum, pinCode, "Withdraw",output, "2000");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         if (100>Double.parseDouble(atm.getBalance(file, accNum, pinCode)))
        {
            JOptionPane.showMessageDialog(null,"balance not enough", "Report" , JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
        double newBalance = Double.parseDouble(atm.getBalance(file, accNum, pinCode))-100;
        atm.modifyBalance(file, Double.toString(newBalance), accNum, pinCode);
        JOptionPane.showMessageDialog(null,"balance updated", "Report" , JOptionPane.INFORMATION_MESSAGE);
         DateTimeFormatter formatter =
        DateTimeFormatter.ofLocalizedDateTime( FormatStyle.SHORT )
                     .withLocale( Locale.UK )
                     .withZone( ZoneId.systemDefault() );
        Instant instant = Instant.now();
        String output = formatter.format( instant );
        atm.miniStatement(file, accNum, pinCode, "Withdraw",output, "100");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       if (500>Double.parseDouble(atm.getBalance(file, accNum, pinCode)))
        {
            JOptionPane.showMessageDialog(null,"balance not enough", "Report" , JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
        double newBalance = Double.parseDouble(atm.getBalance(file, accNum, pinCode))-500;
        atm.modifyBalance(file, Double.toString(newBalance), accNum, pinCode);
        JOptionPane.showMessageDialog(null,"balance updated", "Report" , JOptionPane.INFORMATION_MESSAGE);
         DateTimeFormatter formatter = 
        DateTimeFormatter.ofLocalizedDateTime( FormatStyle.SHORT )
                     .withLocale( Locale.UK )
                     .withZone( ZoneId.systemDefault() );
        Instant instant = Instant.now();
        String output = formatter.format( instant );
        atm.miniStatement(file, accNum, pinCode, "Withdraw",output, "500");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         if (10000>Double.parseDouble(atm.getBalance(file, accNum, pinCode)))
        {
            JOptionPane.showMessageDialog(null,"balance not enough", "Report" , JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
        double newBalance = Double.parseDouble(atm.getBalance(file, accNum, pinCode))-10000;
        atm.modifyBalance(file, Double.toString(newBalance), accNum, pinCode);
        JOptionPane.showMessageDialog(null,"balance updated", "Report" , JOptionPane.INFORMATION_MESSAGE);
         DateTimeFormatter formatter =
        DateTimeFormatter.ofLocalizedDateTime( FormatStyle.SHORT )
                     .withLocale( Locale.UK )
                     .withZone( ZoneId.systemDefault() );
        Instant instant = Instant.now();
        String output = formatter.format( instant );
        atm.miniStatement(file, accNum, pinCode, "Withdraw",output, "10000");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         if (1000>Double.parseDouble(atm.getBalance(file, accNum, pinCode)))
        {
            JOptionPane.showMessageDialog(null,"balance not enough", "Report" , JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
        double newBalance = Double.parseDouble(atm.getBalance(file, accNum, pinCode))-1000;
        atm.modifyBalance(file, Double.toString(newBalance), accNum, pinCode);
        JOptionPane.showMessageDialog(null,"balance updated", "Report" , JOptionPane.INFORMATION_MESSAGE);
        DateTimeFormatter formatter =
        DateTimeFormatter.ofLocalizedDateTime( FormatStyle.SHORT )
                     .withLocale( Locale.UK )
                     .withZone( ZoneId.systemDefault() );
        Instant instant = Instant.now();
        String output = formatter.format( instant );
        atm.miniStatement(file, accNum, pinCode, "Withdraw",output, "1000");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         if (5000>Double.parseDouble(atm.getBalance(file, accNum, pinCode)))
        {
            JOptionPane.showMessageDialog(null,"balance not enough", "Report" , JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
        double newBalance = Double.parseDouble(atm.getBalance(file, accNum, pinCode))-5000;
        atm.modifyBalance(file, Double.toString(newBalance), accNum, pinCode);
        JOptionPane.showMessageDialog(null,"balance updated", "Report" , JOptionPane.INFORMATION_MESSAGE);
        DateTimeFormatter formatter =
        DateTimeFormatter.ofLocalizedDateTime( FormatStyle.SHORT )
                     .withLocale( Locale.UK )
                     .withZone( ZoneId.systemDefault() );
        Instant instant = Instant.now();
        String output = formatter.format( instant );
        atm.miniStatement(file, accNum, pinCode, "Withdraw",output, "5000");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Bank bank = new Bank(accNum , pinCode);
        bank.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(fastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fastCash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fastCash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
