package testing;
import java.util.Scanner;
public class tesInputNilaiArray2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] nilaiMat = new double[4][];
            nilaiMat[0] = new double[4];
            nilaiMat[1] = new double[2];
            nilaiMat[2] = new double[1];
            nilaiMat[3] = new double[1];
        double rata_nilaiTugas, jml_nilaiTugas=0, rata_nilaiUH, jml_nilaiUH=0, rataRata;

        double[][] nilaiIpa = new double[4][];
            nilaiIpa[0] = new double[4];
            nilaiIpa[1] = new double[2];
            nilaiIpa[2] = new double[1];
            nilaiIpa[3] = new double[1];

         double[][] nilaiBin = new double[4][];
            nilaiBin[0] = new double[4];
            nilaiBin[1] = new double[2];
            nilaiBin[2] = new double[1];
            nilaiBin[3] = new double[1];

// KALKULASI NILAI
    // KALKULASI NILAI MATEMATIKA
        int i = 0;
        System.out.println("Matematika");
        do {
            int j = 0;
            if (i==0) {
                System.out.println("Tugas:");
            }else if (i==1) {
                System.out.println("Ulangan Harian:");
            }else if (i==2) {
                System.out.println("Ulangan Tengah Semester:");
            }else System.out.println("Ujian:");
            do {
            System.out.println("Masukkan nilai ke-"+(j+1));
            nilaiMat[i][j] = sc.nextDouble();
            j++;
            } while (j<nilaiMat[i].length);
            i++;
        } while (i<nilaiMat.length);

        for (int j = 0; j < nilaiMat[0].length; j++) {
            jml_nilaiTugas = nilaiMat[0][j]+jml_nilaiTugas;
        }
        rata_nilaiTugas =  jml_nilaiTugas/nilaiMat[0].length;
        System.out.println("Rata-rata nilai tugas adalah "+rata_nilaiTugas);

        for (int j = 0; j < nilaiMat[1].length; j++) {
            jml_nilaiUH = nilaiMat[1][j]+jml_nilaiUH;
        }
        rata_nilaiUH =  jml_nilaiUH/nilaiMat[0].length;
        System.out.println("Rata-rata nilai UH adalah "+rata_nilaiUH);

        System.out.println("Nilai UTS adalah "+nilaiMat[2][0]);
        System.out.println("Nilai Ujian adalah "+nilaiMat[3][0]);

        rataRata = (rata_nilaiTugas+rata_nilaiUH+nilaiMat[2][0]+nilaiMat[3][0])/4;
        System.out.println("Rata-rata seluruhnya adalah "+rataRata);

    // KALKULASI NILAI IPA
        i = 0;
        System.out.println("Ilmu Pengetahuan Alam");
        do {
            int j = 0;
            if (i==0) {
                System.out.println("Tugas:");
            }else if (i==1) {
                System.out.println("Ulangan Harian:");
            }else if (i==2) {
                System.out.println("Ulangan Tengah Semester:");
            }else System.out.println("Ujian:");
            do {
            System.out.println("Masukkan nilai ke-"+(j+1));
            nilaiIpa[i][j] = sc.nextDouble();
            j++;
            } while (j<nilaiIpa[i].length);
            i++;
        } while (i<nilaiIpa.length);

        for (int j = 0; j < nilaiIpa[0].length; j++) {
            jml_nilaiTugas = nilaiIpa[0][j]+jml_nilaiTugas;
        }
        rata_nilaiTugas =  jml_nilaiTugas/nilaiIpa[0].length;
        System.out.println("Rata-rata nilai tugas adalah "+rata_nilaiTugas);

        for (int j = 0; j < nilaiIpa[1].length; j++) {
            jml_nilaiUH = nilaiIpa[1][j]+jml_nilaiUH;
        }
        rata_nilaiUH =  jml_nilaiUH/nilaiIpa[0].length;
        System.out.println("Rata-rata nilai UH adalah "+rata_nilaiUH);

        System.out.println("Nilai UTS adalah "+nilaiIpa[2][0]);
        System.out.println("Nilai Ujian adalah "+nilaiIpa[3][0]);

        rataRata = (rata_nilaiTugas+rata_nilaiUH+nilaiIpa[2][0]+nilaiIpa[3][0])/4;
        System.out.println("Rata-rata seluruhnya adalah "+rataRata);

     // KALKULASI NILAI MATEMATIKA
        i = 0;
        System.out.println("Ilmu Pengetahuan Alam");
        do {
            int j = 0;
            if (i==0) {
                System.out.println("Tugas:");
            }else if (i==1) {
                System.out.println("Ulangan Harian:");
            }else if (i==2) {
                System.out.println("Ulangan Tengah Semester:");
            }else System.out.println("Ujian:");
            do {
            System.out.println("Masukkan nilai ke-"+(j+1));
            nilaiBin[i][j] = sc.nextDouble();
            j++;
            } while (j<nilaiBin[i].length);
            i++;
        } while (i<nilaiBin.length);

        for (int j = 0; j < nilaiBin[0].length; j++) {
            jml_nilaiTugas = nilaiBin[0][j]+jml_nilaiTugas;
        }
        rata_nilaiTugas =  jml_nilaiTugas/nilaiBin[0].length;
        System.out.println("Rata-rata nilai tugas adalah "+rata_nilaiTugas);

        for (int j = 0; j < nilaiBin[1].length; j++) {
            jml_nilaiUH = nilaiBin[1][j]+jml_nilaiUH;
        }
        rata_nilaiUH =  jml_nilaiUH/nilaiBin[0].length;
        System.out.println("Rata-rata nilai UH adalah "+rata_nilaiUH);

        System.out.println("Nilai UTS adalah "+nilaiBin[2][0]);
        System.out.println("Nilai Ujian adalah "+nilaiBin[3][0]);

        rataRata = (rata_nilaiTugas+rata_nilaiUH+nilaiBin[2][0]+nilaiBin[3][0])/4;
        System.out.println("Rata-rata seluruhnya adalah "+rataRata);
        
    }
}