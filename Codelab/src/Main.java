import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner objInput = new Scanner(System.in);
        String nama;
        String jenisKelamin;
        int tahunLahir;
        int tahunSekarang = LocalDate.now().getYear();

        System.out.print("Masukkan nama: ");
        nama = objInput.nextLine();n
        System.out.print("Masukkan jenis kelamin (l/p): ");
        jenisKelamin = objInput.nextLine();
        if (jenisKelamin.equalsIgnoreCase("l") || jenisKelamin.equalsIgnoreCase("p")) {
            System.out.print("Masukkan tahun lahir: ");
            tahunLahir = objInput.nextInt();
            int umur = tahunSekarang - tahunLahir;

            System.out.println("\n=== Data diri ===");
            System.out.println("Nama          : " + nama);
            switch (jenisKelamin) {
                case "l":
                    System.out.println("Jenis kelamin : laki-laki");
                    break;
                case "p":
                    System.out.println("Jenis kelamin : perempuan");
                    break;
                default:
                    break;
            }
            System.out.println("Umur          : " + umur + " tahun");
        }else {
            System.out.println("jenis kelamin invalid.");
        }
    }
}