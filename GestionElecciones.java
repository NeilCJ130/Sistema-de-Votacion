package sistemavotacion;

import javax.swing.DefaultComboBoxModel;
import java.text.SimpleDateFormat;
import java.util.Date;
import clases.*;
import TDAA.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class GestionElecciones extends javax.swing.JFrame {
    private Sistema sistema;
    private Operador admin; 
    private DefaultComboBoxModel<String> modeloComboCandidatos;
    private DefaultComboBoxModel<String> modeloComboMesas;
    private Lista<Candidato> listaCandidatos;
    private Lista<MesaElectoral> mesas;

   
    public GestionElecciones(Sistema sistema, Operador admin) {
        initComponents();
        this.sistema = sistema;
        this.admin = admin;

      
        this.modeloComboCandidatos = new DefaultComboBoxModel<>();
        this.modeloComboMesas = new DefaultComboBoxModel<>();
        this.listaCandidatos = sistema.obtenerCandidato();
        this.mesas = sistema.getListaMesas();

        inicializarComponentesSecundarios();
    }

    
    public GestionElecciones() {
        initComponents();
        inicializarFecha();
    }

  
    private void inicializarComponentesSecundarios() {
        inicializarFecha();
        cargarComboBoxMesas();
        cargarComboBoxCandidatos();
    }

   
    private void inicializarFecha() {
        LocalDateTime ahora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        String horaActual = ahora.format(formatter);

        txtFechaEleccion.setText(horaActual);
        txtFechaEleccion.setEditable(false);
    }

  
    private void cargarComboBoxMesas() {
        modeloComboMesas.removeAllElements();

        for (int i = 1; i <= mesas.longitud(); i++) {
            MesaElectoral mesa = mesas.iesimo(i);
            String numeroYubicacion = mesa.getNumeroMesa() + " (" + mesa.getUbicacion() + ")";
            modeloComboMesas.addElement(numeroYubicacion);
        }

        cboMesa.setModel(modeloComboMesas);
    }

  
    private void cargarComboBoxCandidatos() {
        modeloComboCandidatos.removeAllElements(); 

        for (int i = 1; i <= listaCandidatos.longitud(); i++) {
            Candidato candidato = listaCandidatos.iesimo(i);
            String nombreYPartidoPolitico = candidato.getNombre() + " (" + candidato.getPartidoPolitico() + ")";
            modeloComboCandidatos.addElement(nombreYPartidoPolitico);
        }

        cboCandidato.setModel(modeloComboCandidatos);
    }
     private void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }
      private void mostrarMensajeExito(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }
      
        private void limpiarCampos() {
        txtNombre.setText("");
        cboEleccion.setSelectedIndex(0);
        cboCandidato.setSelectedIndex(-1);
        cboMesa.setSelectedIndex(-1);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cboEleccion = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cboMesa = new javax.swing.JComboBox<>();
        cboCandidato = new javax.swing.JComboBox<>();
        btnCerrar = new javax.swing.JButton();
        btnVerLista = new javax.swing.JToggleButton();
        btnGuardar = new javax.swing.JButton();
        txtFechaEleccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        cboEleccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Municipal", "Nacional", "Referéndum" }));

        jLabel1.setText("Nombre");

        jLabel2.setText("Tipo de Eleccion");

        jLabel3.setText("Candidatos");

        jLabel5.setText("Mesas");

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnVerLista.setText("Verlista");
        btnVerLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerListaActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel6.setText("Fecha");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Gestion de Elecciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVerLista)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFechaEleccion)
                            .addComponent(cboMesa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboEleccion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre)
                            .addComponent(cboCandidato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(btnCerrar)
                        .addGap(36, 36, 36))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboEleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboMesa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerLista)
                    .addComponent(btnGuardar)
                    .addComponent(btnCerrar))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
   dispose();        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      String nombre = txtNombre.getText();
        String tipo = (String) cboEleccion.getSelectedItem();
        String fechaStr = txtFechaEleccion.getText();

        int selectedMesaIndex = cboMesa.getSelectedIndex();
        int selectedCandidatoIndex = cboCandidato.getSelectedIndex();

       
        if (nombre.isEmpty() || tipo == null) {
            mostrarMensajeError("Por favor, complete todos los campos requeridos.");
            return;
        }

        if (selectedMesaIndex == -1) {
            mostrarMensajeError("Por favor, seleccione una mesa electoral.");
            return;
        }

        if (selectedCandidatoIndex == -1) {
            mostrarMensajeError("Por favor, seleccione un candidato.");
            return;
        }

     
        LocalDateTime fechaEleccion;
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
            fechaEleccion = LocalDateTime.parse(fechaStr, formatter);
        } catch (Exception e) {
            mostrarMensajeError("El formato de la fecha no es válido. Use el formato: dd-MM-yyyy.");
            return;
        }

        
        MesaElectoral mesaSeleccionada = mesas.iesimo(selectedMesaIndex + 1);
        Candidato candidatoSeleccionado = listaCandidatos.iesimo(selectedCandidatoIndex + 1);

        if (mesaSeleccionada == null || candidatoSeleccionado == null) {
            mostrarMensajeError("Ha ocurrido un error al obtener la mesa o el candidato.");
            return;
        }

        
        Eleccion nuevaEleccion = new Eleccion(nombre, fechaEleccion, tipo, candidatoSeleccionado, mesaSeleccionada, "", "", "");

       
        if (sistema.agregarEleccion(nuevaEleccion)) {
            mostrarMensajeExito("¡Elección guardada correctamente!");
            limpiarCampos();
        } else {
            mostrarMensajeError("Hubo un problema al guardar la elección.");
        }    
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnVerListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerListaActionPerformed
         

        ListaElecciones lista = new ListaElecciones(this.sistema);
        
        lista.setVisible(true);
    
    }//GEN-LAST:event_btnVerListaActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JToggleButton btnVerLista;
    private javax.swing.JComboBox<String> cboCandidato;
    private javax.swing.JComboBox<String> cboEleccion;
    private javax.swing.JComboBox<String> cboMesa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtFechaEleccion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
