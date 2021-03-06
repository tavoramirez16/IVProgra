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
        this.setLocationRelativeTo(null);
        imprimirselect();
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
        jComboBoxId = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldfitro = new javax.swing.JTextField();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(620, 390));
        setMinimumSize(new java.awt.Dimension(620, 390));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(620, 390));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dolce Vita Heavy", 1, 24)); // NOI18N
        jLabel1.setText("Ingresar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 110, 110, 32);

        jLabel3.setFont(new java.awt.Font("Dolce Vita Heavy", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Paciente");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 20, 200, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Identificación");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 160, 90, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Nombre");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 190, 50, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Teléfono");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 220, 60, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("E-mail");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 250, 50, 15);

        jTextFieldIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdentificacionActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdentificacion);
        jTextFieldIdentificacion.setBounds(110, 160, 150, 22);
        getContentPane().add(jTextFieldNombrePaciente);
        jTextFieldNombrePaciente.setBounds(90, 190, 170, 22);
        getContentPane().add(jTextFieldTelefono);
        jTextFieldTelefono.setBounds(90, 220, 170, 22);
        getContentPane().add(jTextFieldEmaill);
        jTextFieldEmaill.setBounds(90, 250, 170, 22);

        jTextFieldFechaNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaNacActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldFechaNac);
        jTextFieldFechaNac.setBounds(140, 280, 120, 22);

        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar-01.png"))); // NOI18N
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar);
        jButtonGuardar.setBounds(280, 260, 40, 40);

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar-01.png"))); // NOI18N
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar);
        jButtonBuscar.setBounds(500, 150, 40, 40);

        jButtonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cerrar4-01.png"))); // NOI18N
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir);
        jButtonSalir.setBounds(570, 10, 40, 40);

        jButtonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Menú2-01.png"))); // NOI18N
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMenu);
        jButtonMenu.setBounds(570, 50, 40, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Fecha Nacimiento");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 280, 110, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Tipo de Sangre");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(280, 200, 100, 15);

        jLabelMensaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jLabelMensaje);
        jLabelMensaje.setBounds(380, 260, 160, 40);

        jComboBoxTipoSangre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxTipoSangre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        jComboBoxTipoSangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoSangreActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxTipoSangre);
        jComboBoxTipoSangre.setBounds(280, 220, 70, 30);

        jComboBoxId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxIdActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxId);
        jComboBoxId.setBounds(280, 160, 210, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Borrar-01.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(330, 260, 40, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pantallas2-01.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 620, 390);

        jTextFieldfitro.setEditable(false);
        jTextFieldfitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldfitroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldfitro);
        jTextFieldfitro.setBounds(50, 330, 10, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFechaNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaNacActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        jLabelMensaje.setText("");
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

        System.exit(0);//Cerrar la ventana
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        //String select = (String) jTextFieldIdentificacion.getText();
        jLabelMensaje.setText("");
        String id = (String) jComboBoxId.getSelectedItem();
        String nombre = null;
        String telefono = null;
        String correo = null;
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
        String select = (String) jComboBoxId.getSelectedItem();
        String[] partes = select.split("-");
        String id = partes[0];
        String condicion = "idPaciente->" + id;
        boolean respuesta = paciente.eliminar(condicion);
        if (respuesta) {
            jLabelMensaje.setText("Eliminado Correctamente");
            imprimirselect();
        } else {
            jLabelMensaje.setText("Error eliminando");
        }
        limpiar();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
                //Runeable
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JTextField jTextFieldEmaill;
    private javax.swing.JTextField jTextFieldFechaNac;
    private javax.swing.JTextField jTextFieldIdentificacion;
    private javax.swing.JTextField jTextFieldNombrePaciente;
    private javax.swing.JTextField jTextFieldTelefono;
    private javax.swing.JTextField jTextFieldfitro;
    // End of variables declaration//GEN-END:variables
}
