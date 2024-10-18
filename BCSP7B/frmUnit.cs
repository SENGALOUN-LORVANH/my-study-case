using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace BCSP7B
{
    public partial class frmUnit : Form
    {
        public frmUnit()
        {
            InitializeComponent();
        }
        classConnectDatabase ccd = new classConnectDatabase();
        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void groupBox1_Enter(object sender, EventArgs e)
        {

        }

        private void frmUnit_Load(object sender, EventArgs e)
        {
            ccd.connectDatabase();
        }

        private void btnSave_Click(object sender, EventArgs e)
        {

        }

        private void btnEdit_Click(object sender, EventArgs e)
        {

        }

        private void brnDelete_Click(object sender, EventArgs e)
        {

        }

        private void btnExit_Click(object sender, EventArgs e)
        {

        }

        private void txtUnitID_TextChanged(object sender, EventArgs e)
        {

        }

        private void txtUnitName_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
