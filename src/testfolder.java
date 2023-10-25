import java.util.Scanner;

public class testfolder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] user = {"userA", "userB", "userC"};
        String[] pass = {"passA", "passB", "passC"};
        String username;
        String password;

        System.out.println("\n\n###################################################");
        System.out.println("    Selamat Datang di Sistem Informasi Akademik    ");
        System.out.println("###################################################\n");

        boolean loginSuccess = false;

        do {
            System.out.println("Masukkan username : ");
            username = sc.nextLine();
            System.out.println("Masukkan password : ");
            password = sc.nextLine();

            for (int i = 0; i < user.length; i++) {
                if (user[i].equals(username) && pass[i].equals(password)) {
                    loginSuccess = true;
                    System.out.println("\nAnda berhasil login");
                    break;
                }
            }

            if (!loginSuccess) {
                System.out.println("\nUsername atau Password yang Anda masukkan salah!");
                System.out.println("Silahkan mencoba kembali\n");
            }

        } while (!loginSuccess);
    }
}