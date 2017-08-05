/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra4.ui;

import progra4.Paciente;
import progra4.ui.GuiExpediente;
import progra4.Pantalla;

/**
 *
 * @author yoorda
 */
public class GuiPaciente extends javax.swing.JFrame {

    Paciente paciente = new Paciente();

    public GuiPaciente() {
        initComponents();
        imprimirselect();

        //imprimirselect();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldIdentificacion = new javax.swing.JTextField();
        jTextFieldNombrePaciente = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldEmaill = new javax.swing.JTextField();
        jTextFieldFechaNac = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonMenu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabelMensaje = new javax.swing.JLabel();
        jComboBoxTipoSangre = new javax.swing.JComboBox<>();
        jTextFieldfitro = new javax.swing.JTextField();
        jComboBoxId = new javax.swing.JComboBox<>();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Ingresar");

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Paciente");

        jLabel5.setText("Identificación");

        jLabel6.setText("Nombre");

        jLabel8.setText("Teléfono");

        jLabel9.setText("E-mail");

        jTextFieldIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdentificacionActionPerformed(evt);
            }
        });

        jTextFieldFechaNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaNacActionPerformed(evt);
            }
        });

        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        jButtonMenu.setText("Menu");
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha Nacimiento");

        jLabel10.setText("Tipo de Sangre");

        jLabelMensaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jComboBoxTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jComboBoxTipoSangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoSangreActionPerformed(evt);
            }
        });

        jTextFieldfitro.setEditable(false);
        jTextFieldfitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldfitroActionPerformed(evt);
            }
        });

        jComboBoxId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldNombrePaciente)
                                            .addComponent(jTextFieldTelefono)
                                            .addComponent(jTextFieldEmaill)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jTextFieldIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButtonGuardar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jTextFieldFechaNac))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButtonMenu)
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jButtonSalir))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jComboBoxTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jComboBoxId, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButtonBuscar)))
                                        .addGap(0, 16, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldfitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBuscar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jComboBoxTipoSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmaill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addComponent(jTextFieldfitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMenu))
                .addGap(29, 29, 29)
                .addComponent(jButtonSalir)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFechaNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaNacActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        String id = jTextFieldIdentificacion.getText();
        String nombre = jTextFieldNombrePaciente.getText();
        String telefono = jTextFieldTelefono.getText();
        String correo = jTextFieldEmaill.getText();
        String fechaNac = jTextFieldFechaNac.getText();
        String tipoSangre = (String) jComboBoxTipoSangre.getSelectedItem();
        String data = "idPaciente->'" + id + "',"
                + "nombre->'" + nombre + "',"
                + "Telefono->'" + telefono + "',"
                + "Correo->'" + correo + "',"
                + "FechaNacimiento->'" + telefono + "',"
                + "TipoSangre->'" + tipoSangre + "',";
        String condicion = "idPaciente->" + id;
        boolean respuesta;
        if (jTextFieldfitro.getText().length() == 0) {
            respuesta = paciente.agregar(data);
        } else {
            respuesta = paciente.editar(data, condicion);
        }
        if (respuesta) {
            jLabelMensaje.setText("Guardado Correctamente");
        } else {
            jLabelMensaje.setText("Error Guardado");
        }

        limpiar();    }//GEN-LAST:event_jButtonGuardarActionPerformed
    private void limpiar() {

        jTextFieldIdentificacion.setText("");
        jTextFieldNombrePaciente.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldEmaill.setText("");
        jTextFieldFechaNac.setText("");
        jComboBoxTipoSangre.setSelectedItem("");
        jTextFieldfitro.setText("");
    }
    private void jTextFieldIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdentificacionActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        //String select = (String) jTextFieldIdentificacion.getText();
        String id = (String) jComboBoxId.getSelectedItem();
        String nombre = null;
        String telefono = null;
        String correo= null;
        String nacimiento = null;
        String sangre = null;
        String data = "*";
        String condicion = "idPaciente->" + id;
        String order = "idPaciente->ASC";
        String[][] resultado = paciente.imprimir(data, condicion, order);
        for (int x = 0; x < resultado.length; x++) {
            id = resultado[x][0];
            nombre = resultado[x][1];
            telefono = resultado[x][2];
            correo = resultado[x][3];
            nacimiento = resultado[x][4];
            sangre = resultado[x][5];
        }
        jTextFieldIdentificacion.setText(id);
        jTextFieldNombrePaciente.setText(nombre);
        jTextFieldTelefono.setText(telefono);
        jTextFieldEmaill.setText(correo);
        jTextFieldFechaNac.setText(nacimiento);
        jComboBoxTipoSangre.setSelectedItem(sangre);
        jTextFieldfitro.setText(" ");
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void imprimirselect() {
        int itemCount = jComboBoxId.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            jComboBoxId.removeItemAt(0);
        }
        String data = "idPaciente";
        String condicion = null;
        String order = "idPaciente->ASC";
        String[][] resultado = paciente.imprimir(data, condicion, order);
        for (int x = 0; x < resultado.length; x++) {
            jComboBoxId.addItem(resultado[x][0]);
        }
    }

    private void jComboBoxTipoSangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoSangreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoSangreActionPerformed

    private void jTextFieldfitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldfitroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldfitroActionPerformed

    private void jComboBoxIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxIdActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed

        GuiMenu menu = new GuiMenu();
        menu.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMenuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GuiPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxId;
    private javax.swing.JComboBox<String> jComboBoxTipoSangre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldEmaill;
    private javax.swing.JTextField jTextFieldFechaNac;
    private javax.swing.JTextField jTextFieldIdentificacion;
    private javax.swing.JTextField jTextFieldNombrePaciente;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldfitro;
    // End of variables declaration//GEN-END:variables
}
