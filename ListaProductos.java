
package Ventanas.gui;

import inventario.Exportar;
import inventario.InventarioProductos;
import inventario.RegistrosProductos;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ListaProductos extends javax.swing.JFrame {
    
    Exportar obj;
    public ListaProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
        refrescarTabla();
    }
public void refrescarTabla(){       
        //Creamos un vector inicial para la dimension de los datos 
        Vector<Vector> data = new Vector<>();
        Vector<InventarioProductos> productos = RegistrosProductos.leerProductos();
        for(InventarioProductos productoTemp : productos ){
        Vector registro = new Vector();
        registro.add(productoTemp.getCantidad());
        registro.add(productoTemp.getProducto());
        registro.add(productoTemp.getTipoProducto());
        registro.add(productoTemp.getProveedor());
        registro.add(productoTemp.getSucursal());

        data.add(registro);

        Vector<String> columnNames = new Vector<>();
        columnNames.add("CANTIDAD");
        columnNames.add("PRODUCTO");
        columnNames.add("TIPO DE PRODUCTO");
        columnNames.add("PROVEEDOR");
        columnNames.add("SUCURSAL");
        tablaProductos.setModel(new DefaultTableModel(data, columnNames));
        }          
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btAgregar2 = new javax.swing.JButton();
        btSucursales = new javax.swing.ButtonGroup();
        btProveedores = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        productoText = new javax.swing.JTextField();
        txtTIPO = new javax.swing.JLabel();
        txtProducto = new javax.swing.JLabel();
        cantidadText = new javax.swing.JTextField();
        txtCANTIDAD = new javax.swing.JLabel();
        txtSUCURSAL = new javax.swing.JLabel();
        txtPROVEEDOR = new javax.swing.JLabel();
        btModificar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tipoSelec = new javax.swing.JComboBox<>();
        btAgregar1 = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductos = new javax.swing.JTable();
        cBoxPP = new javax.swing.JCheckBox();
        cBoxC = new javax.swing.JCheckBox();
        cBoxA = new javax.swing.JCheckBox();
        jRMobi = new javax.swing.JRadioButton();
        jRCool = new javax.swing.JRadioButton();
        jRAM = new javax.swing.JRadioButton();
        btnConfirmar = new javax.swing.JButton();

        btAgregar2.setBackground(new java.awt.Color(0, 0, 0));
        btAgregar2.setForeground(new java.awt.Color(255, 255, 255));
        btAgregar2.setText("Agregar");
        btAgregar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btAgregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregar2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 948, -1));
        jPanel1.add(productoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 208, 115, 30));

        txtTIPO.setText("Tipo de Producto");
        jPanel1.add(txtTIPO, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 108, -1, -1));

        txtProducto.setText("Producto");
        jPanel1.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 185, -1, -1));

        cantidadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadTextActionPerformed(evt);
            }
        });
        jPanel1.add(cantidadText, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 137, 115, 30));

        txtCANTIDAD.setText("Cantidad");
        jPanel1.add(txtCANTIDAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 108, -1, -1));

        txtSUCURSAL.setText("Sucursal");
        jPanel1.add(txtSUCURSAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 185, -1, -1));

        txtPROVEEDOR.setText("Proveedor");
        jPanel1.add(txtPROVEEDOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 108, 60, -1));

        btModificar.setBackground(new java.awt.Color(0, 0, 0));
        btModificar.setForeground(new java.awt.Color(255, 255, 255));
        btModificar.setText("MODIFICAR");
        btModificar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 203, 115, 35));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Productos");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 57, 368, -1));

        tipoSelec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Accesorios", "Cargadores", "Herramientas", "Refacciones" }));
        tipoSelec.setToolTipText("");
        tipoSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoSelecActionPerformed(evt);
            }
        });
        jPanel1.add(tipoSelec, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 137, 115, 30));

        btAgregar1.setBackground(new java.awt.Color(0, 0, 0));
        btAgregar1.setForeground(new java.awt.Color(255, 255, 255));
        btAgregar1.setText("Agregar");
        btAgregar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregar1ActionPerformed(evt);
            }
        });
        jPanel1.add(btAgregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(738, 127, 115, 35));

        btEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btEliminar.setText("Eliminar");
        btEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 115, 35));

        tablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaProductos);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 353, 851, 198));

        btSucursales.add(cBoxPP);
        cBoxPP.setText("Plaza Patio");
        cBoxPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxPPActionPerformed(evt);
            }
        });
        jPanel1.add(cBoxPP, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 204, -1, -1));

        btSucursales.add(cBoxC);
        cBoxC.setText("Centro");
        cBoxC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxCActionPerformed(evt);
            }
        });
        jPanel1.add(cBoxC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 234, -1, -1));

        btSucursales.add(cBoxA);
        cBoxA.setText("Acaya");
        cBoxA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxAActionPerformed(evt);
            }
        });
        jPanel1.add(cBoxA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 268, -1, -1));

        btProveedores.add(jRMobi);
        jRMobi.setText("Mobo");
        jRMobi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMobiActionPerformed(evt);
            }
        });
        jPanel1.add(jRMobi, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, -1, -1));

        btProveedores.add(jRCool);
        jRCool.setText("Coolook");
        jRCool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRCoolActionPerformed(evt);
            }
        });
        jPanel1.add(jRCool, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, -1, -1));

        btProveedores.add(jRAM);
        jRAM.setText("AllMovil");
        jRAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRAMActionPerformed(evt);
            }
        });
        jPanel1.add(jRAM, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, -1, -1));

        btnConfirmar.setBackground(new java.awt.Color(0, 0, 0));
        btnConfirmar.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Confirmar Pedido");
        btnConfirmar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void escribirProductos(InventarioProductos producto) throws IOException{       
            Vector<InventarioProductos> productos = RegistrosProductos.leerProductos();
            productos.add(producto);
            RegistrosProductos.escribirProductos(productos);
    }
    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
        //Indice seleccionado
        int indice = tablaProductos.getSelectedRow();
        if(indice == -1){
            return;
        }  
        //Abrir cuadro de dialogo modificar
        ModificarProducto1 modiproducto = new ModificarProducto1(this, true, indice);
        modiproducto.setLocationRelativeTo(this);
        modiproducto.setVisible(true);
        
        //Refrescar Tabla
        refrescarTabla();
           
    }//GEN-LAST:event_btModificarActionPerformed

    private void btAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregar1ActionPerformed
        if(cantidadText.getText().isEmpty()){
             javax.swing.JOptionPane.showMessageDialog(null, "Por favor Introduzca la cantidad" ,
                     "Campo Vacio", javax.swing.JOptionPane.WARNING_MESSAGE);           
             return;
        }
        if (!cantidadText.getText().matches("[+]?\\d*(\\\\d+)?")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Por favor Introduzca solo numeros en la cantidad",
                    "Valor incompatible", javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(productoText.getText().isEmpty()){
             javax.swing.JOptionPane.showMessageDialog(null, "Por favor Introduzca el nombre del producto" ,
                     "Campo Vacio", javax.swing.JOptionPane.WARNING_MESSAGE);           
            return;
        }    
        
        if(tipoSelec.getSelectedItem() == "Seleccione"){
            javax.swing.JOptionPane.showMessageDialog(null, "Por favor seleccione un tipo de producto" ,
                     "Campo Vacio", javax.swing.JOptionPane.WARNING_MESSAGE);           
            return;
        }

        String sucursal="";
        if (cBoxA.isSelected() || cBoxC.isSelected() || cBoxPP.isSelected()) {
            sucursal = btSucursales.getSelection().getActionCommand();
        }
        else {
            JOptionPane.showMessageDialog(null,"No se ha seleccionado ninguna sucursal");
        }
        
        String proveedor="";
        if (jRAM.isSelected() || jRCool.isSelected() || jRMobi.isSelected()) {
            proveedor = btProveedores.getSelection().getActionCommand();
        }
        else {
            JOptionPane.showMessageDialog(null,"No se ha seleccionado ningun proovedor");
        }
        
        try {
            String cantidad = cantidadText.getText();
            String nomproducto = productoText.getText();
            String tipoP = (String)tipoSelec.getSelectedItem();

            InventarioProductos producto = new InventarioProductos(cantidad, nomproducto,tipoP,proveedor,sucursal);
            escribirProductos(producto);

            cantidadText.setText(null);
            productoText.setText(null);
            tipoSelec.setSelectedIndex(0); 
            btProveedores.clearSelection();
            btSucursales.clearSelection();
                    
            JOptionPane.showMessageDialog(this, "Producto agregado con éxito", "Guardado", JOptionPane.PLAIN_MESSAGE);                   
        } catch (IOException ex) {
            Logger.getLogger(ListaProductos.class.getName()).log(Level.SEVERE, null, ex);
        }    
        refrescarTabla();
        
    }//GEN-LAST:event_btAgregar1ActionPerformed

    private void btAgregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAgregar2ActionPerformed

    private void cantidadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadTextActionPerformed

    }//GEN-LAST:event_cantidadTextActionPerformed

    private void cBoxPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxPPActionPerformed
        this.cBoxPP.setActionCommand("Plaza Patio");
    }//GEN-LAST:event_cBoxPPActionPerformed

    private void cBoxCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxCActionPerformed
        this.cBoxC.setActionCommand("Centro");
    }//GEN-LAST:event_cBoxCActionPerformed

    private void cBoxAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxAActionPerformed
        this.cBoxA.setActionCommand("Acaya");
    }//GEN-LAST:event_cBoxAActionPerformed

    private void jRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRAMActionPerformed
        this.jRAM.setActionCommand("AllMovil");
    }//GEN-LAST:event_jRAMActionPerformed

    private void jRMobiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMobiActionPerformed
        this.jRMobi.setActionCommand("Mobo");
    }//GEN-LAST:event_jRMobiActionPerformed

    private void jRCoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRCoolActionPerformed
        this.jRCool.setActionCommand("Coolook");
    }//GEN-LAST:event_jRCoolActionPerformed

    private void tipoSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoSelecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoSelecActionPerformed

//    public static void reiniciarJTable(javax.swing.JTable tablaJTable){
//        DefaultTableModel modelo = (DefaultTableModel) tablaJTable.getModel();
//        while(modelo.getRowCount()>0)modelo.removeRow(0);
// 
//        TableColumnModel modCol = tablaJTable.getColumnModel();
//        while(modCol.getColumnCount()>0)modCol.removeColumn(modCol.getColumn(0));
//    }
    
    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed

        javax.swing.JOptionPane.showMessageDialog(null,"Se mostrará una pantalla para guardar el pedido "
                + "\nEliga una ubicación",
            "Confirmación de pedido", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        try {
            obj = new Exportar();
            obj.exportarExcel(tablaProductos);
            
        } catch (IOException ex) {
            Logger.getLogger(ListaProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
//        Vector<InventarioProductos> productos = RegistrosProductos.leerProductos();
//
//        productos.removeAll(productos);

    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        int indice = tablaProductos.getSelectedRow();
        if(indice == -1){
            refrescarTabla();
            return;
        }
        //CONFIRMACION

        int respuesta = JOptionPane.showConfirmDialog(this, "Esta por eliminar un producto \n¿Desea continuar?",
            "Confirmación de eliminación",javax.swing.JOptionPane.YES_NO_OPTION);
        if(respuesta != javax.swing.JOptionPane.YES_OPTION){
            refrescarTabla();
            return;
        }

        //RECUPERAR PERSONAS

        Vector<InventarioProductos> productos = RegistrosProductos.leerProductos();

        //ELIMAR PERSONA DE LA LISTA

        productos.remove(indice);

        //ESCRIBIR DE NUEVO

        RegistrosProductos.escribirProductos(productos);
        refrescarTabla();

    }//GEN-LAST:event_btEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(ListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar1;
    private javax.swing.JButton btAgregar2;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btModificar;
    private javax.swing.ButtonGroup btProveedores;
    private javax.swing.ButtonGroup btSucursales;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JCheckBox cBoxA;
    private javax.swing.JCheckBox cBoxC;
    private javax.swing.JCheckBox cBoxPP;
    private javax.swing.JTextField cantidadText;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRAM;
    private javax.swing.JRadioButton jRCool;
    private javax.swing.JRadioButton jRMobi;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField productoText;
    private javax.swing.JTable tablaProductos;
    public static javax.swing.JComboBox<String> tipoSelec;
    private javax.swing.JLabel txtCANTIDAD;
    private javax.swing.JLabel txtPROVEEDOR;
    private javax.swing.JLabel txtProducto;
    private javax.swing.JLabel txtSUCURSAL;
    private javax.swing.JLabel txtTIPO;
    // End of variables declaration//GEN-END:variables
}
