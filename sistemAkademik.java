package sistemAkademik;

/**
 * sistemAkademik
 */
import java.util.Scanner;
public class sistemAkademik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String maPel;
            int nilaiTugas, nilaiUlanganHarian, nilaiTengah;
            double rataRata, nilaiAkhir, indeksPrestasi;
            char nilaiHuruf;

        System.out.println("Masukkan Mata Pelajaran :");
        maPel = sc.next();
        System.out.println("Masukkan Nilai Tugas :");
        nilaiTugas = sc.nextInt();
        System.out.println("Masukkan Nilai Ulangan Harian :");
        nilaiUlanganHarian = sc.nextInt();
        System.out.println("Masukkan Nilai Ujian Tengah Semester");
    }
}