import java.util.Scanner;
public class sistemAkademik1 {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int nMat, nIpa, nBin;
         double rataRata;
         
        System.out.println("Masukkan Nilai Tugas :");
        
        nMat = sc.nextInt();
        nIpa = sc.nextInt();
        nBin = sc.nextInt();
        rataRata = (nMat + nIpa + nBin) / 3;
        
        System.out.println("Rata-rata : " + rataRata);
        sc.close();
    }
}