/**
 * sistemAkademik
 */
import java.util.Scanner;
public class sistemAkademik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            double nMat, nIpa, nBin, nUHMat, nUHIpa, nUHBin, nUMat, nUIpa, nUBin, bMat = 3, bIpa = 3, bBin = 3;
            double proporsiTugas = 0.4, proporsiUH = 0.25, proporsiU = 0.35; //proporsi setiap tugas/penilaian
            double rataRata, indeksPrestasi, nAIpa, nAMat, nABin; //int ganti ke double karena input nilai bisa berupa pecahan
            String[] user = {"admin", "userA", "userB"};
            String pass[] = {"admin", "passA", "passB"};
            String username;
            String password;
            String kelas;
            String nama = "";
            String a1[] = {"murid1a1", "murid1a2", "murid1a3", "murid1a4", "murid1a5"};
            String a2[] = {"murid2a1", "murid2a2", "murid2a3", "murid2a4", "murid2a5"};
            String a3[] = {"murid3a1", "murid3a2", "murid3a3", "murid3a4", "murid3a5"};
            String b1[] = {"murid1b1", "murid1b2", "murid1b3", "murid1b4", "murid1b5"};
            String b2[] = {"murid2b1", "murid2b2", "murid2b3", "murid2b4", "murid2b5"};
            String b3[] = {"murid3b1", "murid3b2", "murid3b3", "murid3b4", "murid3b5"};
            String c1[] = {"murid1c1", "murid1c2", "murid1c3", "murid1c4", "murid1c5"};
            String c2[] = {"murid2c1", "murid2c2", "murid2c3", "murid2c4", "murid2c5"};
            String c3[] = {"murid3c1", "murid3c2", "murid3c3", "murid3c4", "murid3c5"};

        System.out.println("\n\n#######################################################");
        System.out.println("#                                                     #");
        System.out.println("#     SELAMAT DATANG DI SISTEM INFORMASI AKADEMIK     #");
        System.out.println("#                                                     #");
        System.out.println("#######################################################\n");

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

        System.out.println("\n\n###################################################################");
        System.out.println("     Selamat datang di Sistem Informasi Akademik SMAN x Malang     ");
        System.out.println("###################################################################\n");

        System.out.println("Berikut kelas yang ada di sekolah ini :");
        System.out.println("1A    2A    3A\n\n1B    2B    3B\n\n1C    2C    3C");
        System.out.print("Silahkan pilih kelas : ");
        kelas = sc.nextLine();

        switch (kelas) {
            case "1A":
            for (int i = 0; i < a1.length; i++) {
                System.out.println(a1[i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "a1[0]":
                nama = a1[0];
                System.out.println(a1[0]);
                break;
                case "a1[1]":
                nama = a1[1];
                System.out.println(a1[1]);
                break;
                case "a1[2]":
                nama = a1[2];
                System.out.println(a1[2]);
                break;
                case "a1[3]":
                nama = a1[3];
                System.out.println(a1[3]);
                break;
                case "a1[4]":
                nama = a1[4];
                System.out.println(a1[4]);
                break;
            case "1B":
            for (int i = 0; i < b1.length; i++) {
                System.out.println(b1[i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "b1[0]":
                nama = b1[0];
                System.out.println(b1[0]);
                break;
                case "b1[1]":
                nama = b1[1];
                System.out.println(b1[1]);
                break;
                case "b1[2]":
                nama = b1[2];
                System.out.println(b1[2]);
                break;
                case "b1[3]":
                nama = b1[3];
                System.out.println(b1[3]);
                break;
                case "b1[4]":
                nama = b1[4];
                System.out.println(b1[4]);
                break;
            case "1C":
            for (int i = 0; i < c1.length; i++) {
                System.out.println(c1[i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "c1[0]":
                nama = c1[0];
                System.out.println(a2[0]);
                break;
                case "c1[1]":
                nama = c1[1];
                System.out.println(a2[1]);
                break;
                case "c1[2]":
                nama = c1[2];
                System.out.println(a2[2]);
                break;
                case "c1[3]":
                nama = c1[3];
                System.out.println(a2[3]);
                break;
                case "c1[4]":
                nama = c1[4];
                System.out.println(a2[4]);
                break;
            case "2A":
            for (int i = 0; i < a2.length; i++) {
                System.out.println(a2[i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "a2[0]":
                nama = a2[0];
                System.out.println(a2[0]);
                break;
                case "a2[1]":
                nama = a2[1];
                System.out.println(a2[1]);
                break;
                case "a2[2]":
                nama = a2[2];
                System.out.println(a2[2]);
                break;
                case "a2[3]":
                nama = a2[3];
                System.out.println(a2[3]);
                break;
                case "a2[4]":
                nama = a2[4];
                System.out.println(a2[4]);
                break;
            case "2B":
            for (int i = 0; i < b2.length; i++) {
                System.out.println(b2[i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "b2[0]":
                nama = b2[0];
                System.out.println(b2[0]);
                break;
                case "b2[1]":
                nama = b2[1];
                System.out.println(b2[1]);
                break;
                case "b2[2]":
                nama = b2[2];
                System.out.println(b2[2]);
                break;
                case "b2[3]":
                nama = b2[3];
                System.out.println(b2[3]);
                break;
                case "b2[4]":
                nama = b2[4];
                System.out.println(b2[4]);
                break;
            case "2C":
            for (int i = 0; i < c2.length; i++) {
                System.out.println(c2[i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "c2[0]":
                nama = c2[0];
                System.out.println(c2[0]);
                break;
                case "c2[1]":
                nama = c2[1];
                System.out.println(c2[1]);
                break;
                case "c2[2]":
                nama = c2[2];
                System.out.println(c2[2]);
                break;
                case "c2[3]":
                nama = c2[3];
                System.out.println(c2[3]);
                break;
                case "c2[4]":
                nama = c2[4];
                System.out.println(c2[4]);
                break;
            case "3A":
            for (int i = 0; i < a3.length; i++) {
                System.out.println(a3[i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "a3[0]":
                nama = a3[0];
                System.out.println(a3[0]);
                break;
                case "a3[1]":
                nama = a3[1];
                System.out.println(a3[1]);
                break;
                case "a3[2]":
                nama = a3[2];
                System.out.println(a3[2]);
                break;
                case "a3[3]":
                nama = a3[3];
                System.out.println(a3[3]);
                break;
                case "a3[4]":
                nama = a3[4];
                System.out.println(a3[4]);
                break;
            case "3B":
            for (int i = 0; i < b3.length; i++) {
                System.out.println(c2[i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "b3[0]":
                nama = b3[0];
                System.out.println(b3[0]);
                break;
                case "b3[1]":
                nama = b3[1];
                System.out.println(b3[1]);
                break;
                case "b3[2]":
                nama = b3[2];
                System.out.println(b3[2]);
                break;
                case "b3[3]":
                nama = b3[3];
                System.out.println(b3[3]);
                break;
                case "b3[4]":
                nama = b3[4];
                System.out.println(b3[4]);
                break;
            case "3C":
            for (int i = 0; i < c3.length; i++) {
                System.out.println(c3[i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "c3[0]":
                nama = c3[0];
                System.out.println(c3[0]);
                break;
                case "c3[1]":
                nama = c3[1];
                System.out.println(c3[1]);
                break;
                case "c3[2]":
                nama = c3[2];
                System.out.println(c3[2]);
                break;
                case "c3[3]":
                nama = c3[3];
                System.out.println(c3[3]);
                break;
                case "c3[4]":
                nama = c3[4];
                System.out.println(c3[4]);
                break;
        }

        System.out.println("Masukkan jumlah kehadiran siswa dalam satu semester (maksimal 132 hari) : ");
        double presensi;
        presensi = sc.nextDouble();
        
        do {
           if (presensi > 132) {
                System.out.println("\nAnda memasukkan jumlah yang tidak valid.\nSilakan coba lagi.");
                System.out.println("\nMasukkan jumlah kehadiran siswa dalam satu semester (maksimal 132 hari) : ");
            }
        } while (presensi > 132);
        
        System.out.println("\nNilai Tugas Matematika : ");
        do {
            nMat = sc.nextDouble();
            if (nMat < 0 || nMat > 100) {
            System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
            System.out.println("\nNilai Tugas Matematika : ");
            }
        } while (nMat < 0 || nMat > 100);
        
        System.out.println("\nNilai Ulangan Harian Matematika : ");
       do {
            nUHMat = sc.nextDouble();
            if (nUHMat < 0 || nUHMat > 100) {
            System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
            System.out.println("\nNilai Ulangan Harian Matematika : ");
            }
        } while (nUHMat < 0 || nUHMat > 100);
        
        System.out.println("\nNilai Ujian Matematika : ");
       do {
            nUMat = sc.nextDouble();
            if (nUMat < 0 || nUMat > 100) {
            System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
            System.out.println("Nilai Ujian Matematika : ");
            }
       } while (nUMat < 0 || nUMat > 100);
        
            nAMat = (nMat*proporsiTugas+nUMat*proporsiU+nUHMat*proporsiUH)*bMat;
        System.out.println("Hasil Nilai Akhir Matematika : " + nAMat);
            if (nAMat<75) {
                System.out.println("Remedi.");
            } else {
                System.out.println("Tidak Remedi.");
            }

        System.out.println("\nNilai Tugas IPA : ");
        do {
            nIpa = sc.nextDouble();
            if (nIpa < 0 || nIpa > 100) {
            System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
            System.out.println("\nNilai Tugas IPA : ");
            }
        } while (nIpa < 0 || nIpa > 100);
        
        System.out.println("\nNilai Ulangan Harian IPA : ");
        do {
            nUHIpa = sc.nextDouble();  
            if (nUHIpa < 0 || nUHIpa > 100) {
            System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
            System.out.println("Nilai Ulangan Harian IPA : ");
            }
        } while (nUHIpa < 0 || nUHIpa > 100);
        
        System.out.println("\nNilai Ujian IPA : ");
        do {
            nUIpa = sc.nextDouble();
            if (nUIpa < 0 || nUIpa > 100){
            System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
            System.out.println("Nilai Ujian IPA");
            }
        } while (nUIpa < 0 || nUIpa > 100);
       
            nAIpa = (nIpa*proporsiTugas+nUIpa*proporsiU+nUHIpa*proporsiUH)*bIpa;
        System.out.println("Hasil Nilai Akhir IPA : " + nAIpa);
            if (nAIpa<75) {
                System.out.println("Remedi.");
            } else {
                System.out.println("Tidak Remedi.");
            }

        System.out.println("\nNilai Tugas Bahasa Indonesia : ");
        do {
            nBin = sc.nextDouble();
            if (nBin < 0 || nBin > 100) {
            System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
            System.out.println("\nNilai Tugas Bahasa Indonesia : ");
            }
        } while (nBin < 0 || nBin > 100);
        
        System.out.println("\nNilai Ulangan Harian Bahasa Indonesia : ");
        do {
            nUHBin = sc.nextDouble();
            if (nUHBin < 0 || nUHBin > 100) {
            System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
            System.out.println("Nilai Ulangan Harian Bahasa Indonesia: ");
            }
        } while (nUHBin < 0 || nUHBin > 100);
        
        System.out.println("\nNilai Ujian Bahasa Indonesia : ");
        do {
            nUBin = sc.nextDouble();
            if (nUBin < 0 || nUBin > 100){
            System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
            System.out.println("Nilai Ujian Bahasa Indonesia");
            }
        } while (nUBin < 0 || nUBin > 100);
        
            nABin = (nBin*proporsiTugas+nUBin*proporsiU+nUHBin*proporsiUH)*bBin;
        System.out.println("Hasil Nilai Akhir Bahasa Indonesia : " + nABin);
            if (nABin<75) {
                System.out.println("Remedi.");
            } else {
                System.out.println("Tidak Remedi.");
            }
            
        System.out.println("Siswa "+nama);
        
        double jmlPresensi = (presensi/132)*100;
            System.out.printf("Persentase kehadiran siswa dalam 1 semester : %.1f", jmlPresensi);

        indeksPrestasi = (nAMat+nAIpa+nABin)/((bMat+bIpa+bBin)*25);
            System.out.println("\nIndeks Prestasi siswa : " + indeksPrestasi);

        rataRata = (nAMat+nAIpa+nABin)/(3);
            System.out.println("Nilai rata-rata siswa : " + rataRata);


        if(indeksPrestasi>=3.0) {
            if(jmlPresensi>=0.7) {
                System.out.println("\nSiswa memnuhi syarat untuk naik kelas.");
            } else {
                System.out.println("\nSiswa tidak memenuhi syarat untuk naik kelas.");
            }
        } else {
            System.out.println("\nSiswa tidak memenuhi syarat untuk naik kelas.");
        }

        sc.close();
    }
}
