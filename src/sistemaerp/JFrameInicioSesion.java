package sistemaerp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.sql.*;

public class JFrameInicioSesion extends javax.swing.JFrame {

    //CREAMOS VARIABLES PARA MANIPULAR LA BASE DE DATOS
    static Connection cn; 
    static Statement st;
    static ResultSet rs; 
    static ResultSet rsaux;
    
    String nomUsu;
    String passWord;
    boolean ingresa;
    
    
   
    public JFrameInicioSesion() {
        initComponents();
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
    
    
    //METODO PARA INGRESAR DATOS
    public void ingresoTabla(){
        try{
            conectar();
            String nombre = JOptionPane.showInputDialog(null, "Ingresa nombre: ");
            String rol = JOptionPane.showInputDialog(null, "Ingresa rol: ");
            String result = "insert into tb_usuarios values ('0','"+nombre+"','"+rol+"')";
            st.execute(result);
            cn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error ingresando datos\n" + e);
        }
    }
    
    //METODO PARA QUE NOS REGRESE DATOS DE LA BASE
    public void consultaTabla(){
        try{
            int valor;
            String id;
            String nombre;
            String rol;
            conectar();
            rs = st.executeQuery("select id,nombre,rol from tbl_usuarios");
            valor = Integer.parseInt(JOptionPane.showInputDialog(null,"valor"));
            for(int i=0;i<valor;i++){
                rs.next();
            }
            id = rs.getString("id");
            nombre = rs.getString("nombre");
            rol = rs.getString("rol");
            JOptionPane.showMessageDialog(null, "El usuario es: " + nombre + " " + rol);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error consultando tabla\n" + e);
        }
    }
    
    //METODO PARA QUE NOS REGRESE DATOS DE LA BASE
    public void login() {
        try {
            conectar();
            rs = st.executeQuery("select usuario, password from tbl_registro order by usuario desc");
            while(rs.next()){
                nomUsu = rs.getString("usuario");
                passWord = rs.getString("password");
                if(jTFUsuario.getText().equals(nomUsu) && jTFCon.getText().equals(passWord)){
                    ingresa = true;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error consultando tabla\n" + e);
        }
    }
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAceptar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        txtTitulo = new javax.swing.JLabel();
        txtNom = new javax.swing.JLabel();
        txtCon = new javax.swing.JLabel();
        jTFUsuario = new javax.swing.JTextField();
        jTFCon = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, -1, -1));

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, -1, -1));

        txtTitulo.setText("Escriba los datos de usuario para iniciar sesion");
        getContentPane().add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtNom.setText("Nombre de usuario:");
        getContentPane().add(txtNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtCon.setText("Contraseña:");
        getContentPane().add(txtCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jTFUsuario.setToolTipText("");
        getContentPane().add(jTFUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 200, -1));
        getContentPane().add(jTFCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 200, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 190));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        //BOTON DE ACEPTAR
        login();
        if(ingresa){
            JFrameAdmin pantalla = new JFrameAdmin();
            pantalla.setVisible(true);
        }
        
        
        
    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        //BOTON DE CANCELAR
        System.exit(0);
        
        
        
    }//GEN-LAST:event_botonCancelarActionPerformed

    
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
            java.util.logging.Logger.getLogger(JFrameInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameInicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameInicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jTFCon;
    private javax.swing.JTextField jTFUsuario;
    private javax.swing.JLabel txtCon;
    private javax.swing.JLabel txtNom;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
}
