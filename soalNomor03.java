import java.util.Scanner;

public class soalNomor03 {
    public static void main(String[] args) {
        //Buatlah kode program Java yang menerima 10 input berupa angka, kemudian hitung
        //banyak angka yang kelipatan 5 di antara 10 angka yang diinput (poin 40).

        Scanner masuk = new Scanner(System.in);
        int kelipatan5 = 0; int bukankelipatan5 = 0; int panjangAngka = 10;

        for (int i = 1; i <= panjangAngka; i++) {
            System.out.print("Angka ke-" + i + ": "); int angka = masuk.nextInt();
            if (angka % 5 == 0) {
                kelipatan5++;
            } else if (angka % 5 !=0){
                bukankelipatan5++;
            }
        }
        System.out.print("Ada " + kelipatan5 + " angka dari " + panjangAngka + " buah angka yang berkelipatan 5," + 
        " sementara ada " + bukankelipatan5 + " angka dari " + panjangAngka + " buah angka yang bukan kelipatan 5.");
    }
}
