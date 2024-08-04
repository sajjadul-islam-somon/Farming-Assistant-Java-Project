package SourceCode;

import javax.swing.*;
import java.sql.*;

public class LoginForm extends javax.swing.JFrame {

    
    public LoginForm() {
        initComponents();
        
        ImageIcon frameIcon = new ImageIcon("src/images/appIcon.png");
        this.setIconImage(frameIcon.getImage());
    } 

   
    @SuppressWarnings("unchecked")

    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hidePass = new javax.swing.JLabel();
        showPass = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        signBtn = new javax.swing.JButton();
        regBtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        pinField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Artboard.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 400));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Login");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 25, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone Number :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 96, -1, -1));

        jLabel4.setText("_____________________________________________");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 138, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PIN :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 176, -1, -1));

        jLabel6.setText("_____________________________________________");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 218, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconUser.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        hidePass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconHide.png"))); // NOI18N
        hidePass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hidePass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hidePassMouseClicked(evt);
            }
        });
        jPanel2.add(hidePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        showPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/iconEye.png"))); // NOI18N
        showPass.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showPassMouseClicked(evt);
            }
        });
        jPanel2.add(showPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        jLabel9.setForeground(new java.awt.Color(153, 0, 0));
        jLabel9.setText("Forget Password!");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        signBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        signBtn.setText("Sign in");
        signBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signBtnActionPerformed(evt);
            }
        });
        jPanel2.add(signBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 266, 155, 34));

        regBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        regBtn.setText("Register");
        regBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        regBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regBtnActionPerformed(evt);
            }
        });
        jPanel2.add(regBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 155, 34));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Don't have an account? Then, register new account");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        phoneField.setBackground(new java.awt.Color(51, 51, 255));
        phoneField.setFont(phoneField.getFont().deriveFont(phoneField.getFont().getSize()+4f));
        phoneField.setForeground(new java.awt.Color(255, 255, 255));
        phoneField.setBorder(null);
        phoneField.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(phoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 280, -1));

        pinField.setBackground(new java.awt.Color(51, 51, 255));
        pinField.setFont(pinField.getFont().deriveFont(pinField.getFont().getSize()+4f));
        pinField.setForeground(new java.awt.Color(255, 255, 255));
        pinField.setBorder(null);
        pinField.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(pinField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 280, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void hidePassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hidePassMouseClicked
        // TODO add your handling code here:
        pinField.setEchoChar((char)0);
        hidePass.setVisible(false);
        hidePass.setEnabled(false);
        showPass.setVisible(true);
        showPass.setEnabled(true);
    }//GEN-LAST:event_hidePassMouseClicked

    private void showPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showPassMouseClicked
        // TODO add your handling code here:
        pinField.setEchoChar((char)8226);
        hidePass.setVisible(true);
        hidePass.setEnabled(true);
        showPass.setVisible(false);
        showPass.setEnabled(false);
    }//GEN-LAST:event_showPassMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void regBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regBtnActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == regBtn) {
            setVisible(false);
            new RegForm().setVisible(true);
        }
    }//GEN-LAST:event_regBtnActionPerformed

    
    private void signBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signBtnActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == signBtn) {
            
            Connect c = new Connect();
            String phone = phoneField.getText();
            String pin = pinField.getText();
            String query = "select * from signup where phone = '"+phone+"' and pin = '"+pin+"'";
            
            try {
                ResultSet rs = c.s.executeQuery(query);
                if (rs.next()) {
                    String reg = rs.getString("reg");
                    String queryLog = "insert into login value('"+phone+"', '"+pin+"', '"+reg+"')";
                    c.s.executeUpdate(queryLog);
                    
                    setVisible(false);
                    new MainForm().setVisible(true);
                } else {
                    ImageIcon icon = new ImageIcon("src/images/wrongPin.png");
                    JOptionPane.showMessageDialog(null, "Wrong Phone Number or PIN", "⚠ Warning ⚠", JOptionPane.INFORMATION_MESSAGE, icon);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            
        }
    }//GEN-LAST:event_signBtnActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        if (evt.getSource()== jLabel9) {
            JOptionPane.showMessageDialog(null, "Please contact with our helpdesk. 📞55555");
        }
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

   
    private javax.swing.JLabel hidePass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField phoneField;
    private javax.swing.JPasswordField pinField;
    private javax.swing.JButton regBtn;
    private javax.swing.JLabel showPass;
    private javax.swing.JButton signBtn;
   
}
