﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace BCSP7B
{
    public partial class frmCategory : Form
    {
        public frmCategory()
        {
            InitializeComponent();
        }
        classConnectDatabase ccd = new classConnectDatabase();
        private void frmCategory_Load(object sender, EventArgs e)
        {
            ccd.connectDatabase();
            ShowData();
            DGV.Columns[0].HeaderText = "ລະຫັດປະເພດສິນຄ້າ";
            DGV.Columns[1].HeaderText = "ຊື່ປະເພດສິນຄ້າ";
            DGV.Columns[0].Width = 150;
            DGV.Columns[1].Width = 150;
        }
        void ShowData()
        {
            ccd.da = new SqlDataAdapter("select * from tbCategory", ccd.conn);
            ccd.da.Fill(ccd.ds);
            ccd.ds.Tables[0].Clear();
            ccd.da.Fill(ccd.ds);
            DGV.DataSource = ccd.ds.Tables[0];
            DGV.Refresh();
        }

        private void btnSave_Click(object sender, EventArgs e)
        {
            ccd.cmd = new SqlCommand("Insert into tbCategory values(@categoryID,@categoryName)", ccd.conn);
            ccd.cmd.Parameters.AddWithValue("categoryID", txtCategoryID.Text);
            ccd.cmd.Parameters.AddWithValue("categoryName", txtCategoryName.Text);
            ccd.cmd.ExecuteNonQuery();
            ShowData();
            ResetForm();
        }

        private void DGV_Click(object sender, EventArgs e)
        {
            txtCategoryID.Text = DGV.Rows[DGV.CurrentRow.Index].Cells[0].Value.ToString();
            txtCategoryName.Text = DGV.Rows[DGV.CurrentRow.Index].Cells[1].Value.ToString();
        }

        private void txtCategoryID_TextChanged(object sender, EventArgs e)
        {

        }

        private void DGV_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }

        private void btnEdit_Click(object sender, EventArgs e)
        {
            ccd.cmd = new SqlCommand("Update tbCategory set categoryName=@categoryName where categoryID=@categoryID", ccd.conn);
            ccd.cmd.Parameters.AddWithValue("categoryID", txtCategoryID.Text);
            ccd.cmd.Parameters.AddWithValue("categoryName", txtCategoryName.Text);
            ccd.cmd.ExecuteNonQuery();
            ShowData();
            ResetForm();
        }

        private void ResetForm()
        {
            txtCategoryID.Clear();
            txtCategoryName.Clear();
            txtCategoryID.Focus();
        }

        private void brnDelete_Click(object sender, EventArgs e)
        {

        }

        private void btnExit_Click(object sender, EventArgs e)
        {

        }
    }
}
