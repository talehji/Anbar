package com.Screens;

import com.entity.Maganfir;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.table.DefaultTableModel;

public final class ScreenMagazalar extends javax.swing.JDialog {

    private final EntityManager em;

    public ScreenMagazalar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AnbarPU");
        em = emf.createEntityManager();
        FillMagazaTable();
    }

    public void FillMagazaTable() {

        DefaultTableModel tmodel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tmodel.addColumn("İD");
        tmodel.addColumn("Adı");
        tmodel.addColumn("Telefon");
        tmodel.addColumn("Ünvan");
        tmodel.addColumn("Satıcı");


        jTableMagaza.setModel(tmodel);

        List<Maganfir> ListOfMaganfir = em.createNamedQuery("Maganfir.findAll", Maganfir.class).getResultList();

        for (Maganfir b : ListOfMaganfir) {

            if (b.getPairentId().equals("2")) {
                tmodel.insertRow(jTableMagaza.getRowCount(), new Object[]{
                    b.getIdMagAnFir(),
                    b.getAdi(),
                    b.getTelefon(),
                    b.getUnvan(),
                    b.getIdMembers().getAdi() + " " + b.getIdMembers().getSoyadi(),});
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMagaza = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableMagaza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableMagaza);

        jButton1.setText("Əlavə et");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Dəyiş");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 689, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ScreenMagazalarAdd d = new ScreenMagazalarAdd(null, rootPaneCheckingEnabled);
        d.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMagaza;
    // End of variables declaration//GEN-END:variables
}
