import java.util.Scanner;
public class sistemAkademik1 {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int nMat,nIpa, nBing, nBin;
         double rataRata;
         
        System.out.println("Masukkan Nilai Tugas :");
        
        nMat = sc.nextInt();
        nIpa = sc.nextInt();
        nBing = sc.nextInt();
        nBin = sc.nextInt();
        rataRata = (nMat + nIpa + nBing + nBin) / 4;
        
        System.out.println("Rata-rata : " + rataRata);
        sc.close();
    }
}