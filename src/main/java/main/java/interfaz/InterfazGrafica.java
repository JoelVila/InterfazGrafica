package main.java.interfaz;


import Exceptions.ExcepcionDNI;
import Exceptions.ExcepcionFecha;
import java.awt.Color;
import model.validations.UserDataValidations;
import ficheros.ClassFichero;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class InterfazGrafica extends javax.swing.JFrame {

    UserDataValidations validaciones = new UserDataValidations();
    
   
    public InterfazGrafica() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextoNombre = new javax.swing.JTextField();
        jTextoDNI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jBotonValidar = new javax.swing.JButton();
        jlabelErrorNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelErrorDNI = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextoEmail = new javax.swing.JTextField();
        jLabelErrorEmail = new javax.swing.JLabel();
        jTextoCP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabelErrorCP = new javax.swing.JLabel();
        jTextoNacimiento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabelErrorNacimiento = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jBotonCSV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("Nombre: ");

        jTextoDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextoDNIActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("DNI:");

        jBotonValidar.setText("Validar");
        jBotonValidar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonValidarActionPerformed(evt);
            }
        });

        jlabelErrorNombre.setForeground(new java.awt.Color(255, 0, 51));

        jLabel2.setText("VALIDACIONES DATOS USUARIO");

        jLabelErrorDNI.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("Email:");

        jTextoEmail.setToolTipText("");
        jTextoEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextoEmailActionPerformed(evt);
            }
        });

        jTextoCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextoCPActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("Codigo postal:");

        jLabelErrorCP.setForeground(new java.awt.Color(255, 0, 0));

        jTextoNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextoNacimientoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("Nacimiento:");

        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jBotonCSV.setText("CSV");
        jBotonCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBotonCSVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(288, 288, 288)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelErrorNacimiento)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelErrorCP)
                        .addComponent(jLabelErrorDNI)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(45, 45, 45))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBotonValidar)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jBotonCSV))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextoCP, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(jlabelErrorNombre))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabelErrorEmail)))))
                    .addComponent(jLabel2))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlabelErrorNombre))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextoDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelErrorDNI))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelErrorEmail))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextoCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelErrorCP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextoNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelErrorNacimiento))
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBotonValidar)
                    .addComponent(jButton1)
                    .addComponent(jBotonCSV))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBotonValidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonValidarActionPerformed
       String nombre = jTextoNombre.getText();
    String dni = jTextoDNI.getText();
    String email = jTextoEmail.getText();
    String cp = jTextoCP.getText();
    String nacimiento = jTextoNacimiento.getText();

    // Validar nombre (aún devuelve booleano, según tu implementación)
    if (!validaciones.checkName(nombre)) {
        jlabelErrorNombre.setText("Inválido");
        jlabelErrorNombre.setForeground(Color.RED);
    } else {
        jlabelErrorNombre.setText("Válido");
        jlabelErrorNombre.setForeground(Color.GREEN);
        jTextoNombre.setEditable(false);
    }

    // Validar DNI
    try {
        validaciones.checkId(dni);
        jLabelErrorDNI.setText("Válido");
        jLabelErrorDNI.setForeground(Color.GREEN);
        jTextoDNI.setEditable(false);
    } catch (ExcepcionDNI e) {
        jLabelErrorDNI.setText("Inválido: " + e.getMessage());
        jLabelErrorDNI.setForeground(Color.RED);
    }

    // Validar Email
    if (!validaciones.checkEmail(email)) {
        jLabelErrorEmail.setText("Inválido");
        jLabelErrorEmail.setForeground(Color.RED);
    } else {
        jLabelErrorEmail.setText("Válido");
        jLabelErrorEmail.setForeground(Color.GREEN);
        jTextoEmail.setEditable(false);
    }

    // Validar Código Postal
    if (!validaciones.checkPostalCode(cp)) {
        jLabelErrorCP.setText("Inválido");
        jLabelErrorCP.setForeground(Color.RED);
    } else {
        jLabelErrorCP.setText("Válido");
        jLabelErrorCP.setForeground(Color.GREEN);
        jTextoCP.setEditable(false);
    }

    // Validar Fecha de Nacimiento
    try {
        validaciones.checkFormatDate(nacimiento);
        jLabelErrorNacimiento.setText("Válido");
        jLabelErrorNacimiento.setForeground(Color.GREEN);
        jTextoNacimiento.setEditable(false);
    } catch (ExcepcionFecha e) {
        jLabelErrorNacimiento.setText("Inválido: " + e.getMessage());
        jLabelErrorNacimiento.setForeground(Color.RED);
    }

    jBotonCSV.setEnabled(true);
            
    }//GEN-LAST:event_jBotonValidarActionPerformed

    private void jTextoDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextoDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextoDNIActionPerformed

    private void jTextoEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextoEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextoEmailActionPerformed

    private void jTextoCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextoCPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextoCPActionPerformed

    private void jTextoNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextoNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextoNacimientoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextoNombre.setText("");
        jTextoNombre.setEditable(true);
        jTextoDNI.setText("");
        jTextoDNI.setEditable(true);
        jTextoEmail.setText("");
        jTextoEmail.setEditable(true);
        jTextoCP.setText("");
        jTextoCP.setEditable(true);
        jTextoNacimiento.setText("");
        jTextoNacimiento.setEditable(true);
        jBotonCSV.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBotonCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBotonCSVActionPerformed
        String finalCSV = jTextoNombre.getText() + ";" + jTextoDNI.getText() + ";" + jTextoEmail.getText() + ";" + jTextoCP.getText() + ";" +  jTextoNacimiento.getText() + ";" + "\n";
        
        ClassFichero.writeFile(finalCSV);
        jBotonCSV.setEnabled(false);
        
                 
    }//GEN-LAST:event_jBotonCSVActionPerformed

    
    public static void main(String args[]) throws FileNotFoundException {
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
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        ClassFichero.createFile("user_data_JVN.csv");
        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBotonCSV;
    private javax.swing.JButton jBotonValidar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelErrorCP;
    private javax.swing.JLabel jLabelErrorDNI;
    private javax.swing.JLabel jLabelErrorEmail;
    private javax.swing.JLabel jLabelErrorNacimiento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextoCP;
    private javax.swing.JTextField jTextoDNI;
    private javax.swing.JTextField jTextoEmail;
    private javax.swing.JTextField jTextoNacimiento;
    private javax.swing.JTextField jTextoNombre;
    private javax.swing.JLabel jlabelErrorNombre;
    // End of variables declaration//GEN-END:variables
}
