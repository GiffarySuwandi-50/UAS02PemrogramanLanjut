import java.util.Scanner;

public class soalNomor02 {
    public static void main(String[] args) {
        //Buatlah kode program Java yang menerima sebuah input berupa teks, kemudian
        //memeriksa apakah panjang teks tersebut adalah 5 karakter atau tidak (poin 25).

        Scanner ketikan = new Scanner(System.in); 
        System.out.println("Masukkan teks berupa 'String'. (contoh: Anak) ");
        System.out.print("Teks akan diidentifikasi apakah panjangnya 5 karakter atau tidak: "); String teksMasukan = ketikan.nextLine();
        System.out.println("Kalimat yang dimasukkan adalah " + teksMasukan + " dan panjangnya adalah "  + teksMasukan.length());
        if (teksMasukan.length() == 5){
            System.out.println("------------------------------------");
            System.out.println("Teks sepanjang 5 karakter. [BENAR]");
        } 
        else if (teksMasukan.length() < 5){
            System.out.println("------------------------------------");
            System.out.println("Panjang teks kurang dari 5 karakter. [SALAH]");
        } 
        else if (teksMasukan.length() > 5){
            System.out.println("------------------------------------");
            System.out.println("Panjang teks lebih dari 5 karakter. [SALAH]");
        }
    }
}
