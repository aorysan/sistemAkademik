import java.util.Scanner;

public class testfolder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] user = {"admin", "userA", "userB"};
        String pass[] = {"admin", "passA", "passB"};
        String username;
        String password;

        int jmlKelas = 3;
        int jmlSiswaPerKelas = 5;
        String[][] dataKelas = new String[3][5];

        System.out.println("\n\n###################################################");
        System.out.println("#                                                 #");
        System.out.println("#   SELAMAT DATANG DI SISTEM INFORMASI AKADEMIK   #");
        System.out.println("#                                                 #");
        System.out.println("###################################################\n");

        boolean loginSuccess = false;

        do {
            System.out.print("Masukkan username : ");
            username = sc.nextLine();
            System.out.print("Masukkan password : ");
            password = sc.nextLine();

            for (int i = 0; i < user.length; i++) {
                if (username.equals(user[i]) && pass[i].equals(password)) {
                    System.out.println("\nAnda berhasil login");
                    loginSuccess = true;
                    break;
                }
            }

            if (!loginSuccess) {
                System.out.println("\nUsername atau Password yang Anda masukkan salah!");
                System.out.println("Silahkan mencoba kembali\n");
            }

        } while (!loginSuccess);

        for (int kelas = 0; kelas < jmlKelas; kelas++){
            System.out.println("Kelas " + (kelas + 1));
            for (int siswa = 0; siswa < jmlSiswaPerKelas; siswa++){
               System.out.println("Nama siswa ke-" + (siswa + 1) + ": ");
               String nama = sc.next();
               dataKelas[kelas][siswa] = nama;

            }
        }
        for (int kelas = 0; kelas < jmlKelas; kelas++){
            System.out.println("Kelas " + (kelas + 1));
            for (int siswa = 0; siswa < jmlSiswaPerKelas; siswa++){
                String nama = dataKelas[kelas][siswa];
                System.out.println("Nama siswa ke- " + (siswa + 1) + nama);
            }
        }
        sc.close();
    }
}