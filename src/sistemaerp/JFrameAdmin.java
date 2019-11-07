package sistemaerp;

public class JFrameAdmin extends javax.swing.JFrame {

    public JFrameAdmin() {
        initComponents();
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAgregar = new javax.swing.JMenu();
        jIAUsu = new javax.swing.JMenuItem();
        jIARol = new javax.swing.JMenuItem();
        jIAEmpresa = new javax.swing.JMenuItem();
        jMenuEditar = new javax.swing.JMenu();
        jIEUsu = new javax.swing.JMenuItem();
        jIERol = new javax.swing.JMenuItem();
        jIEEmpresa = new javax.swing.JMenuItem();
        jMenuEliminar = new javax.swing.JMenu();
        jIElimUsu = new javax.swing.JMenuItem();
        jIElimRol = new javax.swing.JMenuItem();
        jIElimEmpresa = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();
        jItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 412, Short.MAX_VALUE)
        );

        jMenuAgregar.setText("Agregar");

        jIAUsu.setText("Usuarios");
        jIAUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIAUsuActionPerformed(evt);
            }
        });
        jMenuAgregar.add(jIAUsu);

        jIARol.setText("Roles");
        jIARol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIARolActionPerformed(evt);
            }
        });
        jMenuAgregar.add(jIARol);

        jIAEmpresa.setText("Empresas");
        jIAEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIAEmpresaActionPerformed(evt);
            }
        });
        jMenuAgregar.add(jIAEmpresa);

        jMenuBar1.add(jMenuAgregar);

        jMenuEditar.setText("Editar");

        jIEUsu.setText("Usuarios");
        jMenuEditar.add(jIEUsu);

        jIERol.setText("Roles");
        jMenuEditar.add(jIERol);

        jIEEmpresa.setText("Empresas");
        jIEEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIEEmpresaActionPerformed(evt);
            }
        });
        jMenuEditar.add(jIEEmpresa);

        jMenuBar1.add(jMenuEditar);

        jMenuEliminar.setText("Eliminar");

        jIElimUsu.setText("Usuarios");
        jMenuEliminar.add(jIElimUsu);

        jIElimRol.setText("Roles");
        jIElimRol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIElimRolActionPerformed(evt);
            }
        });
        jMenuEliminar.add(jIElimRol);

        jIElimEmpresa.setText("Empresas");
        jIElimEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIElimEmpresaActionPerformed(evt);
            }
        });
        jMenuEliminar.add(jIElimEmpresa);

        jMenuBar1.add(jMenuEliminar);

        jMenuAyuda.setText("Ayuda");

        jItemAcercaDe.setText("Acerca de");
        jItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemAcercaDeActionPerformed(evt);
            }
        });
        jMenuAyuda.add(jItemAcercaDe);

        jMenuBar1.add(jMenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jIARolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIARolActionPerformed
        // AGREGAR ROL
        
        
        
        
    }//GEN-LAST:event_jIARolActionPerformed

    private void jIEEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIEEmpresaActionPerformed
        // EDITAR EMPRESA
        
        
        
        
    }//GEN-LAST:event_jIEEmpresaActionPerformed

    private void jIElimEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIElimEmpresaActionPerformed
        // ELIMINAR EMPRESA
        
        
        
        
    }//GEN-LAST:event_jIElimEmpresaActionPerformed

    private void jItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemAcercaDeActionPerformed
        // ACERCA DE
        JIFFAcercaDe acercaDe = new JIFFAcercaDe();
        escritorio.add(acercaDe);
        acercaDe.show();
        
        
        
        
        
    }//GEN-LAST:event_jItemAcercaDeActionPerformed

    private void jIAUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIAUsuActionPerformed
        // REGISTRO DE USUARIOS
        JIFFUsuarios agregarUsu = new JIFFUsuarios();
        escritorio.add(agregarUsu);
        agregarUsu.show();
        
        
        
        
        
        
        
    }//GEN-LAST:event_jIAUsuActionPerformed

    private void jIAEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIAEmpresaActionPerformed
        // REGISTRO DE EMPRESAS
        
        
        
        
    }//GEN-LAST:event_jIAEmpresaActionPerformed

    private void jIElimRolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIElimRolActionPerformed
        // ELIMINAR ROL
        
        
        
        
    }//GEN-LAST:event_jIElimRolActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jIAEmpresa;
    private javax.swing.JMenuItem jIARol;
    private javax.swing.JMenuItem jIAUsu;
    private javax.swing.JMenuItem jIEEmpresa;
    private javax.swing.JMenuItem jIERol;
    private javax.swing.JMenuItem jIEUsu;
    private javax.swing.JMenuItem jIElimEmpresa;
    private javax.swing.JMenuItem jIElimRol;
    private javax.swing.JMenuItem jIElimUsu;
    private javax.swing.JMenuItem jItemAcercaDe;
    private javax.swing.JMenu jMenuAgregar;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuEditar;
    private javax.swing.JMenu jMenuEliminar;
    // End of variables declaration//GEN-END:variables
}
