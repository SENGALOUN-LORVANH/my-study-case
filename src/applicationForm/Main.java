package applicationForm;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Main extends javax.swing.JFrame {

    String id;

    public Main() {
        initComponents();
    }

    public Main(String id, String name, String status) {
        initComponents();
        this.id = id;
        this.setTitle("ຜູ້ໃຊ້ງານ: "+ name);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("../image/logo.png")));
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        //ປຽນສີແຖບ Title bar ດ້ານເທິງ
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(204, 209, 209));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(23, 32, 42));

        //ບໍ່ສະແດງ Icon ທີ່ title bar
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_SHOW_ICON, false);

        //ເວລາກົດປິດທີ່ສັນຍາລັກ X ບໍ່ໃຫ້ມັນເຮັດແລ້ວຈິ່ງໃສ່ event  windowsClosing ເພື່ອປິດ
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        //ຖ້າສະຖານະບໍ່ແມ່ນ Admin ເມນູ ຈັດການຂໍ້ມູນ ສັ່ງຊື່-ນໍາເຂົ້າ ແລະ ລາຍງານ ບໍ່ໃຫ້ສະແດງ
        if (!status.equals("Admin")) {
            jMenuData.setVisible(false);
            jMenuOrder.setVisible(false);
            jMenuReport.setVisible(false);
        }
        //ເວລາຣັນມາໜ້າ Main ໃຫ້ເອົາ PanelHome ມາສະແດງກ່ອນ
        showPanel(new PanelHome());
    }
    
    //ສ້າງເມັດທອດສະຫຼັບໜ້າເພື່ອເອົາຕ່ລະໜ້າມາສະແດງທີ່ jPanelMain
    private void showPanel(JPanel panel) {
        jPanelMain.removeAll();
        jPanelMain.add(panel);
        jPanelMain.validate();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelMain = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuHome = new javax.swing.JMenu();
        jMenuData = new javax.swing.JMenu();
        jMenuItemEmployee = new javax.swing.JMenuItem();
        jMenuItemProduct = new javax.swing.JMenuItem();
        jMenuItemCategory = new javax.swing.JMenuItem();
        jMenuItemBrand = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuOrder = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuCustomer = new javax.swing.JMenu();
        jMenuSale = new javax.swing.JMenu();
        jMenuSearch = new javax.swing.JMenu();
        jMenuReport = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuProfile = new javax.swing.JMenu();
        jMenuTheme = new javax.swing.JMenu();
        jMenuItemLight = new javax.swing.JMenuItem();
        jMenuItemDark = new javax.swing.JMenuItem();
        jMenuItemMacDark = new javax.swing.JMenuItem();
        jMenuLogout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelMain.setBackground(new java.awt.Color(255, 204, 204));
        jPanelMain.setLayout(new java.awt.BorderLayout());

        jMenuHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home_Page.png"))); // NOI18N
        jMenuHome.setText("ໜ້າຫຼັກ");
        jMenuHome.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuHome.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuHome.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuHomeMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuHome);

        jMenuData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add_Database.png"))); // NOI18N
        jMenuData.setText("ຈັດການຂໍ້ມູນ");
        jMenuData.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuData.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuData.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDataActionPerformed(evt);
            }
        });

        jMenuItemEmployee.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItemEmployee.setText("ຈັດການຂໍ້ມູນພະນັກງານ");
        jMenuItemEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemEmployeeActionPerformed(evt);
            }
        });
        jMenuData.add(jMenuItemEmployee);

        jMenuItemProduct.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItemProduct.setText("ຈັດການຂໍ້ມູນສິນຄ້າ");
        jMenuItemProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductActionPerformed(evt);
            }
        });
        jMenuData.add(jMenuItemProduct);

        jMenuItemCategory.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItemCategory.setText("ຈັດການຂໍ້ມູນປະເພດສິນຄ້າ");
        jMenuItemCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCategoryActionPerformed(evt);
            }
        });
        jMenuData.add(jMenuItemCategory);

        jMenuItemBrand.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItemBrand.setText("ຈັດການຂໍ້ມູນຍີ່ຫໍ້");
        jMenuItemBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemBrandActionPerformed(evt);
            }
        });
        jMenuData.add(jMenuItemBrand);

        jMenuItem5.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem5.setText("ຈັດການຂໍ້ມູນອັດຕາແລກປ່ຽນ");
        jMenuData.add(jMenuItem5);

        jMenuItem6.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem6.setText("ຈັດການຂໍ້ມູນຜູ້ສະໜອງ");
        jMenuData.add(jMenuItem6);

        jMenuBar1.add(jMenuData);

        jMenuOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/order_Import.png"))); // NOI18N
        jMenuOrder.setText("ສັ່ງຊື້-ນໍາເຂົ້າ");
        jMenuOrder.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuOrder.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuOrder.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem7.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem7.setText("ຈັດການຂໍ້ມູນສັ່ງຊື້ສິນຄ້າ");
        jMenuOrder.add(jMenuItem7);

        jMenuItem8.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem8.setText("ຈັດການຂໍ້ມູນນໍາເຂົ້າສິນຄ້າ");
        jMenuOrder.add(jMenuItem8);

        jMenuBar1.add(jMenuOrder);

        jMenuCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/customer.png"))); // NOI18N
        jMenuCustomer.setText("ລູກຄ້າ");
        jMenuCustomer.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuCustomer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuCustomer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(jMenuCustomer);

        jMenuSale.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sale_Product.png"))); // NOI18N
        jMenuSale.setText("ຂາຍສິນຄ້າ");
        jMenuSale.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuSale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuSale.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuSale.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(jMenuSale);

        jMenuSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search_Property.png"))); // NOI18N
        jMenuSearch.setText("ຄົ້ນຫາສິນຄ້າ");
        jMenuSearch.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuSearch.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuSearch.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(jMenuSearch);

        jMenuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/order_Import.png"))); // NOI18N
        jMenuReport.setText("ລາຍງານ");
        jMenuReport.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuReport.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuReport.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItem9.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem9.setText("ລາຍງານຂໍ້ມູນການຂາຍ");
        jMenuReport.add(jMenuItem9);

        jMenuItem10.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem10.setText("ລາຍງານຂໍ້ມູນສິນຄ້າ");
        jMenuReport.add(jMenuItem10);

        jMenuItem11.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem11.setText("ລາຍງານຂໍ້ມູນສິນຄ້າໄກ້ໝົດ");
        jMenuReport.add(jMenuItem11);

        jMenuItem12.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem12.setText("ໃບບິນ");
        jMenuReport.add(jMenuItem12);

        jMenuItem13.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem13.setText("ລາຍງານຂໍ້ມູນສັ່ງຊື້ສິນຄ້າ");
        jMenuReport.add(jMenuItem13);

        jMenuItem14.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem14.setText("ລາຍງານຂໍ້ມູນນໍາເຂົ້າສິນຄ້າ");
        jMenuReport.add(jMenuItem14);

        jMenuItem15.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem15.setText("ລາຍງານຂໍ້ມູນລູກຄ້າ");
        jMenuReport.add(jMenuItem15);

        jMenuItem16.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItem16.setText("ລາຍງານຂໍ້ມູນພະນັກງານ");
        jMenuReport.add(jMenuItem16);

        jMenuBar1.add(jMenuReport);

        jMenuProfile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/profile.png"))); // NOI18N
        jMenuProfile.setText("ໂປຣໄຟລ໌");
        jMenuProfile.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuProfile.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuProfile.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuProfile.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuBar1.add(jMenuProfile);

        jMenuTheme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/change_Theme.png"))); // NOI18N
        jMenuTheme.setText("ພື້ນຫຼັງ");
        jMenuTheme.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuTheme.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuTheme.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuTheme.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jMenuItemLight.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItemLight.setText("Light");
        jMenuItemLight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemLightActionPerformed(evt);
            }
        });
        jMenuTheme.add(jMenuItemLight);

        jMenuItemDark.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItemDark.setText("Dark");
        jMenuItemDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDarkActionPerformed(evt);
            }
        });
        jMenuTheme.add(jMenuItemDark);

        jMenuItemMacDark.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuItemMacDark.setText("MacDark");
        jMenuItemMacDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMacDarkActionPerformed(evt);
            }
        });
        jMenuTheme.add(jMenuItemMacDark);

        jMenuBar1.add(jMenuTheme);

        jMenuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shutdown.png"))); // NOI18N
        jMenuLogout.setText("ອອກລະບົບ");
        jMenuLogout.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jMenuLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenuLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuLogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jMenuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLogoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuLogout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelMain, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLogoutMouseClicked
        int data;
        data = JOptionPane.showConfirmDialog(rootPane, "ທ່ານຕ້ອງການອອກຈາກລະບົບແທ້ ຫຼື ບໍ່?", "ຢືນຢັນ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (data == 0) {
            Login log = new Login();
            log.txtUsername.setText("");
            log.txtPassword.setText("");
            log.checkRemember.setSelected(false);
            log.saveuserpass("", "");
            log.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jMenuLogoutMouseClicked

    private void jMenuItemLightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemLightActionPerformed
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(204, 209, 209));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(23, 32, 42));
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatLightLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        });
    }//GEN-LAST:event_jMenuItemLightActionPerformed

    private void jMenuItemDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDarkActionPerformed
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(33, 47, 61));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(253, 254, 254));
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatDarkLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        });
    }//GEN-LAST:event_jMenuItemDarkActionPerformed

    private void jMenuItemMacDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMacDarkActionPerformed
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_BACKGROUND, new Color(28, 40, 51));
        getRootPane().putClientProperty(FlatClientProperties.TITLE_BAR_FOREGROUND, new Color(253, 254, 254));
        SwingUtilities.invokeLater(() -> {
            try {
                UIManager.setLookAndFeel(new FlatMacDarkLaf());
                SwingUtilities.updateComponentTreeUI(this);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        });
    }//GEN-LAST:event_jMenuItemMacDarkActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int data;
        data = JOptionPane.showConfirmDialog(rootPane, "ທ່ານຕ້ອງການປິດໂປຣແກຣມແທ້ ຫຼື ບໍ່?", "ຢືນຢັນ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (data == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void jMenuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuHomeMouseClicked
         showPanel(new PanelHome());
    }//GEN-LAST:event_jMenuHomeMouseClicked

    private void jMenuItemEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemEmployeeActionPerformed
        showPanel(new PanelEmployee());
    }//GEN-LAST:event_jMenuItemEmployeeActionPerformed

    private void jMenuItemProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductActionPerformed
        showPanel(new PanelProduct());
    }//GEN-LAST:event_jMenuItemProductActionPerformed

    private void jMenuItemCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCategoryActionPerformed
         showPanel(new PanelCategory());
    }//GEN-LAST:event_jMenuItemCategoryActionPerformed

    private void jMenuDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuDataActionPerformed

    private void jMenuItemBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemBrandActionPerformed
        showPanel(new PanelBrand());
    }//GEN-LAST:event_jMenuItemBrandActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCustomer;
    private javax.swing.JMenu jMenuData;
    private javax.swing.JMenu jMenuHome;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemBrand;
    private javax.swing.JMenuItem jMenuItemCategory;
    private javax.swing.JMenuItem jMenuItemDark;
    private javax.swing.JMenuItem jMenuItemEmployee;
    private javax.swing.JMenuItem jMenuItemLight;
    private javax.swing.JMenuItem jMenuItemMacDark;
    private javax.swing.JMenuItem jMenuItemProduct;
    private javax.swing.JMenu jMenuLogout;
    private javax.swing.JMenu jMenuOrder;
    private javax.swing.JMenu jMenuProfile;
    private javax.swing.JMenu jMenuReport;
    private javax.swing.JMenu jMenuSale;
    private javax.swing.JMenu jMenuSearch;
    private javax.swing.JMenu jMenuTheme;
    private javax.swing.JPanel jPanelMain;
    // End of variables declaration//GEN-END:variables
}
