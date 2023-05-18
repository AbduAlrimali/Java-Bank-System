package bank.gui;

import bank.Client;

public class NewAccount extends javax.swing.JFrame {

    public NewAccount(Client client) {
        initComponents();
        currentClient = client;
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        acc_type_label = new javax.swing.JLabel();
        acc_type_combobox = new javax.swing.JComboBox<>();
        enter_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        acc_type_label.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        acc_type_label.setText("Account Type");

        acc_type_combobox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        acc_type_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Current", "Saving" }));

        enter_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        enter_btn.setText("Enter");
        enter_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enter_btnActionPerformed(evt);
            }
        });

        back_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(back_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(enter_btn)
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(acc_type_label)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(acc_type_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(acc_type_label, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(acc_type_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back_btn)
                    .addComponent(enter_btn))
                .addGap(32, 32, 32))
        );

        pack();
    }

    private void enter_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enter_btnActionPerformed
        currentClient.openAcc((String) acc_type_combobox.getSelectedItem());
        Accounts accounts = new Accounts(currentClient);
        accounts.setVisible(true);
        this.dispose();
    }

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        Accounts accounts = new Accounts(currentClient);
        accounts.setVisible(true);
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
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new NewAccount().setVisible(true);
            }
        });
    }

    private javax.swing.JButton enter_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JComboBox<String> acc_type_combobox;
    private javax.swing.JLabel acc_type_label;
    private Client currentClient;
}
