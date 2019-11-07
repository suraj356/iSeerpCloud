package sistemaerp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.sql.*;

public class JIFFUsuarios extends javax.swing.JInternalFrame {

    //CREAMOS VARIABLES PARA MANIPULAR LA BASE DE DATOS
    static Connection cn; 
    static Statement st;
    static ResultSet rs; 
    static ResultSet rsaux;
    
    String roles = "";
    
    public JIFFUsuarios() {
        initComponents();
        buttonGroup1.add(jRadioButton1);
        buttonGroup1.add(jRadioButton2);
        listaRoles();
        listaEmpresas();
    }
    
    public static void conectar() {
        try{
            String url = "jdbc:mysql://localhost:3308/bd_iseerpcloud";
            cn = DriverManager.getConnection(url,"root","$Jorge150380@");
            st = cn.createStatement();
            JOptionPane.showMessageDialog(null, "Conectado");

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se ha podido conectar\n" + e);
        }
    }
    
    //METODO PARA QUE NOS REGRESE DATOS DE LA BASE
    public void listaRoles() {
        try {
            conectar();
            String algo = "Algo";
            rs = st.executeQuery("select * from tbl_roles order by id_rol desc");
            while(rs.next()){
                roles = rs.getString("nombre_rol");
                comboRoles.addItem(roles);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error consultando tabla\n" + e);
        }
    }
    
    //METODO PARA QUE NOS REGRESE DATOS DE LA BASE
    public void listaEmpresas() {
        try {
            conectar();
            String algo = "Algo";
            rs = st.executeQuery("select * from tbl_empresas order by id_empresa desc");
            while(rs.next()){
                roles = rs.getString("nombre_empresa");
                comboEmpresas.addItem(roles);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error consultando tabla\n" + e);
        }
    }
    
    //METODO PARA INGRESAR DATOS
    public void ingresoTabla(){
        try{
            conectar();
            String nombre = jTFNombre.getText();
            nombre.getChars(ALLBITS, WIDTH, dst, ALLBITS);
            String con = jTFCon.getText();
            String contra = jTFContra.getText();
            String rol = (String) comboRoles.getSelectedItem();
            String empresa = (String) comboEmpresas.getSelectedItem();
            if(con==contra){
                String result = "insert into tb_usuarios values ('0','"+nombre+"','"+con+"','"+rol+"','"+empresa+"')";
                st.execute(result);
                cn.close();
            }else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                cn.close();
            }
            
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error ingresando datos\n" + e);
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        txtTitulo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();
        txtCon = new javax.swing.JLabel();
        txtContra = new javax.swing.JLabel();
        comboRoles = new javax.swing.JComboBox();
        txtRol = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        txtExtra = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        comboEmpresas = new javax.swing.JComboBox();
        jTFNombre = new javax.swing.JTextField();
        jTFCon = new javax.swing.JPasswordField();
        jTFContra = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Agregar Usuarios");

        txtTitulo.setText("Llena todos los campos");

        txtNombre.setText("Nombre:");

        txtCon.setText("Contraseña:");

        txtContra.setText("Confirmar Contraseña:");

        comboRoles.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno" }));
        comboRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRolesActionPerformed(evt);
            }
        });

        txtRol.setText("Rol:");

        jCheckBox1.setText("Autorizar acciones a otros usuarios");

        txtExtra.setText("Empresas autorizadas");

        jRadioButton1.setText("Todas");

        jRadioButton2.setText("Lista");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        comboEmpresas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ninguno" }));

        jButton1.setText("Guardar y cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRol)
                                .addGap(18, 18, 18)
                                .addComponent(comboRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1)
                            .addComponent(txtExtra)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre)
                                .addGap(18, 18, 18)
                                .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtTitulo)
                            .addComponent(comboEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtContra)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFContra, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFCon, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(78, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCon)
                    .addComponent(jTFCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContra)
                    .addComponent(jTFContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRol))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtExtra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboEmpresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // GUARDAR Y CERRAR
        ingresoTabla();
        this.show(false);
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void comboRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRolesActionPerformed
        // COMBO BOX ROLES
    }//GEN-LAST:event_comboRolesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox comboEmpresas;
    private javax.swing.JComboBox comboRoles;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JPasswordField jTFCon;
    private javax.swing.JPasswordField jTFContra;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JLabel txtCon;
    private javax.swing.JLabel txtContra;
    private javax.swing.JLabel txtExtra;
    private javax.swing.JLabel txtNombre;
    private javax.swing.JLabel txtRol;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
