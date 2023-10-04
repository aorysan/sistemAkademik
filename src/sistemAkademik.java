/**
 * sistemAkademik
 */
import java.util.Scanner;
public class sistemAkademik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String userA = "admin", passA = "admin", user, pass;
            double nMat, nIpa, nBin, nUHMat, nUHIpa, nUHBin, nUMat, nUIpa, nUBin, bMat = 3, bIpa = 3, bBin = 3;
            double jmlPenilaian = 3; //jml penilaian tiap mapel saja (skrng cuma ada tugas, UH, sm ujian)
            double rataRata, indeksPrestasi, nAIpa, nAMat, nABin; //int ganti ke double karena input nilai bisa berupa pecahan
                
            System.out.println("\n\n#########################################");
            System.out.println("    Selamat Datang di Sistem Akademik    ");
            System.out.println("#########################################\n");

            System.out.println("Masukkan username : ");
            user = sc.nextLine();
            System.out.println("\nMasukkan password : ");
            pass = sc.nextLine();
    
            if (user.equals(userA) && pass.equals(passA)){
                System.out.println("Login berhasil\n");
            } else {
                System.out.println("username atau password salah\n");
            }
            
        System.out.println("Masukkan jumlah kehadiran siswa dalam 1 semester : ");
            double presensi = sc.nextDouble();

        System.out.println("\nNilai Tugas Matematika : ");
            nMat = sc.nextDouble();
        System.out.println("Nilai Ulangan Harian Matematika : ");
            nUHMat = sc.nextDouble();
        System.out.println("Nilai Ujian Matematika : ");
            nUMat = sc.nextDouble();
            nAMat = (nMat + nUHMat + nUMat)/jmlPenilaian*bMat;
        System.out.println("Hasil Nilai Akhir Matematika : " + nAMat);
            if (nAMat<75) {
                System.out.println("Remidi");
            } else {
                System.out.println("Tidak Remidi");
            }

        System.out.println("\nNilai Tugas IPA : ");
            nIpa = sc.nextDouble();
        System.out.println("Nilai Ulangan Harian IPA : ");
            nUHIpa = sc.nextDouble();  
        System.out.println("Nilai Ujian IPA");
            nUIpa = sc.nextDouble();
            nAIpa = (nIpa + nUHIpa + nUIpa)/jmlPenilaian*bIpa;
        System.out.println("Hasil Nilai Akhir IPA : " + nAIpa);
            if (nAIpa<75) {
                System.out.println("Remidi");
            } else {
                System.out.println("Tidak Remidi");
            }

        System.out.println("\nNilai Tugas Bahasa Indonesia : ");
            nBin = sc.nextDouble();
        System.out.println("Nilai Ulangan Harian Bahasa Indonesia: ");
            nUHBin = sc.nextDouble();
        System.out.println("Nilai Ujian Bahasa Indonesia");
            nUBin = sc.nextDouble();
            nABin = (nBin + nUHBin + nUBin)/jmlPenilaian*bBin;
        System.out.println("Hasil Nilai Akhir Bahasa Indonesia : " + nABin);
            if (nABin<75) {
                System.out.println("Remidi");
            } else {
                System.out.println("Tidak Remidi");
            }
        
        double jmlPresensi = (presensi/132)*1;
            System.out.println("Persentase kehadiran siswa dalam 1 semester : "+ (jmlPresensi*100)+" %");

        indeksPrestasi = (nAMat+nAIpa+nABin)/(225);
            System.out.println("\nIndeks Prestasi siswa : " + indeksPrestasi);

        rataRata = (nAMat+nAIpa+nABin)/(3);
            System.out.println("Nilai rata-rata siswa : " + rataRata);

        if(indeksPrestasi>=3.0) {
            if(jmlPresensi>=0.7) {
                System.out.println("\nSiswa memnuhi syarat untuk naik kelas");
            } else {
                System.out.println("\nSiswa tidak memenuhi syarat untuk naik kelas");
            }
        } else {
            System.out.println("\nSiswa tidak memenuhi syarat untuk naik kelas");
        }

        sc.close();
    }
}