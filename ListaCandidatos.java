/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemavotacion;
import clases.Candidato;

import clases.Sistema;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

public class ListaCandidatos extends javax.swing.JFrame {

    

    private Sistema sistema;
    private DefaultTableModel modeloTabla;
    

    
    public ListaCandidatos() {
        initComponents();
        
        actualizarTabla();
        
    }
    public ListaCandidatos(Sistema sistema){
        initComponents();
        this.sistema = sistema;
        modeloTabla = new DefaultTableModel();
        this.tablalistacandidatos.setModel(modeloTabla);
        modeloTabla.addColumn("Nombres");
        modeloTabla.addColumn("Apellidos");
        modeloTabla.addColumn("DNI");
        modeloTabla.addColumn("Partido Politico");
        actualizarTabla();
        
           
    }

 
    
    
    private void actualizarTabla(){
        
         int numFilas = modeloTabla.getRowCount();
        for (int i = numFilas-1; i >= 0; i--) {
            modeloTabla.removeRow(i);
        }
        Candidato[] listaCandidatos = this.sistema.getListaCandidato();
        for (int i = 0; i < listaCandidatos.length; i++) {
              Candidato objCandidato = listaCandidatos[i];
    
               String[] fila = new String[4];
                 fila[0] = objCandidato.getNombre();
                 fila[1] = objCandidato.getApellido();
                 fila[2] = String.valueOf(objCandidato.getDni());
                 fila[3] = objCandidato.getPartidoPolitico();

    modeloTabla.addRow(fila);
}

        
         
        
         
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablalistacandidatos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCerrrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtFila = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtColumna = new javax.swing.JTextField();
        txtNuevoDato = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

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

        tablalistacandidatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablalistacandidatos);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnCerrrar.setText("Cerrar");
        btnCerrrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrrarActionPerformed(evt);
            }
        });

        jLabel1.setText("Fila:");

        jLabel2.setText("Columna:");

        jLabel3.setText("Nuevo Dato:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Lista de candidatos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtFila, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(52, 52, 52))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel3)
                                        .addGap(31, 31, 31))
                                    .addComponent(btnModificar, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEliminar)
                                        .addGap(35, 35, 35)
                                        .addComponent(btnCerrrar))
                                    .addComponent(txtNuevoDato, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(183, 183, 183))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtNuevoDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCerrrar)
                    .addComponent(txtColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
int filaSeleccionada = this.tablalistacandidatos.getSelectedRow();
if (filaSeleccionada >= 0) {
    int result = JOptionPane.showConfirmDialog(rootPane, "¿Estás seguro de eliminar?");

    if (result == 0) {
        String dni = modeloTabla.getValueAt(filaSeleccionada, 2).toString();  
        this.sistema.eliminar(dni);  

        actualizarTabla();
        JOptionPane.showMessageDialog(this, "¡Eliminado correctamente!");
    }
} else {
    JOptionPane.showMessageDialog(this, "¡No seleccionaste un registro!");
}       
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
    
 try {
        
        int fila = Integer.parseInt(txtFila.getText());
        int columna = Integer.parseInt(txtColumna.getText());
        String nuevoDato = txtNuevoDato.getText();

      
        if (fila >= 0 && fila < modeloTabla.getRowCount() && columna >= 0 && columna < modeloTabla.getColumnCount()) {
            
            modeloTabla.setValueAt(nuevoDato, fila, columna);

            
            Candidato candidato = this.sistema.getListaCandidato()[fila];
            switch (columna) {
                case 0:
                    candidato.setNombre(nuevoDato); 
                    break;
                case 1:
                    candidato.setApellido(nuevoDato); 
                    break;
                case 2:
                    candidato.setDni(nuevoDato); 
                    break;
                case 3:
                    candidato.setPartidoPolitico(nuevoDato); 
                    break;
                default:
                    throw new IllegalArgumentException("Columna no válida.");
            }

            // Confirmar modificación
            JOptionPane.showMessageDialog(this, "¡Modificación guardada correctamente!");
        } else {
            JOptionPane.showMessageDialog(this, "Índices fuera de rango. Verifica los valores ingresados.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingresa números válidos para fila y columna.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCerrrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrrarActionPerformed
    dispose();       
    }//GEN-LAST:event_btnCerrrarActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tablalistacandidatos;
    private javax.swing.JTextField txtColumna;
    private javax.swing.JTextField txtFila;
    private javax.swing.JTextField txtNuevoDato;
    // End of variables declaration//GEN-END:variables
}
