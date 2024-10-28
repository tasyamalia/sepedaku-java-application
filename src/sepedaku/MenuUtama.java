package sepedaku;
import java.awt.Color;
//Tasya Amalia Salsabila
//JBBA - 2301968954
public class MenuUtama extends javax.swing.JFrame {

    private Database db;
    public MenuUtama() {
        initComponents();
        this.db = new Database();
        statusAction();
        getContentPane().setBackground(Color.WHITE); 
    }

    //•	Input harus merupakan angka dari 1 sampai 4. (2)
    public void ActionMenu(String menu){
        switch(menu){
            case "1":
                TambahSepeda ts = new TambahSepeda(db);
                ts.setVisible(true);
                dispose();
                break;
            case "2":
                StockSepeda ss = new StockSepeda(db);
                ss.setVisible(true);
                dispose();
                break;
            case "3":
                PenjualanSepeda ps = new PenjualanSepeda(db);
                ps.setVisible(true);
                dispose();
                break;
            case "4":
                //Jika memilih menu 4: keluar dari program
                dispose();
                break;
            default:
                statusAction("Masukkan angka dari 1-4");
        }
    }
    
    public void statusAction(){
      lblStatus.setText("");
      lblStatus.setVisible(false);
    }
    public void statusAction(String status){
      lblStatus.setText(status);
      lblStatus.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfMenuUtama = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Apple Braille", 0, 18)); // NOI18N
        jLabel1.setText("Toko Sepedaku");

        jLabel2.setText("Menu Utama");

        jLabel3.setText("1. Tambah Sepeda");

        jLabel4.setText("2. Lihat Stok Sepeda ");

        jLabel5.setText("3. Penjualan Sepeda");

        jLabel6.setText("4. Keluar");

        jLabel7.setText("Silakan Masukkan Angka dari Menu yang Anda Pilih :");

        tfMenuUtama.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        tfMenuUtama.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfMenuUtama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMenuUtamaActionPerformed(evt);
            }
        });

        btnOK.setBackground(new java.awt.Color(51, 153, 255));
        btnOK.setText("OK");
        btnOK.setBorderPainted(false);
        btnOK.setOpaque(true);
        btnOK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOKMouseClicked(evt);
            }
        });

        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(84, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(162, 162, 162))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tfMenuUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblStatus)
                        .addGap(155, 155, 155))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(tfMenuUtama, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStatus)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfMenuUtamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMenuUtamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMenuUtamaActionPerformed

    private void btnOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOKMouseClicked
        // TODO add your handling code here:
        ActionMenu(tfMenuUtama.getText());
    }//GEN-LAST:event_btnOKMouseClicked


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField tfMenuUtama;
    // End of variables declaration//GEN-END:variables
}
