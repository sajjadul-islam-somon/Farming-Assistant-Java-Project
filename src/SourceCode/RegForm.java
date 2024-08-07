package SourceCode;

import javax.swing.*;
import java.util.*;
import java.text.*;

public class RegForm extends javax.swing.JFrame {

    int result;
    
    public RegForm() {
        initComponents();
        
        ImageIcon frameIcon = new ImageIcon("src/images/appIcon.png");
        this.setIconImage(frameIcon.getImage());
        
        Random r = new Random();
        int start = 111111;
        int end = 999999;
        result = r.nextInt(end-start) + start;
        regNum.setText(String.valueOf(result));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        regNum = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dateChooser = new com.toedter.calendar.JDateChooser();
        nameField = new javax.swing.JTextField();
        fnameField = new javax.swing.JTextField();
        mnameField = new javax.swing.JTextField();
        nidField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        maleBtn = new javax.swing.JRadioButton();
        othersBtn = new javax.swing.JRadioButton();
        femaleBtn = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        newpinField = new javax.swing.JPasswordField();
        checkBox = new javax.swing.JCheckBox();
        subBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(101, 255, 101));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registration Form");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        backBtn.setBackground(new java.awt.Color(101, 255, 101));
        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 10)); // NOI18N
        backBtn.setForeground(new java.awt.Color(0, 0, 0));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        backBtn.setAlignmentY(0.0F);
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, -1));

        regNum.setBackground(new java.awt.Color(101, 255, 101));
        regNum.setFont(regNum.getFont().deriveFont(regNum.getFont().getSize()-1f));
        regNum.setForeground(new java.awt.Color(0, 0, 0));
        regNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        regNum.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(regNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 16, 70, 20));

        jPanel2.setBackground(new java.awt.Color(225, 255, 253));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Father's Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Mother's Name");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Date of Birth");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("NID Number");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Phone Number");

        nameField.setFont(nameField.getFont().deriveFont(nameField.getFont().getSize()+4f));
        nameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameFieldActionPerformed(evt);
            }
        });

        fnameField.setFont(fnameField.getFont().deriveFont(fnameField.getFont().getSize()+4f));

        mnameField.setFont(mnameField.getFont().deriveFont(mnameField.getFont().getSize()+4f));

        nidField.setFont(nidField.getFont().deriveFont(nidField.getFont().getSize()+4f));

        phoneField.setFont(phoneField.getFont().deriveFont(phoneField.getFont().getSize()+4f));
        phoneField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Gender");

        genderGroup.add(maleBtn);
        maleBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        maleBtn.setForeground(new java.awt.Color(0, 0, 0));
        maleBtn.setText("Male");
        maleBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        genderGroup.add(othersBtn);
        othersBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        othersBtn.setForeground(new java.awt.Color(0, 0, 0));
        othersBtn.setText("Others");
        othersBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        othersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                othersBtnActionPerformed(evt);
            }
        });

        genderGroup.add(femaleBtn);
        femaleBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        femaleBtn.setForeground(new java.awt.Color(0, 0, 0));
        femaleBtn.setText("Female");
        femaleBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("New PIN");

        newpinField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpinFieldActionPerformed(evt);
            }
        });

        checkBox.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        checkBox.setForeground(new java.awt.Color(0, 0, 0));
        checkBox.setText("I hereby declares that the above entered details are correct to the best of my knowledge.");
        checkBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        subBtn.setText("Submit");
        subBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subBtnActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vertical.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Address");

        addressField.setFont(addressField.getFont().deriveFont(addressField.getFont().getSize()+4f));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(552, 552, 552)
                        .addComponent(subBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(checkBox))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(87, 87, 87)
                                        .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(84, 84, 84)
                                        .addComponent(newpinField, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(95, 95, 95)
                                        .addComponent(maleBtn)
                                        .addGap(53, 53, 53)
                                        .addComponent(femaleBtn)
                                        .addGap(55, 55, 55)
                                        .addComponent(othersBtn))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(34, 34, 34)
                                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(53, 53, 53)
                                        .addComponent(nidField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(54, 54, 54)
                                        .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(107, 107, 107)
                                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(41, 41, 41)
                                        .addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(32, 32, 32)
                                        .addComponent(mnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(81, 81, 81)
                        .addComponent(jLabel11)))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(fnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nidField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(othersBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(femaleBtn)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(maleBtn)
                                    .addComponent(jLabel8))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(newpinField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(checkBox))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subBtn)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void othersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_othersBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_othersBtnActionPerformed

    private void phoneFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneFieldActionPerformed

    private void newpinFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpinFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpinFieldActionPerformed

    private void subBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subBtnActionPerformed
        // TODO add your handling code here:
        String reg = "" + result;
        String name = nameField.getText();
        String fname = fnameField.getText();
        String mname = mnameField.getText();
        String nid = nidField.getText();
        String phone = phoneField.getText();
        String gender = null;
        String pin = newpinField.getText();
        String address = addressField.getText();
        
//        Date selectedDate = dateChooser.getDate();
//        String date = selectedDate.toString();

        Date selectedDate = dateChooser.getDate();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String date = dateFormat.format(selectedDate);

        
        if (maleBtn.isSelected()) {
            gender = "Male";
        } else if(femaleBtn.isSelected()) {
            gender = "Female";
        } else if(othersBtn.isSelected()) {
            gender = "Others";
        }
        
        
        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is required");
            } if (fname.equals("")) {
                JOptionPane.showMessageDialog(null, "Father's name is required");
            } if (mname.equals("")) {
                JOptionPane.showMessageDialog(null, "Mother's is required");
            } if (date.equals("")) {
                JOptionPane.showMessageDialog(null, "Date of Birth is required");
            } if (nid.equals("")) {
                JOptionPane.showMessageDialog(null, "NID number is required");
            } if (phone.equals("")) {
                JOptionPane.showMessageDialog(null, "Phone number is required");
            } if (pin.equals("")) {
                JOptionPane.showMessageDialog(null, "PIN number is required");
            } if (address.equals("")) {
                JOptionPane.showMessageDialog(null, "Address is required");
            } if (!checkBox.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please Check the Box");
            } else {
                Connect c = new Connect();
                String queryreg = "insert into signup value('"+reg+"', '"+name+"', '"+fname+"', '"+mname+"', '"+date+"', '"+nid+"', '"+phone+"', '"+address+"', '"+gender+"', '"+pin+"')";
                
                c.s.executeUpdate(queryreg);
                
                
                if (evt.getSource() == subBtn) {
                    setVisible(false);
                    new LoginForm().setVisible(true);
                }
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_subBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        if (evt.getSource() == backBtn) {
            setVisible(false);
            new LoginForm().setVisible(true);
        }
    }//GEN-LAST:event_backBtnActionPerformed

    private void nameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(RegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JButton backBtn;
    private javax.swing.JCheckBox checkBox;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JRadioButton femaleBtn;
    private javax.swing.JTextField fnameField;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton maleBtn;
    private javax.swing.JTextField mnameField;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField newpinField;
    private javax.swing.JTextField nidField;
    private javax.swing.JRadioButton othersBtn;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel regNum;
    private javax.swing.JButton subBtn;
    // End of variables declaration//GEN-END:variables
}
