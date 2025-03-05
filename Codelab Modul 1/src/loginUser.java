import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int pinAdmin = 409;
        int InputPin;
        String NamaMahasiswa = "Alexander";
        String InputNama;
        int NIM = 391;
        int InputNIM;
        int pilihan;
        Scanner Input = new Scanner(System.in);

        System.out.println("Pilih login: ");
        System.out.println("1. Admin Login");
        System.out.println("2. Login Mahasiswa");
        System.out.println("Masukkan Pilihan: ");

        if (Input.hasNextInt()) {
            pilihan = Input.nextInt();
            Input.nextLine(); // Clear the buffer

            if (pilihan == 1) {
                System.out.print("Masukkan PIN Admin: ");
                if (Input.hasNextInt()) {
                    InputPin = Input.nextInt();
                    if (pinAdmin == InputPin) {
                        System.out.println("Login Admin Berhasil!\nHalo MIN!!");
                    } else {
                        System.out.println("Pin admin salah");
                    }
                } else {
                    System.out.println("Input PIN tidak valid");
                }
            } else if (pilihan == 2) {
                System.out.print("Masukkan Nama Mahasiswa: ");
                InputNama = Input.nextLine();
                System.out.print("Masukkan NIM: ");
                if (Input.hasNextInt()) {
                    InputNIM = Input.nextInt();
                    if (InputNama.equals(NamaMahasiswa) && (InputNIM == NIM)) {
                        System.out.println("Login Mahasiswa Berhasil");
                    } else {
                        System.out.println("NIM atau Nama Mahasiswa Salah");
                    }
                } else {
                    System.out.println("Input NIM tidak valid");
                }
            } else {
                System.out.print("Input Anda Salah");
            }
        } else {
            System.out.println("Input pilihan tidak valid");
        }

        Input.close();
    }
}