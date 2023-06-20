import java.util.Scanner;

public class soalNomor04 {
    public static void main(String[] args) {
        //Buatlah kode program Java yang menerima 10 input berupa teks, kemudian hitung
        //banyak teks yang panjangnya 5 karakter di antara 10 teks yang diinput (poin 40). 

        Scanner masuk = new Scanner(System.in);
        int kurangatauLebihLimaKarakter = 0; int limaKarakter  = 0; int panjangTeks = 10;

        for (int i = 1; i <= panjangTeks; i++) {
            System.out.print("Masukkan teks ke-" + i + ": "); String teksMasuk = masuk.nextLine();

            if (teksMasuk.length() == 5) {
                limaKarakter++;
            } else if (teksMasuk.length() != 5){
                kurangatauLebihLimaKarakter++;
            }
        }
        System.out.println("Ada " + limaKarakter + "teks yang panjangnya 5 karakter, " + kurangatauLebihLimaKarakter + " teks yang kurang/lebih dari 5 karakter.");  
    }
}
