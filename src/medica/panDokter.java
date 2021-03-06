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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class panDokter extends javax.swing.JPanel {
private DefaultTableModel table;
private String tgl(){
    String tgl=""+jComboBox4.getSelectedItem()+"-"+jComboBox3.getSelectedItem()+"-"+jComboBox2.getSelectedItem()+"";
    return tgl;
}
    private Color col;
    private GradientPaint paint;
    private RoundRectangle2D.Double shape;
    /**
     * Creates new form panDokter
     */
    public panDokter() {
        initComponents();
        setOpaque(false);
        col=new Color(getBackground().getRed(),getBackground().getGreen(),getBackground().getBlue(),80);
        String[] judul={"ID","NAMA","JK","TEMPAT LAHIR","TANGGAL LAHIR","GOL.DARAH","AGAMA","AlAMAT","NO.TELP","STATUS","ALUMNI","NO.IJIN PRAKTIK"};
        table = new DefaultTableModel(judul,0){

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }     
        };
        jTable1.setModel(table);
        tampil();
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

        fTransparan1 = new desain.FTransparan();
        textBox3 = new desain.TextBox();
        textBox2 = new desain.TextBox();
        textBox1 = new desain.TextBox();
        jLabel12 = new javax.swing.JLabel();
        textBox5 = new desain.TextBox();
        textBox4 = new desain.TextBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button1 = new desain.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        button3 = new desain.Button();
        jComboBox5 = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        button4 = new desain.Button();
        jComboBox4 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        button2 = new desain.Button();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        textBox7 = new desain.TextBox();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        textBox6 = new desain.TextBox();
        fTransparan2 = new desain.FTransparan();
        buttonBig1 = new desain.ButtonBig();
        buttonBig2 = new desain.ButtonBig();
        textBox8 = new desain.TextBox();
        button5 = new desain.Button();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        fTransparan3 = new desain.FTransparan();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 0));

        fTransparan1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel12.setText("No Ijin Praktik");

        textBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBox5ActionPerformed(evt);
            }
        });

        jLabel10.setText("Status Nikah");

        jLabel11.setText("Alumni");

        jLabel8.setText("Alamat Tinggal");

        jLabel9.setText("No. Telp");

        jLabel2.setText("Nama Dokter");

        button1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checked.png"))); // NOI18N
        button1.setText("Simpan");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID Dokter");

        jLabel4.setText("Tempat Lahir");

        jLabel3.setText("Jenis Kelamin");

        button3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/but_delete.png"))); // NOI18N
        button3.setText("Hapus");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "AB", "O" }));

        jLabel6.setText("Gol. Darah");

        button4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/but_refres.png"))); // NOI18N
        button4.setText("Refresh");
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005" }));

        jLabel5.setText("Tanggal Lahir");

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Menikah", "Singgle" }));

        button2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/but_edit.png"))); // NOI18N
        button2.setText("Edit");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Islam", "Kristen", "Hindu", "Budha" }));

        jLabel7.setText("Agama");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "L", "P" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", " " }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        org.jdesktop.layout.GroupLayout fTransparan1Layout = new org.jdesktop.layout.GroupLayout(fTransparan1);
        fTransparan1.setLayout(fTransparan1Layout);
        fTransparan1Layout.setHorizontalGroup(
            fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fTransparan1Layout.createSequentialGroup()
                .addContainerGap()
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(fTransparan1Layout.createSequentialGroup()
                        .add(10, 10, 10)
                        .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(fTransparan1Layout.createSequentialGroup()
                                .add(button1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(button2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(button3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, fTransparan1Layout.createSequentialGroup()
                                .add(button4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(89, 89, 89))))
                    .add(fTransparan1Layout.createSequentialGroup()
                        .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel12)
                            .add(jLabel11)
                            .add(jLabel10)
                            .add(jLabel8)
                            .add(jLabel7)
                            .add(jLabel6)
                            .add(jLabel5)
                            .add(jLabel3)
                            .add(jLabel9))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(textBox6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(textBox7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(textBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jComboBox7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(textBox5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(fTransparan1Layout.createSequentialGroup()
                        .add(2, 2, 2)
                        .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel4)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel1)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jLabel2))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jComboBox5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jComboBox6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(textBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(textBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(fTransparan1Layout.createSequentialGroup()
                                .add(jComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jComboBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jComboBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(textBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fTransparan1Layout.linkSize(new java.awt.Component[] {jLabel1, jLabel10, jLabel11, jLabel12, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        fTransparan1Layout.linkSize(new java.awt.Component[] {textBox1, textBox2, textBox3, textBox4, textBox5, textBox6, textBox7}, org.jdesktop.layout.GroupLayout.HORIZONTAL);

        fTransparan1Layout.setVerticalGroup(
            fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fTransparan1Layout.createSequentialGroup()
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(fTransparan1Layout.createSequentialGroup()
                        .add(20, 20, 20)
                        .add(textBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, fTransparan1Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jLabel1)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(textBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(textBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4))
                .add(4, 4, 4)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(textBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel8))
                .add(18, 18, 18)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jComboBox2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jComboBox3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jComboBox4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(jComboBox5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel7)
                    .add(jComboBox6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel10)
                    .add(jComboBox7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(textBox5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel11)
                    .add(textBox6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(textBox7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel12))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(fTransparan1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(button1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(button2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(button3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(button4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        fTransparan2.setBackground(new java.awt.Color(255, 153, 0));

        buttonBig1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/printer.png"))); // NOI18N
        buttonBig1.setText("Print");
        buttonBig1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBig1ActionPerformed(evt);
            }
        });

        buttonBig2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dkelas.png"))); // NOI18N
        buttonBig2.setText("Detail");

        button5.setText("Cari");
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        jLabel14.setText("Keyword");

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane2.setViewportView(jScrollPane1);

        org.jdesktop.layout.GroupLayout fTransparan2Layout = new org.jdesktop.layout.GroupLayout(fTransparan2);
        fTransparan2.setLayout(fTransparan2Layout);
        fTransparan2Layout.setHorizontalGroup(
            fTransparan2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fTransparan2Layout.createSequentialGroup()
                .addContainerGap()
                .add(fTransparan2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(fTransparan2Layout.createSequentialGroup()
                        .add(jLabel14)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(textBox8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 232, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(button5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(buttonBig1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(buttonBig2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jScrollPane2))
                .addContainerGap())
        );
        fTransparan2Layout.setVerticalGroup(
            fTransparan2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fTransparan2Layout.createSequentialGroup()
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 370, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(fTransparan2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(fTransparan2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel14)
                        .add(textBox8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(button5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(buttonBig2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(buttonBig1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 64, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(0, 32, Short.MAX_VALUE))
        );

        fTransparan3.setBackground(new java.awt.Color(255, 153, 0));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel13.setText("Kelola Dokter");

        org.jdesktop.layout.GroupLayout fTransparan3Layout = new org.jdesktop.layout.GroupLayout(fTransparan3);
        fTransparan3.setLayout(fTransparan3Layout);
        fTransparan3Layout.setHorizontalGroup(
            fTransparan3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fTransparan3Layout.createSequentialGroup()
                .add(402, 402, 402)
                .add(jLabel13)
                .addContainerGap(361, Short.MAX_VALUE))
        );
        fTransparan3Layout.setVerticalGroup(
            fTransparan3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(fTransparan3Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel13)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(fTransparan1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(fTransparan2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(fTransparan3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(fTransparan3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(fTransparan1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(fTransparan2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBox5ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        try{
        Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost/medica","root","");
        koneksi.createStatement().executeUpdate("INSERT INTO DOKTER VALUES('"+textBox1.getText()+"','"+textBox2.getText()+"','"+jComboBox1.getSelectedItem()+"','"+textBox3.getText()+"','"+tgl()+"','"+jComboBox5.getSelectedItem()+"','"+jComboBox6.getSelectedItem()+"','"+textBox4.getText()+"','"+textBox5.getText()+"','"+jComboBox7.getSelectedItem()+"','"+textBox6.getText()+"','"+textBox7.getText()+"')");
        JOptionPane.showMessageDialog(fTransparan1, "data berhasil di simpan");
        tampil();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(fTransparan1, ex);
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        int hem=jTable1.getRowCount();
        for (int i=0;i<hem;i++){
            table.removeRow(0);
        }
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost/medica","root","");
            ResultSet dat=koneksi.createStatement().executeQuery("SELECT * FROM dokter WHERE kd_dokter LIKE '"+textBox1.getText()+"' OR nm_dokter LIKE '"+textBox2.getText()+"'");
            tampil();
            while(dat.next()){
                String[] data={dat.getString(1),dat.getString(2),dat.getString(3),dat.getString(4),dat.getString(5),dat.getString(6),dat.getString(7),dat.getString(8),dat.getString(9),dat.getString(10),dat.getString(11),dat.getString(12)};
                table.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_button5ActionPerformed

    private void buttonBig1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBig1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonBig1ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        textBox1.setText(null);
        textBox2.setText(null);
        textBox3.setText(null);
        textBox4.setText(null);
        textBox7.setText(null);
        textBox5.setText(null);
        textBox8.setText(null);
        textBox6.setText(null);
        tampil();       
    }//GEN-LAST:event_button4ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        try{
        Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost/medica","root","");
        koneksi.createStatement().executeUpdate("delete from dokter where kd_dokter='"+textBox1.getText()+"'");
        tampil();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(fTransparan1, ex);
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int i=jTable1.getSelectedRow();
        if(i>-1){
            textBox1.setText(table.getValueAt(i, 0).toString());
            textBox2.setText(table.getValueAt(i, 1).toString());
            textBox3.setText(table.getValueAt(i, 3).toString());
            textBox4.setText(table.getValueAt(i, 7).toString());
            textBox5.setText(table.getValueAt(i, 8).toString());
            textBox6.setText(table.getValueAt(i, 10).toString());
            textBox7.setText(table.getValueAt(i, 11).toString());
           
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        try{
        Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost/medica","root","");
        koneksi.createStatement().executeUpdate("UPDATE dokter SET nm_dokter='"+textBox2+"', jk='"+jComboBox1.getSelectedItem()
                +"',tmp_lahir='"+textBox3.getText()+"',tgl_lahir='"+tgl()+"', gol_drh='"+jComboBox5.getSelectedItem()
                +"', agama='"+jComboBox6.getSelectedItem()+"', almt_tgl='"+textBox4.getText()+"', no_telp='"+textBox5.getText()
                +"',stts_nikah='"+jComboBox7.getSelectedItem()+"', alumni='"+textBox6.getText()+"', no_ijin_prak='"+textBox7.getText()
                +"' WHERE kd_dokter='"+textBox1.getText()+"'");
        JOptionPane.showMessageDialog(fTransparan1, "data berhasil di simpan");
        tampil();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(fTransparan1, ex);
        }
    }//GEN-LAST:event_button2ActionPerformed

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
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private desain.TextBox textBox1;
    private desain.TextBox textBox2;
    private desain.TextBox textBox3;
    private desain.TextBox textBox4;
    private desain.TextBox textBox5;
    private desain.TextBox textBox6;
    private desain.TextBox textBox7;
    private desain.TextBox textBox8;
    // End of variables declaration//GEN-END:variables

    private void tampil() {
       int hem=jTable1.getRowCount();
       for(int i=0; i<hem; i++){
           table.removeRow(0);
       }
        try {
            Connection koneksi=DriverManager.getConnection("jdbc:mysql://localhost/medica","root","");
            ResultSet dat=koneksi.createStatement().executeQuery("select * from dokter");
            while(dat.next()){
                String[] data={dat.getString(1),dat.getString(2),dat.getString(3),dat.getString(4),dat.getString(5),dat.getString(6),dat.getString(7),dat.getString(8),dat.getString(9),dat.getString(10),dat.getString(11),dat.getString(12)};
                table.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
