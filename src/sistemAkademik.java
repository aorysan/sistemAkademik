/**
 * sistemAkademik
 */
package src;

import java.util.Scanner;
public class sistemAkademik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            double nMat, nIpa, nBin, nUHMat, nUHIpa, nUHBin, nUMat, nUIpa, nUBin, bMat = 3, bIpa = 3, bBin = 3;
            double jmlPenilaian = 3;
            double rataRata, indeksPrestasi, nAIpa, nAMat, nABin; //int ganti ke double karena input nilai bisa berupa pecahan
            char nilaiHuruf;
                
        System.out.println("Nilai Tugas Matematika : ");
            nMat = sc.nextDouble();
        System.out.println("Nilai Tugas IPA : ");
            nIpa = sc.nextDouble();
        System.out.println("Nilai Tugas Bahasa Indonesia : ");
            nBin = sc.nextDouble();

        System.out.println("Nilai Ulangan Harian Matematika : ");
            nUHMat = sc.nextDouble();
        System.out.println("Nilai Ulangan Harian IPA : ");
            nUHIpa = sc.nextDouble();
        System.out.println("Nilai Ulangan Harian Bahasa Indonesia: ");
            nUHBin = sc.nextDouble();

        System.out.println("Nilai Ujian Matematika : ");
            nUMat = sc.nextDouble();
        System.out.println("Nilai Ujian IPA");
            nUIpa = sc.nextDouble();
        System.out.println("Nilai Ujian Bahasa Indonesia");
            nUBin = sc.nextDouble();

        nAIpa = (nIpa + nUHIpa + nUIpa)*bIpa;
        nABin = (nBin + nUHBin + nUBin)*bBin;
        nAMat = (nMat + nUHMat + nUMat)*bMat;

        System.out.println("Hasil Nilai Akhir IPA : " + nAIpa);
        System.out.println("Hasil Nilai Akhir Bahasa Indonesia : " + nABin);
        System.out.println("Hasil Nilai Akhir Matematika : " + nAMat);

        indeksPrestasi = (nAMat+nAIpa+nABin)/((bMat+bIpa+bBin)*10);
        System.out.println("Indeks Prestasi siswa : " + indeksPrestasi);
        
        rataRata = (nAMat+nAIpa+nABin)/(3*10);
        System.out.println("Nilai rata-rata siswa : " + rataRata);

        nAIpa = (nIpa + nUHIpa + nUIpa)/jmlPenilaian*bIpa; //cari rata-rata nilai mapel dulu (dibagi 3), lalu kali beban mapel = nilai akhir mapel
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

        indeksPrestasi = (nAMat+nAIpa+nABin)/(bMat+bIpa+bBin);
            System.out.println("Indeks Prestasi siswa : " + indeksPrestasi);
        
        double ipDalamPersen = indeksPrestasi * 25;
            System.out.println("IP dalam bentuk persen : " + ipDalamPersen); 

        rataRata = (nAMat+nAIpa+nABin)/(3);
            System.out.println("Nilai rata-rata siswa : " + rataRata);
        
        sc.close();
        
    }
}