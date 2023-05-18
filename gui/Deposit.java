package bank.gui;

import bank.Account;

import java.awt.*;

public class Deposit extends javax.swing.JFrame {

    public Deposit(Account account) {
        initComponents();
        currentAccount = account;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        header = new javax.swing.JLabel();
        amount_label = new javax.swing.JLabel();
        amount_field = new javax.swing.JTextField();
        confirm_btn = new javax.swing.JButton();
        error_label = new javax.swing.JLabel();
        exit_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setBackground(java.awt.Color.lightGray);

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        header.setForeground(new java.awt.Color(51, 102, 255));
        header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        header.setText("Deposit");

        amount_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        amount_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amount_label.setText("Amount to deposit");

        amount_field.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        amount_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amount_fieldActionPerformed(evt);
            }
        });

        confirm_btn.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        confirm_btn.setText("Confirm");
        confirm_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_btnActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirm_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(error_label, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amount_field, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(243, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(amount_label, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)))
                .addGap(329, 329, 329))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amount_label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(amount_field, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(error_label)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirm_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit_btn))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
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
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deposit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Deposit().setVisible(true);
            }
        });
    }
    private void confirm_btnActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            amount = Integer.parseInt(amount_field.getText());
            if(currentAccount.deposit(amount)){
                showSuccess("Amount deposited successfully");
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
    private Account currentAccount;
    private long amount;
}
