package Vista;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author theka
 */
public class Ventana extends javax.swing.JFrame {

    /**
     *
     */
    public Ventana() {
        initComponents();
        setLocationRelativeTo(this);
    }

    /**
     *
     * Código para poner un icono de imagen.
     */
    public Image getIconImage() {

        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("IMG/DMC.jpg"));
        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Back = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputInformation1 = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        inputInformation2 = new javax.swing.JTextField();
        colorChanger = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        hombre = new javax.swing.JRadioButton();
        mujer = new javax.swing.JRadioButton();
        yesButton = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        Back.setBackground(new java.awt.Color(51, 255, 102));

        jLabel1.setFont(new java.awt.Font("Source Code Pro Light", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Entra tus datos para ver si puedes jugar");

        jLabel2.setFont(new java.awt.Font("Source Serif Pro Light", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("USER");

        jLabel3.setFont(new java.awt.Font("Source Serif Pro Light", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("PASSWORD");

        inputInformation1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button.setFont(new java.awt.Font("Source Code Pro Light", 1, 24)); // NOI18N
        button.setText("LOG IN");
        button.setFocusable(false);
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        inputInformation2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        inputInformation2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                inputInformation2KeyPressed(evt);
            }
        });

        colorChanger.setFont(new java.awt.Font("Source Sans Pro Light", 1, 18)); // NOI18N
        colorChanger.setText("COLOR");
        colorChanger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorChangerActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("ARE YOU +18 ?");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("GÉNERO");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("COLOR DE PELO");

        comboBox.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "RUBIO", "NEGRO", "BLANCO", "CASTAÑO", "ROJO", "ROSA", "OTRO" }));

        hombre.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        hombre.setText("HOMBRE");

        mujer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        mujer.setText("MUJER");

        yesButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        yesButton.setText("SI");

        javax.swing.GroupLayout BackLayout = new javax.swing.GroupLayout(Back);
        Back.setLayout(BackLayout);
        BackLayout.setHorizontalGroup(
            BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap())
                    .addGroup(BackLayout.createSequentialGroup()
                        .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 419, Short.MAX_VALUE)
                        .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackLayout.createSequentialGroup()
                                    .addComponent(inputInformation2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(95, 95, 95))
                                .addGroup(BackLayout.createSequentialGroup()
                                    .addComponent(inputInformation1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap()))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackLayout.createSequentialGroup()
                                .addComponent(yesButton)
                                .addGap(108, 108, 108))))
                    .addGroup(BackLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackLayout.createSequentialGroup()
                                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackLayout.createSequentialGroup()
                                .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mujer)
                                    .addComponent(hombre))
                                .addGap(82, 82, 82))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(61, 61, 61))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(BackLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(colorChanger, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackLayout.setVerticalGroup(
            BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BackLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BackLayout.createSequentialGroup()
                        .addComponent(inputInformation1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(inputInformation2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yesButton))
                .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel5))
                    .addGroup(BackLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(hombre)))
                .addGap(18, 18, 18)
                .addComponent(mujer)
                .addGap(35, 35, 35)
                .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(BackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorChanger, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed

        String user = inputInformation1.getText();
        String password = inputInformation2.getText();

        /**
         *
         * Código para ver si se es mayor de edad o no y mostrar un mensaje.
         */
        if (!yesButton.isSelected()) {
            JOptionPane.showMessageDialog(this, "Usted debe ser mayor de edad para avanzar al juego", "Error", JOptionPane.ERROR_MESSAGE);
        }

        /**
         *
         * Código para ver si el usuario o la contraseña están vacios y mostrar
         * un mensaje.
         */
        if (!user.isEmpty() && !password.isEmpty()) {

            Login ventana = new Login();
            ventana.setVisible(true);
            this.dispose();

        } else {

            JOptionPane.showMessageDialog(this, "Error en el usuario o contraseña", "Error", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_buttonActionPerformed

    private void colorChangerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorChangerActionPerformed

        /**
         *
         * Código para cambiar el color del fondo.
         */
        if (colorChanger.isSelected()) {
            Back.setBackground(Color.blue);
        } else {

            Back.setBackground(Color.GREEN);

        }

    }//GEN-LAST:event_colorChangerActionPerformed

    private void inputInformation2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_inputInformation2KeyPressed

        /**
         *
         * Código para mostrar un mensaje y la ventana.
         */
        String user = inputInformation1.getText();
        String password = inputInformation2.getText();

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!user.isEmpty() && !password.isEmpty()) {

                Login ventana = new Login();
                ventana.setVisible(true);

            } else {

                JOptionPane.showMessageDialog(this, "Incorrect acces", "Error", JOptionPane.ERROR_MESSAGE);

            }
        }


    }//GEN-LAST:event_inputInformation2KeyPressed

    /**
     *
     * @param args
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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Back;
    private javax.swing.JButton button;
    private javax.swing.JToggleButton colorChanger;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JRadioButton hombre;
    private javax.swing.JTextField inputInformation1;
    private javax.swing.JTextField inputInformation2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton mujer;
    private javax.swing.JCheckBox yesButton;
    // End of variables declaration//GEN-END:variables
}
