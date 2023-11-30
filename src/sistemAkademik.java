import java.util.Scanner;
public class sistemAkademik {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            double nUMat, nUIpa, nUBin, bMat = 4, bIpa = 4, bBin = 4;
            double[] nMat = new double[4], nUHMat = new double[4], nIpa = new double[4], nUHIpa = new double[4], nBin = new double[4], nUHBin = new double[4];
            double rata_nMat, rata_nUHMat, rata_nIpa, rata_nUHIpa, rata_nBin, rata_nUHBin;
            double proporsiTugas = 0.3, proporsiUH = 0.35, proporsiU = 0.35; //proporsi setiap tugas/penilaian
            double rataRata, indeksPrestasi, nAIpa, nAMat, nABin; //int ganti ke double karena input nilai bisa berupa pecahan
            String[] user = {"admin", "userA", "userB"};
            String pass[] = {"admin", "passA", "passB"};
            String username, password, menu, biodata, pilihKelas = "";
            String kelas[] = {"1A", "1B", "1C", "2A", "2B", "2C", "3A", "3B", "3C",};
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

        System.out.println("Biodata\nKelas");
        System.out.print("Pilih menu Anda : ");
        menu = sc.next();

        //Hasil setelah user memilih menu
        switch (menu) {
            case "kelas":
                Kelas(kelas);
                pemilihanKelas(pilihKelas, kelas, murid, nama);
                break;
            }
            
            // PRESENSI
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
        rata_nIpa = j/nIpa.length;
        
        
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
    System.out.printf("Persentase kehadiran siswa dalam 1 semester : %.1f\n", jmlPresensi);
    
    indeksPrestasi = (nAMat+nAIpa+nABin)/((bMat+bIpa+bBin)*25);
    // System.out.println((nAMat+nAIpa+nABin));
    // System.out.println((bMat+bIpa+bBin)); untuk tes
    System.out.println("\nIndeks Prestasi siswa : " + indeksPrestasi);
    
    rataRata = (nAMat+nAIpa+nABin)/(4);
        System.out.println("Nilai rata-rata siswa : " + rataRata);
        
        //  MESIN DECISION KELULUSAN
        // VAR MASUK: indeksPrestasi, jmlPresensi
        kelulusan(indeksPrestasi, presensi);
    }

    //Fungsi untuk pembuat keputusan kelulusan
    static void kelulusan(double indeksPrestasi, double jmlPresensi){
        if(indeksPrestasi >= 2.5) {
            if(jmlPresensi >= 0.7) {
                System.out.println("\nSiswa memnuhi syarat untuk naik kelas.");
            } else {
                System.out.println("\nSiswa tidak memenuhi syarat untuk naik kelas.");
            }
        } else {
            System.out.println("\nSiswa tidak memenuhi syarat untuk naik kelas.");
        }
    }

    //Fungsi untuk print out kelas
    static void Kelas (String kelas[]) {
        System.out.println("Berikut kelas yang ada di sekolah ini :");
        for (int i = 0; i < kelas.length; i++) {
            System.out.print(kelas[i] + "\t");
        }
        System.out.println();
    }

    //Fungsi untuk pemilihan murid
    static void pemilihanKelas (String pilihKelas, String kelas[], String murid[][], String nama) {
        System.out.print("Silahkan pilih kelas : ");
        pilihKelas = sc.next();
        for (int i = 0; i < kelas.length; i++) {
            if (pilihKelas.equals(kelas[i])) {
                int j = 0;
                plusMurid(j, murid, i);
            }
        }
        System.out.print("Silahkan pilih siswa : ");
        nama = sc.next();
        for (int i = 0; i < kelas.length; i++) {
            for (int j = 0; j < murid[i].length; j++) {
                if (nama.equalsIgnoreCase(murid[i][j])) {
                    System.out.print(murid[i][j] + "\n\n");
                }
            }
        }
    }
    static void plusMurid (int j, String murid[][], int i) {
        if (j < murid[i].length) {
            System.out.println(murid[i][j]);
            j++;
            plusMurid(j, murid, i);
            
        }
    }
    // public static void Biodata(String )
}
