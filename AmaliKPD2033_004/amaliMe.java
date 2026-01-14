// AMALI 
import java.util.Scanner;

public class amaliMe {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaPekerja;
        int bilanganHariBekerjaSebulan = 0;
        int kadarPembayaranGaji = 160;
        int jumlahGaji;

        System.out.println("Masukkan Nama: ");
        namaPekerja = input.nextLine();

        while (bilanganHariBekerjaSebulan < 1 || bilanganHariBekerjaSebulan > 31) {
            System.out.println("Masukkan bilangan hari bekerja: ");
            bilanganHariBekerjaSebulan = input.nextInt();

            if (bilanganHariBekerjaSebulan < 1 || bilanganHariBekerjaSebulan > 31) {
                System.out.println("Bilangan hari tidak boleh melebihi 31 hari");
            }
        }

        jumlahGaji = bilanganHariBekerjaSebulan * kadarPembayaranGaji;

        System.out.println();
        System.out.println("Masukkan nama: " + namaPekerja);
		System.out.println("Rumusan gaji bulanan bagi " + namaPekerja);
        System.out.println("Bilangan Hari Bekerja " + bilanganHariBekerjaSebulan);
        System.out.println("GAJI SEBULAN ADALAH " + jumlahGaji);
    }
}