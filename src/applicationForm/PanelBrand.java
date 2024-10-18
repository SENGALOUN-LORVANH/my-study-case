package applicationForm;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import connect_database.MySQLConnect;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanelBrand extends javax.swing.JPanel {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    public PanelBrand() {
        initComponents();

        txtSearch.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "ຄົ້ນຫາ");
        txtSearch.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("image_svg/search.svg"));

        //ປ່ຽນສີພື້ນຫົວຕາຕະລາງ
        JTableHeader header = jTable1.getTableHeader();
        header.setFont(new Font("Lao_SomVang", Font.PLAIN, 14));
        header.setOpaque(false);
        header.setBackground(new Color(108, 117, 125));
        header.setForeground(new Color(243, 243, 243));

        //ສະແດງຜົນຢູ່ກາງຖັນ
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jTable1.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jTable1.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);

        //ເສັ້ນຕາຕະລາງ
        jTable1.setShowGrid(false);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jTable1.setGridColor(new Color(139, 138, 137));

        //ເຊື່ອມຕໍ່ຖານຂໍ້ມູນ
        conn = MySQLConnect.connectDB();
        autoID();
        tableUpdate();

        //ກໍານົດໃຫ້ປຸ່ມ ແກ້ໄຂ ແລະ ລືບໃຊ້ງານບໍ່ໄດ້
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);

    }

    //ສ້າງເມັດທອດເພື່ອ generate ເອົາລະຫັດປະພເພດສິນຄ້າ
    private void autoID() {
        try {
            String sql = "SELECT SUBSTRING(MAX(brand_id), 2, 4) FROM brand";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            if (rs.next()) {
                int id = rs.getInt(1);
                txtBrand_id.setText("B" + String.format("%03d", ++id));
            } else {
                txtBrand_id.setText("B001");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //ສ້າງເມັດທອດສະແດງຂໍ້ມູນໃນຕາຕະລາງ
    private void tableUpdate() {
        try {
            String sql = "SELECT  *FROM brand ORDER BY brand_id DESC";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            DefaultTableModel d = (DefaultTableModel) jTable1.getModel();
            jTable1.setRowHeight(30); //ຄວາມສູງຂອງແຕ່ລະແຖວ
            d.setRowCount(0); //ລືບຂໍ້ມູນໃນຕາຕະລາງອອກ
            int num_row = 1;
            while (rs.next()) {
                d.addRow(new Object[]{
                    num_row++,
                    rs.getString(1),
                    rs.getString(2)
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //ສ້າງເມັດທອດຍົກເລີກຂໍ້ມູນ
    private void clearForm() {
        autoID();
        txtBrand_name.setText("");
        btnAdd.setEnabled(true);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        jTable1.clearSelection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBrand_name = new javax.swing.JTextField();
        txtBrand_id = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();

        jTable1.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ລໍາດັບ", "ລະຫັດ", "ປະເພດສິນຄ້າ"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(100);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(100);
            jTable1.getColumnModel().getColumn(1).setMinWidth(150);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(150);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(150);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ຈັດການຂໍ້ມູນຢີ້ຫໍ້ສິນຄ້າ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lao_SomVang", 0, 16))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jLabel1.setText("ລະຫັດ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 45, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jLabel2.setText("ປະເພດສິນຄ້າ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        txtBrand_name.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jPanel1.add(txtBrand_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 310, -1));

        txtBrand_id.setEditable(false);
        txtBrand_id.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        jPanel1.add(txtBrand_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 310, -1));

        btnCancel.setBackground(new java.awt.Color(21, 115, 71));
        btnCancel.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(253, 254, 254));
        btnCancel.setText("ຍົກເລີກ");
        btnCancel.setMargin(new java.awt.Insets(2, 3, 3, 3));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, 70, -1));

        btnAdd.setBackground(new java.awt.Color(11, 94, 215));
        btnAdd.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(251, 238, 230));
        btnAdd.setText("ເພີ່ມ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 70, -1));

        btnEdit.setBackground(new java.awt.Color(255, 201, 12));
        btnEdit.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(28, 31, 35));
        btnEdit.setText("ແກ້ໄຂ");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 70, -1));

        btnDelete.setBackground(new java.awt.Color(187, 45, 59));
        btnDelete.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(253, 254, 254));
        btnDelete.setText("ລືບ");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 70, -1));

        txtSearch.setFont(new java.awt.Font("Lao_SomVang", 0, 14)); // NOI18N
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        clearForm();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // ກວດສອບວ່າປ້ອນຂໍ້ມູນຫຼືບໍ່
        if (txtBrand_name.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ກະລຸນາປ້ອນປະເພດສິນຄ້າດ້ວຍ!", "ຫວ່າງເປົ່າ", JOptionPane.WARNING_MESSAGE);
            txtBrand_name.requestFocus();
            return;
        }

        try {
            String sql = "INSERT INTO brand VALUES(?, ?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtBrand_id.getText());
            pst.setString(2, txtBrand_name.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "ຂໍ້ມູນໄດ້ບັນທຶກລົງໃນຖານຂໍ້ມູນສໍາເລັດ", "ສໍາເລັດ", JOptionPane.WIDTH, new FlatSVGIcon("image_svg/done.svg"));
            clearForm();
            tableUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel d = (DefaultTableModel) jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
        //ຖ້າກົດເມົ້າໃສ່ບໍ່ຖືກແຖວ
        if (selectIndex == -1) {
            return;
        }

        txtBrand_id.setText(d.getValueAt(selectIndex, 1).toString());
        txtBrand_name.setText(d.getValueAt(selectIndex, 2).toString());

        //ໃຫ້ປຸ່ມເພີ່ມໃຊ້ງານບໍ່ໄດ້
        btnAdd.setEnabled(false);
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // ກວດສອບວ່າປ້ອນຂໍ້ມູນຫຼືບໍ່
        if (txtBrand_name.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "ກະລຸນາປ້ອນປະເພດສິນຄ້າດ້ວຍ!", "ຫວ່າງເປົ່າ", JOptionPane.WARNING_MESSAGE);
            txtBrand_name.requestFocus();
            return;
        }

        try {
            String sql = "UPDATE brand SET brand_name=? WHERE brand_id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtBrand_name.getText());
            pst.setString(2, txtBrand_id.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "ປັບປຸງຂໍ້ມູນໃນຖານຂໍ້ມູນສໍາເລັດ", "ສໍາເລັດ", JOptionPane.WIDTH, new FlatSVGIcon("image_svg/done.svg"));
            clearForm();
            tableUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int data;
        data = JOptionPane.showConfirmDialog(null, "ທ່ານຕ້ອງການລືບຂໍ້ມູນລາຍການນີ້ແທ້ ຫຼື ບໍ່?", "ຢືນຢັນ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (data != 0) {
            clearForm();
            return;
        }
        try {
            String sql = "DELETE FROM brand WHERE brand_id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1, txtBrand_id.getText());
            pst.executeUpdate();
            clearForm();
            tableUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        try {
            String sql = "SELECT *FROM brand WHERE concat(brand_id, brand_name) LIKE '%" + txtSearch.getText() + "%' ORDER BY brand_id DESC";
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();

            DefaultTableModel d = (DefaultTableModel) jTable1.getModel();
            jTable1.setRowHeight(30); //ຄວາມສູງຂອງແຕ່ລະແຖວ
            d.setRowCount(0); //ລືບຂໍ້ມູນໃນຕາຕະລາງອອກ
            int num_row = 1;
            while (rs.next()) {
                d.addRow(new Object[]{num_row++, rs.getString(1), rs.getString(2)});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_txtSearchKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBrand_id;
    private javax.swing.JTextField txtBrand_name;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
