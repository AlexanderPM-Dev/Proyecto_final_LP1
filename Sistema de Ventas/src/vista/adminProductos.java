package vista;

import controlador.ConsultasProductoProvedor;
import javax.swing.JOptionPane;
import modelo.Producto;
import modelo.Proveedor;

public class adminProductos extends javax.swing.JFrame {

    /**
     * Creates new form adminProductos
     */
    public adminProductos() {
        initComponents();
        this.setTitle("Productos");
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
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JTextField();
        txtCompania = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtPCompra = new javax.swing.JTextField();
        txtPMayoreo = new javax.swing.JTextField();
        txtPMenudeo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBuscarProv = new javax.swing.JButton();
        txtExistencias = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id :");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });

        jLabel2.setText("Marca :");

        jLabel3.setText("DATOS DEL PRODUCTO");

        jLabel4.setText("Descripción :");

        jLabel5.setText("PRECIO");

        jLabel6.setText("Compra :");

        jLabel7.setText("VENTA");

        jLabel8.setText("Mayoreo : ");

        jLabel9.setText("Menudeo :");

        jLabel10.setText("Existencias :");

        jLabel11.setText("DATOS DEL PROVEEDOR");

        jLabel12.setText("Id Proveedor :");

        jLabel13.setText("Compañia :");

        jLabel14.setText("Dirección :");

        jLabel15.setText("Telefono :");

        txtIdProveedor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdProveedorKeyTyped(evt);
            }
        });

        txtCompania.setEditable(false);
        txtCompania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCompaniaActionPerformed(evt);
            }
        });

        txtDireccion.setEditable(false);

        txtTelefono.setEditable(false);

        txtPCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPCompraKeyTyped(evt);
            }
        });

        txtPMayoreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPMayoreoKeyTyped(evt);
            }
        });

        txtPMenudeo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPMenudeoKeyTyped(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnMod.setText("MODIFICAR");
        btnMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR CAMPOS");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBuscarProv.setText("BUSCAR");
        btnBuscarProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProvActionPerformed(evt);
            }
        });

        txtExistencias.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBuscar)
                            .addComponent(txtMarca)
                            .addComponent(txtDescripcion)
                            .addComponent(txtPCompra, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMod, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdProveedor)
                                    .addComponent(txtCompania)
                                    .addComponent(txtDireccion)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtPMayoreo)
                                    .addComponent(txtPMenudeo)
                                    .addComponent(txtExistencias, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel11)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPCompra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPMayoreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtPMenudeo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProv, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtCompania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (txtBuscar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ingresa un ID");//Revisa que el campo no esté vacío
        } else {
            ConsultasProductoProvedor buscar = new ConsultasProductoProvedor();
            try {
                Producto producto = buscar.consultaProducto(Integer.parseInt(txtBuscar.getText()));
                Proveedor proveedor = producto.getProveedor();
                //Rellena los campos
                txtMarca.setText(producto.getMarca());
                txtDescripcion.setText(producto.getDescripcion());
                txtPCompra.setText(Double.toString(producto.getPrecioCompra()));
                txtPMayoreo.setText(Double.toString(producto.getPrecioVentaMayoreo()));
                txtPMenudeo.setText(Double.toString(producto.getPrecioVentaMenudeo()));
                txtExistencias.setText(Integer.toString(producto.getExistencias()));
                txtIdProveedor.setText(Integer.toString(proveedor.getId()));
                txtCompania.setText(proveedor.getCompania());
                txtDireccion.setText(proveedor.getDireccion());
                txtTelefono.setText(Long.toString(proveedor.getTelefono()));
            } catch (NullPointerException e) {
                //Limpia los campos si no encuentra nada
                txtMarca.setText("");
                txtDescripcion.setText("");
                txtPCompra.setText("");
                txtPMayoreo.setText("");
                txtPMenudeo.setText("");
                txtExistencias.setText("");
                txtIdProveedor.setText("");
                txtCompania.setText("");
                txtDireccion.setText("");
                txtTelefono.setText("");
                System.out.println("No se puedieron llenar los campos");
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (txtBuscar.getText().isEmpty() || txtMarca.getText().isEmpty() || txtDescripcion.getText().isEmpty() || txtPCompra.getText().isEmpty() || txtPMayoreo.getText().isEmpty() || txtPMenudeo.getText().isEmpty() || txtIdProveedor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "llena todos los campos"); //valida que no haya campos vacios
        } else {
            ConsultasProductoProvedor alta = new ConsultasProductoProvedor();
            Producto producto = new Producto();
            try {
                //Toma los datos
                Proveedor proveedor = alta.consultaProveedor(Integer.parseInt(txtIdProveedor.getText()));
                producto.setId(Integer.parseInt(txtBuscar.getText()));
                producto.setMarca(txtMarca.getText());
                producto.setDescripcion(txtDescripcion.getText());
                producto.setPrecioCompra(Double.parseDouble(txtPCompra.getText()));
                producto.setPrecioVentaMayoreo(Double.parseDouble(txtPMayoreo.getText()));
                producto.setPrecioVentaMenudeo(Double.parseDouble(txtPMenudeo.getText()));
                producto.setExistencias(0);
                producto.setProveedor(proveedor);
                //Revisa que el alta se haya completado
                if (alta.altaProducto(producto, proveedor)) {
                    JOptionPane.showMessageDialog(rootPane, "Registro Exitoso");
                }
            } catch (NullPointerException e) {
                txtCompania.setText("");
                txtDireccion.setText("");
                txtTelefono.setText("");
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModActionPerformed
        if (txtBuscar.getText().isEmpty() || txtMarca.getText().isEmpty() || txtDescripcion.getText().isEmpty() || txtPCompra.getText().isEmpty() || txtPMayoreo.getText().isEmpty() || txtPMenudeo.getText().isEmpty() || txtIdProveedor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "llena todos los campos"); //valida que no haya campos vacios
        } else {
            ConsultasProductoProvedor update = new ConsultasProductoProvedor();
            Producto producto = new Producto();
            try {
                Proveedor proveedor = update.consultaProveedor(Integer.parseInt(txtIdProveedor.getText()));
                //Toma los datos
                producto.setId(Integer.parseInt(txtBuscar.getText()));
                producto.setMarca(txtMarca.getText());
                producto.setDescripcion(txtDescripcion.getText());
                producto.setPrecioCompra(Double.parseDouble(txtPCompra.getText()));
                producto.setPrecioVentaMayoreo(Double.parseDouble(txtPMayoreo.getText()));
                producto.setPrecioVentaMenudeo(Double.parseDouble(txtPMenudeo.getText()));
                producto.setExistencias(0);
                producto.setProveedor(proveedor);
                if (update.modProducto(producto)) {//Realiza el Alta
                    JOptionPane.showMessageDialog(rootPane, "Actualizacion Exitosa");
                }
            } catch (NullPointerException e) {
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_btnModActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (txtBuscar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ingresa un ID"); //valida que el campo id no este vacio
        } else {
            int id = Integer.parseInt(txtBuscar.getText());
            ConsultasProductoProvedor eliminar = new ConsultasProductoProvedor();
            ConsultasProductoProvedor buscar = new ConsultasProductoProvedor();
            try {
                Producto producto = new Producto();
                producto = buscar.consultaProducto(id);
                if (eliminar.eliminarProducto(id)) {  //Elimina el registro
                    JOptionPane.showMessageDialog(rootPane, "Se elimino este registro");
                    //Limpia los campos
                    txtBuscar.setText("");
                    txtMarca.setText("");
                    txtDescripcion.setText("");
                    txtPCompra.setText("");
                    txtPMayoreo.setText("");
                    txtPMenudeo.setText("");
                    txtExistencias.setText("");
                    txtIdProveedor.setText("");
                    txtCompania.setText("");
                    txtDireccion.setText("");
                    txtTelefono.setText("");
                }
            } catch (NullPointerException e) {
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProvActionPerformed
        if (txtIdProveedor.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ingresa un ID");//Valida que el campo no esté vacío
        } else {
            ConsultasProductoProvedor buscar = new ConsultasProductoProvedor();
            try {
                //Llena los campos
                Proveedor proveedor = buscar.consultaProveedor(Integer.parseInt(txtIdProveedor.getText()));
                txtIdProveedor.setText(Integer.toString(proveedor.getId()));
                txtCompania.setText(proveedor.getCompania());
                txtDireccion.setText(proveedor.getDireccion());
                txtTelefono.setText(Long.toString(proveedor.getTelefono()));
            } catch (NullPointerException e) {
                //Limpia los campos si no encuentra nada
                txtCompania.setText("");
                txtDireccion.setText("");
                txtTelefono.setText("");
                System.out.println("No se puedieron llenar los campos");
            }
        }
    }//GEN-LAST:event_btnBuscarProvActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
         //Establece todos los campos de texto en blanco
        txtBuscar.setText("");
        txtMarca.setText("");
        txtDescripcion.setText("");
        txtPCompra.setText("");
        txtPMayoreo.setText("");
        txtPMenudeo.setText("");
        txtExistencias.setText("");
        txtIdProveedor.setText("");
        txtCompania.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        char validar = evt.getKeyChar();
        //Valida solo números
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "ingresar solo numeros");
        }
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void txtPCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPCompraKeyTyped
        char validar = evt.getKeyChar();
        //Valida solo números
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "ingresar solo numeros");
        }
        //Valida solo un decimal
        if (evt.getKeyChar() == '.' && txtPCompra.getText().contains(".")) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "ya hay un punto decimal");
        }
    }//GEN-LAST:event_txtPCompraKeyTyped

    private void txtPMayoreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPMayoreoKeyTyped
        char validar = evt.getKeyChar();
        //Valida solo números
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "ingresar solo numeros");
        }
        //Valida solo un punto decimal
        if (evt.getKeyChar() == '.' && txtPMayoreo.getText().contains(".")) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "ya hay un punto decimal");
        }
    }//GEN-LAST:event_txtPMayoreoKeyTyped

    private void txtPMenudeoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPMenudeoKeyTyped
        char validar = evt.getKeyChar();
        //Valida solo números
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "ingresar solo numeros");
        }
        //Valida solo un punto decimal
        if (evt.getKeyChar() == '.' && txtPMenudeo.getText().contains(".")) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "ya hay un punto decimal");
        }
    }//GEN-LAST:event_txtPMenudeoKeyTyped

    private void txtIdProveedorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdProveedorKeyTyped
         //Valida solo números
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "ingresar solo numeros");
        }
    }//GEN-LAST:event_txtIdProveedorKeyTyped

    private void txtCompaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCompaniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCompaniaActionPerformed

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
            java.util.logging.Logger.getLogger(adminProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarProv;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCompania;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtExistencias;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtPCompra;
    private javax.swing.JTextField txtPMayoreo;
    private javax.swing.JTextField txtPMenudeo;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}