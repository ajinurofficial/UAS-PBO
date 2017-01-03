/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokoBuku;

/**
 *
 * @author Aji N. Rohman
 */
public class TokoBuku {
    private int id;
    private String judul;
    private String kategori;
    private String pengarang;
    private String penerbit;
    private String tahun;
    private String isbn;
    private String harga;
    private String jml_hal;
    private String terbitan;

    public TokoBuku(int id, String judul, String kategori, String pengarang, String penerbit, String tahun, String isbn, String harga, String jml_hal, String terbitan) {
        this.id = id;
        this.judul = judul;
        this.kategori = kategori;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
        this.isbn = isbn;
        this.harga = harga;
        this.jml_hal = jml_hal;
        this.terbitan = terbitan;
    }

    TokoBuku() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJml_hal() {
        return jml_hal;
    }

    public void setJml_hal(String jml_hal) {
        this.jml_hal = jml_hal;
    }

    public String getTerbitan() {
        return terbitan;
    }

    public void setTerbitan(String terbitan) {
        this.terbitan = terbitan;
    }
    

    
}
