/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoBuku;
    import java.sql.SQLException;
    import java.util.ArrayList;

/**
 *
 * @author Aji N. Rohman
 */
public interface CRUDInterface {
    public void bukaKoneksi() throws ClassNotFoundException, SQLException;
    public void tutupKoneksi() throws SQLException;
    public ArrayList<TokoBuku> read() throws SQLException;
    public TokoBuku readById (int id) throws SQLException;
    public void create(TokoBuku ba) throws SQLException;
    public void delete(TokoBuku ba) throws SQLException;
    public void update(TokoBuku ba) throws SQLException;
}
