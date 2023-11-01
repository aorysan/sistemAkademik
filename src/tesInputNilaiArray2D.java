package sistemAkademik.src;
import java.util.Scanner;
public class tesInputNilaiArray2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] nilai = new double[4][];
            nilai[0] = new double[4];
            nilai[1] = new double[2];
            nilai[2] = new double[1];
            nilai[3] = new double[1];
        double rata_nilaiTugas, jml_nilaiTugas=0, rata_nilaiUH, jml_nilaiUH=0, rataRata;

        int i = 0;
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
            nilai[i][j] = sc.nextDouble();
            j++;
            } while (j<nilai[i].length);
            i++;
        } while (i<nilai.length);

        for (int j = 0; j < nilai.length; j++) {
            jml_nilaiTugas = nilai[0][j]+jml_nilaiTugas;
        }
        rata_nilaiTugas =  jml_nilaiTugas/nilai[0].length;
        System.out.println("Rata-rata nilai tugas adalah "+rata_nilaiTugas);

        for (int j = 0; j < nilai.length; j++) {
            jml_nilaiUH = nilai[0][j]+jml_nilaiUH;
        }
        rata_nilaiUH =  jml_nilaiUH/nilai[0].length;
        System.out.println("Rata-rata nilai UH adalah "+rata_nilaiUH);

        System.out.println("Nilai UTS adalah "+nilai[2][0]);
        System.out.println("Nilai Ujian adalah "+nilai[3][0]);

        rataRata = (rata_nilaiTugas+rata_nilaiUH+nilai[2][0]+nilai[3][0])/4;
        System.out.println("Rata-rata seluruhnya adalah "+rataRata);
        
    }
}
