package com.Screens;

import com.entity.Maganfir;
import java.awt.Font;
import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.table.DefaultTableModel;

public final class ScreenMagazalar extends javax.swing.JDialog {

    EntityManager em;
    private List<Maganfir> ListOfMaganfir;
    private Maganfir selectedMagaza;

    public ScreenMagazalar(java.awt.Frame parent, boolean modal,EntityManager em) {
        super(parent, modal);
        initComponents();
        this.em = em;
        FillMagazaTable();
    }

    public void FillMagazaTable() {

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

        jTableMagaza.setAutoResizeMode(jTableMagaza.AUTO_RESIZE_ALL_COLUMNS);
        jTableMagaza.setRowHeight(20);
        jTableMagaza.setFont(new Font("Tahoma", Font.PLAIN, 14));
        jTableMagaza.setModel(tmodel);
        jTableMagaza.setModel(tmodel);

        ListOfMaganfir = em.createNamedQuery("Maganfir.findByPairentId", Maganfir.class)
                .setParameter("pairentId", "2")
                .getResultList();

        for (Maganfir b : ListOfMaganfir) {
            tmodel.insertRow(jTableMagaza.getRowCount(), new Object[]{
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
        jTableMagaza = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(202, 151, 119));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 123, 81), 6));

        jTableMagaza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableMagaza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMagazaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMagaza);

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
        ScreenMagazalarAddEdit d = new ScreenMagazalarAddEdit(null, rootPaneCheckingEnabled, null, em);
        d.setVisible(true);
        em.clear();
        FillMagazaTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableMagaza.getModel();
        int index = jTableMagaza.getSelectedRow();
        selectedMagaza = ListOfMaganfir.get(index);
        ScreenMagazalarAddEdit d = new ScreenMagazalarAddEdit(null, rootPaneCheckingEnabled, selectedMagaza, em);
        d.setVisible(true);
        em.clear();
        FillMagazaTable();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTableMagazaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMagazaMouseClicked
        if (evt.getClickCount() == 2) {
            DefaultTableModel model = (DefaultTableModel) jTableMagaza.getModel();
            int index = jTableMagaza.getSelectedRow();
            selectedMagaza = ListOfMaganfir.get(index);
            ScreenMagazalarAddEdit d = new ScreenMagazalarAddEdit(null, rootPaneCheckingEnabled, selectedMagaza, em);
            d.setVisible(true);
            em.clear();
            FillMagazaTable();
        }
    }//GEN-LAST:event_jTableMagazaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMagaza;
    // End of variables declaration//GEN-END:variables
}
