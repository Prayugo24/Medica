/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package medica;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.geom.RoundRectangle2D.Double;
import javax.swing.JPanel;

public class panPasienIbuMati extends javax.swing.JPanel {
private Color col;
    private GradientPaint paint;
    private RoundRectangle2D.Double shape;
    /**
     * Creates new form panIbuMati
     */
    public panPasienIbuMati() {
        initComponents();
        setOpaque(false);
        col=new Color(getBackground().getRed(),getBackground().getGreen(),getBackground().getBlue(),80);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void setBackground(Color bg) {
        super.setBackground(bg);
        col=new Color(getBackground().getRed(),getBackground().getGreen(),getBackground().getBlue(),80);
        repaint();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D gr=(Graphics2D)g.create();
        gr.setColor(col);
//        gr.fillRect(0, 0, getWidth(), getHeight());
        shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 10, 10);
        gr.fill(shape);
        gr.dispose();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fTransparan3 = new desain.FTransparan();
        jLabel13 = new javax.swing.JLabel();
        fTransparan1 = new desain.FTransparan();
        textBox2 = new desain.TextBox();
        textBox1 = new desain.TextBox();
        textBox4 = new desain.TextBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        button1 = new desain.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        button3 = new desain.Button();
        button4 = new desain.Button();
        button2 = new desain.Button();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        fTransparan2 = new desain.FTransparan();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonBig1 = new desain.ButtonBig();
        buttonBig2 = new desain.ButtonBig();
        textBox8 = new desain.TextBox();
        button5 = new desain.Button();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 0));

        fTransparan3.setBackground(new java.awt.Color(255, 153, 0));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel13.setText("Kelola Pasien Ibu Mati");

        org.jdesktop.layout.GroupLayout fTransparan3Layout = new org.jdesktop.layout.GroupLayout(fTransparan3);
        fTransparan3.setLayout(fTransparan3Layout);
        fTransparan3Layout.setHorizontalGroup(
            fTransparan3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fTransparan3Layout.createSequentialGroup()
                .add(385, 385, 385)
                .add(jLabel13)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fTransparan3Layout.setVerticalGroup(
            fTransparan3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fTransparan3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel13)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        fTransparan1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel8.setText("Keterangan");

        jLabel9.setText("Tanggal");

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checked.png"))); // NOI18N
        button1.setText("Simpan");

        jLabel1.setText("No. Remik Ibu");

        jLabel4.setText("Jam");

        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/but_delete.png"))); // NOI18N
        button3.setText("Hapus");

        button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/but_refres.png"))); // NOI18N
        button4.setText("Refresh");

        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/but_edit.png"))); // NOI18N
        button2.setText("Edit");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        org.jdesktop.layout.GroupLayout fTransparan1Layout = new org.jdesktop.layout.GroupLayout(fTransparan1);
        fTransparan1.setLayout(fTransparan1Layout);
        fTransparan1Layout.setHorizontalGroup(
            fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fTransparan1Layout.createSequentialGroup()
                .add(21, 21, 21)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(fTransparan1Layout.createSequentialGroup()
                        .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(fTransparan1Layout.createSequentialGroup()
                                .add(button1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(button2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(button3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(fTransparan1Layout.createSequentialGroup()
                                .add(93, 93, 93)
                                .add(button4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .add(fTransparan1Layout.createSequentialGroup()
                        .add(4, 4, 4)
                        .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(fTransparan1Layout.createSequentialGroup()
                                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel9))
                                .add(28, 28, 28))
                            .add(fTransparan1Layout.createSequentialGroup()
                                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                    .add(jLabel8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)))
                        .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(fTransparan1Layout.createSequentialGroup()
                                .add(textBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(22, 22, 22))
                            .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(fTransparan1Layout.createSequentialGroup()
                                    .add(textBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(22, 22, 22))
                                .add(fTransparan1Layout.createSequentialGroup()
                                    .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                        .add(textBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .add(fTransparan1Layout.createSequentialGroup()
                                            .add(jComboBox6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jComboBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                            .add(jComboBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                    .add(0, 27, Short.MAX_VALUE)))))))
        );
        fTransparan1Layout.setVerticalGroup(
            fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fTransparan1Layout.createSequentialGroup()
                .add(30, 30, 30)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(textBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(1, 1, 1)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(textBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4))
                .add(4, 4, 4)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(jComboBox6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jComboBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jComboBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(textBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(button1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(button2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(button3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(button4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(267, Short.MAX_VALUE))
        );

        fTransparan2.setBackground(new java.awt.Color(255, 153, 0));

        jTable1.setBackground(new java.awt.Color(204, 255, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        buttonBig1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/printer.png"))); // NOI18N
        buttonBig1.setText("Print");

        buttonBig2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dkelas.png"))); // NOI18N
        buttonBig2.setText("Detail");

        button5.setText("Cari");

        jLabel14.setText("Keyword");

        org.jdesktop.layout.GroupLayout fTransparan2Layout = new org.jdesktop.layout.GroupLayout(fTransparan2);
        fTransparan2.setLayout(fTransparan2Layout);
        fTransparan2Layout.setHorizontalGroup(
            fTransparan2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fTransparan2Layout.createSequentialGroup()
                .addContainerGap()
                .add(fTransparan2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane1)
                    .add(fTransparan2Layout.createSequentialGroup()
                        .add(jLabel14)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(textBox8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 232, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(button5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 180, Short.MAX_VALUE)
                        .add(buttonBig1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(18, 18, 18)
                        .add(buttonBig2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(22, 22, 22))))
        );
        fTransparan2Layout.setVerticalGroup(
            fTransparan2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fTransparan2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 362, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(fTransparan2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(fTransparan2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(textBox8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(button5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel14))
                    .add(buttonBig1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .add(buttonBig2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(fTransparan3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(fTransparan1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(fTransparan2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(fTransparan3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(fTransparan1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(fTransparan2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private desain.Button button1;
    private desain.Button button2;
    private desain.Button button3;
    private desain.Button button4;
    private desain.Button button5;
    private desain.ButtonBig buttonBig1;
    private desain.ButtonBig buttonBig2;
    private desain.FTransparan fTransparan1;
    private desain.FTransparan fTransparan2;
    private desain.FTransparan fTransparan3;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private desain.TextBox textBox1;
    private desain.TextBox textBox2;
    private desain.TextBox textBox4;
    private desain.TextBox textBox8;
    // End of variables declaration//GEN-END:variables
}
