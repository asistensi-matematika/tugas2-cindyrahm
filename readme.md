# TUGAS 2 ASISTENSI ALPRO - Sabtu , 04 Mei 2019
NAMA:   Cindy Rahma Meilynda

NRP:    06111840000011


## DESKRIPSI SOAL
Buatlah suatu program dengan menggunakan GUI untuk mengaproksimasi nilai $f(x)$ dengan $n$ angka penting.
## UPLOAD 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class guii extends javax.swing.JFrame {

    /**
     * Creates new form guii
     */
    public guii() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        boxsoal = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        inputx = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputa = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nilaifx = new javax.swing.JTextField();
        tombolhitung = new javax.swing.JButton();
        tombolreset = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        labelsoal = new javax.swing.JLabel();
        labelsyarat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        boxsoal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Soal", "Soal 1", "Soal 2", "Soal 3" }));
        boxsoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihsoal(evt);
            }
        });

        jLabel1.setText("Masukkan nilai x");

        jLabel2.setText("Masukkan nilai a");

        jLabel3.setText("Masukkan nilai n");

        jLabel4.setText("Nilai f(x)");

        tombolhitung.setText("Hitung");
        tombolhitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitung(evt);
            }
        });

        tombolreset.setText("Reset");
        tombolreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Keterangan:\n- Nilai f(x) adalah aproksimasi dengan menggunakan deret Taylor dengan n angka penting.\n- Nilai a, n, x yang dimasukkan harus berupa angka. \n  Jika menyatakan angka desimal, gunakan tanda \".\" bukan \",\".");
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(boxsoal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(inputx)
                                    .addComponent(inputa)
                                    .addComponent(inputn)
                                    .addComponent(nilaifx, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(labelsyarat, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(tombolhitung)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                                    .addComponent(tombolreset))
                                .addComponent(labelsoal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(boxsoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputx)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputa)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputn)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(labelsoal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(labelsyarat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nilaifx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolhitung)
                    .addComponent(tombolreset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                .addContainerGap())
        );

        boxsoal.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>                        

    private void pilihsoal(java.awt.event.ActionEvent evt) {                           
        // TODO add your handling code here:
        switch(boxsoal.getSelectedIndex())
        {
            case 1:
                labelsoal.setText("ln(-x)");
                labelsyarat.setText("Syarat: a <0, n bilangan bulat positif, x <0");
                inputa.setText("");
                inputx.setText("");
                inputn.setText("");
                nilaifx.setText("");
                break;
                
            
        }
    }                          

    private void hitung(java.awt.event.ActionEvent evt) {                        
        // TODO add your handling code here:
        double a = Double.parseDouble(inputa.getText());
        double n = Double.parseDouble(inputn.getText());
        double x = Double.parseDouble(inputx.getText());
        
        switch(boxsoal.getSelectedIndex())
        {
            
            case 1:
                nilaifx.setText(String.valueOf(HasilSoal1(a, n, x)));
                break;
        }
    }                       

    private void reset(java.awt.event.ActionEvent evt) {                       
        // TODO add your handling code here:
        inputa.setText("");
        inputx.setText("");
        inputn.setText("");
        nilaifx.setText("");
    }                      

    public static double HasilSoal1(double a, double n, double x){
        double[] f = new double[10001];
        f[0] = Math.log(-a);
        double Fungsi=0;
        double es = 0.5 * Math.pow(10, 2-n);
        for(int i=1; i<=10000; i++){
            f[i]=f[i-1] + (Math.pow(-1,i+1)*Math.pow(x-a, i))/(i*Math.pow(a,i));
            double ea = ((f[i]-f[i-1])/f[i])*100;
            if(Math.abs(ea)<es){
                Fungsi += f[i];
                System.out.println(i);
                break;
            }
        }
        double Output = Math.floor(Fungsi*10000)/10000;
        return Output;
    
    }

    
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
            java.util.logging.Logger.getLogger(guii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guii.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guii().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> boxsoal;
    private javax.swing.JTextField inputa;
    private javax.swing.JTextField inputn;
    private javax.swing.JTextField inputx;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelsoal;
    private javax.swing.JLabel labelsyarat;
    private javax.swing.JTextField nilaifx;
    private javax.swing.JButton tombolhitung;
    private javax.swing.JButton tombolreset;
    // End of variables declaration                   
}


