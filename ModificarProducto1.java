
package Ventanas.gui;

import static Ventanas.gui.ListaProductos.tipoSelec;
import inventario.InventarioProductos;
import inventario.RegistrosProductos;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

public class ModificarProducto1 extends javax.swing.JDialog {
    private int indiceProducto;

    public ModificarProducto1(java.awt.Frame parent, boolean modal, int indiceProducto) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.indiceProducto = indiceProducto;

        LlamarDatos();    
    }
    
public void LlamarDatos(){
        Vector<InventarioProductos> productos = RegistrosProductos.leerProductos();
        InventarioProductos producto = productos.get(indiceProducto);
        cantidadText.setText(producto.getCantidad());
        productoText.setText(producto.getProducto());
        String sucur = producto.getSucursal();
        String provee = producto.getProveedor();
        String tipoP = producto.getTipoProducto();
        
//        //Asignación de datos sucursal
//        if(sucur.equals("Plaza Patio")){
//            btSucursales.setSelected(cBoxPP.getModel(), true);
//        }else if(sucur.equals("Centro")){
//            btSucursales.setSelected(cBoxC.getModel(), true);
//        }else if(sucur.equals("Acaya")){
//            btSucursales.setSelected(cBoxA.getModel(), true);
//        }
//        
//        //Asignación de datos proveedor
//        if(provee.equals("Mobo")){
//            btProveedores.setSelected(jRMobi.getModel(), true);
//        }else if(provee.equals("Coolook")){
//            btProveedores.setSelected(jRCool.getModel(), true);
//        }else if(provee.equals("AllMovil")){
//            btProveedores.setSelected(jRAM.getModel(), true);
//        }
        
        //Asignación de datos tipo
        if(tipoP.equals("Accesorios")){
            tipoSelec.setSelectedIndex(1);
        }if(tipoP.equals("Cargadores")){
            tipoSelec.setSelectedIndex(2);
        }if(tipoP.equals("Herramientas")){
            tipoSelec.setSelectedIndex(3);
        }if(tipoP.equals("Refacciones")){
            tipoSelec.setSelectedIndex(4);
        }
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btSucursales = new javax.swing.ButtonGroup();
        btProveedores = new javax.swing.ButtonGroup();
        btnGuardar = new javax.swing.JButton();
        txtSUCURSAL = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        productoText = new javax.swing.JTextField();
        txtTIPO = new javax.swing.JLabel();
        txtPROVEEDOR = new javax.swing.JLabel();
        txtProducto = new javax.swing.JLabel();
        cantidadText = new javax.swing.JTextField();
        txtCANTIDAD = new javax.swing.JLabel();
        tipoSelec = new javax.swing.JComboBox<>();
        cBoxPP = new javax.swing.JCheckBox();
        cBoxC = new javax.swing.JCheckBox();
        cBoxA = new javax.swing.JCheckBox();
        jRMobi = new javax.swing.JRadioButton();
        jRCool = new javax.swing.JRadioButton();
        jRAM = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnGuardar.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        txtSUCURSAL.setText("Sucursal");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MODIFICAR PRODUCTO");

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

        productoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productoTextActionPerformed(evt);
            }
        });

        txtTIPO.setText("Tipo de Producto");

        txtPROVEEDOR.setText("Proveedor");

        txtProducto.setText("Producto");

        cantidadText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadTextActionPerformed(evt);
            }
        });

        txtCANTIDAD.setText("Cantidad");

        tipoSelec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Accesorios", "Cargadores", "Herramientas", "Refacciones" }));
        tipoSelec.setToolTipText("");
        tipoSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoSelecActionPerformed(evt);
            }
        });

        btSucursales.add(cBoxPP);
        cBoxPP.setText("Plaza Patio");
        cBoxPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxPPActionPerformed(evt);
            }
        });

        btSucursales.add(cBoxC);
        cBoxC.setText("Centro");
        cBoxC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxCActionPerformed(evt);
            }
        });

        btSucursales.add(cBoxA);
        cBoxA.setText("Acaya");
        cBoxA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxAActionPerformed(evt);
            }
        });

        btProveedores.add(jRMobi);
        jRMobi.setText("Mobo");
        jRMobi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRMobiActionPerformed(evt);
            }
        });

        btProveedores.add(jRCool);
        jRCool.setText("Coolook");
        jRCool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRCoolActionPerformed(evt);
            }
        });

        btProveedores.add(jRAM);
        jRAM.setText("AllMovil");
        jRAM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRAMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCANTIDAD)
                                    .addComponent(cantidadText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tipoSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTIPO)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProducto)
                                    .addComponent(productoText, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cBoxA)
                                    .addComponent(cBoxPP)
                                    .addComponent(cBoxC)
                                    .addComponent(txtSUCURSAL))))
                        .addGap(26, 26, 26)
                        .addComponent(txtPROVEEDOR, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(178, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jRMobi)
                                .addComponent(jRCool)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(200, 373, Short.MAX_VALUE)
                            .addComponent(jRAM)))
                    .addGap(0, 171, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel10)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCANTIDAD)
                    .addComponent(txtTIPO))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tipoSelec, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPROVEEDOR)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(cantidadText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtProducto)
                    .addComponent(txtSUCURSAL))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productoText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cBoxPP)
                        .addGap(5, 5, 5)
                        .addComponent(cBoxC)
                        .addGap(9, 9, 9)
                        .addComponent(cBoxA)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jRMobi)
                    .addGap(5, 5, 5)
                    .addComponent(jRCool)
                    .addGap(5, 5, 5)
                    .addComponent(jRAM)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public void ActualizarProducto(InventarioProductos producto) throws IOException{
        Vector<InventarioProductos> productos =RegistrosProductos.leerProductos();        
        productos.remove(indiceProducto);
        productos.add(indiceProducto, producto);
        if(indiceProducto < productos.size()){
           RegistrosProductos.escribirProductos(productos); 
        }else{
            productos.add(producto);
        }        
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
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
        String sucursal="sucursal";
            if (cBoxA.isSelected() || cBoxC.isSelected() || cBoxPP.isSelected() || btSucursales.isSelected(null)) {
                sucursal = btSucursales.getSelection().getActionCommand();
            }else{
                return;
            }

            String proveedor="proveedor";
            if (jRAM.isSelected() || jRCool.isSelected() || jRMobi.isSelected()) {
                proveedor = btProveedores.getSelection().getActionCommand();
            }else{
                return;
            }
        
        try {
            
            String cantidad = cantidadText.getText();
            String nomproducto = productoText.getText();
            String tipoP = (String)tipoSelec.getSelectedItem();
                        
            InventarioProductos producto = new InventarioProductos(cantidad, nomproducto,tipoP,proveedor,sucursal);
            
            ActualizarProducto(producto);
            
            cantidadText.setText(null);
            productoText.setText(null);
            tipoSelec.setSelectedIndex(0); 
            btSucursales.clearSelection();
            btProveedores.clearSelection();
                    
            JOptionPane.showMessageDialog(this, "Producto modificado con éxito", "Guardado", JOptionPane.PLAIN_MESSAGE);     
            
            dispose();  
            
        } catch (IOException ex) {
            Logger.getLogger(ListaProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
                                             

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void productoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productoTextActionPerformed

    private void cantidadTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadTextActionPerformed

    private void tipoSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoSelecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoSelecActionPerformed

    private void cBoxPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxPPActionPerformed
        this.cBoxPP.setActionCommand("Plaza Patio");
    }//GEN-LAST:event_cBoxPPActionPerformed

    private void cBoxCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxCActionPerformed
        this.cBoxC.setActionCommand("Centro");
    }//GEN-LAST:event_cBoxCActionPerformed

    private void cBoxAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxAActionPerformed
        this.cBoxA.setActionCommand("Acaya");
    }//GEN-LAST:event_cBoxAActionPerformed

    private void jRMobiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRMobiActionPerformed
        this.jRMobi.setActionCommand("Mobo");
    }//GEN-LAST:event_jRMobiActionPerformed

    private void jRCoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRCoolActionPerformed
        this.jRCool.setActionCommand("Coolook");
    }//GEN-LAST:event_jRCoolActionPerformed

    private void jRAMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRAMActionPerformed
        this.jRAM.setActionCommand("AllMovil");
    }//GEN-LAST:event_jRAMActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btProveedores;
    private javax.swing.ButtonGroup btSucursales;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox cBoxA;
    private javax.swing.JCheckBox cBoxC;
    private javax.swing.JCheckBox cBoxPP;
    private javax.swing.JTextField cantidadText;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRAM;
    private javax.swing.JRadioButton jRCool;
    private javax.swing.JRadioButton jRMobi;
    private javax.swing.JTextField productoText;
    public static javax.swing.JComboBox<String> tipoSelec;
    private javax.swing.JLabel txtCANTIDAD;
    private javax.swing.JLabel txtPROVEEDOR;
    private javax.swing.JLabel txtProducto;
    private javax.swing.JLabel txtSUCURSAL;
    private javax.swing.JLabel txtTIPO;
    // End of variables declaration//GEN-END:variables
}
