package forms;

import backEnd.connection;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class cliente extends javax.swing.JFrame {

    DefaultTableModel modelo;

    public void clean() {
        identification.setText("");
        names.setText("");
        lastNames.setText("");
        password.setText("");
        confirmationPassword.setText("");
        typeAccount.setSelectedIndex(0);
        originCity.setSelectedIndex(0);
    }

    PreparedStatement ps;
    ResultSet rs;
    java.util.Date date = new java.util.Date();
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String formattedDate = simpleDateFormat.format(date);
    java.sql.Date fecha = java.sql.Date.valueOf(formattedDate);

    connection connect = new connection();

    public cliente() {
        initComponents();
        String[] titles = {"Id", "Identificacion", "Nombres", "Apellidos", "Cuenta", "Ciudad Origen"};
        modelo = new DefaultTableModel(null, titles);
        dataTable.setModel(modelo);
        showDataInTable();
        hiddenId.setVisible(false);
        update.setEnabled(false);
        drop.setEnabled(false);
        showDataInTable();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        save = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        showPasswords = new javax.swing.JCheckBox();
        identification = new javax.swing.JTextField();
        names = new javax.swing.JTextField();
        lastNames = new javax.swing.JTextField();
        typeAccount = new javax.swing.JComboBox<>();
        originCity = new javax.swing.JComboBox<>();
        password = new javax.swing.JPasswordField();
        confirmationPassword = new javax.swing.JPasswordField();
        hiddenId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(125, 191, 249));

        jLabel1.setText("Número de identificación");

        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        save.setText("Guardar");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombres");

        jLabel3.setText("Apellidos");

        jLabel4.setText("Tipo de cuenta");

        jLabel5.setText("Ciudad de origen");

        jLabel6.setText("Clave");

        jLabel7.setText("Repetir clave");

        showPasswords.setText("Mostrar contraseñas");
        showPasswords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordsActionPerformed(evt);
            }
        });

        typeAccount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cuenta de ahorros (Personas Corrientes)", "Cuenta corriente (Empresas)" }));

        originCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bogotá", "Soacha", "Barranquilla" }));

        hiddenId.setEnabled(false);

        jButton1.setText("Menú");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Bluesoft Bank");

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Registro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(49, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hiddenId, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(jLabel1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(identification)
                                    .addComponent(password)
                                    .addComponent(confirmationPassword)
                                    .addComponent(originCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(typeAccount, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lastNames)
                                    .addComponent(names)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(234, 234, 234)
                                .addComponent(showPasswords))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(exit)
                                .addGap(158, 158, 158)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(196, 196, 196)
                                .addComponent(save)
                                .addGap(48, 48, 48)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(exit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(identification, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(names, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lastNames, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(typeAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(originCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(confirmationPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hiddenId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showPasswords))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(save))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void showDataInTable() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        try {
            Connection connected = connect.connected();
            ps = connected.prepareStatement("select * from clientes");
            rs = ps.executeQuery();
            while (rs.next()) {
                Object[] data = {rs.getString("id"), rs.getString("identification"), rs.getString("nombres"), rs.getString("apellidos"), rs.getString("tipo_cuenta"), rs.getString("ciudad_origen")};
                modelo.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el cliente en cuestión, comuníquese con nosotros \n" + e, "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void showPasswordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordsActionPerformed
        // TODO add your handling code here:
        if (showPasswords.isSelected()) {
            password.setEchoChar((char) 0);
            confirmationPassword.setEchoChar((char) 0);
        } else {
            confirmationPassword.setEchoChar('*');
            password.setEchoChar('*');
        }
    }//GEN-LAST:event_showPasswordsActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        showDataInTable();
        Connection connected = connect.connected();
        String passwordData = new String(password.getPassword());
        String confirmationPasswordData = new String(confirmationPassword.getPassword());
        String identificationData = identification.getText();
        String namesData = names.getText();
        String lastNamesData = lastNames.getText();
        String typeAccountData = typeAccount.getSelectedItem().toString();
        String originCityData = originCity.getSelectedItem().toString();
        if (!password.getText().isEmpty() || !confirmationPassword.getText().isEmpty() || !identification.getText().isEmpty()
                || !names.getText().isEmpty() || !lastNames.getText().isEmpty()) {
            if (passwordData.equals(confirmationPasswordData)) {
                try {

                    ps = connected.prepareStatement("select * from clientes where identification = ?");
                    ps.setString(1, identification.getText());
                    rs = ps.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Ya existe un cliente con esta identificación.");
                        clean();
                    } else {
                        /*String fecha = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));*/
                        ps = connected.prepareStatement("insert into clientes (identification, nombres, apellidos, clave, ciudad_origen, tipo_cuenta, fecha) values (?,?,?,?,?,?,?)");
                        ps.setString(1, identificationData);
                        ps.setString(2, namesData);
                        ps.setString(3, lastNamesData);
                        ps.setString(4, passwordData);
                        ps.setString(5, originCityData);
                        ps.setString(6, typeAccountData);
                        ps.setDate(7, fecha);
                        ps.executeUpdate();
                        ps = connected.prepareStatement("insert into saldo (id_cliente, saldo, fecha) values (?,0,?)");
                        ps.setString(1, identificationData);
                        ps.setDate(2, fecha);
                        ps.executeUpdate();
                        ps = connected.prepareStatement("insert into transacciones (id_cliente, ciudad_origen, fecha, valor) values (?,?,?,0)");
                        ps.setString(1, identificationData);
                        ps.setString(2, originCityData);
                        ps.setDate(3, fecha);
                        ps.executeUpdate();
                        JOptionPane.showMessageDialog(null, "El cliente " + identification.getText() + " se creó de manera satisfactoria", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                        connected.close();
                        clean();
                        showDataInTable();
                        update.setEnabled(false);
                        drop.setEnabled(false);
                    }

                } catch (Exception e) {
                    System.out.println(e);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no son las mismas.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por favor diligencie todos las casillas.");
        }
    }//GEN-LAST:event_saveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        inicio ret = new inicio();
        ret.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmationPassword;
    private javax.swing.JButton exit;
    private javax.swing.JTextField hiddenId;
    private javax.swing.JTextField identification;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lastNames;
    private javax.swing.JTextField names;
    private javax.swing.JComboBox<String> originCity;
    private javax.swing.JPasswordField password;
    private javax.swing.JButton save;
    private javax.swing.JCheckBox showPasswords;
    private javax.swing.JComboBox<String> typeAccount;
    // End of variables declaration//GEN-END:variables
}
