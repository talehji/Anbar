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

/**
 *
 * @author Pallas
 */
public final class ScreenMembersAddEdit extends javax.swing.JDialog {

    EntityManager em;
    private final List<Properties> ListofVezife;
    /**
     * Creates new form NewJDialog1
     */
    Members m;

    public ScreenMembersAddEdit(java.awt.Frame parent, boolean modal, Members m, EntityManager em) {
        super(parent, modal);
        initComponents();
        this.m = m;
        this.em = em;
        ListofVezife = em.createNamedQuery("Properties.findByPairentId", Properties.class)
                .setParameter("pairentId", 1)
                .getResultList();
        jcom();
    }

    public void jcom() {
        if (m == null) {

        } else {
            jTextFieldAdi.setText(m.getAdi());
            jTextFieldQeyd.setText(m.getQeyd());
            jTextFieldSoyad.setText(m.getSoyadi());
            jTextFieldVesiqeNo.setText(m.getSexsNo());
            jFormattedTextField1.setText(m.getTelefon());
        }
        for (Properties p : ListofVezife) {
            jComboBoxVezife.addItem(p.getAdi());
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
        jTextFieldSoyad = new javax.swing.JTextField();
        jLabels = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonBagla = new javax.swing.JButton();
        jTextFieldAdi = new javax.swing.JTextField();
        jComboBoxVezife = new javax.swing.JComboBox<>();
        jTextFieldQeyd = new javax.swing.JTextField();
        jButtonYaddaSaxla = new javax.swing.JButton();
        jTextFieldVesiqeNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(202, 151, 119));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(188, 123, 81), 6));

        jTextFieldSoyad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabels.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabels.setText("Vəzifə");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Vəsiqə Nömrəsi");

        jButtonBagla.setBackground(new java.awt.Color(192, 135, 98));
        jButtonBagla.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonBagla.setText("Bağla");
        jButtonBagla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBaglaActionPerformed(evt);
            }
        });

        jTextFieldAdi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jComboBoxVezife.setBackground(new java.awt.Color(192, 135, 98));
        jComboBoxVezife.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldQeyd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonYaddaSaxla.setBackground(new java.awt.Color(192, 135, 98));
        jButtonYaddaSaxla.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonYaddaSaxla.setText("Yadda saxla");
        jButtonYaddaSaxla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYaddaSaxlaActionPerformed(evt);
            }
        });

        jTextFieldVesiqeNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Adı");

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)-###-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Qeyd");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Soyad");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Telefon");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabels, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxVezife, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldQeyd, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldVesiqeNo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButtonYaddaSaxla, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBagla, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTextFieldAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldVesiqeNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldQeyd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabels)
                    .addComponent(jComboBoxVezife, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonBagla, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButtonYaddaSaxla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonYaddaSaxlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYaddaSaxlaActionPerformed
        java.util.Date date = new java.util.Date();
        long t = date.getTime();
        java.sql.Date sqlDate = new java.sql.Date(t);
        Properties SelectedProperties = ListofVezife.get(jComboBoxVezife.getSelectedIndex());
        if (m != null) {
            em.getTransaction().begin();
            Members d = new Members();
            d.setIdMembers(m.getIdMembers());
            d.setAdi(jTextFieldAdi.getText());
            d.setSoyadi(jTextFieldSoyad.getText());
            d.setTelefon(jFormattedTextField1.getText());
            d.setSexsNo(jTextFieldVesiqeNo.getText());
            d.setQeyd(jTextFieldQeyd.getText());
            d.setIdProperties(em.find(Properties.class, SelectedProperties.getIdProperties()));
            d.setTarix(sqlDate);
            d.setIsActive("1");
            em.merge(d);
            em.getTransaction().commit();
            this.dispose();

        } else {
            em.getTransaction().begin();
            Members d = new Members(0);
            d.setAdi(jTextFieldAdi.getText());
            d.setSoyadi(jTextFieldSoyad.getText());
            d.setTelefon(jFormattedTextField1.getText());
            d.setSexsNo(jTextFieldVesiqeNo.getText());
            d.setQeyd(jTextFieldQeyd.getText());
            d.setIdProperties(em.find(Properties.class, SelectedProperties.getIdProperties()));
            d.setTarix(sqlDate);
            d.setIsActive("1");
            em.persist(d);
            em.getTransaction().commit();
            this.dispose();
        }
    }//GEN-LAST:event_jButtonYaddaSaxlaActionPerformed

    private void jButtonBaglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBaglaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonBaglaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBagla;
    private javax.swing.JButton jButtonYaddaSaxla;
    private javax.swing.JComboBox<String> jComboBoxVezife;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabels;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAdi;
    private javax.swing.JTextField jTextFieldQeyd;
    private javax.swing.JTextField jTextFieldSoyad;
    private javax.swing.JTextField jTextFieldVesiqeNo;
    // End of variables declaration//GEN-END:variables
}
