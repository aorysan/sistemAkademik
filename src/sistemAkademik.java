import java.util.*;
public class sistemAkademik {
    
    static int bMat            = 4;
    static int bIpa            = 4;
    static int bBin            = 4;
    static double proporsiTugas   = 0.3;
    static double proporsiUH      = 0.35;
    static double proporsiU       = 0.35;
    static Scanner sc = new Scanner(System.in);

    // Deklarasi untuk inp-kalk nilai
        // Masukkan banyak mapel
    static int banyakMapel = 3;
    static double tugas[][] = new double[banyakMapel][4];
    static double uH[][] = new double[banyakMapel][4];
    static double ujian[] = new double[banyakMapel];
    static String mapel[] = {"Matematika", "Ilmu Pengetahuan Alam", "Bahasa Indonesia"};
    static double nilaiA[] = new double[banyakMapel];
    static double rata[][] = new double[banyakMapel][2]; 
    static int bobotMapel[] = {4,4,4,4,4,4,4,4};

    // BIODATA MURID
    static String biodata[][] = {
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
    
    public static void main(String[] args) {
        siakad(false, null, 0, 0, 0, 0, 0, 0, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0, null, null, null, 0, 0, 0, 0, 0, 0, 0, 0);
    }
    static void siakad (boolean loginSucces, String pilih, double nUmat, double nUIpa, double nUBin, double bMat, double bIpa, double bBin, double nUHBin[], double nUHIpa[], double nUHMat[], double rata_nBin, double rata_nMat, double rata_nIpa, double rata_nUHBin, double rata_nUHIpa, double rata_nUHMat, double jmlPresensi, double nUMat, double nIpa[], double nMat[], double nBin[], double proporsiTugas, double proporsiUH, double proporsiU, double rataRata, double indeksPrestasi, double nAIpa, double nAMat, double nABin) {
        loginSucces = false;
        pilih           = "";
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
        String username = "", password = "", menu = "", pilihKelas = "";
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
        
        for (int i = 0; i < nilaiA.length; i++) {
           nilaiA[i] = KalkulasiNilai(i);
        }
        
        jmlPresensi = (presensi/132)*100;
        //System.out.printf("Persentase kehadiran siswa dalam 1 semester : %.1f\n", jmlPresensi);
        double totalNilaiAkhir=0, totalBobotMapel=0;
        for (int i = 0; i < banyakMapel; i++) {
            totalNilaiAkhir =+ nilaiA[i];
            totalBobotMapel =+ bobotMapel[i];
        } 
        indeksPrestasi = (totalNilaiAkhir)/((totalBobotMapel)*25);
        rataRata = (totalNilaiAkhir)/(banyakMapel);
        
        pilih(loginSucces, username, password, user, pass, pilih, murid, pilihKelas, nama, kelas, nUHBin, nUHBin, rata_nMat, rata_nUHMat, nUMat, nAMat, rata_nIpa, rata_nUHIpa, nUIpa, nAIpa, rata_nBin, rata_nUHBin, nUBin, nABin, jmlPresensi, indeksPrestasi, rataRata);
    }
    
    static void cetakRapor(String nama, String pilihKelas, double rata_nMat, double rata_nUHMat, double nUMat, double nAMat, double rata_nIpa, double rata_nUHIpa, double nUIpa, double nAIpa, double rata_nBin, double rata_nUHBin, double nUBin, double nABin, double jmlPresensi, double indeksPrestasi, double rataRata) {
        System.out.println("Nama Siswa\t: " + biodata[0][Integer.parseInt(nama)-1]);
        System.out.println("Kelas\t\t: " + pilihKelas);

        System.out.println("\n============================== NILAI ==============================");
        for (int i = 0; i < mapel.length; i++) {
            cetakMapel(i);
        }

        System.out.println("\n============================== KEHADIRAN ==============================");
        System.out.printf("Presentase Kehadiran : %.1f\n ", jmlPresensi);

        System.out.println("\n============================== HASIL ==============================");
        System.out.println("Indeks Prestasi\t\t: " + indeksPrestasi);
        System.out.println("Rata-rata Nilai\t\t: " + rataRata);
        kelulusan(indeksPrestasi, jmlPresensi);
    }
    static void cetakMapel(int i){
        System.out.println("Mata Pelajaran : " + mapel[i]);
        System.out.printf("Tugas\t\t: %.1f\n", rata[i][0]); // rata[i][0] untuk rata2 tugas
        System.out.printf("UH\t\t: %.1f\n", rata[i][1]); // rata[i][1] untuk rata2 uh
        System.out.printf("Ujian\t\t: %.1f\n", ujian[i]);
        System.out.printf("Nilai Akhir\t: %.1f\n", nilaiA[i]);
    }
    static void pilih (boolean loginSucces, String username, String password, String user[], String pass[], String pilih, String murid[][], String pilihKelas, String nama, String kelas[], double nMat[], double nUHMat[], double rata_nMat, double rata_nUHMat, double nUMat, double nAMat, double rata_nIpa, double rata_nUHIpa, double nUIpa, double nAIpa, double rata_nBin, double rata_nUHBin, double nUBin, double nABin, double jmlPresensi, double indeksPrestasi, double rataRata) {
        
        System.out.print("Apakah Anda ingin mencetek rapor?(y/n) : ");
        pilih = sc.next();
        
        if(pilih.equalsIgnoreCase("y")) {
            //Pemanggilan Fungsi Cetak Rapor
            cetakRapor(nama, pilihKelas, rata_nMat, rata_nUHMat, nUMat, nAMat, rata_nIpa, rata_nUHIpa, nUIpa, nAIpa, rata_nBin, rata_nUHBin, nUBin, nABin, jmlPresensi, indeksPrestasi, rataRata);
            System.out.print("Apakah Anda ingin kembali ke menu awal?(y/n) : ");
            pilih = sc.next();
            if (pilih.equalsIgnoreCase("y")) {
                Menu(pilih, murid, kelas, nama, pilihKelas);
            }
        } else if (pilih.equalsIgnoreCase("n")) {
            System.out.print("Apakah Anda ingin kembali ke menu?(y/n) : ");
            pilih = sc.next();
            if (pilih.equalsIgnoreCase("y")) {
                Menu(pilih, murid, kelas, nama, pilihKelas);
            } else if (pilih.equalsIgnoreCase("n")) {
                System.out.print("Apakah Anda ingin logout?(y/n) : ");
                pilih = sc.next();
                if (pilih.equalsIgnoreCase("y")) {
                    loginSucces = false;
                    siakad(loginSucces, pilihKelas, nUMat, nUIpa, nUBin, nAMat, nUIpa, nABin, nUHMat, nUHMat, nUHMat, rata_nBin, rata_nMat, rata_nIpa, rata_nUHBin, rata_nUHIpa, rata_nUHMat, jmlPresensi, nUMat, nUHMat, nMat, nUHMat, rata_nUHBin, nUBin, jmlPresensi, rataRata, indeksPrestasi, nAIpa, nAMat, nABin);
                }
            }
        }
    }

    //Fungsi untuk pembuat keputusan kelulusan
    static void kelulusan(double indeksPrestasi, double jmlPresensi){
        if(indeksPrestasi >= 2.5 && jmlPresensi >= 70)  {
            
                System.out.println("\nSiswa memenuhi syarat untuk naik kelas.\n");
        } else {
            System.out.println("\nSiswa tidak memenuhi syarat untuk naik kelas.\n");
        }
    }

    //Fungsi untuk print out kelas
    static void Kelas (String kelas[]) {
        System.out.println("Berikut kelas yang ada di sekolah ini : ");
        for (int i = 0; i < kelas.length; i++) {
            System.out.print(kelas[i] + "\t");
        }
        System.out.println();
    }

    //Fungsi untuk pemilihan murid
    static void plusMurid (int j, String murid[][], int i) {
        if (j < murid[i].length) {
            System.out.println(murid[i][j]);
            j++;
            plusMurid(j, murid, i);
        }
    }
    
    public static void Biodata(boolean loginSucces, String murid[][], String pilih, String nama, String kelas[]){
        boolean isEnd = false;
        
            System.out.println("╔═══════════════════════╗");
            System.out.println("║      B I O D A T A    ║");
            System.out.println("╚═══════════════════════╝\n");

        for (; isEnd == false;) {
            System.out.print("Silakan masukkan nomor induk siswa (1 s.d. 45) : ");
            int i = sc.nextInt();
            for (int j = 0; j < biodata.length; j++) {
                switch (j) {
                    case 0:
                        System.out.print("Nama Lengkap\t\t: ");
                        break;
                    
                    case 1:
                        System.out.print("Jenis Kelamin\t\t: ");
                        break;
                    case 2:
                        System.out.print("Tempat Lahir\t\t: ");
                        break;
                    case 3:
                        System.out.print("Tanggal Lahir\t\t: ");
                        break;
                    case 4:
                        System.out.print("Agama\t\t\t: ");
                        break;
                    case 5:
                        System.out.print("Alamat\t\t\t: ");
                        break;
                    case 6:
                        System.out.print("Nama Ayah\t\t: ");
                        break;
                    case 7:
                        System.out.print("Nama Ibu\t\t: ");
                        break;
                    case 8:
                        System.out.print("Pekerjaan Ayah\t\t: ");
                        break;
                    case 9:
                        System.out.print("Pekerjaan Ibu\t\t: ");
                    default:
                        break;
                }
                System.out.print(biodata[j][(i-1)]+"\n");
            }
            System.out.print("\nIngin melihat siswa lain? (y/n) : ");
            char isLagi = sc.next().charAt(0);
            if (isLagi == 'n') {
                isEnd = true;
                System.out.print("Apakah Anda ingin kembali ke menu?(y/n)");
                pilih = sc.next();
                if (pilih.equalsIgnoreCase("y")) {
                    Menu(nama, murid, kelas, nama, pilih);
                } else if (pilih.equalsIgnoreCase("n")) {
                    System.out.print("Apakah Anda ingin logout?(y/n)");
                    pilih = sc.next();
                    if (pilih.equalsIgnoreCase("y")) {
                        siakad(loginSucces, pilih, isLagi, i, i, isLagi, i, i, null, null, null, i, isLagi, i, i, i, isLagi, i, isLagi, null, null, null, i, i, i, isLagi, i, i, isLagi, i);
                    }
                }
            }
        }
    }
    static void login (boolean loginSucces, String username, String password, String user[], String pass[]) {

        System.out.println("\n\n#################################################################");
        System.out.println("#                                                               #");
        System.out.println("#          SELAMAT DATANG DI SISTEM INFORMASI AKADEMIK          #");
        System.out.println("#                                                               #");
        System.out.println("#################################################################\n");

        boolean loginSuccess = false;
        do {
            System.out.print("Masukkan username : ");
            username = sc.next();
            System.out.print("Masukkan password : ");
            password = sc.next();

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

        System.out.println("\n\n#############################################################################");
        System.out.println("          Selamat datang di Sistem Informasi Akademik SMAN x Malang          ");
        System.out.println("#############################################################################\n");
    }
    static void Menu (String menu, String murid[][], String kelas[], String nama, String pilihKelas) {
        System.out.println("Biodata\nKelas");
        System.out.print("Pilih menu Anda : ");
        menu = sc.next();
        switch (menu) {
            case "biodata":
                Biodata(false, murid, pilihKelas, pilihKelas, kelas);
                break;
            case "kelas":
                Kelas(kelas);
                break;
        }
    }

    public static double KalkulasiNilai(int i){
        
        int j =0;
        System.out.println("===== "+mapel[i]+" =====");
        do {
            System.out.print("\nNilai Tugas "+mapel[i] +"\n Tugas ke-"+(j+1)+" : ");
            do {
                tugas[i][j] = sc.nextDouble();
                if (tugas[i][j] < 0 || tugas[i][j] > 100) {
                    System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                System.out.print("\nNilai Tugas "+mapel[i]+" \n Tugas ke-"+(j+1)+" : ");
                }
            } while (tugas[i][j] < 0 || tugas[i][j] > 100);
            j++;
        } while (j<tugas[i].length);
            
        j = 0;
        do {
            System.out.print("\nNilai Ulangan Harian "+ mapel[i] +"\n UH ke-"+(j+1)+" : ");
            do {
                uH[i][j] = sc.nextDouble();
                if (uH[i][j] < 0 || uH[i][j] > 100) {
                    System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                    System.out.print("\nNilai Ulangan Harian "+mapel[i]+" \n UH ke-"+(j+1)+" : ");
                }
            } while (uH[i][j] < 0 || uH[i][j] > 100);
                j++;
        } while (j<uH[i].length);

        j=0;
        System.out.print("\nNilai Ujian "+mapel[i]+" : ");
        do {
            ujian[i] = sc.nextDouble();
            if (ujian[i] < 0 || ujian[i] > 100) {
                System.out.println("Anda memasukkan nilai yang tidak valid. \nSilahkan coba lagi.");
                System.out.print("Nilai Ujian "+mapel[i]+" : ");
            }
        } while (ujian[i] < 0 || ujian[i] > 100);
                
                //rata-rata nilai mat dalam array
        double total=0;
        for(j=0; j<tugas[i].length; j++){
            total += tugas[i][j];
        }

        rata[i][0] = total/tugas[i].length;
                
        total=0;
        for(j=0; j<uH[i].length; j++){
            total+= uH[i][j];
        }

        rata[i][1]= total/uH[i].length;
                
        double nilaiAkhir = (rata[i][0]*proporsiTugas+ujian[i]*proporsiU+rata[i][1]*proporsiUH)*bMat;
        
        System.out.print("Hasil Nilai Akhir "+mapel[i]+" : " + nilaiAkhir);
        if (nilaiAkhir<75) {
            System.out.println("\nRemedi.");
        } else {
            System.out.println("\nTidak Remedi.");
        }
        return nilaiAkhir;
    }
}