/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema4;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author chima
 */
public class frmSimpson extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    private ButtonGroup groupOptions;

    public frmSimpson() {
        initComponents();
        groupOptions = new ButtonGroup();
        groupOptions.add(this.radioSimpson);
        groupOptions.add(this.radioTrapezio);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtN = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnSimpson = new javax.swing.JButton();
        radioTrapezio = new javax.swing.JRadioButton();
        radioSimpson = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        lblTexto = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Integración Numérica");
        setBounds(new java.awt.Rectangle(420, 220, 0, 0));
        getContentPane().setLayout(null);

        txtA.setToolTipText("Ingresar rango a");
        getContentPane().add(txtA);
        txtA.setBounds(50, 80, 105, 20);

        txtB.setToolTipText("Ingresar rango b");
        getContentPane().add(txtB);
        txtB.setBounds(50, 120, 105, 20);

        jLabel1.setText("a:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 80, 10, 14);

        jLabel2.setText("b:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 120, 10, 14);

        txtN.setToolTipText("Ingresar Numero de Intervalos");
        getContentPane().add(txtN);
        txtN.setBounds(50, 160, 105, 20);

        jLabel3.setText("N:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 160, 11, 14);

        btnSimpson.setText("Calcular");
        btnSimpson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpsonActionPerformed(evt);
            }
        });
        getContentPane().add(btnSimpson);
        btnSimpson.setBounds(170, 160, 92, 23);

        radioTrapezio.setText("Trapezio");
        radioTrapezio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioTrapezioActionPerformed(evt);
            }
        });
        getContentPane().add(radioTrapezio);
        radioTrapezio.setBounds(270, 80, 100, 23);

        radioSimpson.setText("Simpson");
        getContentPane().add(radioSimpson);
        radioSimpson.setBounds(270, 110, 100, 23);

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setForeground(new java.awt.Color(51, 255, 51));

        lblTexto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTexto.setForeground(new java.awt.Color(255, 255, 255));
        lblTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTexto.setText("INTEGRACIÓN NUMERICA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTexto, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 500, 60);

        lblResultado.setBackground(new java.awt.Color(0, 0, 0));
        lblResultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblResultado.setText("Resultado");
        getContentPane().add(lblResultado);
        lblResultado.setBounds(50, 210, 230, 22);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnSimpsonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpsonActionPerformed
        // TODO add your handling code here:

        csEntrada datos = new csEntrada();

        try {
            datos.setA(Double.parseDouble(this.txtA.getText().trim()));
            datos.setB(Double.parseDouble(this.txtB.getText().trim()));

            datos.setN(Integer.parseInt(this.txtN.getText().trim()));
            datos.setH((datos.getB() - datos.getA()) / datos.getN());

            ctrlIntegraciones integral = new ctrlIntegraciones(datos);
            
            if (this.radioSimpson.isSelected() == true) {
                if (Integer.parseInt(this.txtN.getText().trim()) % 2 == 0) {
                    double resultado = integral.Simpson();
                    this.lblResultado.setText(String.valueOf(resultado));
                } else {
                    JOptionPane.showMessageDialog(null, "n debe ser Par");
                }
            } else if (this.radioTrapezio.isSelected() == true) {
                double resultado = integral.Trapecio();
                this.lblResultado.setText(String.valueOf(resultado));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSimpsonActionPerformed

    private void radioTrapezioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioTrapezioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioTrapezioActionPerformed

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
            java.util.logging.Logger.getLogger(frmSimpson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmSimpson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmSimpson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmSimpson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmSimpson().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSimpson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JRadioButton radioSimpson;
    private javax.swing.JRadioButton radioTrapezio;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtN;
    // End of variables declaration//GEN-END:variables
}