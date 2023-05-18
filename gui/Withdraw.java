
package bank.gui;
import bank.Account;

import java.awt.*;


public class Withdraw extends javax.swing.JFrame {

    public Withdraw(Account account) {
        initComponents();
        currentAccount = account;
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JLabel();
        amount_field = new javax.swing.JTextField();
        confirm_btn = new javax.swing.JButton();
        amount_label = new javax.swing.JLabel();
        error_label = new javax.swing.JLabel();
        exit_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(204, 204, 204));
        setSize(new java.awt.Dimension(1000, 500));

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 500));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        header.setForeground(new java.awt.Color(2, 67, 255));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Withdraw");
        header.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        header.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        header.setPreferredSize(new java.awt.Dimension(47, 70));

        amount_field.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        amount_field.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        amount_field.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        amount_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount_fieldActionPerformed(evt);
            }
        });

        confirm_btn.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        confirm_btn.setText("Confirm");
        confirm_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        confirm_btn.setVerifyInputWhenFocusTarget(false);
        confirm_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_btnActionPerformed(evt);
            }
        });

        amount_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        amount_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amount_label.setText("Amount to withdraw");
        amount_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        error_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        error_label.setForeground(new java.awt.Color(255, 51, 51));
        error_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error_label.setText(" ");

        exit_btn.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        exit_btn.setText("Exit");
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(amount_label, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(365, 365, 365))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(amount_field, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
                            .addComponent(error_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(234, 234, 234))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirm_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exit_btn)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(amount_label, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(amount_field, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(error_label)
                        .addGap(31, 31, 31)
                        .addComponent(confirm_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, 488, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void confirm_btnActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            amount = Integer.parseInt(amount_field.getText());
            if(currentAccount.withdraw(amount)) {
                showSuccess("Amount withdrew successfully");
            }
        } catch (Exception e){
            showError("Input error");
        }

    }

    private void amount_fieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        this.dispose();
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Withdraw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Withdraw().setVisible(true);
            }
        });
    }
    private void showError(String message){
        error_label.setVisible(true);
        error_label.setForeground(new Color(255, 51, 51));
        error_label.setText(message);
    }
    private void showSuccess(String message){
        error_label.setVisible(true);
        error_label.setForeground(new Color(0, 204, 0));
        error_label.setText(message);
    }
    private javax.swing.JTextField amount_field;
    private javax.swing.JLabel amount_label;
    private javax.swing.JButton confirm_btn;
    private javax.swing.JLabel error_label;
    private javax.swing.JButton exit_btn;
    private javax.swing.JLabel header;
    private javax.swing.JPanel jPanel1;
    private Account currentAccount;
    private long amount;
}
