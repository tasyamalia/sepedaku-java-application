package sepedaku;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

//Tasya Amalia Salsabila
//JBBA - 2301968954
public class PenjualanSepeda extends javax.swing.JFrame {

    private Database db;
    private DefaultTableModel dtm;
    public PenjualanSepeda() {
        initComponents();
    }
    public PenjualanSepeda(Database db){
        initComponents();
        this.db = db;
        refreshData(db.getSepeda());
        plSearch.setVisible(false);
        getContentPane().setBackground(Color.WHITE); 
    }
    public void refreshData(Vector dtSpd){
        Vector header = new Vector();
        header.add("ID");
        header.add("Nama Sepeda");
        header.add("Ukuran");
        header.add("Harga");
        header.add("Stok");
        //Tampilkanlah daftar sepeda dan urutkanlah berdasarkan Nama Sepeda
        //secara ascending
        Vector dtSepeda = dtSpd;
        dtm = new DefaultTableModel(dtSepeda, header);
        tableData.setModel(dtm);
        //Jika tidak ada data, maka tampilkanlah pesan kesalahan. (5)
        if(dtSepeda.size()==0){
            scrollPanel.setVisible(false);
            statusAction("Tidak Ada Data");
            jLabel2.setVisible(false);
            tfCari.setVisible(false);
            btnCari.setVisible(false);
        }else{
            scrollPanel.setVisible(true);
            statusAction();
            jLabel2.setVisible(true);
            tfCari.setVisible(true);
            btnCari.setVisible(true);
        }
    }
    public void statusAction(){
      lblEmpty.setText("");
      lblEmpty.setVisible(false);
    }
    public void statusAction(String status){
      lblEmpty.setText(status);
      lblEmpty.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfCari = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnCari = new javax.swing.JButton();
        scrollPanel = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        lblEmpty = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        plSearch = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfJumlahJual = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Apple Braille", 0, 18)); // NOI18N
        jLabel1.setText("Penjualan Sepeda");

        jLabel2.setText("Masukkan ID Sepeda");

        btnCari.setBackground(new java.awt.Color(51, 153, 255));
        btnCari.setText("Cari");
        btnCari.setBorderPainted(false);
        btnCari.setOpaque(true);
        btnCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariMouseClicked(evt);
            }
        });

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollPanel.setViewportView(tableData);

        lblEmpty.setText("Tidak Ada Data");

        btnBack.setBackground(new java.awt.Color(199, 224, 250));
        btnBack.setText("Kembali");
        btnBack.setBorderPainted(false);
        btnBack.setOpaque(true);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        jLabel4.setText("Jumlah yang dijual");

        btnUpdate.setBackground(new java.awt.Color(153, 204, 255));
        btnUpdate.setText("Jual");
        btnUpdate.setBorderPainted(false);
        btnUpdate.setOpaque(true);
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout plSearchLayout = new javax.swing.GroupLayout(plSearch);
        plSearch.setLayout(plSearchLayout);
        plSearchLayout.setHorizontalGroup(
            plSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plSearchLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(tfJumlahJual, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        plSearchLayout.setVerticalGroup(
            plSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(plSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(plSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfJumlahJual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnBack)
                        .addGap(64, 64, 64)
                        .addComponent(lblEmpty))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(plSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmpty)
                    .addComponent(btnBack))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(plSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseClicked
        // TODO add your handling code here:
        //Masukkanlah ID sepeda yang mau dijual
        switch(tfCari.getText()){
            case "0":
                //Jika ID sepeda diisi angka 0, maka kembali ke menu utama
                MenuUtama mu = new MenuUtama();
                mu.setVisible(true);
                dispose();
                break;
            default:
                Vector data = db.getSepedaByID(tfCari.getText());
                refreshData(data);
                //Jika ID sepeda yang dimasukkan tidak ditemukan, maka tampilkanlah 
                //pesan kesalahan dan program meminta untuk memasukkan ulang ID sepeda. 
                if(data.size()==0){
                    lblEmpty.setText("Silahkan memasukkan ulang ID Sepeda");
                    plSearch.setVisible(false);
                }else{
                    plSearch.setVisible(true);
                }  
        }


        
    }//GEN-LAST:event_btnCariMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
        MenuUtama mu = new MenuUtama();
        mu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked
        // TODO add your handling code here:
        //Jika ID sepeda yang dimasukkan ada, maka kurangilah stok sepeda tersebut
        int stok =Integer.parseInt((String) tableData.getValueAt(0, 4));
        int jumlahBeli = Integer.parseInt(tfJumlahJual.getText());
        if(tfJumlahJual.getText() != ""){
            if(jumlahBeli>stok){
                statusAction("Jumlah yang dijual melebihi stok");
            }else{
                int sisaStok = stok - jumlahBeli;
                if(db.updateStok(tableData.getValueAt(0, 0).toString(), sisaStok)){
                    statusAction();
                    String hargaByUkuran = db.getHargaByUkuran(tableData.getValueAt(0, 2).toString());
                    double totalHarga = jumlahBeli * Double.parseDouble(hargaByUkuran);
                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
                    Date date = new Date();  
                    int id_penjualan = db.inputPenjualan(tableData.getValueAt(0, 0).toString(),formatter.format(date), jumlahBeli, totalHarga);
                    //tampilkanlah nota penjualan sederhana
                    NotaPenjualan np = new NotaPenjualan(id_penjualan,db);
                    np.setVisible(true);
                    dispose();
                    
                }
            }
            
        }
    }//GEN-LAST:event_btnUpdateMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenjualanSepeda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblEmpty;
    private javax.swing.JPanel plSearch;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTable tableData;
    private javax.swing.JTextField tfCari;
    private javax.swing.JTextField tfJumlahJual;
    // End of variables declaration//GEN-END:variables
}
