package SourceCode;

import javax.swing.*;

/**
 *
 * @author sajja
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        
        ImageIcon frameIcon = new ImageIcon("src/images/appIcon.png");
        this.setIconImage(frameIcon.getImage());
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
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        searchGo = new javax.swing.JButton();
        viewGo = new javax.swing.JButton();
        helpGo = new javax.swing.JButton();
        adminGo = new javax.swing.JButton();
        aboutGo = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/titleName.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel1)
                .addContainerGap(250, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 80));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(null));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("App Version 0.1v");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/appMain.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 130, 420));

        jPanel3.setBackground(new java.awt.Color(225, 255, 253));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        searchGo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search.gif"))); // NOI18N
        searchGo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchGoActionPerformed(evt);
            }
        });
        jPanel3.add(searchGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        viewGo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        viewGo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        viewGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewGoActionPerformed(evt);
            }
        });
        jPanel3.add(viewGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, -1));

        helpGo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help.png"))); // NOI18N
        helpGo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        helpGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpGoActionPerformed(evt);
            }
        });
        jPanel3.add(helpGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        adminGo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin.png"))); // NOI18N
        adminGo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminGoActionPerformed(evt);
            }
        });
        jPanel3.add(adminGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 231, -1, -1));

        aboutGo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/about.png"))); // NOI18N
        aboutGo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aboutGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutGoActionPerformed(evt);
            }
        });
        jPanel3.add(aboutGo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 231, -1, -1));

        logoutBtn.setBackground(new java.awt.Color(204, 255, 255));
        logoutBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 0, 0));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        logoutBtn.setText("Logout");
        logoutBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel3.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(671, 379, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 770, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchGoActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == searchGo) {
            SearchForm searchform = new SearchForm();
            searchform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            searchform.setVisible(true);
        }
    }//GEN-LAST:event_searchGoActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == logoutBtn) {
//            System.exit(0);       //to end the running application system.
            setVisible(false);
            new LoginForm().setVisible(true);
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void viewGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewGoActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == viewGo) {
            ViewForm viewform = new ViewForm();
            viewform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            viewform.setVisible(true);
        }
    }//GEN-LAST:event_viewGoActionPerformed

    private void helpGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpGoActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == helpGo) {
            HelpForm helpform = new HelpForm();
            helpform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            helpform.setVisible(true);
        }
    }//GEN-LAST:event_helpGoActionPerformed

    private void aboutGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutGoActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == aboutGo) {
            AboutForm aboutform = new AboutForm();
            aboutform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            aboutform.setVisible(true);
        }
    }//GEN-LAST:event_aboutGoActionPerformed

    private void adminGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminGoActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == adminGo) {
            AdminCheckForm admincheckform = new AdminCheckForm();
            admincheckform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            admincheckform.setVisible(true);
        }
    }//GEN-LAST:event_adminGoActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutGo;
    private javax.swing.JButton adminGo;
    private javax.swing.JButton helpGo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton searchGo;
    private javax.swing.JButton viewGo;
    // End of variables declaration//GEN-END:variables
}
