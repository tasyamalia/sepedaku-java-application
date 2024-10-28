package sepedaku;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
//Tasya Amalia Salsabila
//JBBA - 2301968954
public class Database {
        private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost:8889/Sepedaku";
    private final String USER = "root";
    private final String PASS = "root";
    private Connection conn;
    private Statement stmt;
    
    public Database() {
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            stmt = conn.createStatement();
        } catch (Exception ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //Mendapatkan nama ukuran yang digunakan untuk mengisi data JComboBox
    public Vector getUkuran(){
        Vector temp = new Vector();
        temp.add("--Pilih--");
        try {
            String query = "SELECT nama_ukuran FROM ukuran";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                temp.add(rs.getString("nama_ukuran"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }
    
    //Mendapatkan harga berdasarkan nama ukuran yang dipilih
    public String getHargaByUkuran(String ukuran){
        String harga = "";
        try {
            String query = "SELECT `harga` FROM `ukuran` WHERE `nama_ukuran` = '"+ukuran+"'";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                harga = rs.getString("harga");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return harga;
    }
    
    //Mendapatkan semua data id_sepeda di database
    public Vector getSepedaID(){
        Vector temp = new Vector();
        try {
            String query = "SELECT id_sepeda FROM sepeda";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                temp.add(rs.getString("id_sepeda"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }
    
    //Validasi apakah id_sepeda yang telah dibuat sudah ada di database atau belum
    public Boolean validateSepedaID(String sepedaID){
        try {
            String query = "SELECT `id_sepeda` FROM `sepeda` WHERE `id_sepeda` = '"+sepedaID+"'";
            ResultSet rs = stmt.executeQuery(query);
            if(rs.next()){
                return false;
            }else{
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //Mendapatkan id_ukuran berdasarkan nama_ukuran yang telah dipilih dari JComboBox
    public int getIdUkuran(String ukuran){
        int id_ukuran = 0;
        try {
            String query = "SELECT `id_ukuran` FROM `ukuran` WHERE `nama_ukuran` = '"+ukuran+"'";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                id_ukuran = rs.getInt("id_ukuran");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id_ukuran;
    }
    
    //Melakukan insert data sepeda ke database
    public Boolean inputData(String id_sepeda, String nama_sepeda, int id_ukuran, int stock){
        try {
            String query = "INSERT INTO `sepeda` VALUES ("
                    + "'"+id_sepeda+"',"
                    + "'"+nama_sepeda+"',"
                    +id_ukuran+","
                    +stock+")";
            stmt.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //Mendapatkan semua data sepeda 
    public Vector getSepeda(){
        Vector temp = new Vector();
        try {
            String query = "SELECT sepeda.id_sepeda,sepeda.nama_sepeda,ukuran.nama_ukuran, ukuran.harga, sepeda.stok FROM `sepeda` INNER JOIN ukuran ON sepeda.id_ukuran=ukuran.id_ukuran ORDER BY sepeda.nama_sepeda ASC";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Vector data = new Vector();
                data.add(rs.getString("id_sepeda"));
                data.add(rs.getString("nama_sepeda"));
                data.add(rs.getString("nama_ukuran"));
                data.add(rs.getString("harga"));
                data.add(rs.getString("stok"));
                
                temp.add(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }
    
    //Mendapatkan data sepeda berdasarkan id_sepeda
    public Vector getSepedaByID(String id_sepeda){
        Vector temp = new Vector();
        try {
            String query = "SELECT sepeda.id_sepeda,sepeda.nama_sepeda,ukuran.nama_ukuran, ukuran.harga, sepeda.stok FROM `sepeda` INNER JOIN ukuran ON sepeda.id_ukuran=ukuran.id_ukuran WHERE sepeda.id_sepeda = '"+id_sepeda+"' ORDER BY sepeda.nama_sepeda ASC";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Vector data = new Vector();
                data.add(rs.getString("id_sepeda"));
                data.add(rs.getString("nama_sepeda"));
                data.add(rs.getString("nama_ukuran"));
                data.add(rs.getString("harga"));
                data.add(rs.getString("stok"));
                
                temp.add(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }
    
    //Melakukan update stok sepeda berdasarkan id_sepeda yang telah diinputkan
    public Boolean updateStok(String id_sepeda, int stok){
        try {
            String query = "UPDATE `sepeda` SET `stok`="+stok+" WHERE `id_sepeda`='"+id_sepeda+"'";
            stmt.executeUpdate(query);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //Melakukan insert data penjualan ke database
    public int inputPenjualan(String id_sepeda,String tanggal, int jumlah, double totalHarga){
        int id_penjualan =0;
        try {
            String query = "INSERT INTO `penjualan`(`id_sepeda`, `tanggal`, `qty`, `totalHarga`) VALUES ('"+id_sepeda+"','"+tanggal+"',"+jumlah+","+totalHarga+");";
            stmt.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()){
                id_penjualan=rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id_penjualan;
    }
    
    //Mendapatkan data penjualan 
    public Vector getPenjualan(int id_penjualan){
        Vector temp = new Vector();
        try {
            String query = "SELECT sepeda.id_sepeda,sepeda.nama_sepeda,penjualan.qty, ukuran.harga, penjualan.totalHarga FROM `penjualan` INNER JOIN sepeda ON sepeda.id_sepeda = penjualan.id_sepeda"
                    + " INNER JOIN ukuran ON sepeda.id_ukuran=ukuran.id_ukuran WHERE penjualan.id_penjualan = "+id_penjualan;
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                Vector data = new Vector();
                data.add(rs.getString("id_sepeda"));
                data.add(rs.getString("nama_sepeda"));
                data.add(rs.getString("qty"));
                data.add(rs.getString("harga"));
                data.add(rs.getString("totalHarga"));
                
                temp.add(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
        return temp;
    }
}
