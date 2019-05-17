import javax.swing.JOptionPane;

public class tess extends javax.swing.JFrame {
    public tess() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbSoto = new javax.swing.JCheckBox();
        cbRawon = new javax.swing.JCheckBox();
        cbSate = new javax.swing.JCheckBox();
        cbBakso = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        cbTeh = new javax.swing.JCheckBox();
        cbKopi = new javax.swing.JCheckBox();
        cbJus = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfSoto = new javax.swing.JTextField();
        tfRawon = new javax.swing.JTextField();
        tfSate = new javax.swing.JTextField();
        tfBakso = new javax.swing.JTextField();
        tfTeh = new javax.swing.JTextField();
        tfKopi = new javax.swing.JTextField();
        tfJus = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        lblTHSoto = new javax.swing.JLabel();
        lblTHRawon = new javax.swing.JLabel();
        lblTHSate = new javax.swing.JLabel();
        lblTHBakso = new javax.swing.JLabel();
        lblTHTeh = new javax.swing.JLabel();
        lblTHKopi = new javax.swing.JLabel();
        lblTHJus = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lblTJ = new javax.swing.JLabel();
        lblTH = new javax.swing.JLabel();
        btnHitung = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnKeuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Daftar Pesanan");

        jLabel2.setText("Makanan");

        cbSoto.setText("Soto");
        cbSoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSotoActionPerformed(evt);
            }
        });

        cbRawon.setText("Rawon");
        cbRawon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRawonActionPerformed(evt);
            }
        });

        cbSate.setText("Sate");
        cbSate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSateActionPerformed(evt);
            }
        });

        cbBakso.setText("Bakso");
        cbBakso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBaksoActionPerformed(evt);
            }
        });

        jLabel3.setText("Minuman");

        cbTeh.setText("Teh");
        cbTeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTehActionPerformed(evt);
            }
        });

        cbKopi.setText("Kopi");
        cbKopi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKopiActionPerformed(evt);
            }
        });

        cbJus.setText("Jus");
        cbJus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJusActionPerformed(evt);
            }
        });

        jLabel4.setText("Harga");

        jLabel5.setText("12.000");

        jLabel6.setText("15.000");

        jLabel7.setText("13.000");

        jLabel8.setText("10.000");

        jLabel9.setText("3.000");

        jLabel10.setText("5.000");

        jLabel11.setText("7.000");

        jLabel12.setText("Jumlah");

        tfSoto.setEditable(false);

        tfRawon.setEditable(false);

        tfSate.setEditable(false);

        tfBakso.setEditable(false);

        tfTeh.setEditable(false);

        tfKopi.setEditable(false);

        tfJus.setEditable(false);

        jLabel13.setText("Total Harga");

        lblTHSoto.setText("0");

        lblTHRawon.setText("0");

        lblTHSate.setText("0");

        lblTHBakso.setText("0");

        lblTHTeh.setText("0");

        lblTHKopi.setText("0");

        lblTHJus.setText("0");

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jLabel14.setText("TOTAL BAYAR");

        lblTJ.setText("0 porsi");

        lblTH.setText("0");

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnKeuar.setText("Keluar");
        btnKeuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(cbSoto)
                                    .addComponent(cbRawon)
                                    .addComponent(cbSate)
                                    .addComponent(cbBakso)
                                    .addComponent(cbTeh)
                                    .addComponent(cbKopi)
                                    .addComponent(cbJus))
                                .addGap(78, 78, 78)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(btnHitung)))
                            .addComponent(jLabel14))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfSoto)
                                .addComponent(tfRawon)
                                .addComponent(tfSate)
                                .addComponent(tfBakso)
                                .addComponent(tfTeh)
                                .addComponent(tfKopi)
                                .addComponent(tfJus))
                            .addComponent(lblTJ)
                            .addComponent(btnReset))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnKeuar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTHSoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTHRawon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTHSate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTHBakso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTHTeh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTHKopi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTHJus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(248, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSoto)
                    .addComponent(jLabel5)
                    .addComponent(tfSoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTHSoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRawon)
                    .addComponent(jLabel6)
                    .addComponent(tfRawon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTHRawon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSate)
                    .addComponent(jLabel7)
                    .addComponent(tfSate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTHSate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBakso)
                    .addComponent(jLabel8)
                    .addComponent(tfBakso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTHBakso))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTeh)
                    .addComponent(jLabel9)
                    .addComponent(tfTeh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTHTeh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbKopi)
                    .addComponent(jLabel10)
                    .addComponent(tfKopi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTHKopi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbJus)
                    .addComponent(jLabel11)
                    .addComponent(tfJus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTHJus))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(lblTJ)
                    .addComponent(lblTH))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHitung)
                    .addComponent(btnReset)
                    .addComponent(btnKeuar))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbRawonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRawonActionPerformed
        // TODO add your handling code here:
         if (cbRawon.isSelected() == true){
            tfRawon.setEditable(true);
            tfRawon.requestFocus();
        }
        else{
            tfRawon.setEditable (false);
            tfRawon.setText("");
            lblTHRawon.setText("0");
    }
    }//GEN-LAST:event_cbRawonActionPerformed

    private void cbTehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTehActionPerformed
        // TODO add your handling code here:
         if (cbTeh.isSelected() == true){
            tfTeh.setEditable(true);
            tfTeh.requestFocus();
        }
        else{
            tfTeh.setEditable (false);
            tfTeh.setText("");
            lblTHTeh.setText("0");
    }
    }//GEN-LAST:event_cbTehActionPerformed

    private void cbSotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSotoActionPerformed
        // TODO add your handling code here:
        if (cbSoto.isSelected() == true){
            tfSoto.setEditable(true);
            tfSoto.requestFocus();
        }
        else{
            tfSoto.setEditable (false);
            tfSoto.setText("");
            lblTHSoto.setText("0");
    }
    }//GEN-LAST:event_cbSotoActionPerformed

    private void cbSateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSateActionPerformed
        // TODO add your handling code here:
         if (cbSate.isSelected() == true){
            tfSate.setEditable(true);
            tfSate.requestFocus();
        }
        else{
            tfSate.setEditable (false);
            tfSate.setText("");
            lblTHSate.setText("0");
    }
    }//GEN-LAST:event_cbSateActionPerformed

    private void cbBaksoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBaksoActionPerformed
        // TODO add your handling code here:
         if (cbBakso.isSelected() == true){
            tfBakso.setEditable(true);
            tfBakso.requestFocus();
        }
        else{
            tfBakso.setEditable (false);
            tfBakso.setText("");
            lblTHBakso.setText("0");
    }
    }//GEN-LAST:event_cbBaksoActionPerformed

    private void cbKopiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKopiActionPerformed
        // TODO add your handling code here:
         if (cbKopi.isSelected() == true){
            tfKopi.setEditable(true);
            tfKopi.requestFocus();
        }
        else{
            tfKopi.setEditable (false);
            tfKopi.setText("");
            lblTHKopi.setText("0");
    }
    }//GEN-LAST:event_cbKopiActionPerformed

    private void cbJusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJusActionPerformed
        // TODO add your handling code here:
         if (cbJus.isSelected() == true){
            tfJus.setEditable(true);
            tfJus.requestFocus();
        }
        else{
            tfJus.setEditable (false);
            tfJus.setText("");
            lblTHJus.setText("0");
    }
    }//GEN-LAST:event_cbJusActionPerformed

    private static void pesan_kosong (){
       JOptionPane.showMessageDialog(null, "Jumlah pesanan Soto belum dimasukkan", "Warning", JOptionPane.WARNING_MESSAGE);
    }
    
    private static void pesan_karakter (){
       JOptionPane.showMessageDialog(null, "Jumlah pesanan harus angka", "Warning", JOptionPane.WARNING_MESSAGE);
    }
    
    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        // TODO add your handling code here:
        int JmlSoto = 0,
            JmlRawon = 0,
            JmlSate = 0,
            JmlBakso = 0,
            JmlTeh = 0,
            JmlKopi = 0,
            JmlJus = 0,
            HrgSoto = 0,
            HrgRawon = 0,
            HrgSate = 0,
            HrgBakso = 0,
            HrgTeh = 0,
            HrgKopi = 0,
            HrgJus = 0,
            THrgSoto = 0, THrgRawon = 0, THrgSate = 0, THrgBakso = 0, THrgTeh = 0, THrgKopi = 0, THrgJus = 0, TJml, TBayar;
        
        if (cbSoto.isSelected() == false && cbRawon.isSelected() == false && cbSate.isSelected() == false && cbBakso.isSelected() == false && cbTeh.isSelected() == false && cbKopi.isSelected() == false && cbJus.isSelected() == false){
            JOptionPane.showMessageDialog(null, "Silakan Pesan", "Warning!!!", JOptionPane.WARNING_MESSAGE);
        }
        else{
            if(cbSoto.isSelected()== true){
                if (tfSoto.getText().length()== 0){
                pesan_kosong();
                tfSoto.requestFocus();
                    }
                else if (tfSoto.getText().matches("[1-9]")){
                JmlSoto = Integer.parseInt(tfSoto.getText());
                HrgSoto = 12000;
                THrgSoto = JmlSoto * HrgSoto;
                lblTHSoto.setText("Rp. " + THrgSoto + ",-");
                    }
                else {
                pesan_karakter();
                tfSoto.requestFocus();
                }
                }
            
            if(cbRawon.isSelected()== true){
                if (tfRawon.getText().length()== 0){
                pesan_kosong();
                tfRawon.requestFocus();
                    }
                else if (tfRawon.getText().matches("[1-9]")){
                JmlRawon = Integer.parseInt(tfRawon.getText());
                HrgRawon = 15000;
                THrgRawon = JmlRawon * HrgRawon;
                lblTHRawon.setText("Rp. " + THrgRawon + ",-");
                    }
                else {
                pesan_karakter();
                tfRawon.requestFocus();
                }
                }
            
            if(cbSate.isSelected()== true){
                if (tfSate.getText().length()== 0){
                pesan_kosong();
                tfSate.requestFocus();
                    }
                else if (tfSate.getText().matches("[1-9]")){
                JmlSate = Integer.parseInt(tfSate.getText());
                HrgSate = 13000;
                THrgSate = JmlSate * HrgSate;
                lblTHSate.setText("Rp. " + THrgSate + ",-");
                    }
                else {
                pesan_karakter();
                tfSate.requestFocus();
                }
                }
            
            if(cbBakso.isSelected()== true){
                if (tfBakso.getText().length()== 0){
                pesan_kosong();
                tfBakso.requestFocus();
                    }
                else if (tfBakso.getText().matches("[1-9]")){
                JmlBakso = Integer.parseInt(tfBakso.getText());
                HrgBakso = 10000;
                THrgBakso = JmlBakso * HrgBakso;
                lblTHBakso.setText("Rp. " + THrgBakso + ",-");
                    }
                else {
                pesan_karakter();
                tfBakso.requestFocus();
                }
                }
            
            if(cbTeh.isSelected()== true){
                if (tfTeh.getText().length()== 0){
                pesan_kosong();
                tfTeh.requestFocus();
                    }
                else if (tfTeh.getText().matches("[1-9]")){
                JmlTeh = Integer.parseInt(tfTeh.getText());
                HrgTeh = 3000;
                THrgTeh = JmlTeh * HrgTeh;
                lblTHTeh.setText("Rp. " + THrgTeh + ",-");
                    }
                else {
                pesan_karakter();
                tfTeh.requestFocus();
                }
                }
            
            if(cbKopi.isSelected()== true){
                if (tfKopi.getText().length()== 0){
                pesan_kosong();
                tfKopi.requestFocus();
                    }
                else if (tfKopi.getText().matches("[1-9]")){
                JmlKopi = Integer.parseInt(tfKopi.getText());
                HrgKopi = 5000;
                THrgKopi = JmlKopi * HrgKopi;
                lblTHKopi.setText("Rp. " + THrgKopi + ",-");
                    }
                else {
                pesan_karakter();
                tfKopi.requestFocus();
                }
                }
            
            if(cbJus.isSelected()== true){
                if (tfJus.getText().length()== 0){
                pesan_kosong();
                tfJus.requestFocus();
                    }
                else if (tfJus.getText().matches("[1-9]")){
                JmlJus = Integer.parseInt(tfJus.getText());
                HrgJus = 12000;
                THrgJus = JmlJus * HrgJus;
                lblTHJus.setText("Rp. " + THrgJus + ",-");
                    }
                else {
                pesan_karakter();
                tfJus.requestFocus();
                }
                }
            TJml = JmlSoto + JmlRawon + JmlSate + JmlBakso + JmlTeh + JmlKopi + JmlJus;
            TBayar = THrgSoto + THrgRawon + THrgSate + THrgBakso + THrgTeh + THrgKopi + THrgJus;
            lblTJ.setText("" + TJml + "Porsi");
            lblTH.setText("Rp. " + TBayar + ",-");
        }
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        tfSoto.setEditable(false);
        tfRawon.setEditable(false);
        tfSate.setEditable(false);
        tfBakso.setEditable(false);
        tfTeh.setEditable(false);
        tfKopi.setEditable(false);
        tfJus.setEditable(false);
        cbSoto.setSelected(false);
        cbRawon.setSelected(false);
        cbSate.setSelected(false);
        cbBakso.setSelected(false);
        cbTeh.setSelected(false);
        cbKopi.setSelected(false);
        cbJus.setSelected(false);
        tfSoto.setText("");
        tfRawon.setText("");
        tfSate.setText("");
        tfBakso.setText("");
        tfTeh.setText("");
        tfKopi.setText("");
        tfJus.setText("");
        lblTJ.setText("0 Porsi");
        lblTHSoto.setText("0");
        lblTHRawon.setText("0");
        lblTHSate.setText("0");
        lblTHBakso.setText("0");
        lblTHTeh.setText("0");
        lblTHKopi.setText("0");
        lblTHJus.setText("0");
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnKeuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeuarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnKeuarActionPerformed

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
            java.util.logging.Logger.getLogger(tess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeuar;
    private javax.swing.JButton btnReset;
    private javax.swing.JCheckBox cbBakso;
    private javax.swing.JCheckBox cbJus;
    private javax.swing.JCheckBox cbKopi;
    private javax.swing.JCheckBox cbRawon;
    private javax.swing.JCheckBox cbSate;
    private javax.swing.JCheckBox cbSoto;
    private javax.swing.JCheckBox cbTeh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblTH;
    private javax.swing.JLabel lblTHBakso;
    private javax.swing.JLabel lblTHJus;
    private javax.swing.JLabel lblTHKopi;
    private javax.swing.JLabel lblTHRawon;
    private javax.swing.JLabel lblTHSate;
    private javax.swing.JLabel lblTHSoto;
    private javax.swing.JLabel lblTHTeh;
    private javax.swing.JLabel lblTJ;
    private javax.swing.JTextField tfBakso;
    private javax.swing.JTextField tfJus;
    private javax.swing.JTextField tfKopi;
    private javax.swing.JTextField tfRawon;
    private javax.swing.JTextField tfSate;
    private javax.swing.JTextField tfSoto;
    private javax.swing.JTextField tfTeh;
    // End of variables declaration//GEN-END:variables
}
