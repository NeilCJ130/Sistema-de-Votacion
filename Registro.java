package sistemavotacion;

import javax.swing.JOptionPane;
import clases.Sistema;
import clases.Participante;
import clases.Usuario;
import TDAA.Lista;

public class Registro extends javax.swing.JFrame {
    
    private Sistema sistema;
    public Registro(Sistema sistema) {
        
    initComponents();
    this.sistema = sistema;
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsernameRegister = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPasswordRegister = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtConfirmPassRegister = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtDNIRegister = new javax.swing.JTextField();
        txtNameRegister = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPhoneNumberRegister = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmailRegister = new javax.swing.JTextField();
        btnReturnRegister = new javax.swing.JButton();
        btnSaveRegister = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(38, 39, 39));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTER");

        jLabel2.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");

        txtUsernameRegister.setBackground(new java.awt.Color(38, 39, 39));
        txtUsernameRegister.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        txtUsernameRegister.setForeground(new java.awt.Color(255, 255, 255));
        txtUsernameRegister.setBorder(null);
        txtUsernameRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameRegisterActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");

        txtPasswordRegister.setBackground(new java.awt.Color(38, 39, 39));
        txtPasswordRegister.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        txtPasswordRegister.setForeground(new java.awt.Color(255, 255, 255));
        txtPasswordRegister.setBorder(null);
        txtPasswordRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordRegisterActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirm Password:");

        txtConfirmPassRegister.setBackground(new java.awt.Color(38, 39, 39));
        txtConfirmPassRegister.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        txtConfirmPassRegister.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmPassRegister.setBorder(null);
        txtConfirmPassRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmPassRegisterActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DNI:");

        jLabel6.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Name:");

        txtDNIRegister.setBackground(new java.awt.Color(38, 39, 39));
        txtDNIRegister.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        txtDNIRegister.setForeground(new java.awt.Color(255, 255, 255));
        txtDNIRegister.setBorder(null);
        txtDNIRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIRegisterActionPerformed(evt);
            }
        });

        txtNameRegister.setBackground(new java.awt.Color(38, 39, 39));
        txtNameRegister.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        txtNameRegister.setForeground(new java.awt.Color(255, 255, 255));
        txtNameRegister.setBorder(null);
        txtNameRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameRegisterActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Telefono:");

        txtPhoneNumberRegister.setBackground(new java.awt.Color(38, 39, 39));
        txtPhoneNumberRegister.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        txtPhoneNumberRegister.setForeground(new java.awt.Color(255, 255, 255));
        txtPhoneNumberRegister.setBorder(null);
        txtPhoneNumberRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNumberRegisterActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Email:");

        txtEmailRegister.setBackground(new java.awt.Color(38, 39, 39));
        txtEmailRegister.setFont(new java.awt.Font("Lucida Sans Unicode", 0, 14)); // NOI18N
        txtEmailRegister.setForeground(new java.awt.Color(255, 255, 255));
        txtEmailRegister.setBorder(null);
        txtEmailRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailRegisterActionPerformed(evt);
            }
        });

        btnReturnRegister.setBackground(new java.awt.Color(38, 39, 39));
        btnReturnRegister.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        btnReturnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnReturnRegister.setText("RETURN");
        btnReturnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnRegisterActionPerformed(evt);
            }
        });

        btnSaveRegister.setBackground(new java.awt.Color(38, 39, 39));
        btnSaveRegister.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 12)); // NOI18N
        btnSaveRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveRegister.setText("SAVE");
        btnSaveRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveRegisterActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(278, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtConfirmPassRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDNIRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtUsernameRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPasswordRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtPhoneNumberRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtEmailRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNameRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(37, 37, 37))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnReturnRegister)
                        .addGap(89, 89, 89)
                        .addComponent(btnSaveRegister)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsernameRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtPasswordRegister, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirmPassRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(7, 7, 7)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDNIRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPhoneNumberRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnReturnRegister)
                    .addComponent(btnSaveRegister))
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameRegisterActionPerformed
    }//GEN-LAST:event_txtUsernameRegisterActionPerformed

    private void txtConfirmPassRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmPassRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmPassRegisterActionPerformed

    private void txtEmailRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailRegisterActionPerformed

    private void txtPasswordRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordRegisterActionPerformed

    private void txtDNIRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNIRegisterActionPerformed

    private void txtNameRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameRegisterActionPerformed

    private void txtPhoneNumberRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNumberRegisterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberRegisterActionPerformed

    private void btnReturnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnRegisterActionPerformed
        new Login(sistema).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReturnRegisterActionPerformed

    private void btnSaveRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveRegisterActionPerformed
        // Obtener los valores de los campos de texto
     try { 
        String nombre = txtNameRegister.getText();
        String username = txtUsernameRegister.getText();
        String password = new String(txtPasswordRegister.getPassword());
        String confirmPassword = new String(txtConfirmPassRegister.getPassword());
        String dni = txtDNIRegister.getText();
        String telefono = txtPhoneNumberRegister.getText();
        String email = txtEmailRegister.getText();

    // Validar los campos
    if (nombre.isEmpty() || username.isEmpty() || password.isEmpty() || dni.isEmpty() || telefono.isEmpty() || email.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Error de registro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!password.equals(confirmPassword)) {
        JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden", "Error de registro", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Crear el nuevo usuario
    
        Participante nuevoUsuario = new Participante(nombre, username, password, dni, telefono, email);
        boolean usuarioExistente = false;
        
        
        Lista<Usuario> listaUsuarios = sistema.getUsuarios();
        
        
        for (int i = 1; i <= listaUsuarios.longitud(); i++) {
            Usuario usuario = listaUsuarios.iesimo(i);
            if (usuario != null && usuario.getNombre().equals(username)) {
                usuarioExistente = true;
                break;
            }
        }
        if (!usuarioExistente) {
            sistema.registrarUsuario(nuevoUsuario);
            System.out.println("Nuevo interesado registrado: " + nuevoUsuario.getNombre());
            System.out.println("Total de usuarios después del registro: " + sistema.getUsuarios().longitud());
            JOptionPane.showMessageDialog(this, "Registro exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            new Login(sistema).setVisible(true);
            this.dispose(); // Cerrar el formulario de registro
        } else {
            JOptionPane.showMessageDialog(this, "El nombre de usuario ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (Exception e) {
        System.err.println("Error durante el registro: " + e.getMessage());
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Ocurrió un error durante el registro: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSaveRegisterActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturnRegister;
    private javax.swing.JButton btnSaveRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JPasswordField txtConfirmPassRegister;
    private javax.swing.JTextField txtDNIRegister;
    private javax.swing.JTextField txtEmailRegister;
    private javax.swing.JTextField txtNameRegister;
    private javax.swing.JPasswordField txtPasswordRegister;
    private javax.swing.JTextField txtPhoneNumberRegister;
    private javax.swing.JTextField txtUsernameRegister;
    // End of variables declaration//GEN-END:variables
}
