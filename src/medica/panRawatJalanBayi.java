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

public class panRawatJalanBayi extends javax.swing.JPanel {
private Color col;
    private GradientPaint paint;
    private RoundRectangle2D.Double shape;
    /**
     * Creates new form panRawatBayi
     */
    public panRawatJalanBayi() {
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
        shape = new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 10, 10);
        gr.fill(shape);
        gr.dispose();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fTransparan3 = new desain.FTransparan();
        jLabel13 = new javax.swing.JLabel();
        fTransparan1 = new desain.FTransparan();
        textBox3 = new desain.TextBox();
        textBox2 = new desain.TextBox();
        textBox1 = new desain.TextBox();
        jLabel12 = new javax.swing.JLabel();
        textBox5 = new desain.TextBox();
        textBox4 = new desain.TextBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button1 = new desain.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        button3 = new desain.Button();
        jLabel6 = new javax.swing.JLabel();
        button4 = new desain.Button();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox7 = new javax.swing.JComboBox();
        button2 = new desain.Button();
        jComboBox6 = new javax.swing.JComboBox();
        textBox7 = new desain.TextBox();
        textBox6 = new desain.TextBox();
        jLabel16 = new javax.swing.JLabel();
        textBox11 = new desain.TextBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        textBox9 = new desain.TextBox();
        textBox10 = new desain.TextBox();
        textBox12 = new desain.TextBox();
        fTransparan2 = new desain.FTransparan();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        buttonBig1 = new desain.ButtonBig();
        buttonBig2 = new desain.ButtonBig();
        textBox8 = new desain.TextBox();
        button5 = new desain.Button();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 0));

        fTransparan3.setBackground(new java.awt.Color(255, 204, 0));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel13.setText("Rawat Jalan Bayi");

        org.jdesktop.layout.GroupLayout fTransparan3Layout = new org.jdesktop.layout.GroupLayout(fTransparan3);
        fTransparan3.setLayout(fTransparan3Layout);
        fTransparan3Layout.setHorizontalGroup(
            fTransparan3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fTransparan3Layout.createSequentialGroup()
                .add(382, 382, 382)
                .add(jLabel13)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fTransparan3Layout.setVerticalGroup(
            fTransparan3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fTransparan3Layout.createSequentialGroup()
                .add(jLabel13)
                .add(0, 11, Short.MAX_VALUE))
        );

        fTransparan1.setBackground(new java.awt.Color(255, 204, 0));

        jLabel12.setText("Tanggal");

        textBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBox5ActionPerformed(evt);
            }
        });

        jLabel11.setText("Hasil");

        jLabel8.setText("Kode Penyakit");

        jLabel9.setText("Suhu Tubuh");

        jLabel2.setText("No. Remik Bayi");

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checked.png"))); // NOI18N
        button1.setText("Simpan");

        jLabel1.setText("No");

        jLabel4.setText("Kode dokter");

        jLabel3.setText("Tensi");

        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/but_delete.png"))); // NOI18N
        button3.setText("Hapus");

        jLabel6.setText("Keterangan");

        button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/but_refres.png"))); // NOI18N
        button4.setText("Refresh");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/but_edit.png"))); // NOI18N
        button2.setText("Edit");

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel16.setText("Kode Tindakan");

        jLabel17.setText("Kode Imunisasi");

        jLabel18.setText("Imunisasi ke-");

        org.jdesktop.layout.GroupLayout fTransparan1Layout = new org.jdesktop.layout.GroupLayout(fTransparan1);
        fTransparan1.setLayout(fTransparan1Layout);
        fTransparan1Layout.setHorizontalGroup(
            fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fTransparan1Layout.createSequentialGroup()
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(fTransparan1Layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(jLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(8, 8, 8)
                        .add(jComboBox7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jComboBox6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jComboBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(fTransparan1Layout.createSequentialGroup()
                        .add(24, 24, 24)
                        .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(fTransparan1Layout.createSequentialGroup()
                                .add(button1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(button2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(button3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(fTransparan1Layout.createSequentialGroup()
                                .add(105, 105, 105)
                                .add(button4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(fTransparan1Layout.createSequentialGroup()
                        .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(fTransparan1Layout.createSequentialGroup()
                                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(fTransparan1Layout.createSequentialGroup()
                                        .add(14, 14, 14)
                                        .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(fTransparan1Layout.createSequentialGroup()
                                        .add(14, 14, 14)
                                        .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(fTransparan1Layout.createSequentialGroup()
                                        .add(10, 10, 10)
                                        .add(jLabel18))
                                    .add(fTransparan1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .add(jLabel9))
                                    .add(fTransparan1Layout.createSequentialGroup()
                                        .add(12, 12, 12)
                                        .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                            .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                            .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                    .add(fTransparan1Layout.createSequentialGroup()
                                        .add(10, 10, 10)
                                        .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 72, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(18, 18, 18))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, fTransparan1Layout.createSequentialGroup()
                                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jLabel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(10, 10, 10))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, fTransparan1Layout.createSequentialGroup()
                                .add(jLabel17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 93, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(1, 1, 1)))
                        .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(textBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(textBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(textBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(textBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(textBox11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(textBox5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(fTransparan1Layout.createSequentialGroup()
                                .add(2, 2, 2)
                                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(textBox10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(textBox9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(fTransparan1Layout.createSequentialGroup()
                                .add(4, 4, 4)
                                .add(textBox7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(fTransparan1Layout.createSequentialGroup()
                                .add(4, 4, 4)
                                .add(textBox6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(fTransparan1Layout.createSequentialGroup()
                                .add(2, 2, 2)
                                .add(textBox12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        fTransparan1Layout.linkSize(new java.awt.Component[] {jLabel1, jLabel11, jLabel12, jLabel18, jLabel3, jLabel4, jLabel6, jLabel9}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        fTransparan1Layout.setVerticalGroup(
            fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fTransparan1Layout.createSequentialGroup()
                .add(11, 11, 11)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(fTransparan1Layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(jLabel1))
                    .add(textBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(6, 6, 6)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(fTransparan1Layout.createSequentialGroup()
                        .add(5, 5, 5)
                        .add(jLabel2))
                    .add(textBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(6, 6, 6)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(fTransparan1Layout.createSequentialGroup()
                        .add(5, 5, 5)
                        .add(jLabel4))
                    .add(textBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(4, 4, 4)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(textBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(6, 6, 6)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel16)
                    .add(textBox11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(6, 6, 6)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel17)
                    .add(textBox5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(6, 6, 6)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(textBox6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(6, 6, 6)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(textBox7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel11))
                .add(6, 6, 6)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel18)
                    .add(textBox9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(4, 4, 4)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(textBox10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(2, 2, 2)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(textBox12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(12, 12, 12)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(fTransparan1Layout.createSequentialGroup()
                        .add(3, 3, 3)
                        .add(jLabel12))
                    .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jComboBox7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jComboBox6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jComboBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(18, 18, 18)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(button1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(button2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(button3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(button4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fTransparan2.setBackground(new java.awt.Color(255, 204, 0));

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
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 127, Short.MAX_VALUE)
                        .add(buttonBig1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(buttonBig2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(77, 77, 77))))
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
                .addContainerGap(52, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(fTransparan1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(fTransparan2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, fTransparan3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(fTransparan3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(fTransparan1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(fTransparan2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBox5ActionPerformed

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
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private desain.TextBox textBox1;
    private desain.TextBox textBox10;
    private desain.TextBox textBox11;
    private desain.TextBox textBox12;
    private desain.TextBox textBox2;
    private desain.TextBox textBox3;
    private desain.TextBox textBox4;
    private desain.TextBox textBox5;
    private desain.TextBox textBox6;
    private desain.TextBox textBox7;
    private desain.TextBox textBox8;
    private desain.TextBox textBox9;
    // End of variables declaration//GEN-END:variables
}
