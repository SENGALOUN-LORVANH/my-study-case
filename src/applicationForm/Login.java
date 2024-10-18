package applicationForm;

import includeClass.PasswordHashing;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import connect_database.MySQLConnect;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.UIManager;
import java.sql.*;
import java.util.prefs.Preferences;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    //ຈື່ບັນຊີເຂົ້າໃຊ້ ແລະ ລະຫັດຜ່ານ
    public Preferences pref = Preferences.userRoot().node("Rememberme_BCSP6B");

    public Login() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        this.setTitle("ໂປຣແກຣມຂ້າຍເຄື່ອງໜ້າຮ້ານ");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../image/logo.png")));

        //ປຽນສີແຖບ Title bar ແລະ ສີຕົວໜັງສື
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(211, 84, 0));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(23, 32, 42));

        //PlaceHolder
        txtUsername.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ບັນຊີເຂົ້າໃຊ້");
        txtPassword.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ລະຫັດຜ່ານ");

        //ສະແດງລະຫັດຜ່ານ
        txtPassword.putClientProperty(FlatClientProperties.STYLE, "showRevealButton:true");

        //ລືບ
        txtUsername.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);
        txtPassword.putClientProperty(FlatClientProperties.TEXT_FIELD_SHOW_CLEAR_BUTTON, true);

        //ໃສ່ຮູບໃນ txtUser ແລະ txtPass
        //txtUsername.putClientProperty(FlatClientProperties.TEXT_FIELD_TRAILING_ICON, new FlatSVGIcon("image_svg/user.svg"));
        txtUsername.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("image_svg/user.svg"));
        txtPassword.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("image_svg/password.svg"));

        //ໃສຮູບທີ່ປຸ່ມ ເຂົ້າໃຊ້ ແລະ ຍົກເລີກ
        btnLogin.setIcon(new FlatSVGIcon("image_svg/login.svg"));
        btnCancel.setIcon(new FlatSVGIcon("image_svg/cancel.svg"));

        inti_remember(); //ເອີ້ນໃຊ້ ຈື່ບັນຊີເຂົ້າໃຊ້ ແລະ ລະຫັດຜ່ານ
    }

    //ຈື່ບັນຊີເຂົ້າໃຊ້ ແລະ ລະຫັດຜ່ານ
    private void inti_remember() {
        String usr = "";
        usr = pref.get("User", usr);
        txtUsername.setText(usr);

        String pss = "";
        pss = pref.get("Password", pss);
        txtPassword.setText(pss);

        if (!(usr.equals("") && pss.equals(""))) {
            checkRemember.setSelected(true);
        }
    }

    public void saveuserpass(String user, String pass) {
        pref.put("User", user);
        pref.put("Password", pass);
    }

    public final void checked(boolean remember) {
        if (remember == true) {
            saveuserpass(txtUsername.getText(), txtPassword.getText());
        } else {
            saveuserpass("", "");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        checkRemember = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lao_SomVang", 1, 24)); // NOI18N
        jLabel1.setText("ຟອມເຂົ້າໃຊ້ລະບົບ");

        txtUsername.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(97, 106, 107));
        btnLogin.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(253, 254, 254));
        btnLogin.setText("ເຂົ້າໃຊ້");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(243, 156, 18));
        btnCancel.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(23, 32, 42));
        btnCancel.setText("ຍົກເລີກ");
        btnCancel.setMargin(new java.awt.Insets(2, 3, 3, 3));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        checkRemember.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        checkRemember.setText("Remember me");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkRemember)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUsername)
                                .addComponent(txtPassword)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(90, 90, 90))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkRemember)
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnCancel))
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        txtPassword.requestFocus();
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        btnLogin.doClick();
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            conn = MySQLConnect.connectDB();
            String sql = "SELECT emp_id, concat(emp_name, ' ', emp_lname) AS name, status FROM employee  WHERE username=? AND password=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtUsername.getText().trim());
            pst.setString(2, PasswordHashing.doHashing(txtPassword.getText().trim()));
            rs = pst.executeQuery();
            if (rs.next()) {

                //ຈື່ບັນຊີເຂົ້າໃຊ້ ແລະ ລະຫັດຜ່ານ
                if (checkRemember.isSelected()) {
                    checked(true);
                } else {
                    checked(false);
                }

                //Main m = new Main();
                Main m = new Main(rs.getString(1), rs.getString(2), rs.getString(3));
                m.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(rootPane, "ບັນຊີເຂົ້າໃຊ້ ແລະ ລະຫັດຜ່ານບໍ່ຖືກຕ້ອງ!", "ຜິດພາດ", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        txtUsername.setText("");
        txtPassword.setText("");
        checkRemember.setSelected(false);
        saveuserpass("", "");
    }//GEN-LAST:event_btnCancelActionPerformed

    public static void main(String args[]) {
        //FlatDarkLaf.setup();
        FlatLightLaf.setup();

        //ກໍານົດຟ້ອນເລີ້ມຕົ້ນໃຫ້ກັບຟອມ
        UIManager.put("defaultFont", new Font("Lao_Somvang", Font.PLAIN, 16));
        UIManager.put("OptionPane.messageFont", new Font("Lao_Somvang", Font.PLAIN, 14));
        UIManager.put("OptionPane.okButtonText", "ຕົກລົງ");
        UIManager.put("OptionPane.cancelButtonText", "ຍົກເລີກ");

        UIManager.put("Button.arc", 10);
        UIManager.put("Component.arc", 10);
        UIManager.put("ProgressBar.arc", 10);
        UIManager.put("TextComponent.arc", 10);

        UIManager.put("Component.arrowType", "triangle");
        UIManager.put("ScrollBar.showButtons", true);
        UIManager.put("ScrollBar.thumbInsets", new Insets(2, 2, 2, 2));

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnLogin;
    public javax.swing.JCheckBox checkRemember;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
