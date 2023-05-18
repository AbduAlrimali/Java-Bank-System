package bank.gui;

import bank.Client;

import javax.swing.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        name_label = new javax.swing.JLabel();
        name_field = new javax.swing.JTextField();
        email_field = new javax.swing.JTextField();
        email_label = new javax.swing.JLabel();
        username_field = new javax.swing.JTextField();
        username_label = new javax.swing.JLabel();
        password_label = new javax.swing.JLabel();
        confirm_password_label = new javax.swing.JLabel();
        birthdate_field = new javax.swing.JTextField();
        birthdate_label = new javax.swing.JLabel();
        birthcountry_field = new javax.swing.JTextField();
        birthcountry_label = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();
        id_field = new javax.swing.JTextField();
        phone_field = new javax.swing.JTextField();
        phone_label = new javax.swing.JLabel();
        gender_label = new javax.swing.JLabel();
        address_label = new javax.swing.JLabel();
        address_field = new javax.swing.JTextField();
        password_field = new javax.swing.JPasswordField();
        confirm_password_field = new javax.swing.JPasswordField();
        sign_btn = new javax.swing.JButton();
        gender_combobox = new javax.swing.JComboBox<>();
        back_btn = new javax.swing.JButton();
        error_label = new javax.swing.JLabel();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        name_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        name_label.setText("Full Name");

        name_field.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        email_field.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        email_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        email_label.setText("Email");

        username_field.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        username_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        username_label.setText("Username");

        password_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        password_label.setText("Password");

        confirm_password_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        confirm_password_label.setText("Confirm Password");

        birthdate_field.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        birthdate_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        birthdate_label.setText("Birthdate (YYYY-MM-DD)");

        birthcountry_field.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        birthcountry_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        birthcountry_label.setText("Birth Country");

        id_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        id_label.setText("National ID");

        id_field.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        phone_field.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        phone_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        phone_label.setText("Phone");

        gender_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        gender_label.setText("Gender");

        address_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        address_label.setText("Address");

        address_field.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        address_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_fieldActionPerformed(evt);
            }
        });

        password_field.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        confirm_password_field.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        sign_btn.setBackground(new java.awt.Color(153, 255, 102));
        sign_btn.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        sign_btn.setText("Sign Up");
        sign_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sign_btnActionPerformed(evt);
            }
        });

        gender_combobox.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        gender_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        back_btn.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        error_label.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        error_label.setForeground(new java.awt.Color(255, 51, 51));
        error_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        error_label.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(email_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(username_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(password_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(confirm_password_label, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(name_field)
                            .addComponent(email_field)
                            .addComponent(username_field)
                            .addComponent(password_field)
                            .addComponent(confirm_password_field))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(birthdate_field)
                            .addComponent(birthdate_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(birthcountry_field)
                            .addComponent(birthcountry_label, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(id_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(phone_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gender_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(id_field)
                            .addComponent(phone_field)
                            .addComponent(gender_combobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(address_label, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(address_field, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(error_label, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sign_btn)
                        .addGap(102, 102, 102))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_label)
                            .addComponent(address_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(address_field, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(id_field, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phone_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phone_field, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gender_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gender_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(birthdate_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(birthdate_field, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(birthcountry_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(birthcountry_field, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(error_label)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(name_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name_field, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(email_field, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(username_field, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(password_field, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirm_password_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(confirm_password_field)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sign_btn)
                    .addComponent(back_btn))
                .addGap(16, 16, 16))
        );

        pack();
    }

    private void address_fieldActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void sign_btnActionPerformed(java.awt.event.ActionEvent evt) {
        if((!checkInput(email_field.getText(), "email") || (Client.emailExist(email_field.getText())))){
            showError("email");
            System.out.println(email_field.getText());
            System.out.println(Client.emailExist(email_field.getText()));
        } else if ((!checkInput(username_field.getText(), "username") || (Client.usernameExist(username_field.getText())))){
            showError("username");
        } else if (!(String.valueOf(password_field.getPassword()).equals(String.valueOf(confirm_password_field.getPassword()))) || String.valueOf(password_field.getPassword()).isEmpty()){
            showError("password");
        } else if ((Client.idExist(id_field.getText()) || !checkInput(id_field.getText(), "id"))){
            showError("national id");
        } else if (!checkInput(phone_field.getText(), "phone")){
            showError("phone");
        } else if (!checkInput(birthdate_field.getText(), "date")){
            showError("date");
        } else {
            showSuccess();
            name = name_field.getText();
            email = email_field.getText();
            userName = username_field.getText();
            password = String.valueOf(password_field.getPassword());
            national_id = id_field.getText();
            phone = phone_field.getText();
            gender = (String) gender_combobox.getSelectedItem();
            birthDate = birthdate_field.getText();
            birthCountry = birthcountry_field.getText();
            address = address_field.getText();
            new Client(name, national_id, gender, birthDate, birthCountry, phone, userName, email, password, address);
        }
    }

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new Register().setVisible(true);
            }
        });
    }
    private void showError(String message){
        error_label.setVisible(true);
        error_label.setForeground(new Color(255, 51, 51));
        error_label.setText("Error in "+message);
    }
    private void showSuccess(){
        error_label.setVisible(true);
        error_label.setForeground(new Color(0, 204, 0));
        error_label.setText("Account created successfully");
    }
    private static boolean checkInput(String line, String type){
        if(type.equals("date")) {
            pattern = Pattern.compile("^([1-2][09]\\d{2})-([0-1]\\d)-([0-3]\\d)$");
            matcher = pattern.matcher(line);
            return matcher.find();
        } else if (type.equals("id")){
            pattern = Pattern.compile("^[23]\\d{13}$");
            matcher = pattern.matcher(line);
            return matcher.find();
        } else if(type.equals("phone")){
            pattern = Pattern.compile("^01(0|1|2|5)\\d{8}$");
            matcher = pattern.matcher(line);
            return matcher.find();
        } else if (type.equals("username")) {
            pattern = Pattern.compile("^\\S{4,18}$");
            matcher = pattern.matcher(line);
            return matcher.find();
        } else {
            pattern = Pattern.compile("^[\\w-]+@[\\w-]+\\.\\w+$");
            matcher = pattern.matcher(line);
            return matcher.find();
        }
    }

    private javax.swing.JButton sign_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JComboBox<String> gender_combobox;
    private javax.swing.JLabel name_label;
    private javax.swing.JLabel gender_label;
    private javax.swing.JLabel address_label;
    private javax.swing.JLabel error_label;
    private javax.swing.JLabel email_label;
    private javax.swing.JLabel username_label;
    private javax.swing.JLabel password_label;
    private javax.swing.JLabel confirm_password_label;
    private javax.swing.JLabel birthdate_label;
    private javax.swing.JLabel birthcountry_label;
    private javax.swing.JLabel id_label;
    private javax.swing.JLabel phone_label;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JPasswordField confirm_password_field;
    private javax.swing.JTextField name_field;
    private javax.swing.JTextField address_field;
    private javax.swing.JTextField email_field;
    private javax.swing.JTextField username_field;
    private javax.swing.JTextField birthdate_field;
    private javax.swing.JTextField birthcountry_field;
    private javax.swing.JTextField id_field;
    private javax.swing.JTextField phone_field;
    private String name, email, userName, password, address, national_id, phone, birthDate, birthCountry, gender;
    private String username_login, password_login;
    private static java.util.regex.Matcher matcher;
    private static java.util.regex.Pattern pattern;
}
