package sistemAkademik;
/**
 * sistemAkademik
 */
import java.util.Scanner;
public class sistemAkademik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int nMat, nIpa, nBing, nBin, nUHMat, nUHIpa, nUHBing, nUHBin, nUMat, nUIpa, nUBing, nUBin, bMat, bIpa, bBing, bBin;
            double rataRata, indeksPrestasi, nAMat, nAIpa, nABing, nABin;
            char nilaiHuruf;
                bMat  = 4;
                bIpa = 4;
                bBing = 3;
                bBin = 3;
                
                
        System.out.println("Nilai Tugas Matematika : ");
            nMat = sc.nextInt();
        System.out.println("Nilai Tugas IPA : ");
            nIpa = sc.nextInt();
        System.out.println("Nilai Tugas Bahasa Inggris : ");
            nBing = sc.nextInt();
        System.out.println("Nilai Tugas Bahasa Indonesia : ");
            nBin = sc.nextInt();
        System.out.println("Nilai Ulangan Harian Matematika : ");
            nUHMat = sc.nextInt();
        System.out.println("Nilai Ulangan Harian IPA : ");
            nUHIpa = sc.nextInt();
        System.out.println("Nilai Ulangan Harian Bahasa Inggris: ");
            nUHBing = sc.nextInt();
        System.out.println("Nilai Ulangan Harian Bahasa Indonesia: ");
            nUHBin = sc.nextInt();
        System.out.println("Nilai Ujian Matematika : ");
            nUMat = sc.nextInt();
        System.out.println("Nilai Ujian IPA");
            nUIpa = sc.nextInt();
        System.out.println("Nilai Ujian Bahasa Inggris");
            nUBing = sc.nextInt();
        System.out.println("Nilai Ujian Bahasa Indonesia");
            nUBin = sc.nextInt();


        nAIpa = (nIpa + nUHIpa + nUIpa)*bIpa;
        nABing = (nBing + nUHBing + nUBing)*bBing;
        nABin = (nBin + nUHBin + nUBin)*bBin;
        nAMat = (nMat + nUHMat + nUMat)*bMat;
            System.out.println("Hasil Nilai Akhir IPA : " + nAIpa);
            System.out.println("Hasil Nilai Akhir Bahasa Inggris : " + nABing);
            System.out.println("Hasil Nilai Akhir Bahasa Indonesia : " + nABin);
            System.out.println("Hasil Nilai Akhir Matematika : " + nAMat);
        indeksPrestasi = (nAMat+nAIpa+nABin+nABing)/((bMat+bIpa+bBin+bBing)*10);
            System.out.println("Indeks Prestasi siswa : " + indeksPrestasi);
        rataRata = (nAMat+nAIpa+nABin+nABing)/(4*10);
            System.out.println("Nilai rata-rata siswa : " + rataRata);

        
        sc.close();
    }
}