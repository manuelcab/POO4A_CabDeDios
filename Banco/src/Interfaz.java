import java.awt.Color;
import java.util.List;

public class Interfaz extends javax.swing.JFrame {
    
    Cuenta cuenta1 = new Cuenta(0);
    Cliente cliente1 = new Cliente("Manuel", cuenta1);

    public Interfaz() {
        initComponents();
        setBackground(new Color(0,0,0,0));
        
        lblSaldo.setText("$" + Double.toString(cliente1.getCuenta().getSaldo()));
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        panelBorder1 = new PanelBorder();
        panelBorder3 = new PanelBorder();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstMovimientos = new javax.swing.JList<>();
        panelBorder5 = new PanelBorder();
        jLabel4 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        btnDepositar = new javax.swing.JButton();
        btnRetirar = new javax.swing.JButton();
        teclado2 = new Teclado();
        jLabel1 = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();

        jButton4.setText("1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelBorder1.setBackground(new java.awt.Color(30, 30, 30));

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Movimientos");

        lstMovimientos.setBackground(new java.awt.Color(45, 45, 45));
        lstMovimientos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(45, 45, 45), 1, true));
        lstMovimientos.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        lstMovimientos.setForeground(new java.awt.Color(255, 255, 255));
        lstMovimientos.setFocusable(false);
        jScrollPane1.setViewportView(lstMovimientos);

        javax.swing.GroupLayout panelBorder3Layout = new javax.swing.GroupLayout(panelBorder3);
        panelBorder3.setLayout(panelBorder3Layout);
        panelBorder3Layout.setHorizontalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 77, Short.MAX_VALUE))
                    .addGroup(panelBorder3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        panelBorder3Layout.setVerticalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Operaciones");

        txtMonto.setBackground(new java.awt.Color(69, 69, 69));
        txtMonto.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        txtMonto.setForeground(new java.awt.Color(255, 255, 255));
        txtMonto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtMonto.setBorder(null);

        btnDepositar.setBackground(new java.awt.Color(0, 111, 255));
        btnDepositar.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnDepositar.setForeground(new java.awt.Color(255, 255, 255));
        btnDepositar.setText("Depositar");
        btnDepositar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositarActionPerformed(evt);
            }
        });

        btnRetirar.setBackground(new java.awt.Color(0, 111, 255));
        btnRetirar.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btnRetirar.setForeground(new java.awt.Color(255, 255, 255));
        btnRetirar.setText("Retirar");
        btnRetirar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRetirarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder5Layout = new javax.swing.GroupLayout(panelBorder5);
        panelBorder5.setLayout(panelBorder5Layout);
        panelBorder5Layout.setHorizontalGroup(
            panelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMonto)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder5Layout.createSequentialGroup()
                        .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelBorder5Layout.setVerticalGroup(
            panelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelBorder5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDepositar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRetirar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(225, 255, 255));
        jLabel1.setText("Saldo");
        jLabel1.setFocusable(false);

        lblSaldo.setFont(new java.awt.Font("Poppins Light", 0, 36)); // NOI18N
        lblSaldo.setForeground(new java.awt.Color(225, 255, 255));
        lblSaldo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSaldo.setText("$");
        lblSaldo.setAlignmentX(0.5F);
        lblSaldo.setFocusable(false);
        lblSaldo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout teclado2Layout = new javax.swing.GroupLayout(teclado2);
        teclado2.setLayout(teclado2Layout);
        teclado2Layout.setHorizontalGroup(
            teclado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teclado2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(teclado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(teclado2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblSaldo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(teclado2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        teclado2Layout.setVerticalGroup(
            teclado2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(teclado2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBorder5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(teclado2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(panelBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBorder3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(teclado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panelBorder5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDepositarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositarActionPerformed
        
        cliente1.getCuenta().depositar(Double.parseDouble(txtMonto.getText()));
        lblSaldo.setText("$" + Double.toString(cliente1.getCuenta().getSaldo()));
        actualizarListaMovimientos();
        txtMonto.setText("");
             
    }//GEN-LAST:event_btnDepositarActionPerformed

    private void btnRetirarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRetirarActionPerformed
        
        cliente1.getCuenta().retirar(Double.parseDouble(txtMonto.getText()));
        lblSaldo.setText("$" + Double.toString(cliente1.getCuenta().getSaldo()));
        actualizarListaMovimientos();
        txtMonto.setText("");
        
    }//GEN-LAST:event_btnRetirarActionPerformed

    private void actualizarListaMovimientos() {
        
        List<String> movimientos = cliente1.getCuenta().getMovimientos();

        String[] arrayMovimientos = movimientos.toArray(new String[0]);

        lstMovimientos.setListData(arrayMovimientos);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDepositar;
    private javax.swing.JButton btnRetirar;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JList<String> lstMovimientos;
    private PanelBorder panelBorder1;
    private PanelBorder panelBorder3;
    private PanelBorder panelBorder5;
    private Teclado teclado2;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
