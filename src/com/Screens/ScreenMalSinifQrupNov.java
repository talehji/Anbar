/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Screens;

import com.entity.Malnovu;
import com.entity.Malqrupu;
import com.entity.Malsinfi;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author Pallas
 */
public final class ScreenMalSinifQrupNov extends javax.swing.JDialog {

    /**
     * Creates new form ScreenMalQrupSinf
     */
    EntityManager em;
    private List<Malsinfi> ListOfMalsinfi;
    private Malsinfi selectedMalsinfi;
    private List<Malqrupu> ListOfMalQrupu;
    private Malqrupu selectedMalQrupu;
    private List<Malnovu> ListOfMalNovu;
    private Malsinfi selectedMalsinfiChange;
    private List<Malqrupu> ListOfMalQrupuChange;
    private Malqrupu selectedMalQrupuChange;
    private List<Malnovu> ListOfMalNovuChange;
    private Malnovu selectedMalNovuChange;

    public ScreenMalSinifQrupNov(java.awt.Frame parent, boolean modal, EntityManager em) {
        super(parent, modal);
        initComponents();
        this.em = em;
        jcom();
    }

    public void jcom() {
        jComboBoxMalsinfi.removeAllItems();
        ListOfMalsinfi = em.createNamedQuery("Malsinfi.findAll", Malsinfi.class).getResultList();
        for (Malsinfi ms : ListOfMalsinfi) {
            jComboBoxMalsinfi.addItem(ms.getAdi());
        }
        for (Malsinfi ms : ListOfMalsinfi) {
            jComboBoxMalSinfiChange.addItem(ms.getAdi());
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxMalsinfi = new javax.swing.JComboBox<>();
        jTextFieldMalSinfi = new javax.swing.JTextField();
        jTextFieldMalQrupu = new javax.swing.JTextField();
        jComboBoxMalQrupu = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxMalNovu = new javax.swing.JComboBox<>();
        jTextFieldMalNovu = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldMalNovuChange = new javax.swing.JTextField();
        jComboBoxmalNovuChange = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMalQrupuChange = new javax.swing.JTextField();
        jComboBoxMalQrupuChange = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldMalSinfiChange = new javax.swing.JTextField();
        jComboBoxMalSinfiChange = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Mal sinfi");

        jComboBoxMalsinfi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxMalsinfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMalsinfiActionPerformed(evt);
            }
        });

        jTextFieldMalSinfi.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldMalSinfi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMalSinfiActionPerformed(evt);
            }
        });

        jTextFieldMalQrupu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldMalQrupu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMalQrupuActionPerformed(evt);
            }
        });

        jComboBoxMalQrupu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxMalQrupu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMalQrupuActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Mal Qrupu");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mal Növü");

        jComboBoxMalNovu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxMalNovu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMalNovuActionPerformed(evt);
            }
        });

        jTextFieldMalNovu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldMalNovu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMalNovuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxMalsinfi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldMalSinfi)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxMalQrupu, 0, 307, Short.MAX_VALUE)
                    .addComponent(jTextFieldMalQrupu)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxMalNovu, 0, 307, Short.MAX_VALUE)
                    .addComponent(jTextFieldMalNovu))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxMalsinfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldMalSinfi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxMalQrupu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldMalQrupu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxMalNovu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldMalNovu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("      Daxil et      ", jPanel2);

        jTextFieldMalNovuChange.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jComboBoxmalNovuChange.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxmalNovuChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxmalNovuChangeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mal Növü");

        jTextFieldMalQrupuChange.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jComboBoxMalQrupuChange.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxMalQrupuChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMalQrupuChangeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Mal Qrupu");

        jTextFieldMalSinfiChange.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldMalSinfiChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMalSinfiChangeActionPerformed(evt);
            }
        });

        jComboBoxMalSinfiChange.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBoxMalSinfiChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMalSinfiChangeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Mal sinfi");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxMalSinfiChange, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldMalSinfiChange)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxMalQrupuChange, 0, 307, Short.MAX_VALUE)
                    .addComponent(jTextFieldMalQrupuChange)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxmalNovuChange, 0, 307, Short.MAX_VALUE)
                    .addComponent(jTextFieldMalNovuChange))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxMalSinfiChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldMalSinfiChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxMalQrupuChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldMalQrupuChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxmalNovuChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldMalNovuChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("      Düzəliş et      ", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldMalSinfiChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMalSinfiChangeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMalSinfiChangeActionPerformed

    private void jTextFieldMalSinfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMalSinfiActionPerformed
        em.getTransaction().begin();
        Malsinfi ms  = new Malsinfi(0);
        ms.setAdi(jTextFieldMalSinfi.getText());
        em.persist(ms);
        em.getTransaction().commit();
        jTextFieldMalSinfi.setText(null);
        jcom();
    }//GEN-LAST:event_jTextFieldMalSinfiActionPerformed

    private void jComboBoxMalsinfiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMalsinfiActionPerformed
        if (jComboBoxMalsinfi.getSelectedIndex() > -1) {
            jComboBoxMalQrupu.removeAllItems();
            selectedMalsinfi = ListOfMalsinfi.get(jComboBoxMalsinfi.getSelectedIndex());
            System.out.println(selectedMalsinfi.getIdMalSinfi());
            ListOfMalQrupu = em.createNamedQuery("Malqrupu.findByIdMalSinfi", Malqrupu.class)
                    .setParameter("idMalSinfi", em.find(Malsinfi.class, selectedMalsinfi.getIdMalSinfi()))
                    .getResultList();
            ListOfMalQrupu.forEach((p) -> {
                jComboBoxMalQrupu.addItem(p.getAdi());
            });
        } else {
            jComboBoxMalQrupu.removeAllItems();
        }
    }//GEN-LAST:event_jComboBoxMalsinfiActionPerformed

    private void jTextFieldMalQrupuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMalQrupuActionPerformed
        em.getTransaction().begin();
        Malqrupu mq = new Malqrupu(0);
        mq.setAdi(jTextFieldMalQrupu.getText());
        mq.setIdMalSinfi(em.find(Malsinfi.class, selectedMalsinfi.getIdMalSinfi()));
        em.persist(mq);
        em.getTransaction().commit();
        jTextFieldMalQrupu.setText(null);
        jcom();
    }//GEN-LAST:event_jTextFieldMalQrupuActionPerformed

    private void jTextFieldMalNovuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMalNovuActionPerformed
        em.getTransaction().begin();
        Malnovu mn = new Malnovu(0);
        mn.setAdi(jTextFieldMalNovu.getText());
        mn.setIdMalQrupu(em.find(Malqrupu.class, selectedMalQrupu.getIdMalQrupu()));
        em.persist(mn);
        em.getTransaction().commit();
        jTextFieldMalNovu.setText(null);
        jcom();
    }//GEN-LAST:event_jTextFieldMalNovuActionPerformed

    private void jComboBoxMalNovuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMalNovuActionPerformed

    }//GEN-LAST:event_jComboBoxMalNovuActionPerformed

    private void jComboBoxMalQrupuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMalQrupuActionPerformed
        if (jComboBoxMalQrupu.getSelectedIndex() > -1) {
            jComboBoxMalNovu.removeAllItems();
            selectedMalQrupu = ListOfMalQrupu.get(jComboBoxMalQrupu.getSelectedIndex());
            System.out.println(selectedMalQrupu.getIdMalSinfi());
            ListOfMalNovu = em.createNamedQuery("Malnovu.findByIdMalQrupu", Malnovu.class)
                    .setParameter("idMalQrupu", em.find(Malqrupu.class, selectedMalQrupu.getIdMalQrupu()))
                    .getResultList();
            ListOfMalNovu.forEach((p) -> {
                jComboBoxMalNovu.addItem(p.getAdi());
            });
        } else {
            jComboBoxMalNovu.removeAllItems();
        }
    }//GEN-LAST:event_jComboBoxMalQrupuActionPerformed

    private void jComboBoxMalSinfiChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMalSinfiChangeActionPerformed
        if (jComboBoxMalSinfiChange.getSelectedIndex() > -1) {
            jComboBoxMalQrupuChange.removeAllItems();
            jTextFieldMalSinfiChange.setText(null);            
            jTextFieldMalQrupuChange.setText(null);
            selectedMalsinfiChange = ListOfMalsinfi.get(jComboBoxMalSinfiChange.getSelectedIndex());
            jTextFieldMalSinfiChange.setText(selectedMalsinfiChange.getAdi());
            ListOfMalQrupuChange = em.createNamedQuery("Malqrupu.findByIdMalSinfi", Malqrupu.class)
                    .setParameter("idMalSinfi", em.find(Malsinfi.class, selectedMalsinfiChange.getIdMalSinfi()))
                    .getResultList();
            ListOfMalQrupuChange.forEach((p) -> {
                jComboBoxMalQrupuChange.addItem(p.getAdi());
            });
        } else {
            jComboBoxMalQrupuChange.removeAllItems();
        }
    }//GEN-LAST:event_jComboBoxMalSinfiChangeActionPerformed

    private void jComboBoxMalQrupuChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMalQrupuChangeActionPerformed
        if (jComboBoxMalQrupuChange.getSelectedIndex() > -1) {
            jComboBoxmalNovuChange.removeAllItems();
            jTextFieldMalNovuChange.setText(null);
            selectedMalQrupuChange = ListOfMalQrupuChange.get(jComboBoxMalQrupuChange.getSelectedIndex());
            jTextFieldMalQrupuChange.setText(selectedMalQrupuChange.getAdi());
            ListOfMalNovuChange = em.createNamedQuery("Malnovu.findByIdMalQrupu", Malnovu.class)
                    .setParameter("idMalQrupu", em.find(Malqrupu.class, selectedMalQrupuChange.getIdMalQrupu()))
                    .getResultList();
            ListOfMalNovuChange.forEach((p) -> {
                jComboBoxmalNovuChange.addItem(p.getAdi());
            });
        } else {
            jComboBoxmalNovuChange.removeAllItems();
        }
    }//GEN-LAST:event_jComboBoxMalQrupuChangeActionPerformed

    private void jComboBoxmalNovuChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxmalNovuChangeActionPerformed
        if (jComboBoxmalNovuChange.getSelectedIndex() > -1) {
            selectedMalNovuChange = ListOfMalNovu.get(jComboBoxmalNovuChange.getSelectedIndex());
            jTextFieldMalNovuChange.setText(selectedMalNovuChange.getAdi());
        } else {
        }
    }//GEN-LAST:event_jComboBoxmalNovuChangeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxMalNovu;
    private javax.swing.JComboBox<String> jComboBoxMalQrupu;
    private javax.swing.JComboBox<String> jComboBoxMalQrupuChange;
    private javax.swing.JComboBox<String> jComboBoxMalSinfiChange;
    private javax.swing.JComboBox<String> jComboBoxMalsinfi;
    private javax.swing.JComboBox<String> jComboBoxmalNovuChange;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldMalNovu;
    private javax.swing.JTextField jTextFieldMalNovuChange;
    private javax.swing.JTextField jTextFieldMalQrupu;
    private javax.swing.JTextField jTextFieldMalQrupuChange;
    private javax.swing.JTextField jTextFieldMalSinfi;
    private javax.swing.JTextField jTextFieldMalSinfiChange;
    // End of variables declaration//GEN-END:variables
}
