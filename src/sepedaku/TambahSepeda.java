package sepedaku;
import java.awt.Color;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

//Tasya Amalia Salsabila
//JBBA - 2301968954
public class TambahSepeda extends javax.swing.JFrame {
private Database db;
private DefaultComboBoxModel dcbm;

private StringBuffer namaSepeda;
private String id_ukuran;
private String id_sepeda;
private String stock;
    public TambahSepeda() {
        initComponents();
    }
    
    public TambahSepeda(Database db){
        initComponents();
        this.db = db;
        this.dcbm = new DefaultComboBoxModel(db.getUkuran());
        cbUkuran.setModel(dcbm);
        statusAction();
        getContentPane().setBackground(Color.WHITE);
    }

    public Boolean validateIdSepeda(Vector dataID,String sepedaID){
        for(int i=0;i<dataID.size();i++){
            if(dataID.get(i)== sepedaID){
                return false;
            }else{
                return true;
            }
        }
        return true;
    }
    public String randomID(StringBuffer randomID){
        String result = "";
        randomID.substring(0,2);
        for(int i = 0;i<3;i++){
            Random rand = new Random(); 
            int value = rand.nextInt(8); 
            randomID.append(value);
         }  
        return result;
    }
    public void statusAction(){
      lblStatus.setText("");
    }
    public void statusAction(String status){
      lblStatus.setText(status);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfNamaSepeda = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblHarga = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblSepedaID = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfStock = new javax.swing.JTextField();
        btnSimpan = new javax.swing.JButton();
        cbUkuran = new javax.swing.JComboBox<>();
        lblSepeda = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Apple Braille", 0, 18)); // NOI18N
        jLabel1.setText("Tambah Sepeda");

        jLabel2.setText("Nama Sepeda");

        jLabel3.setText("Ukuran");

        jLabel4.setText("Harga");

        lblHarga.setText("-");

        jLabel6.setText("ID");

        lblSepedaID.setText("-");

        jLabel8.setText("Stok");

        btnSimpan.setBackground(new java.awt.Color(51, 153, 255));
        btnSimpan.setText("Simpan");
        btnSimpan.setBorderPainted(false);
        btnSimpan.setOpaque(true);
        btnSimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSimpanMouseClicked(evt);
            }
        });

        cbUkuran.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbUkuran.setToolTipText("");
        cbUkuran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUkuranActionPerformed(evt);
            }
        });

        lblSepeda.setText("Sepeda");

        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("jLabel5");

        btnBack.setBackground(new java.awt.Color(199, 224, 250));
        btnBack.setText("Kembali");
        btnBack.setBorderPainted(false);
        btnBack.setOpaque(true);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSepedaID, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfStock, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbUkuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(lblSepeda)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNamaSepeda, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(70, 70, 70))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnSimpan)
                            .addContainerGap()))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnBack)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(lblStatus)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNamaSepeda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(lblSepeda))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbUkuran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblHarga))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblSepedaID))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(lblStatus)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbUkuranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUkuranActionPerformed
        // TODO add your handling code here:
        //Masukkanlah Ukuran. Ukuran sepeda harus “Kecil”, “Sedang”, atau “Besar”. (case sensitive). (5)
        //Ukuran saya buat dengan JComboBox dengan menampilkan pilihan “Kecil”, “Sedang”, atau “Besar”
        NumberFormat formatNumb = NumberFormat.getCurrencyInstance();
        if(cbUkuran.getSelectedIndex() > 0 ){
            String ukuran = cbUkuran.getSelectedItem().toString();
            
            //Setelah itu tampilkan harga sepeda berdasarkan ukurannya. (5)
            String harga = db.getHargaByUkuran(ukuran);
            lblHarga.setText(formatNumb.format(Double.parseDouble(harga)));
 
            //Lalu buatlah ID dengan aturan sebagai berikut: (5)
            StringBuffer rndmID = new StringBuffer("B");
	    rndmID.append(ukuran.charAt(0));
            String sepedaID ="";
            sepedaID = randomID(rndmID);
            while(validateIdSepeda(db.getSepedaID(),sepedaID) == false){
                sepedaID = "";
                sepedaID = randomID(rndmID);
            }
            
            lblSepedaID.setText(rndmID.toString());
            id_ukuran = ukuran;
            id_sepeda = rndmID.toString();
        }else{
            lblHarga.setText("-");
            lblSepedaID.setText("-");
            id_sepeda = "";
        }
    }//GEN-LAST:event_cbUkuranActionPerformed

    private void btnSimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSimpanMouseClicked
        // TODO add your handling code here:
        namaSepeda = new StringBuffer("Sepeda ");
        namaSepeda.append(tfNamaSepeda.getText());
        
        //Kemudian masukkanlah jumlah stok sepeda. (5)
        stock = tfStock.getText();
        int new_id_ukuran = db.getIdUkuran(id_ukuran);
        if(namaSepeda.toString() != "" && id_sepeda != "" && stock != ""){
            //Masukkanlah Nama Sepeda. Nama sepeda harus 10-25 karakter dan diawali dengan “Sepeda”. 
            if(namaSepeda.length()>9 && namaSepeda.length()<26){
                statusAction();
                //Lalu simpan dan kembali ke menu utama
                if(db.inputData(id_sepeda, namaSepeda.toString(), new_id_ukuran,Integer.parseInt(stock))){
                    statusAction("");
                    MenuUtama mu = new MenuUtama();
                    mu.setVisible(true);
                    dispose();
                }else{
                    statusAction("Data gagal tersimpan");
                }
            }else{
                statusAction("Nama sepeda harus 10-25 karakter ");
            }
        }else{
            statusAction("Lengkapi data");
        }
        
          
    }//GEN-LAST:event_btnSimpanMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
        MenuUtama mu = new MenuUtama();
        mu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahSepeda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbUkuran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblHarga;
    private javax.swing.JLabel lblSepeda;
    private javax.swing.JLabel lblSepedaID;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JTextField tfNamaSepeda;
    private javax.swing.JTextField tfStock;
    // End of variables declaration//GEN-END:variables
}
