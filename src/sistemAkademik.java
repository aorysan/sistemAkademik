import java.util.*;
public class sistemAkademik {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        siakad(false, null, 0, 0, 0, 0, 0, 0, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0);
    }
    static void siakad (boolean loginSucces, String pilih, double nUmat, double nUIpa, double nUBin, double bMat, double bIpa, double bBin, double nUHBin[], double nUHIpa[], double nUHMat[], double rata_nBin, double rata_nMat, double rata_nIpa, double rata_nUHBin, double rata_nUHIpa, double rata_nUHMat, double jmlPresensi, double nUMat, double nIpa[], double nMat[], double nBin[], double proporsiTugas, double proporsiUH, double proporsiU, double rataRata, double indeksPrestasi, double nAIpa, double nAMat, double nABin) {
        loginSucces = false;
        pilih           = "";
        bMat            = 4;
        bIpa            = 4;
        bBin            = 4;
        nMat            = new double[4];
        nUHMat          = new double[4];
        nIpa            = new double[4];
        nUHIpa          = new double[4];
        nBin            = new double[4];
        nUHBin          = new double[4];
        proporsiTugas   = 0.3;
        proporsiUH      = 0.35;
        proporsiU       = 0.35; //proporsi setiap tugas/penilaian
        jmlPresensi     = 0;
        rata_nMat       = 0;
        rata_nUHMat     = 0;
        nUMat           = 0;
        nAMat           = 0;
        rata_nIpa       = 0;
        rata_nUHIpa     = 0;
        nUIpa           = 0;
        nAIpa           = 0;
        rata_nBin       = 0;
        rata_nUHBin     = 0;
        nUBin           = 0;
        nABin           = 0;
        indeksPrestasi  = 0;
        rataRata        = 0;
        String[] user   = {"admin", "userA", "userB"};
        String pass[]   = {"admin", "passA", "passB"};
        String username = "", password = "", menu = "", biodata, pilihKelas = "";
        String kelas[]  = {"1A", "1B", "1C", "2A", "2B", "2C", "3A", "3B", "3C",};
        String nama     = "";
        String murid[][]= {
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
            
        login (loginSucces, username, password, user, pass);
        
        //Hasil setelah user memilih menu
        Menu(menu, murid, kelas, nama, pilihKelas);
            
        System.out.print("Silahkan pilih kelas : ");
        pilihKelas = sc.next();
        for (int i = 0; i < kelas.length; i++) {
            if (pilihKelas.equals(kelas[i])) {
                int j = 0;
                plusMurid(j, murid, i);
            }
        }
        System.out.print("Silahkan pilih nomor induk siswa : ");
        nama = sc.next();
        for (int i = 0; i < kelas.length; i++) {
            for (int j = 0; j < murid[i].length; j++) {
                if (nama.equalsIgnoreCase(murid[i][j])) {
                    System.out.print("\n" + murid[i][j] + "\n\n");
                }
            }
        }

        //PRESENSI
        System.out.println("Masukkan jumlah kehadiran siswa dalam satu semester (maksimal 132 hari) : ");
        double presensi;
            
        do {
            presensi = sc.nextDouble();
            if (presensi > 132) {
                System.out.println("\nAnda memasukkan jumlah yang tidak valid.\nSilakan coba lagi.");
                System.out.println("\nMasukkan jumlah kehadiran siswa dalam satu semester (maksimal 132 hari) : ");
                }
        } while (presensi > 132);
                
        //INPUT NILAI DENGAN ARRAY - MATEMATIKA
        int i = 0;
        do {
            System.out.print("\nNilai Tugas Matematika \n Tugas ke-"+(i+1)+" : ");
            do {
                nMat[i] = sc.nextDouble();
                if (nMat[i] < 0 || nMat[i] > 100) {
                    System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                System.out.print("\nNilai Tugas Matematika \n Tugas ke-"+(i+1)+" : ");
                }
            } while (nMat[i] < 0 || nMat[i] > 100);
            i++;
        } while (i<4);
            
        i = 0;
        do {
            System.out.print("\nNilai Ulangan Harian Matematika \n UH ke-"+(i+1)+" : ");
            do {
                nUHMat[i] = sc.nextDouble();
                if (nUHMat[i] < 0 || nUHMat[i] > 100) {
                    System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                    System.out.print("\nNilai Ulangan Harian Matematika \n UH ke-"+(i+1)+" : ");
                }
            } while (nUHMat[i] < 0 || nUHMat[i] > 100);
                i++;
        } while (i<nUHMat.length);
                
        System.out.print("\nNilai Ujian Matematika : ");
        do {
            nUMat = sc.nextDouble();
            if (nUMat < 0 || nUMat > 100) {
                System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                System.out.print("Nilai Ujian Matematika : ");
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
        
        System.out.print("Hasil Nilai Akhir Matematika : " + nAMat);
        if (nAMat<75) {
            System.out.println("Remedi.");
        } else {
            System.out.println("Tidak Remedi.\n");
        }
            
        // INPUT NILAI ARRAY - IPA
        i = 0;
        do {
            System.out.print("\nNilai Tugas IPA \n Tugas ke-"+(i+1)+" : ");
            do {
                nIpa[i] = sc.nextDouble();
                if (nIpa[i] < 0 || nIpa[i] > 100) {
                    System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                    System.out.print("\nNilai Tugas IPA \n Tugas ke-"+(i+1)+" : ");
                }
            } while (nIpa[i] < 0 || nIpa[i] > 100);
            i++;
        } while (i<nIpa.length);
        
        i = 0;
        do {
            System.out.print("\nNilai Ulangan Harian IPA \n UH ke-"+(i+1)+" : ");
            do {
                nUHIpa[i] = sc.nextDouble();
                if (nUHIpa[i] < 0 || nUHIpa[i] > 100) {
                    System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                    System.out.print("\nNilai Ulangan Harian IPA \n UH ke-"+(i+1)+" : ");
                }
            } while (nUHIpa[i] < 0 || nUHIpa[i] > 100);
            i++;
        } while (i<nUHIpa.length);
        
        System.out.print("\nNilai Ujian IPA : ");
        do {
            nUIpa = sc.nextDouble();
            if (nUIpa < 0 || nUIpa > 100) {
                System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                System.out.print("Nilai Ujian IPA : ");
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
        System.out.print("Hasil Nilai Akhir Matematika : " + nAIpa);
        if (nAIpa<75) {
            System.out.println("Remedi.");
        } else {
            System.out.println("Tidak Remedi.\n");
        }
        
        // INPUT NILAI ARRAY - BIN
        i = 0;
        do {
            System.out.print("\nNilai Tugas Bahasa Indonesia \n Tugas ke-"+(i+1)+" : ");
            do {
                nBin[i] = sc.nextDouble();
                if (nBin[i] < 0 || nBin[i] > 100) {
                    System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                    System.out.print("\nNilai Tugas Bahasa Indonesia \n Tugas ke-"+(i+1)+" : ");
                }
            } while (nBin[i] < 0 || nBin[i] > 100);
            i++;
        } while (i<nBin.length);
        
        i = 0;
        do {
            System.out.print("\nNilai Ulangan Harian Bahasa Indonesia \n UH ke-"+(i+1)+" : ");
            do {
                nUHBin[i] = sc.nextDouble();
                if (nUHBin[i] < 0 || nUHBin[i] > 100) {
                    System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                    System.out.print("\nNilai Ulangan Harian Bahasa Indonesia \n UH ke-"+(i+1)+" : ");
                }
            } while (nUHBin[i] < 0 || nUHBin[i] > 100);
            i++;
        } while (i<nUHBin.length);
        
        System.out.print("\nNilai Ujian Bahasa Indonesia : ");
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
        System.out.print("Hasil Nilai Akhir Bahasa Indonesia : " + nABin);
        if (nABin<75) {
            System.out.println("Remedi.");
        } else {
            System.out.println("Tidak Remedi.\n");
        }

        // PENCETAK RAPOR
        // VAR MASUK: nama, presensi, nAMat, nAIpa, nABin, bMat, bIpa, bBin, nAMat, nAIpa, nABin
        
        jmlPresensi = (presensi/132)*100;
        //System.out.printf("Persentase kehadiran siswa dalam 1 semester : %.1f\n", jmlPresensi);
        
        indeksPrestasi = (nAMat+nAIpa+nABin)/((bMat+bIpa+bBin)*25);
        // System.out.println((nAMat+nAIpa+nABin));
        // System.out.println((bMat+bIpa+bBin)); untuk tes
        //System.out.println("\nIndeks Prestasi siswa : " + indeksPrestasi);
        
        rataRata = (nAMat+nAIpa+nABin)/(4);
        //System.out.println("Nilai rata-rata siswa : " + rataRata);
        
        //  MESIN DECISION KELULUSAN
        // VAR MASUK: indeksPrestasi, jmlPresensi

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
    
    static void cetakRapor(String nama, String kelas, double nUMat, double nAMat, double nUIpa, double nAIpa, double nUBin, double nABin, double jmlPresensi, double indeksPrestasi, double rataRata) {
    System.out.println("\n=============== RAPOR ===============");
    System.out.println("Nama Siswa : " + nama);
    System.out.println("Kelas      : " + kelas);

    System.out.println("\n=============== NILAI ===============");
    cetakMapel("Matematika", nUMat, nAMat);
    cetakMapel("IPA", nUIpa, nAIpa);
    cetakMapel("Bahasa Indoneisa", nUBin, nABin);

    System.out.println("\n=============== KEHADIRAN ===============");
    System.out.printf("Presentase Kehadiran : %.1f\n ", jmlPresensi);


    System.out.println("\n=============== HASIL ===============");
    System.out.println(" Indeks Prestasi  : " + indeksPrestasi);
    System.out.println("Rata-rata Nilai : " + rataRata);
}
    static void cetakMapel(String Mapel, double nUjian, double nAKhir){
    System.out.println("Mata Pelajaran : " + Mapel);
    
    System.out.printf("Ujian : %.1f\n", nUjian);
    System.out.printf("Nilai Akhir : %.1f\n", nAKhir);
}

public static void Biodata(String murid[][]){
    String nama;
    boolean isEnd = false;
    String biodata[][] = {
        // Nama 0
        {"Abdul Khamid Jalaludin", "Aifatul Khoiridah", "Alya Nur Azizah", "Alia Dzikrussofiana", "Amin Ustadzi", "Anggun Puspita Sari", "Azkiyatul Falihah", "Bambang Sudarsono", "Citra Indah Sari", "Dewi Sofiah", "Dika Putra", "Elisa Andriani", "Eva Nia Maulida", "Fajar Setiawan", "Fariska Naftalia", "Farzan Abdul Latif", "Fernando Ardiansyah", "Gina Melati", "Gita Putri Utami", "Hafizh Satrio", "Hendra Gunawan", "Ibnu Fajar Auliya", "Indra Kusuma", "Inayah Nurul Hidayah", "Jihan Aulia", "Joko Susilo", "Kartika Sari", "Lia Nur Fitriani", "Maulana Ridwan", "Nadia Rachmawati", "Oktavia Putri Ramadhani", "Putra Pratama", "Qori Ramadhan", "Rahma Wahyuningrum", "Rendi Pratama", "Siti Nurjanah", "Taufik Hidayat", "Ulfa Khairunnisa", "Vivi Septiani", "Wahyu Setiawan", "Xena Putri Arifin", "Yoga Pratama", "Zahra Rizki Amalia", "Zainal Arifin",  "Zuhair Alami"},
        // Jenis Kelamin 1
        {"L",                       "P",                    "P",            "P",                    "L",            "P",                    "P",                "L",                "P",                    "P",        "L",            "P",                "P",            "L.",               "P",                "L",                "L",                    "P",            "P",                "L",            "L",                "L",                "L",            "P",                    "P",            "L",          "P",          "P",                "L",                "P",                "L",                        "L",            "L",            "P",                    "L",            "P",            "L",               "P",                 "P",            "L",              "P",                  "L",          "P",                  "L",                    "L"},
        // Tempat lahir 2
        {"Malang",                  "Magetan",           "Sleman",          "Surabaya",             "Sidoarjo",     "Pasuruan",             "Probolinggo",      "Banyuwangi",       "Jember",           "Blitar",       "Kediri",       "Mojokerto",        "Madiun",       "Tuban",        "Bojonegoro",         "Ngawi",              "Tulungagung",        "Pamekasan",  "Sumenep",          "Lamongan",      "Ponorogo",        "Pacitan",          "Bondowoso",        "Situbondo",        "Trenggalek", "Madiun",         "Gresik",       "Bangkalan",        "Tulungagung",   "Tulungagung",       "Nganjuk",                "Magetan",      "Pacitan",      "Lumajang",             "Batu",         "Malang",        "Blitar",          "Kediri",           "Tulungagung",      "Banyuwangi", "Jombang",            "Sampang",      "Malang",            "Malang",              "Kudus"},
        // Tanggal lahir 3
        {"2004-01-15",              "2004-03-27",       "2004-05-10",       "2004-07-18",       "2004-09-05",     "2004-11-12",         "2005-02-22",         "2005-04-30",         "2005-06-07",       "2005-08-14", "2004-02-01", "2004-04-18",       "2004-06-25",       "2004-08-03",   "2004-10-20",       "2005-01-08",           "2005-03-19",        "2005-05-28", "2005-07-09",        "2005-09-16",   "2004-01-25",      "2004-03-08",        "2004-05-17",    "2004-07-21",          "2004-09-30", "2004-11-05",   "2005-02-12",   "2005-04-20",         "2005-06-29",   "2005-08-10",       "2004-02-10",               "2004-04-28",   "2004-06-07",    "2004-08-18",          "2004-10-22",   "2005-01-05",    "2005-03-15",      "2005-05-24",       "2005-07-30",   "2005-09-11",     "2004-01-12",         "2004-03-21",   "2004-05-30",        "2004-07-04",      "2004-09-10"},
        // agama 4
        {"Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam", "Islam"},
        // alamat 5
        {"Jalan Pisang Kipas, Gang VI, Nomor 21", "Jalan Veteran Nomor 23", "Jalan Bunga Mawar, Gang Berduri Nomor 11", "Jalan Cendana Nomor 7", "Jalan Kenanga, Perumahan Citra Indah Blok C2 Nomor 15", "Jalan Dahlia, Gang Melati Nomor 3", "Jalan Melati, Perumahan Bumi Asri Blok D Nomor 8", "Jalan Flamboyan Nomor 12", "Jalan Mawar, Perumahan Mekar Jaya Blok E Nomor 5", "Jalan Anggrek, Gang Seroja Nomor 9", "Jalan Kenari, Perumahan Bunga Indah Blok F Nomor 4", "Jalan Rafflesia Nomor 6", "Jalan Dahlia, Perumahan Bumi Asri Blok G Nomor 10", "Jalan Flamboyan Nomor 18", "Jalan Melati, Gang Mawar Nomor 7", "Jalan Dahlia, Perumahan Anggrek Indah Blok H Nomor 14", "Jalan Kenanga, Gang Flamboyan Nomor 13", "Jalan Mawar Nomor 16", "Jalan Rafflesia, Perumahan Bunga Citra Blok I Nomor 2", "Jalan Flamboyan, Gang Dahlia Nomor 17", "Jalan Kenari Nomor 19", "Jalan Mawar, Perumahan Kenanga Indah Blok J Nomor 22", "Jalan Dahlia, Gang Anggrek Nomor 20", "Jalan Melati Nomor 25", "Jalan Flamboyan, Perumahan Rafflesia Blok K Nomor 28", "Jalan Rafflesia Nomor 27", "Jalan Anggrek Nomor 30", "Jalan Kenanga, Gang Flamboyan Nomor 32", "Jalan Mawar Nomor 34", "Jalan Dahlia Nomor 36", "Jalan Melati, Perumahan Kenari Indah Blok L Nomor 38", "Jalan Flamboyan, Gang Rafflesia Nomor 40", "Jalan Rafflesia Nomor 42", "Jalan Anggrek Nomor 44", "Jalan Kenanga Nomor 46", "Jalan Mawar Nomor 48", "Jalan Dahlia Nomor 50", "Jalan Melati Nomor 52", "Jalan Flamboyan Nomor 54", "Jalan Rafflesia Nomor 56", "Jalan Anggrek Nomor 58", "Jalan Kenanga Nomor 60", "Jalan Mawar Nomor 62", "Jalan Dahlia Nomor 64", "Dusun Kenangan, Desa Rindu"},
        // nama ayah 6
        {"Ahmad", "Muhammad", "Abdullah", "Rizky", "Fahmi", "Irfan", "Syamsul", "Haris", "Ari", "Fandi", "Ridwan", "Ilham", "Hendra", "Rizaldi", "Dede", "Ricky", "Budi", "Arif", "Yudi", "Eko", "Maulana", "Rizki", "Adi", "Hadi", "Firman", "Yoga", "Dian", "Rendi", "Surya", "Andi", "Joko", "Eko", "Fajar", "Rizal", "Suryadi", "Agus", "Aldi", "Galih", "Hendri", "Anwar", "Aditya", "Bayu", "Irfan", "Irsan", "Krisna"},
        // nama ibu 7
        {"Siti", "Lina", "Ayu", "Ratna", "Sinta", "Rina", "Eka", "Dewi", "Laras", "Yuni", "Novi", "Rini", "Nur", "Rina", "Sari", "Dian", "Dewi", "Putri", "Indah", "Lia", "Wulan", "Ani", "Fita", "Maya", "Nina", "Sari", "Citra", "Sari", "Ayu", "Nur", "Sari", "Ria", "Mega", "Anisa", "Sari", "Sri", "Rika", "Lia", "Yuli", "Evi", "Lesti", "Rini", "Ayu", "Dwi", "Rina", "Lia"},
        // pekerjaan ayah 8
        {"Pengacara", "Dokter", "Insinyur", "Pilot", "Polisi", "Pengusaha", "Desainer", "Programmer", "Penulis", "Musisi", "Guru", "Aktor", "Ahli IT", "Peneliti", "Pengembang Perangkat Lunak", "Analis Keuangan", "Dosen", "Petani", "Teknisi", "Ahli Bedah", "Ahli Biologi", "Psikolog", "Ilmuwan", "Arsitek", "Konsultan", "Manajer Proyek", "Pengrajin", "Montir", "Pedagang", "Jurnalis", "Editor", "Teknisi Listrik", "Koki", "Tukang Kayu", "Pemadam Kebakaran", "Pemimpin Bisnis", "Ahli Kimia", "Pengacara", "Desainer Interior", "Pembuat Film", "Ahli Geologi", "Pemrogram", "Penyiar", "Ahli Bahasa", "Pemilik Bisnis Kecil", "Ahli Fisika"},
        // pekerjaan ibu 9
        {"Pegawai Negeri Sipil", "Guru", "Wiraswasta", "Pengusaha", "Dokter", "Pengacara", "Insinyur", "Petani", "Pilot", "Pedagang", "Arsitek", "Polisi", "Pramusaji", "Pengemudi Taksi", "Peneliti", "Seniman", "Tentara", "Nelayan", "Peternak", "Sopir Truk", "Ahli IT", "Seniman", "Koki", "Birokrat", "Guru", "Atlet", "Penulis", "Konsultan", "Bidan", "Montir", "Penyanyi", "Sopir Bus", "Dosen", "Psikolog", "Perawat", "Desainer", "Tukang Kayu", "Petugas Kebersihan", "Manajer", "Pemadam Kebakaran", "Pengemudi Ojek Online", "Petugas Keamanan", "Petani", "Teknisi Komputer", "Jurutulis", "Pekerja Sosial"}
        };
    
        System.out.println("╔═══════════════════════╗");
        System.out.println("║      B I O D A T A    ║");
        System.out.println("╚═══════════════════════╝\n");
    

    for (; isEnd == false;) {
        System.out.print("Silakan pilih siswa (1 s.d. 45) : ");
        int i = sc.nextInt();
        for (int j = 0; j < biodata.length; j++) {
            switch (j) {
                case 0:
                    System.out.print("Nama Lengkap    : ");
                    break;
                
                case 1:
                    System.out.print("Jenis Kelamin   : ");
                    break;
                case 2:
                    System.out.print("Tempat Lahir    : ");
                    break;
                case 3:
                    System.out.print("Tanggal Lahir   : ");
                    break;
                case 4:
                    System.out.print("Agama           : ");
                    break;
                case 5:
                    System.out.print("Alamat          : ");
                    break;
                case 6:
                    System.out.print("Nama Ayah       : ");
                    break;
                case 7:
                    System.out.print("Nama Ibu        : ");
                    break;
                case 8:
                    System.out.print("Pekerjaan Ayah  : ");
                    break;
                case 9:
                    System.out.print("Pekerjaan Ibu   : ");
                default:
                    break;
            }
            System.out.print(biodata[j][(i-1)]+"\n");
        }

        System.out.print("\nIngin melihat siswa lain? (y/t) :");
        char isLagi = sc.next().charAt(0);
        if (isLagi == 't') {
            isEnd = true;
        }
    }

}

}