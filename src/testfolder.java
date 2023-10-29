import java.util.Scanner;

public class testfolder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] user = {"admin", "userA", "userB"};
        String pass[] = {"admin", "passA", "passB"};
        String username;
        String password;

        System.out.println("\n\n###################################################");
        System.out.println("    Selamat Datang di Sistem Informasi Akademik    ");
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
        sc.close();
    }
}