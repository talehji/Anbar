package com.Screens;

import com.entity.Maganfir;
import java.awt.Font;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.table.DefaultTableModel;

public final class ScreenFirma extends javax.swing.JDialog {

    EntityManager em;
    private List<Maganfir> ListOfMaganfir;
    private Maganfir selectedFimra;

    public ScreenFirma(java.awt.Frame parent, boolean modal,EntityManager em) {
        super(parent, modal);
        initComponents();
        this.em = em;
        FillFirmaTable();
    }

    public void FillFirmaTable() {

        DefaultTableModel tmodel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tmodel.addColumn("Adı");
        tmodel.addColumn("Telefon");
        tmodel.addColumn("Ünvan");
        tmodel.addColumn("Satıcı");

        jTableFimra.setAutoResizeMode(jTableFimra.AUTO_RESIZE_ALL_COLUMNS);
        jTableFimra.setRowHeight(20);
        jTableFimra.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jTableFimra.setModel(tmodel);
        jTableFimra.setModel(tmodel);

        ListOfMaganfir = em.createNamedQuery("Maganfir.findByPairentId", Maganfir.class)
                .setParameter("pairentId", "3")
                .getResultList();

        for (Maganfir b : ListOfMaganfir) {
            tmodel.insertRow(jTableFimra.getRowCount(), new Object[]{
                b.getAdi(),
                b.getTelefon(),
                b.getUnvan(),
                b.getIdMembers().getAdi() + " " + b.getIdMembers().getSoyadi(),});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableFimra = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(202, 151, 119));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 123, 81), 6));

        jTableFimra.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableFimra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableFimraMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableFimra);

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 423, Short.MAX_VALUE)
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
        ScreenFirmaAddEdit d = new ScreenFirmaAddEdit(null, rootPaneCheckingEnabled, null, em);
        d.setVisible(true);
        em.clear();
        FillFirmaTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableFimra.getModel();
        int index = jTableFimra.getSelectedRow();
        selectedFimra = ListOfMaganfir.get(index);
        ScreenFirmaAddEdit d = new ScreenFirmaAddEdit(null, rootPaneCheckingEnabled, selectedFimra, em);
        d.setVisible(true);
        em.clear();
        FillFirmaTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTableFimraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableFimraMouseClicked
        if (evt.getClickCount() == 2) {
            DefaultTableModel model = (DefaultTableModel) jTableFimra.getModel();
            int index = jTableFimra.getSelectedRow();
            selectedFimra = ListOfMaganfir.get(index);
            ScreenFirmaAddEdit d = new ScreenFirmaAddEdit(null, rootPaneCheckingEnabled, selectedFimra, em);
            d.setVisible(true);
            em.clear();
            FillFirmaTable();
        }
    }//GEN-LAST:event_jTableFimraMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableFimra;
    // End of variables declaration//GEN-END:variables
}
