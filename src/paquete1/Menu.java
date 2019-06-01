/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import com.barcodelib.barcode.QRCode;
import java.awt.Desktop;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Lugue
 */
public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/Iconos/lol.png")).getImage());
        setLocationRelativeTo(null);
        
    }
    


    //variables
    int udm = 0, resol = 72, rot = 0;
    float mi = 0.000f, md = 0.000f, ms = 0.000f, min = 0.000f, tam = 5.00f;

    
    //metodo
    public void generarQR(String dato){
        try{
            
            QRCode code = new QRCode();
            code.setData(dato);
            code.setDataMode(QRCode.MODE_BYTE);
            code.setUOM(udm);
            code.setLeftMargin(mi);
            code.setRightMargin(md);
            code.setTopMargin(ms);
            code.setBottomMargin(min);
            code.setResolution(resol);
            code.setRotate(rot);
            code.setModuleSize(tam);
            
            String archivo = System.getProperty("user.home")+"/CodigoQR GG.gif";
            code.renderBarcode(archivo);
            
            Desktop desk = Desktop.getDesktop();
            desk.open(new File(archivo));
            
        }catch(Exception e){
            System.out.println("Error de: " +e.getMessage());
        }
    }
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        boton_generar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txta_texto = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        boton_limpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        boton_info = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(51, 255, 153));

        boton_generar.setText("Generar");
        boton_generar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_generarActionPerformed(evt);
            }
        });

        txta_texto.setColumns(20);
        txta_texto.setRows(5);
        jScrollPane1.setViewportView(txta_texto);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("Texto o URL que desea generar para compartir");

        boton_limpiar.setText("Limpiar");
        boton_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_limpiarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Unicode MS", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Solucion Trial");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        boton_info.setForeground(new java.awt.Color(204, 0, 0));
        boton_info.setText("Info del creador");
        boton_info.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_infoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton_generar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(boton_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(17, 17, 17))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(boton_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(268, 268, 268)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(boton_limpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(boton_generar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(2, 2, 2)
                .addComponent(boton_info, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        JOptionPane.showMessageDialog(null, "Para quitar el mensaje 'Trial' que aparece en el codigoQR \nbasta con generarlo 2 veces mas y listo", "Info",3);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void boton_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_limpiarActionPerformed
        txta_texto.setText("");
    }//GEN-LAST:event_boton_limpiarActionPerformed

    private void boton_generarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_generarActionPerformed

        String texto = txta_texto.getText();
        generarQR(texto);

    }//GEN-LAST:event_boton_generarActionPerformed

    private void boton_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_infoActionPerformed
      FInfo in = new FInfo();
      in.setVisible(true);
      
    }//GEN-LAST:event_boton_infoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_generar;
    private javax.swing.JButton boton_info;
    private javax.swing.JButton boton_limpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txta_texto;
    // End of variables declaration//GEN-END:variables
}
