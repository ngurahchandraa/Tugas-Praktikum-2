package soal1;

public class Buku {
    private String isbn;
    private String judulBuku;
    private String tahunTerbit;
    private int harga;
    private float rating;

    public Buku(String isbn, String judulBuku, String tahunTerbit, int harga, float rating) {
        this.isbn = isbn;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.harga = harga;
        this.rating = rating;
    }

    public String getisbn() {
        return isbn;
    }

    public String getjudulBuku() {
        return judulBuku;
    }

    public void setjudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }
    public String gettahunTerbit(){
        return tahunTerbit;
    }
    public void settahunTerbit(String tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }
    public int getharga(){
        return harga;
    }
    public void setharga(int harga) {
        this.harga = harga;
    }
    public float getrating(){
        return rating;
    }
    public void setrating(float rating) {
        this.rating = rating;
    }
    public void searchisbn(String isbn) {
       if (this.isbn.equalsIgnoreCase(isbn)){
           System.out.println(isbn+" "+judulBuku+" "+tahunTerbit+" "+harga+" "+rating);
       }
    }
    @Override
    public String toString(){
        return isbn+" "+judulBuku+" "+tahunTerbit+" "+harga+" "+rating;
    }
}
