package sistemAkademik.src;

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
            

        System.out.println("\n\n#######################################################");
        System.out.println("#                                                     #");
        System.out.println("#     SELAMAT DATANG DI SISTEM INFORMASI AKADEMIK     #");
        System.out.println("#                                                     #");
        System.out.println("#######################################################\n");

        boolean loginSuccess = false;

        do {
            System.out.print("Masukkan username : ");
            username = sc.nextLine();
            System.out.print("Masukkan password : ");
            password = sc.nextLine();

            for (int i = 0; i < user.length; i++) {
                if (username.equals(user[i]) && pass[i].equals(password)) {
                    System.out.println("\nAnda berhasil login");
                    loginSuccess = true;
                    break;
                }
            }
            if (!loginSuccess) {
                System.out.println("\nUsername atau Password yang Anda masukkan salah!");
                System.out.println("Silahkan mencoba kembali\n");
            }
        } while (!loginSuccess);

        System.out.println("\n\n###################################################################");
        System.out.println("     Selamat datang di Sistem Informasi Akademik SMAN x Malang     ");
        System.out.println("###################################################################\n");

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
                for (int i = 0; i < murid[0].length; i++) {
                    if (nama.equalsIgnoreCase(murid[0][i])) {
                        System.out.print(murid[0][i]);
                    }
                }
                break;
            case "1B":
            for (int i = 0; i < murid[1].length; i++) {
                System.out.println(murid[1][i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                for (int i = 0; i < murid[1].length; i++) {
                    if (nama.equalsIgnoreCase(murid[1][i])) {
                        System.out.print(murid[1][i]);
                    }
                }
                break;
            case "1C":
            for (int i = 0; i < murid[2].length; i++) {
                System.out.println(murid[2][i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                for (int i = 0; i < murid[2].length; i++) {
                    if (nama.equalsIgnoreCase(murid[2][i])) {
                        System.out.print(murid[2][i]);
                    }
                }
                break;
            case "2A":
            for (int i = 0; i < murid[3].length; i++) {
                System.out.println(murid[3][i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                for (int i = 0; i < murid[3].length; i++) {
                    if (nama.equalsIgnoreCase(murid[3][i])) {
                        System.out.print(murid[3][i]);
                    }
                }
                break;
            case "2B":
            for (int i = 0; i < murid[4].length; i++) {
                System.out.println(murid[4][i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                for (int i = 0; i < murid[4].length; i++) {
                    if (nama.equalsIgnoreCase(murid[4][i])) {
                        System.out.print(murid[4][i]);
                    }
                }
                break;
            case "2C":
            for (int i = 0; i < murid[5].length; i++) {
                System.out.println(murid[5][i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                for (int i = 0; i < murid[5].length; i++) {
                    if (nama.equalsIgnoreCase(murid[5][i])) {
                        System.out.print(murid[5][i]);
                    }
                }
                break;
                case "3A":
                for (int i = 0; i < murid[6].length; i++) {
                    System.out.println(murid[6][i]);
                }
                System.out.print("Silahkan pilih siswa : ");
                nama = sc.nextLine();
                    for (int i = 0; i < murid[6].length; i++) {
                    if (nama.equalsIgnoreCase(murid[6][i])) {
                        System.out.print(murid[6][i]);
                    }
                }
                break;
                case "3B":
                for (int i = 0; i < murid[7].length; i++) {
                    System.out.println(murid[7][i]);
                }
                System.out.print("Silahkan pilih siswa : ");
                nama = sc.nextLine();
                    for (int i = 0; i < murid[7].length; i++) {
                    if (nama.equalsIgnoreCase(murid[7][i])) {
                        System.out.print(murid[7][i]);
                    }
                }
                break;
                case "3C":
                for (int i = 0; i < murid[8].length; i++) {
                    System.out.println(murid[8][i]);
                }
                System.out.print("Silahkan pilih siswa : ");
                nama = sc.nextLine();
                    for (int i = 0; i < murid[8].length; i++) {
                    if (nama.equalsIgnoreCase(murid[8][i])) {
                        System.out.print(murid[8][i]);
                    }
                }
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

// PENCETAK RAPOR
    // VAR MASUK: nama, presensi, nAMat, nAIpa, nABin, bMat, bIpa, bBin, nAMat, nAIpa, nABin
        System.out.println("Siswa "+nama);
        
        double jmlPresensi = (presensi/132)*100;
            System.out.printf("Persentase kehadiran siswa dalam 1 semester : %.1f", jmlPresensi);

        indeksPrestasi = (nAMat+nAIpa+nABin)/((bMat+bIpa+bBin)*45);
            System.out.println("\nIndeks Prestasi siswa : " + indeksPrestasi);

        rataRata = (nAMat+nAIpa+nABin)/(4);
            System.out.println("Nilai rata-rata siswa : " + rataRata);

    //  MESIN DECISION KELULUSAN
        // VAR MASUK: indeksPrestasi, jmlPresensi
        if(indeksPrestasi>=4.0) {
            if(jmlPresensi>=0.7) {
                System.out.println("\nSiswa memnuhi syarat untuk naik kelas.");
            } else {
                System.out.println("\nSiswa tidak memenuhi syarat untuk naik kelas.");
            }
        } else {
            System.out.println("\nSiswa tidak memenuhi syarat untuk naik kelas.");
        }
    sc.close();
    }
}
