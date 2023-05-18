package bank.gui;

import bank.Client;

import java.awt.*;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        header = new javax.swing.JLabel();
        username_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        login_btn = new javax.swing.JButton();
        username_field = new javax.swing.JTextField();
        registration_message = new javax.swing.JLabel();
        newAccount_btn = new javax.swing.JButton();
        password_field = new javax.swing.JPasswordField();
        error_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Welcome to Banking System");
        setBackground(new java.awt.Color(255, 255, 1));

        header.setFont(new java.awt.Font("Segoe UI", 1, 80)); // NOI18N
        header.setForeground(new java.awt.Color(2, 67, 255));
        header.setText("Banking System");
        header.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        username_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        username_label.setText("Username");

        password_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        password_label.setText("Password");

        login_btn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        login_btn.setText("Login");
        login_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_btnActionPerformed(evt);
            }
        });

        username_field.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });

        registration_message.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        registration_message.setText("Don't have an account?");

        newAccount_btn.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        newAccount_btn.setText("Create Account");
        newAccount_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAccount_btnActionPerformed(evt);
            }
        });

        password_field.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        error_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        error_label.setForeground(new java.awt.Color(255, 51, 51));
        error_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error_label.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newAccount_btn)
                            .addComponent(registration_message, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(368, 368, 368))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(username_field)
                            .addComponent(password_field, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                        .addGap(319, 319, 319))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(login_btn)
                        .addGap(445, 445, 445))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(error_label, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(308, 308, 308))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username_label, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password_field)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(login_btn)
                .addGap(35, 35, 35)
                .addComponent(error_label)
                .addGap(18, 18, 18)
                .addComponent(registration_message, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(newAccount_btn)
                .addGap(0, 46, Short.MAX_VALUE))
        );

        pack();
    }

    private void login_btnActionPerformed(java.awt.event.ActionEvent evt) {
        int i;
        new Client("abdu", "30311090201999", "male", "2003-11-09", "egypt", "01146879485", "abdu", "abdu@yahoo.com", "12345", "abo yosef");
        for (i = 0; i < Client.getClients().length; i++) {
            if (Client.getClients()[i].login(username_field.getText(), String.valueOf(password_field.getPassword()))) {
                logged_in = true;
                break;
            }
        }
        if(logged_in){
            accounts_window = new Accounts(Client.getClients()[i]);
            accounts_window.setVisible(true);
            this.dispose();
        } else {
            showError();
        }

    }

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fieldActionPerformed
        // TODO add your handling code here:
    }

    private void newAccount_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAccount_btnActionPerformed
        registration_window = new Register();
        registration_window.setVisible(true);
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Login().setVisible(true);
            }
        });
    }
    private void showError(){
        error_label.setVisible(true);
        error_label.setForeground(new Color(255, 51, 51));
        error_label.setText("Error in your Input");
    }

    private javax.swing.JButton login_btn;
    private javax.swing.JButton newAccount_btn;
    private javax.swing.JLabel header;
    private javax.swing.JLabel username_label;
    private javax.swing.JLabel password_label;
    private javax.swing.JLabel registration_message;
    private javax.swing.JLabel error_label;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JTextField username_field;
    boolean logged_in;
    Accounts accounts_window;
    Register registration_window;
}
