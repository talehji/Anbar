/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Screens;

import com.entity.Mallar;
import java.awt.Font;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pallas
 */
public final class ScreenMallar extends javax.swing.JDialog {

    private DefaultTableModel tmodel;

    /**
     * Creates new form ScreenMallar
     */
    EntityManager em;
    private List<Mallar> ListOfMallar;
    private Mallar selectedMallar;
    public ScreenMallar(java.awt.Frame parent, boolean modal, EntityManager em) {
        super(parent, modal);
        initComponents();
        this.em = em;
        FillTheMallarTable();
    }

    public void FillTheMallarTable() {
        tmodel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tmodel.addColumn("Adı");
        tmodel.addColumn("Ölçü vahidi");
        tmodel.addColumn("Ştrix Kod");
        tmodel.addColumn("Malın Sinfi");
        tmodel.addColumn("Malın Qrupu");
        tmodel.addColumn("Malın Növü");

        jTableMallar.setAutoResizeMode(jTableMallar.AUTO_RESIZE_ALL_COLUMNS);
        jTableMallar.setRowHeight(20);
        jTableMallar.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jTableMallar.setModel(tmodel);
        ListOfMallar = em.createNamedQuery("Mallar.findAll", Mallar.class).getResultList();

        for (Mallar b : ListOfMallar) {

            tmodel.insertRow(jTableMallar.getRowCount(), new Object[]{
                b.getAdi(),
                b.getIdProperties().getAdi(),
                b.getStrixKod(),
                b.getIdMalNovu().getIdMalQrupu().getIdMalSinfi().getAdi(),
                b.getIdMalNovu().getIdMalQrupu().getAdi(),
                b.getIdMalNovu().getAdi(),});
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMallar = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableMallar.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableMallar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMallarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMallar);

        jButton1.setBackground(new java.awt.Color(192, 135, 98));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Əlavə et");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(192, 135, 98));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Dəyiş");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 943, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ScreenMallarAddEdit d = new ScreenMallarAddEdit(null, rootPaneCheckingEnabled, em, null);
        d.setVisible(true);
        em.clear();
        FillTheMallarTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            DefaultTableModel model = (DefaultTableModel) jTableMallar.getModel();
            int index = jTableMallar.getSelectedRow();
            selectedMallar = ListOfMallar.get(index);
            ScreenMallarAddEdit d = new ScreenMallarAddEdit(null, rootPaneCheckingEnabled, em, selectedMallar);
            d.setVisible(true);
            em.clear();
            FillTheMallarTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTableMallarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMallarMouseClicked
        if (evt.getClickCount() == 2) {
            DefaultTableModel model = (DefaultTableModel) jTableMallar.getModel();
            int index = jTableMallar.getSelectedRow();
            selectedMallar = ListOfMallar.get(index);
            ScreenMallarAddEdit d = new ScreenMallarAddEdit(null, rootPaneCheckingEnabled, em, selectedMallar);
            d.setVisible(true);
            em.clear();
            FillTheMallarTable();
        }
    }//GEN-LAST:event_jTableMallarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMallar;
    // End of variables declaration//GEN-END:variables
}
