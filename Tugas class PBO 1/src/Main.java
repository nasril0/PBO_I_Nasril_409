import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pinAdmin = 1234;
        int InputPin;
        String NamaMahasiswa = "Bambang Icikiwir";
        String InputNama;
        int NIM = 391;
        int InputNIM;
        int pilihan;
        Scanner Input = new Scanner(System.in);
        System.out.println("Pilih login: ");
        System.out.println("1. Admin Login");
        System.out.println("2. Login Mahasiswa");
        System.out.print("Masukkan Pilihan: ");
        pilihan = Input.nextInt();
        Input.nextLine();
        if (pilihan == 1){
            System.out.print("Masukkan PIN Admin: ");
            InputPin =Input.nextInt();
            if(pinAdmin == InputPin){
                System.out.println("Login Admin Berhasil!\n" +
                        "Halo MIN!!");
            }else{
                System.out.println("Pin admin salah");
            }
        }else if (pilihan == 2) {
            System.out.print("Masukkan Nama Mahasiswa: ");
            InputNama = Input.nextLine();
            System.out.print("Masukkan NIM: ");
            InputNIM = Input.nextInt();
            if(InputNama.equals(NamaMahasiswa) && (InputNIM == NIM)){
                System.out.println("Login Mahasiswa Berhasil");
            }else{
                System.out.println("NIM atau Nama Mahasiswa Salah");
            }
        }else{
            System.out.print("Input Anda Salah");
        }
        Input.close();
    }
}