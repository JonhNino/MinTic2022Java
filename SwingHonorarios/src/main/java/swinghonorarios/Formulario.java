/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinghonorarios;

import javax.swing.JOptionPane;

/**
 *
 * @author Hp-Gamer
 */
public class Formulario extends javax.swing.JFrame {

    /**
     * Creates new form Formulario
     */
    public Formulario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDocumento = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCategoria = new javax.swing.JLabel();
        lblHorasLaboradas = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtHoras = new javax.swing.JTextField();
        cboCategoria = new javax.swing.JComboBox<>();
        btnhonorarios = new javax.swing.JButton();
        lblValor = new javax.swing.JLabel();
        lblhonorarios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HonorariosJFrame");

        lblDocumento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDocumento.setForeground(new java.awt.Color(204, 0, 51));
        lblDocumento.setText("Documento:");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(204, 0, 51));
        lblNombre.setText("Nombre:");

        lblCategoria.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCategoria.setForeground(new java.awt.Color(204, 0, 51));
        lblCategoria.setText("Categoria:");

        lblHorasLaboradas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblHorasLaboradas.setForeground(new java.awt.Color(204, 0, 51));
        lblHorasLaboradas.setText("Horas Laboradas:");

        txtDocumento.setBackground(new java.awt.Color(51, 51, 0));
        txtDocumento.setForeground(new java.awt.Color(51, 255, 51));

        txtNombre.setBackground(new java.awt.Color(51, 51, 0));
        txtNombre.setForeground(new java.awt.Color(51, 255, 51));

        txtHoras.setBackground(new java.awt.Color(51, 51, 0));
        txtHoras.setForeground(new java.awt.Color(51, 255, 51));
        txtHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHorasActionPerformed(evt);
            }
        });

        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "(Seleccione)", "Auxiliar", "Asistente", "Especial" }));

        btnhonorarios.setBackground(new java.awt.Color(0, 0, 255));
        btnhonorarios.setText("Calcular Honorarios");
        btnhonorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhonorariosActionPerformed(evt);
            }
        });

        lblValor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblValor.setForeground(new java.awt.Color(51, 255, 0));
        lblValor.setText("Valor Honorarios:");

        lblhonorarios.setBackground(new java.awt.Color(255, 204, 204));
        lblhonorarios.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnhonorarios)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblNombre)
                                            .addGap(113, 113, 113))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(lblCategoria)
                                            .addGap(103, 103, 103)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblDocumento)
                                        .addGap(46, 46, 46)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblHorasLaboradas)
                                    .addGap(69, 69, 69)))
                            .addComponent(lblValor))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtHoras)
                            .addComponent(txtDocumento, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboCategoria, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblhonorarios, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDocumento)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCategoria)
                    .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHorasLaboradas)
                    .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblValor))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblhonorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnhonorarios)
                .addGap(44, 44, 44))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHorasActionPerformed

    private void btnhonorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhonorariosActionPerformed
         // TODO add your handling code here: Programacion del evento
         //Definicion de Variables
         long documento;
         String nombre;
         int categoria, horas;
         double honorarios=0;
         
         if((txtDocumento.getText().isEmpty())||(txtNombre.getText().isEmpty())||(txtHoras.getText().isEmpty())||(cboCategoria.getSelectedIndex()==0)){
             JOptionPane.showMessageDialog(null, "Por favor ingrese los Datos");
         }
         else{
             
         //Pasar lo capturado en los elementos visuales a las variables
         documento=Long.parseLong(txtDocumento.getText());
         nombre=txtNombre.getText();
         horas=Integer.parseInt(txtHoras.getText());
         categoria=cboCategoria.getSelectedIndex();
         
         ///Creacion del objeto
         Docente docente =new Docente(documento,nombre,categoria,horas);
         honorarios=docente.calcularHonorarios();
         
         //Salida
         lblhonorarios.setText(String.valueOf(honorarios));
          
         }
    }//GEN-LAST:event_btnhonorariosActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhonorarios;
    private javax.swing.JComboBox<String> cboCategoria;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblHorasLaboradas;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel lblhonorarios;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
