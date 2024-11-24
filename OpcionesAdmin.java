package sistemavotacion;

import clases.Operador;
import clases.Sistema;



public class OpcionesAdmin extends javax.swing.JFrame {
    
    private Sistema sistema;
    private Operador admin;
 
  
    

   
    
    public OpcionesAdmin(Sistema sistema, Operador admin ) {
        initComponents();
        this.sistema = sistema;
        this.admin = admin;
      
      
        
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnSignoff = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnregistrocandidato = new javax.swing.JButton();
        btnMiembrosDeMesa = new javax.swing.JButton();
        bntRegistroMesaElectoral = new javax.swing.JButton();
        btnGestionElecciones = new javax.swing.JButton();
        bntActaElectoral = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        btnSignoff.setText("Sign off");
        btnSignoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignoffActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(38, 39, 39));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIENVENIDO ADMINISTRADOR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(47, 47, 47))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        btnregistrocandidato.setText("Registro de candidatos");
        btnregistrocandidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrocandidatoActionPerformed(evt);
            }
        });

        btnMiembrosDeMesa.setText("Registro de miembros de mesa");
        btnMiembrosDeMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMiembrosDeMesaActionPerformed(evt);
            }
        });

        bntRegistroMesaElectoral.setText("Registro de Mesa Electoral");
        bntRegistroMesaElectoral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntRegistroMesaElectoralActionPerformed(evt);
            }
        });

        btnGestionElecciones.setText("Gestion De Elecciones");
        btnGestionElecciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionEleccionesActionPerformed(evt);
            }
        });

        bntActaElectoral.setText("Ver Acta Electoral");
        bntActaElectoral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntActaElectoralActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnMiembrosDeMesa))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGestionElecciones)
                            .addComponent(btnregistrocandidato))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnSignoff)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(bntRegistroMesaElectoral)
                        .addGap(153, 153, 153))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(bntActaElectoral)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(btnGestionElecciones)
                .addGap(18, 18, 18)
                .addComponent(btnregistrocandidato)
                .addGap(18, 18, 18)
                .addComponent(btnMiembrosDeMesa)
                .addGap(18, 18, 18)
                .addComponent(bntRegistroMesaElectoral)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bntActaElectoral)
                .addGap(79, 79, 79)
                .addComponent(btnSignoff)
                .addGap(87, 87, 87))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignoffActionPerformed
        cerrarSesion();    }//GEN-LAST:event_btnSignoffActionPerformed

    private void btnregistrocandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrocandidatoActionPerformed
    FormularioCandidatoIU registrarcandidatoFrame= new FormularioCandidatoIU (sistema,admin);
        registrarcandidatoFrame.setVisible(true);
    }//GEN-LAST:event_btnregistrocandidatoActionPerformed

    private void btnMiembrosDeMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMiembrosDeMesaActionPerformed
    
     FormularioMiembrodeMesaIU registrarMiembroFrame = new FormularioMiembrodeMesaIU(sistema, admin);

    registrarMiembroFrame.setVisible(true);
    }//GEN-LAST:event_btnMiembrosDeMesaActionPerformed

    private void bntRegistroMesaElectoralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntRegistroMesaElectoralActionPerformed
        FormularioMesaElectoral registrarMesaelectoralFrame= new FormularioMesaElectoral(sistema);
        registrarMesaelectoralFrame.setVisible(true);
    }//GEN-LAST:event_bntRegistroMesaElectoralActionPerformed

    private void btnGestionEleccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionEleccionesActionPerformed
       GestionElecciones registrareleccionFrame= new GestionElecciones  (sistema,admin);
        registrareleccionFrame.setVisible(true);
    }//GEN-LAST:event_btnGestionEleccionesActionPerformed

    private void bntActaElectoralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntActaElectoralActionPerformed
        FormularioActa registrarActa = new FormularioActa (sistema,admin);
        registrarActa.setVisible(true);
    }//GEN-LAST:event_bntActaElectoralActionPerformed

    private void cerrarSesion() {
        Login login = new Login(sistema);
        login.setVisible(true);
        this.dispose(); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntActaElectoral;
    private javax.swing.JButton bntRegistroMesaElectoral;
    private javax.swing.JButton btnGestionElecciones;
    private javax.swing.JButton btnMiembrosDeMesa;
    private javax.swing.JButton btnSignoff;
    private javax.swing.JButton btnregistrocandidato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}