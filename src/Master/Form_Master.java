/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Master;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author harip
 */
public class Form_Master extends javax.swing.JFrame {

    /**
     * Creates new form Form_Master
     */
    public Form_Master() {
        initComponents();
        Tanggal_sekarang();
        Jam_digital();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable (false);
    }
    
    public void Tanggal_sekarang(){
        java.util.Date sekarang = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat ("yyyy-MM-dd") ;
        tanggal.setText(kal.format(sekarang));
    }
    
     public void Jam_digital(){
        new Thread(){
            @Override
            public void run(){
                int waktu_mulai = 0;
                while (waktu_mulai == 0){
                Calendar kalender = new GregorianCalendar();
                int jam = kalender.get(Calendar.HOUR);
                int menit = kalender.get(Calendar.MINUTE);
                int detik = kalender.get(Calendar.SECOND);
                int AM_PM = kalender.get(Calendar.AM_PM);
                String siang_malam = "";
                if (AM_PM == 1){
                    siang_malam = "PM";
                }
                else {
                    siang_malam = "AM";
                }
                String time = jam+" : "+menit+" : "+detik+" "+siang_malam;
                label_jam.setText(time);
                }
            }
        }.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tanggal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label_jam = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        btsaran = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        btmenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 710));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image 32pixel/buka.png"))); // NOI18N
        jButton2.setText("Buka");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 530, 110, -1));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image 32pixel/buka.png"))); // NOI18N
        jButton3.setText("Buka");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 530, 110, -1));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image 32pixel/buka.png"))); // NOI18N
        jButton4.setText("Buka");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 530, 110, -1));

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image 32pixel/buka.png"))); // NOI18N
        jButton5.setText("Buka");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 530, 110, -1));

        jLabel9.setFont(new java.awt.Font("Forte", 0, 36)); // NOI18N
        jLabel9.setText("Master");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 90, 130, -1));

        jLabel10.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel10.setText("Karyawan");
        jLabel10.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 204, 204), new java.awt.Color(102, 0, 0), null)));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        jLabel13.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel13.setText("Donatur");
        jLabel13.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 204, 204), new java.awt.Color(102, 0, 0), null)));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, -1, -1));

        jLabel14.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel14.setText("Admin");
        jLabel14.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 204, 204), new java.awt.Color(102, 0, 0), null)));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 180, -1, -1));

        tanggal.setBackground(new java.awt.Color(255, 255, 255));
        tanggal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tanggal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image 32pixel/calendar.png"))); // NOI18N
        tanggal.setText(" Tanggal");
        getContentPane().add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 186, 216));

        label_jam.setBackground(new java.awt.Color(255, 255, 255));
        label_jam.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
        label_jam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image 32pixel/clock.png"))); // NOI18N
        label_jam.setText(" Jam");
        jPanel1.add(label_jam);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 90, 170, 40));

        jLabel4.setFont(new java.awt.Font("Forte", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Lembaga");
        jLabel4.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 204, 204), new java.awt.Color(102, 0, 0), null)));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 180, 160, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image umum/division.png"))); // NOI18N
        jLabel5.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 0, 153), new java.awt.Color(51, 204, 0), null), new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true)));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, -1, 230));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image umum/admin.png"))); // NOI18N
        jLabel6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 0, 153), new java.awt.Color(51, 204, 0), null), new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true)));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 230, -1, 230));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image umum/donor-consent-form.png"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 0, 153), new java.awt.Color(51, 204, 0), null), new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true)));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, -1, 230));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image umum/building.png"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(204, 0, 153), new java.awt.Color(51, 204, 0), null), new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 204), 2, true)));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 228, -1, 230));

        jButton8.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image 32pixel/arrow.png"))); // NOI18N
        jButton8.setText("LogOut");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 630, 130, 40));

        jButton10.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image 32pixel/exit.png"))); // NOI18N
        jButton10.setText("Exit");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 620, 110, 40));

        btsaran.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        btsaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image 32pixel/report.png"))); // NOI18N
        btsaran.setText("Saran");
        btsaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsaranActionPerformed(evt);
            }
        });
        getContentPane().add(btsaran, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 110, 40));

        jButton6.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image 32pixel/report.png"))); // NOI18N
        jButton6.setText("Ebout");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, 110, 40));

        jButton9.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image 32pixel/report.png"))); // NOI18N
        jButton9.setText(" Data Laporan");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, 180, 40));

        jButton12.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image 32pixel/cash-flow.png"))); // NOI18N
        jButton12.setText("STOK & KAS");
        jButton12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton12.setDoubleBuffered(true);
        jButton12.setFocusCycleRoot(true);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 180, 40));

        jButton13.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image 32pixel/money-transfer.png"))); // NOI18N
        jButton13.setText("TRANSAKSI");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 160, 40));

        jButton16.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image 32pixel/data.png"))); // NOI18N
        jButton16.setText("MASTER");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 160, 40));

        btmenu.setFont(new java.awt.Font("Gill Sans MT", 0, 17)); // NOI18N
        btmenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image 32pixel/home.png"))); // NOI18N
        btmenu.setText("MENU");
        btmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmenuActionPerformed(evt);
            }
        });
        getContentPane().add(btmenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 160, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Image umum/Menu Umum.jpg"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(1280, 720));
        jLabel2.setMinimumSize(new java.awt.Dimension(1280, 720));
        jLabel2.setPreferredSize(new java.awt.Dimension(1280, 720));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new Master.Form_Karyawan().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        new Master.Form_Donatur().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        new Master.Form_Admin().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new Master.Form_Lembaga_Penerima().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        //          String ObjButtons[] = {"Yes","No"};
        // int pilihan = JOptionPane.showOptionDialog(null,"Apakah Anda Yakin Ingin keluar dari Aplikasi ?","Message",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,ObjButtons,ObjButtons[1]);
        // if(pilihan == 0){
            new Login.Form_Login().setVisible(true);
            dispose();
            //        System.exit(0);

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        String ObjButtons[] = {"Yes","No"};
        int pilihan = JOptionPane.showOptionDialog(null,"Apakah Anda Yakin Ingin keluar dari Aplikasi ?","Message",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,ObjButtons,ObjButtons[1]);
        if(pilihan == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btsaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsaranActionPerformed
        // TODO add your handling code here:
        Form_Ebout_FeedBack.Form_FeedBack frm = new Form_Ebout_FeedBack.Form_FeedBack(this, rootPaneCheckingEnabled);
        frm.setTitle("Saran");
        frm.setVisible(true);
    }//GEN-LAST:event_btsaranActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        new Form_Ebout_FeedBack.Form_Ebout().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        new Output.Form_Tampilan_Laporan().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        new Proses.Form_Stok_Kas().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        new Proses.Form_Transaksi().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        new Master.Form_Master().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void btmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btmenuActionPerformed
        // TODO add your handling code here:
        new Master.Form_Menu_Utama().setVisible(true);
        dispose();
    }//GEN-LAST:event_btmenuActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Master().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btmenu;
    private javax.swing.JButton btsaran;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_jam;
    private javax.swing.JLabel tanggal;
    // End of variables declaration//GEN-END:variables
}
