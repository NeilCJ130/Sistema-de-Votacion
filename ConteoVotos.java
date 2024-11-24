/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package sistemavotacion;

import clases.Candidato;
import clases.Sistema;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author fabri
 */
public class ConteoVotos extends javax.swing.JFrame {
    private Sistema sistema;
    private DefaultTableModel modeloTabla;
    

    public ConteoVotos() {
        initComponents();
    }
    
    private ConteoVotos(Sistema sistema){
        initComponents();
        this.sistema = sistema;
        modeloTabla = new DefaultTableModel();
        this.tblVotos.setModel(modeloTabla);
        modeloTabla.addColumn("Candidato");
        modeloTabla.addColumn("Votos Acumulados");
        
    }

    public void actualizarTablaVotos(){
        int numFilas = modeloTabla.getRowCount();
        for (int i = numFilas-1; i >= 0; i--) {
            modeloTabla.removeRow(i);
        }
        
        Candidato[] listaCandidatos = this.sistema.getListaCandidato();
        for (int i = 0; i < listaCandidatos.length; i++) {
              Candidato objCandidato = listaCandidatos[i];
    
               String[] fila = new String[1];
                 fila[0] = objCandidato.getNombre();
        
    modeloTabla.addRow(fila);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        label1 = new java.awt.Label();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVotos = new javax.swing.JTable();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblVotos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Candidato", "VotosAcumulados"
            }
        ));
        jScrollPane1.setViewportView(tblVotos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
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

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private javax.swing.JTable tblVotos;
    // End of variables declaration//GEN-END:variables
}
