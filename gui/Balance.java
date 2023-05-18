package bank.gui;

import bank.Account;

public class Balance extends javax.swing.JFrame {

    public Balance(Account account) {
        initComponents();
        currentAccount = account;
        account_balance_label.setText("$"+currentAccount.checkBalance());
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        frame = new javax.swing.JFrame();
        your_balance_label = new javax.swing.JLabel();
        done_btn = new javax.swing.JButton();
        account_balance_label = new javax.swing.JLabel();

        javax.swing.GroupLayout frameLayout = new javax.swing.GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(frameLayout);
        frameLayout.setHorizontalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        frameLayout.setVerticalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        setBackground(new java.awt.Color(204, 204, 204));

        your_balance_label.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        your_balance_label.setForeground(new java.awt.Color(51, 102, 255));
        your_balance_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        your_balance_label.setText("Your Balance");

        done_btn.setFont(new java.awt.Font("Segoe UI", 0, 40)); // NOI18N
        done_btn.setText("Done");
        done_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                done_btnActionPerformed(evt);
            }
        });

        account_balance_label.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        account_balance_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        account_balance_label.setText("$0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 254, Short.MAX_VALUE)
                .addComponent(your_balance_label, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(247, 247, 247))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(done_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(382, 382, 382))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(account_balance_label, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(275, 275, 275))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(your_balance_label, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(account_balance_label, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(done_btn)
                .addGap(102, 102, 102))
        );

        pack();
    }

    private void done_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_done_btnActionPerformed
        this.dispose();
    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Balance().setVisible(true);
            }
        });
    }

    private javax.swing.JButton done_btn;
    private javax.swing.JFrame frame;
    private javax.swing.JLabel your_balance_label;
    private javax.swing.JLabel account_balance_label;
    private Account currentAccount;
}
