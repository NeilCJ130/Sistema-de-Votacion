package sistemavotacion;
import clases.*;
import TDAA.Lista;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import clases.MiembroDeMesa;

public class FormularioMesaElectoral extends javax.swing.JFrame {
  
 private Sistema sistema;
 private Lista<MiembroDeMesa> miembros;
  private DefaultComboBoxModel<String> modeloCombo;



public FormularioMesaElectoral(Sistema sistema) {
    initComponents();
    this.sistema = sistema;
  
    this.miembros = sistema.obtenerMiembrosDeMesa();  
    inicializarComboBox();  
}

private void inicializarComboBox() {
    modeloCombo = new DefaultComboBoxModel<>();

    for (int i = 1; i <= miembros.longitud(); i++) {
        MiembroDeMesa miembro = miembros.iesimo(i);
  
        String nombreYTipo = miembro.getNombre() + " (" + miembro.getTipo() + ")";
        modeloCombo.addElement(nombreYTipo);
    }
    cboMiembros.setModel(modeloCombo);
}


private void limpiarFormulario() {
    this.txtNumero.setText("");
     this.cboUbi.setSelectedIndex(0);
    this.cboMiembros.setSelectedIndex(0);
}



    



  
  
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        btnVerLista = new javax.swing.JButton();
        cboMiembros = new javax.swing.JComboBox<>();
        cboUbi = new javax.swing.JComboBox<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Formulario Mesa Electoral");

        jLabel2.setText("Numero Mesa:");

        jLabel3.setText("Ubicacion:");

        jLabel4.setText("Miembros:");

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnVerLista.setText("Ver Lista");
        btnVerLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerListaActionPerformed(evt);
            }
        });

        cboMiembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMiembrosActionPerformed(evt);
            }
        });

        cboUbi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mesa 1", "Mesa 2", "Mesa 3", "Mesa 4", "Mesa 5", "Mesa 6", "Mesa 7", "Mesa 8", "Mesa 9", "Mesa 10", "Mesa 11", "Mesa 12", "Mesa 13", "Mesa 14", "Mesa 15" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnVerLista, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboMiembros, 0, 149, Short.MAX_VALUE)
                            .addComponent(txtNumero, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(cboUbi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cboMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboUbi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerLista)
                    .addComponent(btnGuardar)
                    .addComponent(btnCerrar))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnVerListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerListaActionPerformed
        ListaMesaElectoral lista = new ListaMesaElectoral(this.sistema);
        lista.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_btnVerListaActionPerformed

    private void cboMiembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMiembrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMiembrosActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
   
   
     String numeroMesa = txtNumero.getText();
        String ubicacion = cboUbi.getSelectedItem().toString();
        int selectedIndex = cboMiembros.getSelectedIndex();

 
        if (numeroMesa.isEmpty() || ubicacion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos requeridos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

      
        String regex = "^Mesa\\s\\d+$";  
        if (!ubicacion.matches(regex)) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una ubicación válida (Ejemplo: Mesa 1).", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        if (selectedIndex == -1 || miembros == null || miembros.longitud() == 0) {
            JOptionPane.showMessageDialog(this, "Seleccione un miembro válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            
            MiembroDeMesa miembroSeleccionado = miembros.iesimo(selectedIndex + 1); 

          
            Lista<MiembroDeMesa> miembrosSeleccionados = new Lista<>();
            miembrosSeleccionados.agregar(miembroSeleccionado);

            
            MesaElectoral mesa = new MesaElectoral(numeroMesa, ubicacion, miembroSeleccionado.getTipo(),
                    miembrosSeleccionados, "", "",
                    "", "", "",
                   "");

            
            if (sistema.agregar(mesa)) {
                JOptionPane.showMessageDialog(this, "Mesa electoral guardada correctamente!");
                txtNumero.setText("");
                cboUbi.setSelectedIndex(0);
                cboMiembros.setSelectedIndex(0);
            } else {
                JOptionPane.showMessageDialog(this, "Hubo un problema al guardar la mesa electoral.", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al obtener el miembro seleccionado: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
           
        }
    
       limpiarFormulario();
    

    }//GEN-LAST:event_btnGuardarActionPerformed
    
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVerLista;
    private javax.swing.JComboBox<String> cboMiembros;
    private javax.swing.JComboBox<String> cboUbi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables

  
}
