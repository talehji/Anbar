/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Screens;

import com.entity.Members;
import com.entity.Properties;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pallas
 */
public final class ScreensMembers extends javax.swing.JDialog {

    private final EntityManager em;
    private DefaultTableModel tmodel;
    private List<Members> ListOfMembers;
    private Members selectedKassa;

    /**
     * Creates new form ScreensMembers
     */
    public ScreensMembers(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AnbarPU");
        em = emf.createEntityManager();
        FillMembersTable();
    }

    public void FillMembersTable() {

        tmodel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }

        };
        tmodel.addColumn("Adı");
        tmodel.addColumn("Soyadı");
        tmodel.addColumn("Səxşiyyət VN");
        tmodel.addColumn("Telefon");
        tmodel.addColumn("Vəzifə");
        tmodel.addColumn("Status");

        jTableMembers.setModel(tmodel);
        ListOfMembers = null;
        ListOfMembers = em.createNamedQuery("Members.findAll", Members.class).getResultList();

        for (Members b : ListOfMembers) {

            if (b.getIsActive().equals("1")) {
                tmodel.insertRow(jTableMembers.getRowCount(), new Object[]{
                    b.getAdi(),
                    b.getSoyadi(),
                    b.getSexsNo(),
                    b.getTelefon(),
                    b.getIdProperties().getAdi(),
                    "Aktiv"
                });
            } else if (b.getIsActive().equals("2")) {
                tmodel.insertRow(jTableMembers.getRowCount(), new Object[]{
                    b.getAdi(),
                    b.getSoyadi(),
                    b.getSexsNo(),
                    b.getTelefon(),
                    b.getIdProperties().getAdi(),
                    "Passiv"
                });
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMembers = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableMembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTableMembers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMembersMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMembers);

        jButton1.setText("Əlavə et");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Dəyiş");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ScreenMembersAddEdit d = new ScreenMembersAddEdit(null, rootPaneCheckingEnabled, null);
        d.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTableMembersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMembersMouseClicked
        if (evt.getClickCount() == 2) {
            DefaultTableModel model = (DefaultTableModel) jTableMembers.getModel();
            int index = jTableMembers.getSelectedRow();
            selectedKassa = ListOfMembers.get(index);
            ScreenMembersAddEdit d = new ScreenMembersAddEdit(null, rootPaneCheckingEnabled, selectedKassa);
            d.setVisible(true);
            FillMembersTable();
        }
    }//GEN-LAST:event_jTableMembersMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableMembers.getModel();
        int index = jTableMembers.getSelectedRow();
        selectedKassa = ListOfMembers.get(index);
        ScreenMembersAddEdit d = new ScreenMembersAddEdit(null, rootPaneCheckingEnabled, selectedKassa);
        d.setVisible(true);
        FillMembersTable();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMembers;
    // End of variables declaration//GEN-END:variables
}
