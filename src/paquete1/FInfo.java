/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import javax.swing.ImageIcon;

/**
 *
 * @author Lugue
 */
public class FInfo extends javax.swing.JFrame {

    public FInfo() {
        initComponents();
        tf_fb.setEditable(false);
        tf_int.setEditable(false);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Iconos/lol.png")).getImage());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_fb = new javax.swing.JTextField();
        tf_int = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(51, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Created by Angel Maria Perez", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14), new java.awt.Color(153, 0, 0))); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/if_Instagram_1298747.png"))); // NOI18N

        tf_fb.setBackground(new java.awt.Color(51, 255, 153));
        tf_fb.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tf_fb.setForeground(new java.awt.Color(0, 0, 0));
        tf_fb.setText("https://www.facebook.com/angel.mariaperez.9");
        tf_fb.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        tf_int.setBackground(new java.awt.Color(51, 255, 153));
        tf_int.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tf_int.setForeground(new java.awt.Color(0, 0, 0));
        tf_int.setText("@lugue_gg");
        tf_int.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/if_facebook_2062074.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tf_int))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tf_fb, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(tf_fb))
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(tf_int)))
                .addGap(57, 57, 57))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField tf_fb;
    private javax.swing.JTextField tf_fb1;
    private javax.swing.JTextField tf_int;
    private javax.swing.JTextField tf_int1;
    // End of variables declaration//GEN-END:variables
}
