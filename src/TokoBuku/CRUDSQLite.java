/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoBuku;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.util.ArrayList;
/**
 *
 * @author Aji N. Rohman
 */
public class CRUDSQLite implements CRUDInterface{
    private Connection conn;
    
    @Override
    public void bukaKoneksi() throws ClassNotFoundException, SQLException {
       Class.forName ("org.sqlite.JDBC");
       conn = DriverManager.getConnection("jdbc:sqlite:tokobuku.db");
    }

    @Override
    public void tutupKoneksi() throws SQLException {
        conn.close();
    }

    @Override
    public ArrayList<TokoBuku> read() throws SQLException {
        Statement stat = conn.createStatement();
        ResultSet rs = stat.executeQuery("select * from buku");
        ArrayList<TokoBuku> listTokoBuku = new ArrayList();
        while (rs.next()){
            TokoBuku ba = new TokoBuku();
            ba.setId(rs.getInt(1));
            ba.setJudul(rs.getString(2));
            ba.setKategori(rs.getString(3));
            ba.setPengarang(rs.getString(4));
            ba.setPenerbit(rs.getString(5));
            ba.setTahun(rs.getString(6));
            ba.setIsbn(rs.getString(7));
            ba.setHarga(rs.getString(8));
            ba.setJml_hal(rs.getString(9));
            ba.setTerbitan(rs.getString(10));            
        }
        return listTokoBuku;
    }

    @Override
    public TokoBuku readById(int id) throws SQLException {
        String query = "select * from buku where id = ?";
        PreparedStatement ps = conn.prepareStatement(query);  
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        TokoBuku ba = new TokoBuku();
        while (rs.next()) {            
            ba.setId(rs.getInt(1));
            ba.setJudul(rs.getString(2));
            ba.setKategori(rs.getString(3));
            ba.setPengarang(rs.getString(4));
            ba.setPenerbit(rs.getString(5));
            ba.setTahun(rs.getString(6));
            ba.setIsbn(rs.getString(7));
            ba.setHarga(rs.getString(8));
            ba.setJml_hal(rs.getString(9));
            ba.setTerbitan(rs.getString(10));
        }
        return ba;
    }

    @Override
    public void create(TokoBuku ba) throws SQLException {
        String query = "insert into buku(judul,kategori,pengarang,penerbit,tahun,isbn,harga,jml_hal,terbitan) values(?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, ba.getJudul());
        ps.setString(2, ba.getKategori());
        ps.setString(3, ba.getPengarang());
        ps.setString(4, ba.getPenerbit());
        ps.setString(5, ba.getTahun());
        ps.setString(6, ba.getIsbn());
        ps.setString(7, ba.getHarga());
        ps.setString(8, ba.getJml_hal());
        ps.setString(9, ba.getTerbitan());
        ps.execute();
    }

    @Override
    public void delete(TokoBuku ba) throws SQLException {
        String query = "delete from buku where id=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, ba.getId());
        ps.execute();
    }

    @Override
    public void update(TokoBuku ba) throws SQLException {
        String query = "update buku set judul=?, kategori=?,pengarang=?,penerbit=?,tahun=?,isbn=?,harga=?,jml_hal=?,terbitan=? where id=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setString(1, ba.getJudul());
        ps.setString(2, ba.getKategori());
        ps.setString(3, ba.getPengarang());
        ps.setString(4, ba.getPenerbit());
        ps.setString(5, ba.getTahun());
        ps.setString(6, ba.getIsbn());
        ps.setString(7, ba.getHarga());
        ps.setString(8, ba.getJml_hal());
        ps.setString(9, ba.getTerbitan());
        ps.setInt(10, ba.getId());
        ps.execute();
    }

    
}
