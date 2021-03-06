/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra4.ui;

import progra4.CatalogoUsuario;

/**
 *
 * @author jmanu
 */
public class GuiUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form GuiPermisos
     */
    CatalogoUsuario usuarios = new CatalogoUsuario();
    public GuiUsuarios() {
        initComponents();
        imprimirselect();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldIdentificacion = new javax.swing.JTextField();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldUsuario = new javax.swing.JTextField();
        jTextFieldContra = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jComboBoxBusqueda = new javax.swing.JComboBox<>();
        jButtonBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jButtonSalir = new javax.swing.JButton();
        jButtonMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelMensaje = new javax.swing.JLabel();
        jLabelMensaje1 = new javax.swing.JLabel();
        jTextFieldfitro = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 390));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dolce Vita Heavy", 1, 24)); // NOI18N
        jLabel1.setText("Ingresar");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 110, 110, 20);

        jLabel3.setFont(new java.awt.Font("Dolce Vita Heavy", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("Usuarios");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 20, 220, 56);

        jLabel4.setFont(new java.awt.Font("Dolce Vita Heavy", 1, 24)); // NOI18N
        jLabel4.setText("Consultar");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 110, 130, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Identificación");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 160, 90, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Codigo Usuario");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 190, 100, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Usuario");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 220, 50, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Contraseña");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 250, 70, 15);

        jTextFieldIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdentificacionActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldIdentificacion);
        jTextFieldIdentificacion.setBounds(120, 160, 160, 20);
        getContentPane().add(jTextFieldCodigo);
        jTextFieldCodigo.setBounds(120, 190, 160, 20);
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(100, 220, 180, 20);

        jTextFieldContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldContraActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldContra);
        jTextFieldContra.setBounds(100, 250, 180, 20);

        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Guardar-01.png"))); // NOI18N
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGuardar);
        jButtonGuardar.setBounds(240, 280, 40, 40);

        jComboBoxBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(jComboBoxBusqueda);
        jComboBoxBusqueda.setBounds(310, 140, 190, 30);

        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Buscar-01.png"))); // NOI18N
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar);
        jButtonBuscar.setBounds(510, 130, 40, 40);

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(310, 180, 240, 170);

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

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pantallas2-01.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 620, 390);

        jLabelMensaje.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jLabelMensaje);
        jLabelMensaje.setBounds(20, 280, 160, 40);

        jLabelMensaje1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(jLabelMensaje1);
        jLabelMensaje1.setBounds(20, 280, 160, 40);

        jTextFieldfitro.setText("jTextField1");
        getContentPane().add(jTextFieldfitro);
        jTextFieldfitro.setBounds(140, 320, 59, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdentificacionActionPerformed

    private void jTextFieldContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldContraActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed

        jLabelMensaje.setText("");
        String id = jTextFieldIdentificacion.getText();
        String codigoUsuario = jTextFieldCodigo.getText();
        String idPermiso = "";
        String usuario = jTextFieldUsuario.getText();
        String contra = jTextFieldContra.getText();
        String data = "idUsuario->'" + id + "',"
                + "CodigoUsuario->'" + codigoUsuario + "',"
                + "idPermiso->'" + idPermiso + "',"
                + "Usuario->'" + usuario + "',"
                + "PasswordUser->'" + contra + "',";
        String condicion = "idUsuario->" + id;
        boolean respuesta;
        if (jTextFieldfitro.getText().length() == 0) {
            respuesta = usuarios.agregar(data);
        } else {
            respuesta = usuarios.editar(data, condicion);
        }
        if (respuesta) {
            jLabelMensaje.setText("Guardado Correctamente");
        } else {
            jLabelMensaje.setText("Error Guardado");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed

        System.exit(0);//Cerrar la ventana
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed

        GuiMenu menu = new GuiMenu();
        menu.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void imprimirselect() {
        int itemCount = jComboBoxBusqueda.getItemCount();
        for (int i = 0; i < itemCount; i++) {
            jComboBoxBusqueda.removeItemAt(0);
        }
        String data = "idUsuario";
        String condicion = null;
        String order = "idUsuario->ASC";
        String[][] resultado = usuarios.imprimir(data, condicion, order);
        for (int x = 0; x < resultado.length; x++) {
            jComboBoxBusqueda.addItem(resultado[x][0]);
        }
    }
    
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
            java.util.logging.Logger.getLogger(GuiUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<String> jComboBoxBusqueda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelMensaje;
    private javax.swing.JLabel jLabelMensaje1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldContra;
    private javax.swing.JTextField jTextFieldIdentificacion;
    private javax.swing.JTextField jTextFieldUsuario;
    private javax.swing.JTextField jTextFieldfitro;
    // End of variables declaration//GEN-END:variables
}
