package bank.gui;

import bank.Account;
import bank.Client;

public class ServiceSelection extends javax.swing.JFrame {

    public ServiceSelection(Account account, Client client) {
        initComponents();
        currentAccount = account;
        currentClient = client;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        panel = new javax.swing.JPanel();
        pick_service_label = new javax.swing.JLabel();
        balance_btn = new javax.swing.JButton();
        withdraw_btn = new javax.swing.JButton();
        deposit_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        setSize(new java.awt.Dimension(1000, 500));

        panel.setPreferredSize(new java.awt.Dimension(1000, 500));

        pick_service_label.setBackground(new java.awt.Color(2, 67, 255));
        pick_service_label.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        pick_service_label.setForeground(new java.awt.Color(2, 67, 255));
        pick_service_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pick_service_label.setText("Pick your service");

        balance_btn.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        balance_btn.setText("Balance");
        balance_btn.setFocusPainted(false);
        balance_btn.setFocusable(false);
        balance_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balance_btnActionPerformed(evt);
            }
        });

        withdraw_btn.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        withdraw_btn.setText("Withdraw");
        withdraw_btn.setFocusPainted(false);
        withdraw_btn.setFocusable(false);
        withdraw_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdraw_btnActionPerformed(evt);
            }
        });

        deposit_btn.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        deposit_btn.setText("Deposit");
        deposit_btn.setFocusPainted(false);
        deposit_btn.setFocusable(false);
        deposit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deposit_btnActionPerformed(evt);
            }
        });

        exit_btn.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        exit_btn.setText("Exit");
        exit_btn.setFocusPainted(false);
        exit_btn.setFocusable(false);
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(balance_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exit_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(withdraw_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(deposit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(181, Short.MAX_VALUE))
            .addComponent(pick_service_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(pick_service_label, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withdraw_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(balance_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deposit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );

        pack();
    }

    private void balance_btnActionPerformed(java.awt.event.ActionEvent evt){
        Balance balance = new Balance(currentAccount);
        balance.setVisible(true);
    }
    private void withdraw_btnActionPerformed(java.awt.event.ActionEvent evt){
        Withdraw withdraw = new Withdraw(currentAccount);
        withdraw.setVisible(true);
    }
    private void deposit_btnActionPerformed(java.awt.event.ActionEvent evt){
        Deposit deposit = new Deposit(currentAccount);
        deposit.setVisible(true);
    }
    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt){
        Accounts accounts = new Accounts(currentClient);
        accounts.setVisible(true);
        this.dispose();
    }

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
            java.util.logging.Logger.getLogger(ServiceSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new servie_selection().setVisible(true);
            }
        });
    }

    private javax.swing.JButton balance_btn;
    private javax.swing.JButton withdraw_btn;
    private javax.swing.JButton deposit_btn;
    private javax.swing.JButton exit_btn;
    private javax.swing.JLabel pick_service_label;
    private javax.swing.JPanel panel;
    private Account currentAccount;
    private Client currentClient;
}
