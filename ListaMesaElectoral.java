
package sistemavotacion;

import clases.*;
import TDAA.Lista;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class ListaMesaElectoral extends javax.swing.JFrame {

    private Sistema sistema;
    private DefaultTableModel modeloTabla2;

    public ListaMesaElectoral(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        inicializarTabla();
    }

    private void inicializarTabla() {
        modeloTabla2 = new DefaultTableModel();
        modeloTabla2.addColumn("Número de Mesa");
        modeloTabla2.addColumn("Ubicación");
        modeloTabla2.addColumn("Miembros");
        tablalistamiembros.setModel(modeloTabla2); 
        cargarDatos(); 
    }

    private void cargarDatos() {
    
    
    int numFilas = modeloTabla2.getRowCount();
    for (int i = numFilas - 1; i >= 0; i--) {
        modeloTabla2.removeRow(i);
    }

    
    Lista<MesaElectoral> listaMesas = sistema.getListaMesas();
    if (listaMesas == null || listaMesas.longitud() == 0) {
        System.out.println("No hay mesas para mostrar.");
        return;
    }

    
    for (int i = 1; i <= listaMesas.longitud(); i++) {
        MesaElectoral mesa = listaMesas.iesimo(i);
        if (mesa != null) {
            String[] fila = {
                mesa.getNumeroMesa(),
                mesa.getUbicacion(),
                mesa.obtenerMiembrosString()
            };
            modeloTabla2.addRow(fila);
        }
    }
    }
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              
              /**
               * This method is called from within the constructor to initialize the form.
               * WARNING: Do NOT modify this code. The content of this method is always
               * regenerated by the Form Editor.
               */
              @SuppressWarnings("unchecked")
              // <editor-fold defaultstate="collapsed" desc="Generated Code">
              
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        tablalistamiembros = new javax.swing.JTable();
        btnModificar = new javax.swing.JToggleButton();
        btnCerrar = new javax.swing.JToggleButton();
        btnEliminar = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFila = new javax.swing.JTextField();
        txtNuevoDato = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtColumna = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablalistamiembros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablalistamiembros);
        if (tablalistamiembros.getColumnModel().getColumnCount() > 0) {
            tablalistamiembros.getColumnModel().getColumn(2).setResizable(false);
        }

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel2.setText("Fila:");

        jLabel3.setText("Columna:");

        jLabel4.setText("Nuevo Dato:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Lista de Mesa Electoral");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(103, 103, 103))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(24, 24, 24)
                                .addComponent(txtFila, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtColumna, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnEliminar)
                            .addComponent(txtNuevoDato, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(txtNuevoDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtColumna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar)
                    .addComponent(jLabel3)
                    .addComponent(btnEliminar)
                    .addComponent(btnCerrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        
          
       
        int fila = Integer.parseInt(txtFila.getText());
        int columna = Integer.parseInt(txtColumna.getText());

       
        if (fila < 0 || fila >= modeloTabla2.getRowCount()) {
            JOptionPane.showMessageDialog(this, "Fila no válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (columna < 0 || columna >= modeloTabla2.getColumnCount()) {
            JOptionPane.showMessageDialog(this, "Columna no válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        
        String numeroMesa = modeloTabla2.getValueAt(fila, 0).toString();
String nuevoDato = txtNuevoDato.getText();


MesaElectoral mesaEncontrada = sistema.obtenerMesaPorNumeroOUbicacion(numeroMesa, nuevoDato);


if (mesaEncontrada == null) {
    JOptionPane.showMessageDialog(this, "No se encontró la mesa por número o ubicación.", "Error", JOptionPane.ERROR_MESSAGE);
    return;
}


              switch (columna) {
                  
                  case 0:
                      
                      mesaEncontrada.setNumeroMesa(nuevoDato);  
                      break;
                   case 1:
                      
                      mesaEncontrada.setUbicacion(nuevoDato);  
                      break;
                  default:
                      JOptionPane.showMessageDialog(this, "Columna inválida.", "Error", JOptionPane.ERROR_MESSAGE);
                      return;   }


modeloTabla2.setValueAt(nuevoDato, fila, columna);


JOptionPane.showMessageDialog(this, "La mesa se ha actualizado correctamente.");
        

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    int filaSeleccionada = this.tablalistamiembros.getSelectedRow();

    if (filaSeleccionada >= 0) {
        int result = JOptionPane.showConfirmDialog(rootPane, "¿Estás seguro de eliminar?", 
                                                   "Confirmación", JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
           
            String numeroMesa = modeloTabla2.getValueAt(filaSeleccionada, 0).toString();

            
            if (this.sistema.eliminarMesa(numeroMesa)) { 
               
                JOptionPane.showMessageDialog(this, "¡Eliminado correctamente!");

                
                cargarDatos();
            } else {
                
                JOptionPane.showMessageDialog(this, "Hubo un problema al eliminar la mesa.", 
                                              "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } else {
        
        JOptionPane.showMessageDialog(this, "¡No seleccionaste un registro!");
    }
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCerrar;
    private javax.swing.JToggleButton btnEliminar;
    private javax.swing.JToggleButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablalistamiembros;
    private javax.swing.JTextField txtColumna;
    private javax.swing.JTextField txtFila;
    private javax.swing.JTextField txtNuevoDato;
    // End of variables declaration//GEN-END:variables
}
