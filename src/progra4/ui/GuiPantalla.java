/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra4.ui;

import progra4.Pantalla;

/**
 *
 * @author jmanu
 */
public class GuiPantalla extends javax.swing.JFrame {

    Pantalla pantalla = new Pantalla();

    public GuiPantalla() {
        initComponents();
        this.setLocationRelativeTo(null);
        imprimirselect();
    }

    /**
     * Creates new form GuiPantalla
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldIdentificacion1 = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jComboBoxBusqueda = new javax.swing.JComboBox<>();
        jButtonBuscar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonMenu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jLabelMensaje = new javax.swing.JLabel();
        jButtonEliminar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(620, 390));
        setMinimumSize(new java.awt.Dimension(620, 390));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(620, 390));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Dolce Vita Heavy", 1, 24)); // NOI18N
        jLabel2.setText("Ingresar");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 110, 110, 20);

        jLabel7.setFont(new java.awt.Font("Dolce Vita Heavy", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("PANTALLAS");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 20, 240, 56);

        jLabel10.setFont(new java.awt.Font("Dolce Vita Heavy", 1, 24)); // NOI18N
        jLabel10.setText("Consultar");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(310, 110, 130, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Nombre");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 190, 60, 15);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Descripción");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 220, 70, 10);

        jTextFieldIdentificacion1.setEditable(false);
        jTextFieldIdentificacion1.setToolTipText("");
        jTextFieldIdentificacion1.setOpaque(false);
        jTextFieldIdentificacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdentificacion1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdentificacion1);
        jTextFieldIdentificacion1.setBounds(50, 160, 200, 20);
        jTextFieldIdentificacion1.getAccessibleContext().setAccessibleName("id");

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre);
        jTextFieldNombre.setBounds(80, 190, 170, 20);
        jTextFieldNombre.getAccessibleContext().setAccessibleName("nombre");

        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar-01.png"))); // NOI18N
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar);
        jButtonGuardar.setBounds(360, 200, 40, 40);

        jComboBoxBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBusquedaActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxBusqueda);
        jComboBoxBusqueda.setBounds(308, 160, 250, 30);

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar-01.png"))); // NOI18N
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar);
        jButtonBuscar.setBounds(310, 200, 40, 40);

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

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setRows(5);
        jScrollPane2.setViewportView(jTextAreaDescripcion);
        jTextAreaDescripcion.getAccessibleContext().setAccessibleName("descripcion");

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 240, 230, 120);

        jLabelMensaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jLabelMensaje);
        jLabelMensaje.setBounds(0, 0, 0, 0);

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Borrar-01.png"))); // NOI18N
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEliminar);
        jButtonEliminar.setBounds(410, 200, 40, 40);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Id");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 160, 50, 15);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pantallas2-01.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 620, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIdentificacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdentificacion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdentificacion1ActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        String id = jTextFieldIdentificacion1.getText();
        String nombre = jTextFieldNombre.getText();
        String descripcion = jTextAreaDescripcion.getText();
        String data = "nombre->'" + nombre + "',"
                + "descripcion->'" + descripcion + "'";
        String condicion = "idPantalla->" + id;
        boolean respuesta;
        if (jTextFieldIdentificacion1.getText().length() == 0) {
            respuesta = pantalla.agregar(data);
        } else {
            respuesta = pantalla.editar(data, condicion);
        }
        if (respuesta) {
            jLabelMensaje.setText("Guardado Correctamente");
            imprimirselect();
        } else {
            jLabelMensaje.setText("Error Guardado");
        }
        limpiar();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void imprimirselect() {
        int itemCount = jComboBoxBusqueda.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            jComboBoxBusqueda.removeItemAt(0);
        }
        String data = "idPantalla";
        String condicion = null;
        String order = "idPantalla->ASC";
        String[][] resultado = pantalla.imprimir(data, condicion, order);
        for (int x = 0; x < resultado.length; x++) {
            jComboBoxBusqueda.addItem(resultado[x][0] + "-" + resultado[x][1]);
        }
    }
    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
        String select = (String) jComboBoxBusqueda.getSelectedItem();
        String[] partes = select.split("-");
        String id = partes[0];
        String nombre = partes[1];
        String descripcion = null;
        String data = "descripcion";
        String condicion = "idPantalla->" + id;
        String order = "idPantalla->ASC";
        String[][] resultado = pantalla.imprimir(data, condicion, order);
        for (int x = 0; x < resultado.length; x++) {
            descripcion = resultado[x][0];
        }
        jTextFieldIdentificacion1.setText(id);
        jTextFieldNombre.setText(nombre);
        jTextAreaDescripcion.setText(descripcion);
    }//GEN-LAST:event_jButtonBuscarActionPerformed
    private void limpiar() {
        jTextFieldIdentificacion1.setText("");
        jTextFieldNombre.setText("");
        jTextAreaDescripcion.setText("");
    }
    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed

        System.exit(0);//Cerrar la ventana

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jComboBoxBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxBusquedaActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        // TODO add your handling code here:
        String select = (String) jComboBoxBusqueda.getSelectedItem();
        String[] partes = select.split("-");
        String id = partes[0];
        String condicion = "idPantalla->" + id;
        boolean respuesta = pantalla.eliminar(condicion);
        if (respuesta) {
            jLabelMensaje.setText("Eliminado Correctamente");
            imprimirselect();
        } else {
            jLabelMensaje.setText("Error eliminando");
        }
        limpiar();
    }//GEN-LAST:event_jButtonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(GuiPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiPantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiPantalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldIdentificacion1;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

}
