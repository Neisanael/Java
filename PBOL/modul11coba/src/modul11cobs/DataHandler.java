package modul11cobs;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import oracle.jdbc.pool.OracleDataSource;

public class DataHandler {

    // string alamat nomor IP silahkan dig anti dengan ‘localhost’ atau IP server 
    // yang digunakan; demikian juga userid dan password nya. Silahkan diganti
    // denken yang digunakan sebenarnya
    String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
    String userid = "hr";
    String password = "MHS215314043";

    Connection conn;
    Statement stmt;
    ResultSet rset;
    Statement stmt2;
    ResultSet rset2;
    String query;
    String query2;
    ArrayList<StockBarang> arraySimpan = new ArrayList<>();
    ArrayList<PenjualanData> arraySimpan2 = new ArrayList<>();

    public DataHandler() {
    }

    public void getDBConnection() {
        try {
            OracleDataSource ds;
            ds = new OracleDataSource();
            ds.setURL(jdbcUrl);
            conn = ds.getConnection(userid, password);
            JOptionPane.showMessageDialog(null, "Bisa Terkoneksi");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Tidak bisa Terkoneksi/Salah Password User");
        }
    }

    public void close() {
        try {
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Tidak bisa tutup koneksi");
        }
    }

    public ArrayList getAllStockBarang() throws SQLException {
        stmt = conn.createStatement();
        query = "select kode, nama, harga_jual, harga_beli, jumlah from stock_barang";
        System.out.println("\nExecuting query: " + query);
        rset = stmt.executeQuery(query);
        while (rset.next()) {
            arraySimpan.add(new StockBarang(rset.getInt("KODE"), rset.getString("NAMA"), rset.getDouble("HARGA_JUAL"), rset.getDouble("HARGA_BELI"), rset.getInt("JUMLAH")));
        }
        return arraySimpan;
    }

    public void setAllStockBarang(int kode, String nama, double harga_jual, double harga_beli, double jumlah) throws SQLException {
        stmt = conn.createStatement();
        query = "insert into stock_barang (kode, nama, harga_jual, harga_beli, jumlah) values (" + kode + ", '" + nama + "', " + harga_jual + ", " + harga_beli + ", " + jumlah + ")";
        System.out.println("\nExecuting query: " + query);
        rset = stmt.executeQuery(query);
    }

    public void setAllPenjualan(int kode, int jumlah_stock, int jumlah_beli, String nama, double harga) throws SQLException {
        stmt2 = conn.createStatement();
        query2 = "insert into penjualan (nama, harga, jumlah_stock, jumlah_beli, kode) values ('" + nama + "', " + harga + ", " + jumlah_stock + ", " + jumlah_beli + ", " + kode + ")";
        System.out.println("\nExecuting query: " + query2);
        rset2 = stmt2.executeQuery(query2);
    }

    public ArrayList getAllPenjualan() throws SQLException {
        stmt2 = conn.createStatement();
        query2 = "select nama, harga, jumlah_stock, jumlah_beli, kode from penjualan";
        System.out.println("\nExecuting query: " + query2);
        rset2 = stmt2.executeQuery(query2);
        while (rset2.next()) {
            arraySimpan2.add(new PenjualanData(rset2.getInt("KODE"), rset2.getInt("JUMLAH_STOCK"), rset2.getInt("JUMLAH_BELI"), rset2.getString("NAMA"), rset2.getDouble("HARGA")));
        }
        return arraySimpan2;
    }

    public void setUpdateStockBarang(int stock_barang, int kode) throws SQLException {
        stmt2 = conn.createStatement();
        query2 = "update stock_barang  set jumlah = " + stock_barang + "where kode = " + kode;
        System.out.println("\nExecuting query: " + query2);
        rset2 = stmt2.executeQuery(query2);
    }

    public StockBarang searchCode(int kode) throws SQLException {
        stmt2 = conn.createStatement();
        StockBarang pndt = null;
        query2 = "select kode, nama, harga_jual, harga_beli, jumlah from stock_barang where kode = " + kode;
        System.out.println("\nExecuting query: " + query2);
        rset2 = stmt2.executeQuery(query2);
        while (rset2.next()){
            pndt = new StockBarang(rset2.getInt("KODE"), rset2.getString("NAMA"), rset2.getDouble("HARGA_JUAL"), rset2.getDouble("HARGA_BELI"), rset2.getInt("JUMLAH"));  
        }
        return pndt;
    }

    public static void main(String[] args) throws SQLException {
        DataHandler dh = new DataHandler();
        dh.getDBConnection();
        int n = dh.getAllPenjualan().size();
        for (int i = 0; i < n; i++) {
            System.out.println(((PenjualanData) dh.getAllPenjualan().get(i)).getNama());
        }
    }
}
