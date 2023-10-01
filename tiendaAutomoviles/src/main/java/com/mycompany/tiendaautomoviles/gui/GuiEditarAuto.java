package com.mycompany.tiendaautomoviles.gui;

import com.mycompany.tiendaautomoviles.logica.Automovil;
import com.mycompany.tiendaautomoviles.logica.Controladora;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class GuiEditarAuto extends javax.swing.JFrame {

    private static final Controladora control = Controladora.getInstance();
    private static int num_auto = 0;
    
    public GuiEditarAuto(int num_auto) {
        GuiEditarAuto.num_auto = num_auto;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        txtMotor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtModelo = new javax.swing.JTextField();
        txtPatente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbPuertas = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 34)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SISTEMA DE VENTA DE AUTOMOVILES");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtMotor.setBackground(new java.awt.Color(255, 255, 255));
        txtMotor.setForeground(new java.awt.Color(0, 0, 0));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Color:");

        txtColor.setBackground(new java.awt.Color(255, 255, 255));
        txtColor.setForeground(new java.awt.Color(0, 0, 0));
        txtColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Modelo:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Patente:");

        txtModelo.setBackground(new java.awt.Color(255, 255, 255));
        txtModelo.setForeground(new java.awt.Color(0, 0, 0));

        txtPatente.setBackground(new java.awt.Color(255, 255, 255));
        txtPatente.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Marca:");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cant. puertas:");

        txtMarca.setBackground(new java.awt.Color(255, 255, 255));
        txtMarca.setForeground(new java.awt.Color(0, 0, 0));
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Motor:");

        cmbPuertas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "2", "3", "4", "5" }));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ACTUALIZAR REGISTRO");

        btnLimpiar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon("G:\\Mi unidad\\GITHUB\\CURSOS\\BACKEND\\TODO CODE\\04_JAVA\\02_POO\\PROYECTOS\\tiendaAutomoviles\\src\\main\\java\\img\\limpiar.png")); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon("G:\\Mi unidad\\GITHUB\\CURSOS\\BACKEND\\TODO CODE\\04_JAVA\\02_POO\\PROYECTOS\\tiendaAutomoviles\\src\\main\\java\\img\\salvar.png")); // NOI18N
        btnGuardar.setText("Guardar cambios");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("G:\\Mi unidad\\GITHUB\\CURSOS\\BACKEND\\TODO CODE\\04_JAVA\\02_POO\\PROYECTOS\\tiendaAutomoviles\\src\\main\\java\\img\\volver.png")); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(64, 64, 64)
                                .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(62, 62, 62)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPatente)
                                    .addComponent(txtColor)
                                    .addComponent(txtMotor)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(cmbPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMotor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpiar)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbPuertas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("V 1.0");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Der. Nicolas Camargo Buelvas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(611, 611, 611)
                        .addComponent(jLabel9))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.limpiarCampos();        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColorActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        String modelo = txtModelo.getText();
        String marca = txtMarca.getText();
        String motor = txtMotor.getText();
        String color = txtColor.getText();
        String patente = txtPatente.getText();
        String cantPuertas = String.valueOf(cmbPuertas.getSelectedItem());
        
        if(modelo.equals("") || marca.equals("") || motor.equals("") || 
                color.equals("") || patente.equals("") || cantPuertas.equals("-")){
            mensajeEmergente("Operación errónea", "error", "¡Faltan campos por completar!");
        } else {
            control.editarAuto(GuiEditarAuto.num_auto, modelo, marca, motor, color, patente, cantPuertas);
            this.limpiarCampos();
            mensajeEmergente("Operación completada", "info", "¡El automovil ha sido actualizado!");
            
            this.dispose();
            GuiEditarAuto.verMenu();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        Automovil auto = control.buscarAuto(GuiEditarAuto.num_auto);
        txtModelo.setText(auto.getModelo());
        txtMarca.setText(auto.getMarca());
        txtMotor.setText(auto.getMotor());
        txtColor.setText(auto.getColor());
        txtPatente.setText(auto.getPatente());
        
        switch (auto.getCantPuertas()) {
            case 2 -> cmbPuertas.setSelectedIndex(1);
            case 3 -> cmbPuertas.setSelectedIndex(2);
            case 4 -> cmbPuertas.setSelectedIndex(3);
            case 5 -> cmbPuertas.setSelectedIndex(4);
            default -> throw new AssertionError();
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        GuiEditarAuto.verMenu();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void limpiarCampos(){
        txtModelo.setText("");
        txtMarca.setText("");
        txtMotor.setText("");
        txtColor.setText("");
        txtPatente.setText("");
        cmbPuertas.setSelectedIndex(0);
    }
    
    private static void verMenu(){
        GuiMenu guiMenu = new GuiMenu();
        guiMenu.setVisible(true);
        guiMenu.setLocationRelativeTo(null);
        guiMenu.setResizable(false);
    }
    
    private static void mensajeEmergente(String titulo, String tipo, String mensaje){
        
        JOptionPane optionPane = new JOptionPane(mensaje);
        
        if(tipo.equalsIgnoreCase("info")){
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if(tipo.equalsIgnoreCase("error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbPuertas;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtMotor;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables
}
