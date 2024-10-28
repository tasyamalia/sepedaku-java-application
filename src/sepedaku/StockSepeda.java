package sepedaku;
import java.awt.Color;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

//Tasya Amalia Salsabila
//JBBA - 2301968954
public class StockSepeda extends javax.swing.JFrame {
    private Database db;
    private DefaultTableModel dtm;
    public StockSepeda() {
        initComponents();
        
    }
    public StockSepeda(Database db){
        initComponents();
        this.db = db;
        refreshData();
        getContentPane().setBackground(Color.WHITE); 
    }
    public void refreshData(){
        Vector header = new Vector();
        header.add("ID");
        header.add("Nama Sepeda");
        header.add("Ukuran");
        header.add("Harga");
        header.add("Stok");
        //Jika ada data, maka tampilkanlah daftar sepeda dan urutkanlah berdasarkan
        //Nama Sepeda secara ascending
        Vector dtSepeda = db.getSepeda();
        dtm = new DefaultTableModel(dtSepeda, header);
        tableStock.setModel(dtm);
        //Jika tidak ada data, maka tampilkanlah pesan kesalahan. (5)
        if(dtSepeda.size()==0){
            scrollPanel.setVisible(false);
            lblStockEmpty.setVisible(true);
        }else{
            scrollPanel.setVisible(true);
            lblStockEmpty.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblStockEmpty = new javax.swing.JLabel();
        scrollPanel = new javax.swing.JScrollPane();
        tableStock = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Apple Braille", 0, 18)); // NOI18N
        jLabel1.setText("Lihat Stok Sepeda");

        lblStockEmpty.setText("Tidak Ada Data");

        tableStock.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollPanel.setViewportView(tableStock);

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnBack)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(lblStockEmpty))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblStockEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnBack)))
                .addGap(30, 30, 30)
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        // TODO add your handling code here:
        MenuUtama mu = new MenuUtama();
        mu.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StockSepeda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblStockEmpty;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTable tableStock;
    // End of variables declaration//GEN-END:variables
}
