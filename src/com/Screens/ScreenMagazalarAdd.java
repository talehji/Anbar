package com.Screens;

import com.entity.Maganfir;
import com.entity.Members;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ScreenMagazalarAdd extends javax.swing.JDialog {

    private final EntityManager em;

    public ScreenMagazalarAdd(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AnbarPU");
        em = emf.createEntityManager();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        AnbarPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("AnbarPU").createEntityManager();
        membersQuery = java.beans.Beans.isDesignTime() ? null : AnbarPUEntityManager.createQuery("SELECT m FROM Members m");
        membersList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : membersQuery.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAdi = new javax.swing.JTextField();
        jTextFieldUnvan = new javax.swing.JTextField();
        jTextFieldTelefon = new javax.swing.JTextField();
        jButtonBagla = new javax.swing.JButton();
        jButtonYaddaSaxla = new javax.swing.JButton();
        jComboBoxSatici = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Adı");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ünvan");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Telefon");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Satıcı");

        jTextFieldAdi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldUnvan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextFieldTelefon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonBagla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBagla.setText("Bağla");
        jButtonBagla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBaglaActionPerformed(evt);
            }
        });

        jButtonYaddaSaxla.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonYaddaSaxla.setText("Yadda saxla");
        jButtonYaddaSaxla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYaddaSaxlaActionPerformed(evt);
            }
        });

        jComboBoxSatici.setEditable(true);
        jComboBoxSatici.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        org.jdesktop.swingbinding.JComboBoxBinding jComboBoxBinding = org.jdesktop.swingbinding.SwingBindings.createJComboBoxBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, membersList, jComboBoxSatici);
        bindingGroup.addBinding(jComboBoxBinding);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonYaddaSaxla)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBagla, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldTelefon, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(jComboBoxSatici, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jComboBoxSatici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBagla)
                    .addComponent(jButtonYaddaSaxla))
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonYaddaSaxlaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYaddaSaxlaActionPerformed
        Maganfir mgf = new Maganfir(0);
        mgf.setAdi(jTextFieldAdi.getText());
        mgf.setTelefon(jTextFieldTelefon.getText());
        mgf.setUnvan(jTextFieldUnvan.getText());
        mgf.setPairentId("2");
        mgf.setIdMembers((Members) jComboBoxSatici.getSelectedItem());
        em.persist(mgf);
        em.getTransaction().begin();
        em.getTransaction().commit();
    }//GEN-LAST:event_jButtonYaddaSaxlaActionPerformed

    private void jButtonBaglaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBaglaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonBaglaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager AnbarPUEntityManager;
    private javax.swing.JButton jButtonBagla;
    private javax.swing.JButton jButtonYaddaSaxla;
    private javax.swing.JComboBox<String> jComboBoxSatici;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldAdi;
    private javax.swing.JTextField jTextFieldTelefon;
    private javax.swing.JTextField jTextFieldUnvan;
    private java.util.List<com.entity.Members> membersList;
    private javax.persistence.Query membersQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
