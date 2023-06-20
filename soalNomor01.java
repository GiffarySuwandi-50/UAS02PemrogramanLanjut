import java.util.Scanner;

public class soalNomor01 {
    public static void main(String[] args) {
        //Buatlah kode program Java yang menerima sebuah input berupa angka,
        //kemudian memeriksa apakah angka tersebut adalah angka kelipatan 5 atau tidak (poin 25).

        Scanner ketik = new Scanner(System.in); 
        System.out.print("Masukkan angka kelipatan 5 :"); int angkaMasuk = ketik.nextInt();

        if (angkaMasuk % 5 == 0){
            System.out.println("Bilangan " + angkaMasuk +  " adalah kelipatan 5.");
        } else if (angkaMasuk % 5 != 0){
            System.out.println("Bukan bilangan kelipatan 5.");
        }
    }
}

