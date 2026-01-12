// latihan meega88
import java.util.Scanner;

public class latihanMega {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaPekerja;
        int bilanganHariBekerjaSebulan = 0;
        double kadarPembayaranGaji = 180.00;
        double jumlahGaji;

        System.out.println("Masukkan Nama Pekerja: ");
        namaPekerja = input.nextLine();

        while (bilanganHariBekerjaSebulan < 1 || bilanganHariBekerjaSebulan > 31) {
            System.out.println("Masukkan hari bekerja sebulan (1-31): ");
            bilanganHariBekerjaSebulan = input.nextInt();

            if (bilanganHariBekerjaSebulan < 1 || bilanganHariBekerjaSebulan > 31) {
                System.out.println("Ralat! Bilangan hari mesti antara 1 hingga 31 sahaja.");
            }
        }

        jumlahGaji = bilanganHariBekerjaSebulan * kadarPembayaranGaji;

        System.out.println();
        System.out.println("SLIP GAJI MEGA INDUSTRIES SDN.BHD.");
        System.out.println("========================================");
        System.out.println("Nama Pekerja: " + namaPekerja);
        System.out.println("Bilangan Hari Bekerja: " + bilanganHariBekerjaSebulan);
        System.out.println("Kadar Gaji Sehari: RM180");
        System.out.println("Gaji Bulanan: RM" + jumlahGaji);
        System.out.println("========================================");
    }
}
