package sistemAkademik;

/**
 * sistemAkademik
 */
import java.util.Scanner;
public class sistemAkademik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            double nMat, nIpa, nBing, nBin, nUHMat, nUHIpa, nUHBing, nUHBin, nUMat, nUIpa, nUBing, nUBin, bMat = 3, bIpa = 3, bBing = 3, bBin = 3;
            double jmlPenilaian = 3;
            double rataRata, indeksPrestasi, nAIpa, nAMat, nABin, nABing; //int ganti ke double karena input nilai bisa berupa pecahan
                
        System.out.println("Nilai Tugas Matematika : ");
            nMat = sc.nextDouble();
        System.out.println("Nilai Tugas IPA : ");
            nIpa = sc.nextDouble();
        System.out.println("Nilai Tugas Bahasa Inggris : ");
            nBing = sc.nextDouble();
        System.out.println("Nilai Tugas Bahasa Indonesia : ");
            nBin = sc.nextDouble();
        System.out.println("Nilai Ulangan Harian Matematika : ");
            nUHMat = sc.nextDouble();
        System.out.println("Nilai Ulangan Harian IPA : ");
            nUHIpa = sc.nextDouble();
        System.out.println("Nilai Ulangan Harian Bahasa Inggris: ");
            nUHBing = sc.nextDouble();
        System.out.println("Nilai Ulangan Harian Bahasa Indonesia: ");
            nUHBin = sc.nextDouble();
        System.out.println("Nilai Ujian Matematika : ");
            nUMat = sc.nextDouble();
        System.out.println("Nilai Ujian IPA");
            nUIpa = sc.nextDouble();
        System.out.println("Nilai Ujian Bahasa Inggris");
            nUBing = sc.nextDouble();
        System.out.println("Nilai Ujian Bahasa Indonesia");
            nUBin = sc.nextDouble();

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

        nAIpa = (nIpa + nUHIpa + nUIpa)/jmlPenilaian*bIpa; //cari rata-rata nilai mapel dulu (dibagi 3), lalu kali beban mapel = nilai akhir mapel
        nABing = (nBing + nUHBing + nUBing)/jmlPenilaian*bBing;
        nABin = (nBin + nUHBin + nUBin)/jmlPenilaian*bBin;
        nAMat = (nMat + nUHMat + nUMat)/jmlPenilaian*bMat;

            System.out.println("Hasil Nilai Akhir IPA : " + nAIpa);
                if (nAIpa>80) {
                    System.out.println("IPA : A");
                } else if (nAIpa>=65) {
                    System.out.println("IPA : B");
                } else if (nAIpa>=50) {
                    System.out.println("IPA : C");
                } else {
                    System.out.println("IPA : D");
                }
            System.out.println("Hasil Nilai Akhir Bahasa Inggris : " + nABing);
                if (nABing>80) {
                    System.out.println("BAHASA INGGRIS : A");
                } else if (nABing>=65) {
                    System.out.println("BAHASA INGGRIS : B");
                } else if (nABing>=50) {
                    System.out.println("BAHASA INGGRIS : C");
                } else {
                    System.out.println("BAHASA INGGRIS : D");
                }
            System.out.println("Hasil Nilai Akhir Bahasa Indonesia : " + nABin);
                if (nABin>80) {
                    System.out.println("BAHASA INDONESIA : A");
                } else if (nABin>=65) {
                    System.out.println("BAHASA INDONESIA : B");
                } else if (nABin>=50) {
                    System.out.println("BAHASA INDONESIA : C");
                } else {
                    System.out.println("BAHASA INDONESIA : D");
                }
            System.out.println("Hasil Nilai Akhir Matematika : " + nAMat);
                if (nAMat>80) {
                    System.out.println("MATEMATIKA : A");
                } else if (nAMat>=65) {
                    System.out.println("MATEMATIKA : B");
                } else if (nAMat>=50) {
                    System.out.println("MATEMATIKA : C");
                } else {
                    System.out.println("MATEMATIKA : D");
                }
        indeksPrestasi = (nAMat+nAIpa+nABin+nABing)/(bMat+bIpa+bBin+bBing);
            System.out.println("Indeks Prestasi siswa : " + indeksPrestasi);
        
        double ipDalamPersen = indeksPrestasi * 25;
            System.out.println("IP dalam bentuk persen : " + ipDalamPersen); 

        rataRata = (nAMat+nAIpa+nABin+nABing)/(4);
            System.out.println("Nilai rata-rata siswa : " + rataRata);
        
        sc.close();
    }
}