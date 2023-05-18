package bank.gui;

import bank.Account;
import bank.Client;

import java.awt.*;

public class Accounts extends javax.swing.JFrame {


    public Accounts(Client client) {
        initComponents();
        currentClient = client;
        for(int i=0;i<currentClient.getClientAccounts().length;i++){
            accounts_combobox.addItem(i+1+". "+currentClient.getClientAccounts()[i]);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        header = new javax.swing.JLabel();
        choose_acc_label = new javax.swing.JLabel();
        accounts_combobox = new javax.swing.JComboBox<>();
        exit_btn = new javax.swing.JButton();
        create_btn = new javax.swing.JButton();
        confirm_btn = new javax.swing.JButton();
        error_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        header.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        header.setForeground(new java.awt.Color(2, 67, 255));
        header.setText("Accounts");

        choose_acc_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        choose_acc_label.setText("Choose Bank Account");

        accounts_combobox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        exit_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exit_btn.setText("Exit");
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });

        create_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        create_btn.setText("Create new Bank Account");
        create_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_btnActionPerformed(evt);
            }
        });

        confirm_btn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        confirm_btn.setText("Confirm");
        confirm_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm_btnActionPerformed(evt);
            }
        });

        error_label.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        error_label.setForeground(new java.awt.Color(255, 51, 51));
        error_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error_label.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 323, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(choose_acc_label)
                        .addGap(401, 401, 401))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(accounts_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(error_label, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)))
                        .addGap(305, 305, 305))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(create_btn)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(281, 281, 281))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(confirm_btn)
                        .addGap(441, 441, 441))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(choose_acc_label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(accounts_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(error_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirm_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create_btn)
                    .addComponent(exit_btn))
                .addGap(22, 22, 22))
        );

        pack();
    }

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }

    private void create_btnActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        NewAccount newAccount = new NewAccount(currentClient);
        newAccount.setVisible(true);
    }

    private void confirm_btnActionPerformed(java.awt.event.ActionEvent evt) {
        if(accounts_combobox.getSelectedItem() == null){
            showError();
        } else {
            ServiceSelection service = new ServiceSelection(currentClient.getClientAccounts()[accounts_combobox.getSelectedIndex()], currentClient);
            service.setVisible(true);
            this.dispose();

        }
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
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Accounts().setVisible(true);
            }
        });
    }
    private void showError(){
        error_label.setVisible(true);
        error_label.setForeground(new Color(255, 51, 51));
        error_label.setText("Error");
    }
    private void showSuccess(){
        error_label.setVisible(true);
        error_label.setForeground(new Color(0, 204, 0));
        error_label.setText("Account created successfully");
    }
    private javax.swing.JComboBox<String> accounts_combobox;
    private javax.swing.JLabel choose_acc_label;
    private javax.swing.JButton confirm_btn;
    private javax.swing.JButton create_btn;
    private javax.swing.JLabel error_label;
    private javax.swing.JButton exit_btn;
    private javax.swing.JLabel header;
    private Client currentClient;
}
