/**
 * sistemAkademik
 */
import java.util.Scanner;
public class sistemAkademik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            double nUMat, nUIpa, nUBin, bMat = 4, bIpa = 4, bBin = 4;
            double[] nMat = new double[4], nUHMat = new double[4], nIpa = new double[4], nUHIpa = new double[4], nBin = new double[4], nUHBin = new double[4];
            double rata_nMat, rata_nUHMat, rata_nIpa, rata_nUHIpa, rata_nBin, rata_nUHBin;
            double proporsiTugas = 0.4, proporsiUH = 0.45, proporsiU = 0.45; //proporsi setiap tugas/penilaian
            double rataRata, indeksPrestasi, nAIpa, nAMat, nABin; //int ganti ke double karena input nilai bisa berupa pecahan
            String[] user = {"admin", "userA", "userB"};
            String pass[] = {"admin", "passA", "passB"};
            String username;
            String password;
            String kelas;
            String nama = "";
            String murid[][] = {
                {"1", "2", "3", "4", "5"},
                {"6", "7", "8", "9", "10"},
                {"11", "12", "13", "14", "15"},
                {"16", "17", "18", "19", "20"},
                {"21", "22", "23", "24", "25"},
                {"26", "27", "28", "29", "30"},
                {"31", "32", "33", "34", "35"},
                {"36", "37", "38", "39", "40"},
                {"41", "42", "43", "44", "45"}
            };
            // data murid
            

        // System.out.println("\n\n#######################################################");
        // System.out.println("#                                                     #");
        // System.out.println("#     SELAMAT DATANG DI SISTEM INFORMASI AKADEMIK     #");
        // System.out.println("#                                                     #");
        // System.out.println("#######################################################\n");

        // boolean loginSuccess = false;

        // do {
        //     System.out.print("Masukkan username : ");
        //     username = sc.nextLine();
        //     System.out.print("Masukkan password : ");
        //     password = sc.nextLine();

        //     for (int i = 0; i < user.length; i++) {
        //         if (username.equals(user[i]) && pass[i].equals(password)) {
        //             System.out.println("\nAnda berhasil login");
        //             loginSuccess = true;
        //             break;
        //         }
        //     }
        //     if (!loginSuccess) {
        //         System.out.println("\nUsername atau Password yang Anda masukkan salah!");
        //         System.out.println("Silahkan mencoba kembali\n");
        //     }
        // } while (!loginSuccess);

        // System.out.println("\n\n###################################################################");
        // System.out.println("     Selamat datang di Sistem Informasi Akademik SMAN x Malang     ");
        // System.out.println("###################################################################\n");

        System.out.println("Berikut kelas yang ada di sekolah ini :");
        System.out.println("1A    2A    3A\n\n1B    2B    3B\n\n1C    2C    3C");
        System.out.print("Silahkan pilih kelas : ");
        kelas = sc.nextLine();

        switch (kelas) {
            case "1A":
            for (int i = 0; i < murid[0].length; i++) {
                System.out.println(murid[0][i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "1":
                nama = murid[0][0];
                System.out.println(murid[0][0]);
                break;
                case "2":
                nama = murid[0][1];
                System.out.println(murid[0][1]);
                break;
                case "3":
                nama = murid[0][2];
                System.out.println(murid[0][2]);
                break;
                case "4":
                nama = murid[0][3];
                System.out.println(murid[0][3]);
                break;
                case "5":
                nama = murid[0][4];
                System.out.println(murid[0][4]);
                break;
            case "1B":
            for (int i = 0; i < murid[1].length; i++) {
                System.out.println(murid[1][i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "6":
                nama = murid[1][0];
                System.out.println(murid[1][0]);
                break;
                case "7":
                nama = murid[1][1];
                System.out.println(murid[1][1]);
                break;
                case "8":
                nama = murid[1][4];
                System.out.println(murid[1][2]);
                break;
                case "9":
                nama = murid[1][4];
                System.out.println(murid[1][3]);
                break;
                case "10":
                nama = murid[1][4];
                System.out.println(murid[1][4]);
                break;
            case "1C":
            for (int i = 0; i < murid[2].length; i++) {
                System.out.println(murid[2][i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "11":
                nama = murid[2][0];
                System.out.println(murid[2][0]);
                break;
                case "12":
                nama = murid[2][1];
                System.out.println(murid[2][1]);
                break;
                case "13":
                nama = murid[2][2];
                System.out.println(murid[2][2]);
                break;
                case "14":
                nama = murid[2][3];
                System.out.println(murid[2][3]);
                break;
                case "15":
                nama = murid[2][4];
                System.out.println(murid[2][4]);
                break;
            case "2A":
            for (int i = 0; i < murid[3].length; i++) {
                System.out.println(murid[3][i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "16":
                nama = murid[3][0];
                System.out.println(murid[3][0]);
                break;
                case "17":
                nama = murid[3][1];
                System.out.println(murid[3][1]);
                break;
                case "18":
                nama = murid[3][2];
                System.out.println(murid[3][2]);
                break;
                case "19":
                nama = murid[3][3];
                System.out.println(murid[3][3]);
                break;
                case "20":
                nama = murid[3][4];
                System.out.println(murid[3][4]);
                break;
            case "2B":
            for (int i = 0; i < murid[4].length; i++) {
                System.out.println(murid[4][i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "21":
                nama = murid[4][0];
                System.out.println(murid[4][0]);
                break;
                case "22":
                nama = murid[4][1];
                System.out.println(murid[4][1]);
                break;
                case "23":
                nama = murid[4][2];
                System.out.println(murid[4][2]);
                break;
                case "24":
                nama = murid[4][3];
                System.out.println(murid[4][3]);
                break;
                case "25":
                nama = murid[4][4];
                System.out.println(murid[4][4]);
                break;
            case "2C":
            for (int i = 0; i < murid[5].length; i++) {
                System.out.println(murid[5][i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "26":
                nama = murid[5][0];
                System.out.println(murid[5][0]);
                break;
                case "27":
                nama = murid[5][1];
                System.out.println(murid[5][1]);
                break;
                case "28":
                nama = murid[5][2];
                System.out.println(murid[5][2]);
                break;
                case "29":
                nama = murid[5][3];
                System.out.println(murid[5][3]);
                break;
                case "30":
                nama = murid[5][4];
                System.out.println(murid[5][4]);
                break;
                case "3A":
                for (int i = 0; i < murid[0].length; i++) {
                    System.out.println(murid[6][i]);
                }
                System.out.print("Silahkan pilih siswa : ");
                nama = sc.nextLine();
                    case "31":
                    nama = murid[6][0];
                    System.out.println(murid[6][0]);
                    break;
                    case "32":
                    nama = murid[6][1];
                    System.out.println(murid[6][1]);
                    break;
                    case "33":
                    nama = murid[6][2];
                    System.out.println(murid[6][2]);
                    break;
                    case "34":
                    nama = murid[6][3];
                    System.out.println(murid[6][3]);
                    break;
                    case "35":
                    nama = murid[6][4];
                    System.out.println(murid[6][4]);
                    break;
                case "3B":
                for (int i = 0; i < murid[0].length; i++) {
                    System.out.println(murid[7][i]);
                }
                System.out.print("Silahkan pilih siswa : ");
                nama = sc.nextLine();
                    case "36":
                    nama = murid[7][0];
                    System.out.println(murid[7][0]);
                    break;
                    case "37":
                    nama = murid[7][1];
                    System.out.println(murid[7][1]);
                    break;
                    case "38":
                    nama = murid[7][2];
                    System.out.println(murid[7][2]);
                    break;
                    case "39":
                    nama = murid[7][3];
                    System.out.println(murid[7][3]);
                    break;
                    case "40":
                    nama = murid[7][4];
                    System.out.println(murid[7][4]);
                    break;
                case "3C":
                for (int i = 0; i < murid[0].length; i++) {
                    System.out.println(murid[8][i]);
                }
                System.out.print("Silahkan pilih siswa : ");
                nama = sc.nextLine();
                    case "41":
                    nama = murid[8][0];
                    System.out.println(murid[8][0]);
                    break;
                    case "42":
                    nama = murid[8][1];
                    System.out.println(murid[8][1]);
                    break;
                    case "43":
                    nama = murid[8][2];
                    System.out.println(murid[8][2]);
                    break;
                    case "44":
                    nama = murid[8][3];
                    System.out.println(murid[8][3]);
                    break;
                    case "45":
                    nama = murid[8][4];
                    System.out.println(murid[8][4]);
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

        //INPUT NILAI DENGAN ARRAY - MATEMATIKA
        int i = 0;
        do {
            System.out.println("\nNilai Tugas Matematika \n Tugas ke-"+(i+1)+" : ");
            do {
                nMat[i] = sc.nextDouble();
                if (nMat[i] < 0 || nMat[i] > 100) {
                System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                System.out.println("\nNilai Tugas Matematika \n Tugas ke-"+(i+1)+" : ");
                }
            } while (nMat[i] < 0 || nMat[i] > 100);
            i++;
        } while (i<4);

        i = 0;
        do {
            System.out.println("\nNilai Ulangan Harian Matematika \n UH ke-"+(i+1)+" : ");
            do {
                nUHMat[i] = sc.nextDouble();
                if (nUHMat[i] < 0 || nUHMat[i] > 100) {
                System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                System.out.println("\nNilai Ulangan Harian Matematika \n UH ke-"+(i+1)+" : ");
                }
            } while (nUHMat[i] < 0 || nUHMat[i] > 100);
            i++;
        } while (i<nUHMat.length);
        
        System.out.println("\nNilai Ujian Matematika : ");
       do {
            nUMat = sc.nextDouble();
            if (nUMat < 0 || nUMat > 100) {
            System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
            System.out.println("Nilai Ujian Matematika : ");
            }
       } while (nUMat < 0 || nUMat > 100);
        
        //rata-rata nilai mat dalam array
        double j=0;
        for(i=0; i<nMat.length; i++){
            j = nMat[i] +j;
        }
        rata_nMat = j/nMat.length;

        j=0;
        for(i=0; i<4; i++){
            j= nUHMat[i]+j;
        }
        rata_nUHMat= j/nUHMat.length;

            nAMat = (rata_nMat*proporsiTugas+nUMat*proporsiU+rata_nUHMat*proporsiUH)*bMat;
        System.out.println("Hasil Nilai Akhir Matematika : " + nAMat);
            if (nAMat<75) {
                System.out.println("Remedi.");
            } else {
                System.out.println("Tidak Remedi.\n");
            }
        
        // INPUT NILAI ARRAY - IPA
        i = 0;
        do {
            System.out.println("\nNilai Tugas IPA \n Tugas ke-"+(i+1)+" : ");
            do {
                nIpa[i] = sc.nextDouble();
                if (nIpa[i] < 0 || nIpa[i] > 100) {
                System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                System.out.println("\nNilai Tugas IPA \n Tugas ke-"+(i+1)+" : ");
                }
            } while (nIpa[i] < 0 || nIpa[i] > 100);
            i++;
        } while (i<nIpa.length);

        i = 0;
        do {
            System.out.println("\nNilai Ulangan Harian IPA \n UH ke-"+(i+1)+" : ");
            do {
                nUHIpa[i] = sc.nextDouble();
                if (nUHIpa[i] < 0 || nUHIpa[i] > 100) {
                System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                System.out.println("\nNilai Ulangan Harian IPA \n UH ke-"+(i+1)+" : ");
                }
            } while (nUHIpa[i] < 0 || nUHIpa[i] > 100);
            i++;
        } while (i<nUHIpa.length);
        
        System.out.println("\nNilai Ujian IPA : ");
       do {
            nUIpa = sc.nextDouble();
            if (nUIpa < 0 || nUIpa > 100) {
            System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
            System.out.println("Nilai Ujian IPA : ");
            }
       } while (nUIpa < 0 || nUIpa > 100);
        
        //rata-rata nilai ipa dalam array
        j=0;
        for(i=0; i<nIpa.length; i++){
            j = nIpa[i] +j;
        }
        rata_nIpa = j/4;

        j=0;
        for(i=0; i<4; i++){
            j= nUHIpa[i]+j;
        }
        rata_nUHIpa= j/nUHIpa.length;

            nAIpa = (rata_nIpa*proporsiTugas+nUIpa*proporsiU+rata_nUHIpa*proporsiUH)*bIpa;
        System.out.println("Hasil Nilai Akhir Matematika : " + nAIpa);
            if (nAIpa<75) {
                System.out.println("Remedi.");
            } else {
                System.out.println("Tidak Remedi.\n");
            }

        // INPUT NILAI ARRAY - BIN
        i = 0;
        do {
            System.out.println("\nNilai Tugas Bahasa Indonesia \n Tugas ke-"+(i+1)+" : ");
            do {
                nBin[i] = sc.nextDouble();
                if (nBin[i] < 0 || nBin[i] > 100) {
                System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                System.out.println("\nNilai Tugas Bahasa Indonesia \n Tugas ke-"+(i+1)+" : ");
                }
            } while (nBin[i] < 0 || nBin[i] > 100);
            i++;
        } while (i<nBin.length);

        i = 0;
        do {
            System.out.println("\nNilai Ulangan Harian Bahasa Indonesia \n UH ke-"+(i+1)+" : ");
            do {
                nUHBin[i] = sc.nextDouble();
                if (nUHBin[i] < 0 || nUHBin[i] > 100) {
                System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                System.out.println("\nNilai Ulangan Harian Bahasa Indonesia \n UH ke-"+(i+1)+" : ");
                }
            } while (nUHBin[i] < 0 || nUHBin[i] > 100);
            i++;
        } while (i<nUHBin.length);
        
        System.out.println("\nNilai Ujian Bahasa Indonesia : ");
       do {
            nUBin = sc.nextDouble();
            if (nUBin < 0 || nUBin > 100) {
            System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
            System.out.println("Nilai Ujian Bahasa Indonesia : ");
            }
       } while (nUBin < 0 || nUBin > 100);
        
        //rata-rata nilai BIN dalam array
        j=0;
        for(i=0; i<nBin.length; i++){
            j = nBin[i] +j;
        }
        rata_nBin = j/4;

        j=0;
        for(i=0; i<4; i++){
            j= nUHBin[i]+j;
        }
        rata_nUHBin= j/nUHBin.length;

            nABin = (rata_nBin*proporsiTugas+nUBin*proporsiU+rata_nUHBin*proporsiUH)*bBin;
        System.out.println("Hasil Nilai Akhir Bahasa Indonesia : " + nABin);
            if (nABin<75) {
                System.out.println("Remedi.");
            } else {
                System.out.println("Tidak Remedi.\n");
            }

            
        System.out.println("Siswa "+nama);
        
        double jmlPresensi = (presensi/132)*100;
            System.out.printf("Persentase kehadiran siswa dalam 1 semester : %.1f", jmlPresensi);

        indeksPrestasi = (nAMat+nAIpa+nABin)/((bMat+bIpa+bBin)*45);
            System.out.println("\nIndeks Prestasi siswa : " + indeksPrestasi);

        rataRata = (nAMat+nAIpa+nABin)/(4);
            System.out.println("Nilai rata-rata siswa : " + rataRata);


        if(indeksPrestasi>=4.0) {
            if(jmlPresensi>=0.7) {
                System.out.println("\nSiswa memnuhi syarat untuk naik kelas.");
            } else {
                System.out.println("\nSiswa tidak memenuhi syarat untuk naik kelas.");
            }
        } else {
            System.out.println("\nSiswa tidak memenuhi syarat untuk naik kelas.");
        }
    
    }
}
