package forms;

import backEnd.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class transacciones extends javax.swing.JFrame {

    public static String dat2 = "";
    public static String datos2 = "";
    PreparedStatement ps;
    ResultSet rs;
    PreparedStatement ps2;
    ResultSet rs2;
    connection connect = new connection();

    public transacciones() {
        initComponents();
        saldoEsc.setEnabled(true);
        InicioSesion dato = new InicioSesion();
        identification2.setText(dato.dato);
        saldoEsc.setText(dato.dato2);
        goBack.setEnabled(false);
        saldoEsc.setEnabled(false);
        goBack.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generate = new javax.swing.JButton();
        goBack = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        operationType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        close = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        origin = new javax.swing.JComboBox<>();
        identification2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        saldoEsc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        generate.setText("Generar Transacción");
        generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateActionPerformed(evt);
            }
        });

        goBack.setText("Menú");
        goBack.setEnabled(false);
        goBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goBackActionPerformed(evt);
            }
        });

        exit.setText("X");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        operationType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Retiro", "Ingreso" }));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Bluesoft Bank");

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel2.setText("Transacciones");

        jLabel3.setText("Tipo de operación");

        jLabel4.setText("Cantidad");

        close.setText("Cerrar Sesión");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jLabel5.setText("Lugar de la transacción");

        origin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogotá", "Soacha", "Barranquilla" }));

        identification2.setEnabled(false);

        jLabel6.setText("Número de cuenta");

        saldoEsc.setEnabled(false);
        saldoEsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saldoEscActionPerformed(evt);
            }
        });

        jLabel7.setText("Saldo actual");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(exit)
                .addGap(79, 79, 79)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(goBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(generate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(close))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(identification2, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                            .addComponent(amount, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(operationType, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(origin, 0, 172, Short.MAX_VALUE)
                            .addComponent(saldoEsc))))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(162, 162, 162))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exit)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(identification2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(operationType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(origin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saldoEsc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generate)
                    .addComponent(goBack)
                    .addComponent(close))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:
        InicioSesion ret = new InicioSesion();
        ret.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void generateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateActionPerformed
        // TODO add your handling code here:
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = simpleDateFormat.format(date);
        java.sql.Date fecha = java.sql.Date.valueOf(formattedDate);
        Connection connected = connect.connected();
        int solicitud = Integer.parseInt(amount.getText());
        String tipo = operationType.getSelectedItem().toString();
        /*String fecha = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));*/
        try {
            ps = connected.prepareStatement("select * from saldo where id_cliente = ?");
            ps.setString(1, identification2.getText());
            rs = ps.executeQuery();
            if (rs.next()) {
                int saldo = Integer.parseInt(rs.getString("saldo"));
                if (tipo == "Ingreso") {
                    int nuevo = saldo + solicitud;
                    ps = connected.prepareStatement("update saldo set saldo = ?, fecha = ? where id_cliente = ?");
                    ps.setInt(1, nuevo);
                    ps.setDate(2, fecha);
                    ps.setString(3, identification2.getText());
                    int rs2 = ps.executeUpdate();
                    if (rs2 > 0) {
                        JOptionPane.showMessageDialog(null, "Transacción del cliente" + identification2.getText() + " realizada con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        ps = connected.prepareStatement("insert into transacciones (id_cliente, ciudad_origen, valor, fecha, estado) values (?,?,?,?,?)");
                        ps.setString(1, identification2.getText());
                        ps.setString(2, origin.getSelectedItem().toString());
                        ps.setInt(3, solicitud);
                        ps.setDate(4, fecha);
                        ps.setString(5, "Aprovado");
                        ps.executeUpdate();
                        connected.close();
                        InicioSesion ret = new InicioSesion();
                        ret.setVisible(true);
                        this.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al actualizar el cliente en cuestión, comuníquese con nosotros \n");
                    }
                } else if (tipo == "Retiro") {
                    if (saldo > solicitud) {
                        int nuevo = saldo - solicitud;
                        ps = connected.prepareStatement("update saldo set saldo = ?, fecha = ? where id_cliente = ?");
                        ps.setInt(1, nuevo);
                        ps.setDate(2, fecha);
                        ps.setString(3, identification2.getText());
                        int rs = ps.executeUpdate();
                        if (rs > 0) {
                            JOptionPane.showMessageDialog(null, "Transacción del cliente" + identification2.getText() + " realizada con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            ps = connected.prepareStatement("insert into transacciones (id_cliente, ciudad_origen, valor, fecha, estado) values (?,?,?,?,?)");
                            ps.setString(1, identification2.getText());
                            ps.setString(2, origin.getSelectedItem().toString());
                            ps.setInt(3, -nuevo);
                            ps.setDate(4, fecha);
                            ps.setString(5, "Aprovado");
                            ps.executeUpdate();
                            connected.close();
                            InicioSesion ret = new InicioSesion();
                            ret.setVisible(true);
                            this.setVisible(false);

                        } else {
                            JOptionPane.showMessageDialog(null, "Transacción del cliente" + identification2.getText() + " realizada con éxito", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            ps = connected.prepareStatement("insert into transacciones (id_cliente, ciudad_origen, valor, fecha, estado) values (?,?,?,?,?)");
                            ps.setString(1, identification2.getText());
                            ps.setString(2, origin.getSelectedItem().toString());
                            ps.setInt(3, -nuevo);
                            ps.setDate(4, fecha);
                            ps.setString(5, "Rechazado");
                            ps.executeUpdate();
                            connected.close();
                            InicioSesion ret = new InicioSesion();
                            ret.setVisible(true);
                            this.setVisible(false);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Saldo insuficiente...", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                    }
                }
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_generateActionPerformed

    private void saldoEscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saldoEscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saldoEscActionPerformed

    private void goBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goBackActionPerformed
        // TODO add your handling code here:
        Connection connected = connect.connected();
        try {
            dat2 = identification2.getText();
            ps = connected.prepareStatement("select * from saldo where id_cliente = ?");
            ps.setString(1, identification2.getText());
            rs2 = ps.executeQuery();
            if (rs.next()) {

                menu ret = new menu();
                menu.saldo.setText(rs2.getString("saldo"));
                ret.setVisible(true);
                this.setVisible(false);
            } else {

            }

        } catch (Exception e) {

        }
    }//GEN-LAST:event_goBackActionPerformed

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
            java.util.logging.Logger.getLogger(transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transacciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transacciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JButton close;
    private javax.swing.JButton exit;
    private javax.swing.JButton generate;
    private javax.swing.JButton goBack;
    public static javax.swing.JTextField identification2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> operationType;
    private javax.swing.JComboBox<String> origin;
    private javax.swing.JTextField saldoEsc;
    // End of variables declaration//GEN-END:variables
}
