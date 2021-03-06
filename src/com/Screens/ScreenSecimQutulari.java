/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Screens;

import com.entity.Mainproperties;
import com.entity.Properties;
import java.awt.event.KeyEvent;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Pallas
 */
public final class ScreenSecimQutulari extends javax.swing.JDialog {

    /**
     * Creates new form NewJDialog
     */
    EntityManager em;
    private List<Mainproperties> ListOfMainproperties;
    private List<Properties> ListOfProperties;
    private Mainproperties selectedMainProperties;
    private Properties selectedProperties;
    private List<Properties> ListOfPropertiesChange;
    private Mainproperties selectedMainPropertiesChange;
    private Properties selectedPropertiesAlt;

    public ScreenSecimQutulari(java.awt.Frame parent, boolean modal, EntityManager em) {
        super(parent, modal);
        initComponents();
        this.em = em;
        AllCombo();
    }

    public void AllCombo() {
        jComboBoxMain.removeAllItems();
        jComboBoxMainChange.removeAllItems();
        ListOfMainproperties = em.createNamedQuery("Mainproperties.findAll", Mainproperties.class)
                .getResultList();
        ListOfMainproperties.forEach((mp) -> {
            jComboBoxMain.addItem(mp.getName());
        });
        ListOfMainproperties.forEach((mp) -> {
            jComboBoxMainChange.addItem(mp.getName());
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxMain = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldmain = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxAltChange = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboBoxMainChange = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldMainChange = new javax.swing.JTextField();
        jTextFieldAltChange = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Alt Bölmələr");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Alt Bölmə Əlavə Et");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Bölmələr");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Alt Bölmələr");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Bölmələr");

        jComboBoxMain.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxMain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMainActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Bölmələr Əlavə Et");

        jTextFieldmain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldmainActionPerformed(evt);
            }
        });
        jTextFieldmain.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldmainKeyReleased(evt);
            }
        });

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxMain, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldmain))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldmain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("      Daxil et      ", jPanel1);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Alt Bölmələr");

        jComboBoxAltChange.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxAltChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxAltChangeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Alt Bölmə Əlavə Et");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Bölmələr");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Alt Bölmələr");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Bölmələr");

        jComboBoxMainChange.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxMainChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMainChangeActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Bölmələr Əlavə Et");

        jTextFieldMainChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMainChangeActionPerformed(evt);
            }
        });
        jTextFieldMainChange.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMainChangeKeyReleased(evt);
            }
        });

        jTextFieldAltChange.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldAltChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAltChangeActionPerformed(evt);
            }
        });
        jTextFieldAltChange.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldAltChangeKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxMainChange, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldMainChange))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxAltChange, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldAltChange))
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboBoxMainChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldMainChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxAltChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldAltChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("      Düzəliş et      ", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldmainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldmainActionPerformed
        em.getTransaction().begin();
        Mainproperties d = new Mainproperties(0);
        d.setName(jTextFieldmain.getText());
        em.persist(d);
        em.getTransaction().commit();
        jTextFieldmain.setText(null);
        AllCombo();
    }//GEN-LAST:event_jTextFieldmainActionPerformed

    private void jComboBoxMainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMainActionPerformed
        if (jComboBoxMain.getSelectedIndex() > -1) {
            jComboBox2.removeAllItems();
            selectedMainProperties = ListOfMainproperties.get(jComboBoxMain.getSelectedIndex());
            ListOfProperties = em.createNamedQuery("Properties.findByPairentId", Properties.class)
                    .setParameter("pairentId", selectedMainProperties.getIdMainProperties())
                    .getResultList();
            ListOfProperties.forEach((p) -> {
                jComboBox2.addItem(p.getAdi());
            });
        } else {
            jComboBox2.removeAllItems();
        }
    }//GEN-LAST:event_jComboBoxMainActionPerformed

    private void jTextFieldmainKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldmainKeyReleased

    }//GEN-LAST:event_jTextFieldmainKeyReleased

    private void jTextField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyReleased

    }//GEN-LAST:event_jTextField2KeyReleased

    private void jComboBoxMainChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMainChangeActionPerformed
        if (jComboBoxMainChange.getSelectedIndex() > -1) {
            jComboBoxAltChange.removeAllItems();
            selectedMainPropertiesChange = ListOfMainproperties.get(jComboBoxMainChange.getSelectedIndex());
            jTextFieldMainChange.setText(selectedMainPropertiesChange.getName());
            ListOfPropertiesChange = em.createNamedQuery("Properties.findByPairentId", Properties.class)
                    .setParameter("pairentId", selectedMainPropertiesChange.getIdMainProperties())
                    .getResultList();
            ListOfPropertiesChange.forEach((p) -> {
                jComboBoxAltChange.addItem(p.getAdi());
            });
        } else {
            jComboBoxAltChange.removeAllItems();
        }
    }//GEN-LAST:event_jComboBoxMainChangeActionPerformed

    private void jTextFieldMainChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMainChangeActionPerformed
        em.getTransaction().begin();
        Mainproperties d = new Mainproperties();
        d.setIdMainProperties(selectedMainPropertiesChange.getIdMainProperties());
        d.setName(jTextFieldMainChange.getText());
        em.merge(d);
        em.getTransaction().commit();
        em.clear();
        jTextFieldMainChange.setText(null);
        AllCombo();
    }//GEN-LAST:event_jTextFieldMainChangeActionPerformed

    private void jTextFieldMainChangeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMainChangeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMainChangeKeyReleased

    private void jTextFieldAltChangeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAltChangeKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAltChangeKeyReleased

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        em.getTransaction().begin();
        Properties d = new Properties(0);
        d.setAdi(jTextField2.getText());
        d.setPairentId(selectedMainProperties.getIdMainProperties());
        em.persist(d);
        em.getTransaction().commit();
        jTextField2.setText(null);
        AllCombo();
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBoxAltChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxAltChangeActionPerformed
        if (jComboBoxAltChange.getSelectedIndex() > -1) {
            selectedPropertiesAlt = ListOfPropertiesChange.get(jComboBoxAltChange.getSelectedIndex());
            jTextFieldAltChange.setText(selectedPropertiesAlt.getAdi());
        } else {
        }
    }//GEN-LAST:event_jComboBoxAltChangeActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextFieldAltChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAltChangeActionPerformed
        em.getTransaction().begin();
        Properties d = new Properties();
        d.setIdProperties(selectedPropertiesAlt.getIdProperties());
        d.setAdi(jTextFieldAltChange.getText());
        d.setPairentId(selectedMainPropertiesChange.getIdMainProperties());
        em.merge(d);
        em.getTransaction().commit();
        em.clear();
        jTextFieldAltChange.setText(null);
        AllCombo();
    }//GEN-LAST:event_jTextFieldAltChangeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBoxAltChange;
    private javax.swing.JComboBox<String> jComboBoxMain;
    private javax.swing.JComboBox<String> jComboBoxMainChange;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldAltChange;
    private javax.swing.JTextField jTextFieldMainChange;
    private javax.swing.JTextField jTextFieldmain;
    // End of variables declaration//GEN-END:variables
}
