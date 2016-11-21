package com.Screens;

import com.entity.Mainproperties;
import com.entity.Mallar;
import com.entity.Malnovu;
import com.entity.Malqrupu;
import com.entity.Malsinfi;
import com.entity.Members;
import com.entity.Properties;
import java.util.List;
import javax.persistence.EntityManager;

public final class ScreenMallarAddEdit extends javax.swing.JDialog {

    EntityManager em;
    private final List<Members> ListofMembers;
    private List<Mainproperties> ListOfMainproperties;
    private Mainproperties selectedMainProperties;
    private List<Properties> ListOfProperties;
    private Properties selectedPropertiesAlt;
    private List<Malsinfi> ListOfMalsinfi;
    private Malsinfi selectedMalsinfi;
    private List<Malqrupu> ListOfMalQrupu;
    private Malqrupu selectedMalQrupu;
    private List<Malnovu> ListOfMalNovu;
    private Malnovu selectedMalNovu;

    Mallar m;

    public ScreenMallarAddEdit(java.awt.Frame parent, boolean modal, EntityManager em, Mallar m) {
        super(parent, modal);
        initComponents();
        this.m = m;
        this.em = em;
        ListofMembers = em.createNamedQuery("Members.findByIsActive", Members.class)
                .setParameter("isActive", "1")
                .getResultList();
        jcom();
    }

    public void jcom() {

        if (m == null) {

        } else {
            jTextFieldAdi.setText(m.getAdi());
            jTextFieldMiqdari.setText(m.getMiqdari());
            jTextFieldStrixKod.setText(m.getStrixKod());
        }
            jComboBoxOlcuVahidiAlt.removeAllItems();
            ListOfProperties = em.createNamedQuery("Properties.findByPairentId", Properties.class)
                    .setParameter("pairentId", 2)
                    .getResultList();
            ListOfProperties.forEach((p) -> {
                jComboBoxOlcuVahidiAlt.addItem(p.getAdi());
            });



        jComboBoxMalSinfi.removeAllItems();
        ListOfMalsinfi = em.createNamedQuery("Malsinfi.findAll", Malsinfi.class).getResultList();
        for (Malsinfi ms : ListOfMalsinfi) {
            jComboBoxMalSinfi.addItem(ms.getAdi());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldAdi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldStrixKod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxMalSinfi = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxMalQrupu = new javax.swing.JComboBox<>();
        jComboBoxMAlNovu = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBoxOlcuVahidiAlt = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldMiqdari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(202, 151, 119));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 123, 81), 6));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Malın adı");

        jTextFieldAdi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Ölçü vahidi");

        jTextFieldStrixKod.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Ştrix Kod");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Malın Sinfi");

        jComboBoxMalSinfi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxMalSinfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMalSinfiActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Malın Qrupu");

        jComboBoxMalQrupu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxMalQrupu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMalQrupuActionPerformed(evt);
            }
        });

        jComboBoxMAlNovu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxMAlNovu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMAlNovuActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Malın Növü");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Yadda Saxla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Ləğv Et");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBoxOlcuVahidiAlt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxOlcuVahidiAlt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOlcuVahidiAltActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Miqdarı");

        jTextFieldMiqdari.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldAdi))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldStrixKod))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxMalSinfi, 0, 249, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxMalQrupu, 0, 249, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxMAlNovu, 0, 249, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxOlcuVahidiAlt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldMiqdari)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBoxOlcuVahidiAlt)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldMiqdari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldStrixKod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxMalSinfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxMalQrupu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxMAlNovu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxOlcuVahidiAltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOlcuVahidiAltActionPerformed
        if (jComboBoxOlcuVahidiAlt.getSelectedIndex() > -1) {
            selectedPropertiesAlt = ListOfProperties.get(jComboBoxOlcuVahidiAlt.getSelectedIndex());
        } else {
        }
    }//GEN-LAST:event_jComboBoxOlcuVahidiAltActionPerformed

    private void jComboBoxMalQrupuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMalQrupuActionPerformed
        if (jComboBoxMalQrupu.getSelectedIndex() > -1) {
            jComboBoxMAlNovu.removeAllItems();
            selectedMalQrupu = ListOfMalQrupu.get(jComboBoxMalQrupu.getSelectedIndex());
            ListOfMalNovu = em.createNamedQuery("Malnovu.findByIdMalQrupu", Malnovu.class)
                    .setParameter("idMalQrupu", em.find(Malqrupu.class, selectedMalQrupu.getIdMalQrupu()))
                    .getResultList();
            ListOfMalNovu.forEach((p) -> {
                jComboBoxMAlNovu.addItem(p.getAdi());
            });
        } else {
            jComboBoxMAlNovu.removeAllItems();
        }
    }//GEN-LAST:event_jComboBoxMalQrupuActionPerformed

    private void jComboBoxMalSinfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMalSinfiActionPerformed
        if (jComboBoxMalSinfi.getSelectedIndex() > -1) {
            jComboBoxMalQrupu.removeAllItems();
            selectedMalsinfi = ListOfMalsinfi.get(jComboBoxMalSinfi.getSelectedIndex());
            ListOfMalQrupu = em.createNamedQuery("Malqrupu.findByIdMalSinfi", Malqrupu.class)
                    .setParameter("idMalSinfi", em.find(Malsinfi.class, selectedMalsinfi.getIdMalSinfi()))
                    .getResultList();
            ListOfMalQrupu.forEach((p) -> {
                jComboBoxMalQrupu.addItem(p.getAdi());
            });
        } else {
            jComboBoxMalQrupu.removeAllItems();
        }
    }//GEN-LAST:event_jComboBoxMalSinfiActionPerformed

    private void jComboBoxMAlNovuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMAlNovuActionPerformed
        if (jComboBoxMAlNovu.getSelectedIndex() > -1) {
            selectedMalNovu = ListOfMalNovu.get(jComboBoxMAlNovu.getSelectedIndex());
        } else {
        }
    }//GEN-LAST:event_jComboBoxMAlNovuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (m == null) {
            em.getTransaction().begin();
            Mallar d = new Mallar(0);
            d.setAdi(jTextFieldAdi.getText());
            d.setIdMalNovu(em.find(Malnovu.class, selectedMalNovu.getIdMalNovu()));
            d.setStrixKod(jTextFieldStrixKod.getText());
            d.setMiqdari(jTextFieldMiqdari.getText());
            d.setIdProperties(em.find(Properties.class, selectedPropertiesAlt.getIdProperties()));
            em.persist(d);
            em.getTransaction().commit();
            this.dispose();
        } else {
            em.getTransaction().begin();
            Mallar d = new Mallar();
            d.setIdMallar(m.getIdMallar());
            d.setAdi(jTextFieldAdi.getText());
            d.setIdMalNovu(em.find(Malnovu.class, selectedMalNovu.getIdMalNovu()));
            d.setStrixKod(jTextFieldStrixKod.getText());
            d.setMiqdari(jTextFieldMiqdari.getText());
            d.setIdProperties(em.find(Properties.class, selectedPropertiesAlt.getIdProperties()));
            em.merge(d);
            em.getTransaction().commit();
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxMAlNovu;
    private javax.swing.JComboBox<String> jComboBoxMalQrupu;
    private javax.swing.JComboBox<String> jComboBoxMalSinfi;
    private javax.swing.JComboBox<String> jComboBoxOlcuVahidiAlt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAdi;
    private javax.swing.JTextField jTextFieldMiqdari;
    private javax.swing.JTextField jTextFieldStrixKod;
    // End of variables declaration//GEN-END:variables
}
