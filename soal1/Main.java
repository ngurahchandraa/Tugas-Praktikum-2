package soal1;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<Buku> Book = new ArrayList<>();

        Book.add(new Buku("01" , "PBO" , "2018" , 50000 , 90));
        Book.add(new Buku("02" , "PBW" , "2019" , 75000 , 85));
        Book.add(new Buku("03" , "IJK" , "2020" , 100000 , 95));

        Book.get(1).setjudulBuku("DPL");
        Book.get(1).settahunTerbit("2017");
        Book.get(1).setharga(80000);
        Book.get(1).setrating(92);

        //Book.remove(0);

        System.out.println("Menampilkan salah satu buku");
        for(Buku book:Book){
            book.searchisbn("02");
        }

        System.out.println("Menampilkan semua buku");
        for (Buku book:Book){
            System.out.println(book);
        }
    }
}
