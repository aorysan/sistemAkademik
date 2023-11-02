package sistemAkademik.src;

import java.util.Scanner;
public class testKelas {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
                murid[0][0] = nama;
                System.out.println(murid[0][0]);
                break;
                case "2":
                murid[0][1] = nama;
                System.out.println(murid[0][1]);
                break;
                case "3":
                murid[0][2] = nama ;
                System.out.println(murid[0][2]);
                break;
                case "4":
                murid[0][3] = nama;
                System.out.println(murid[0][3]);
                break;
                case "5":
                murid[0][4] = nama;
                System.out.println(murid[0][4]);
                break;
            case "1B":
            for (int i = 0; i < murid[1].length; i++) {
                System.out.println(murid[1][i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "6":
                murid[1][0] = nama;
                System.out.println(murid[1][0]);
                break;
                case "7":
                murid[1][1] = nama;
                System.out.println(nama);
                break;
                case "8":
                murid[1][4] = nama;
                System.out.println(murid[1][2]);
                break;
                case "9":
                murid[1][4] = nama;
                System.out.println(murid[1][3]);
                break;
                case "10":
                murid[1][4] = nama;
                System.out.println(murid[1][4]);
                break;
            case "1C":
            for (int i = 0; i < murid[2].length; i++) {
                System.out.println(murid[2][i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "11":
                murid[2][0] = nama;
                System.out.println(murid[2][0]);
                break;
                case "12":
                murid[2][1] = nama;
                System.out.println(murid[2][1]);
                break;
                case "13":
                murid[2][2] = nama;
                System.out.println(murid[2][2]);
                break;
                case "14":
                murid[2][3] = nama;
                System.out.println(murid[2][3]);
                break;
                case "15":
                murid[2][4] =nama ;
                System.out.println(murid[2][4]);
                break;
            case "2A":
            for (int i = 0; i < murid[3].length; i++) {
                System.out.println(murid[3][i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "16":
                murid[3][0] = nama;
                System.out.println(murid[3][0]);
                break;
                case "17":
                murid[3][1] = nama;
                System.out.println(murid[3][1]);
                break;
                case "18":
                murid[3][2] = nama;
                System.out.println(murid[3][2]);
                break;
                case "19":
                murid[3][3] = nama;
                System.out.println(murid[3][3]);
                break;
                case "20":
                murid[3][4] = nama;
                System.out.println(murid[3][4]);
                break;
            case "2B":
            for (int i = 0; i < murid[4].length; i++) {
                System.out.println(murid[4][i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "21":
                murid[4][0] = nama;
                System.out.println(murid[4][0]);
                break;
                case "22":
                murid[4][1] = nama;
                System.out.println(murid[4][1]);
                break;
                case "23":
                murid[4][2] = nama;
                System.out.println(murid[4][2]);
                break;
                case "24":
                murid[4][3] = nama;
                System.out.println(murid[4][3]);
                break;
                case "25":
                murid[4][4] = nama;
                System.out.println(murid[4][4]);
                break;
            case "2C":
            for (int i = 0; i < murid[5].length; i++) {
                System.out.println(murid[5][i]);
            }
            System.out.print("Silahkan pilih siswa : ");
            nama = sc.nextLine();
                case "26":
                murid[5][0] = nama;
                System.out.println(murid[5][0]);
                break;
                case "27":
                murid[5][1] = nama;
                System.out.println(murid[5][1]);
                break;
                case "28":
                murid[5][2] = nama;
                System.out.println(murid[5][2]);
                break;
                case "29":
                murid[5][3] = nama;
                System.out.println(murid[5][3]);
                break;
                case "30":
                murid[5][4] = nama;
                System.out.println(murid[5][4]);
                break;
                case "3A":
                for (int i = 0; i < murid[0].length; i++) {
                    System.out.println(murid[6][i]);
                }
                System.out.print("Silahkan pilih siswa : ");
                nama = sc.nextLine();
                    case "31":
                    murid[6][0] = nama;
                    System.out.println(murid[6][0]);
                    break;
                    case "32":
                    murid[6][1] = nama;
                    System.out.println(murid[6][1]);
                    break;
                    case "33":
                    murid[6][2] = nama;
                    System.out.println(murid[6][2]);
                    break;
                    case "34":
                    murid[6][3] = nama;
                    System.out.println(murid[6][3]);
                    break;
                    case "35":
                    murid[6][4] = nama;
                    System.out.println(murid[6][4]);
                    break;
                case "3B":
                for (int i = 0; i < murid[0].length; i++) {
                    System.out.println(murid[7][i]);
                }
                System.out.print("Silahkan pilih siswa : ");
                nama = sc.nextLine();
                    case "36":
                    murid[7][0] = nama;
                    System.out.println(murid[7][0]);
                    break;
                    case "37":
                    murid[7][1] = nama;
                    System.out.println(murid[7][1]);
                    break;
                    case "38":
                    murid[7][2] = nama;
                    System.out.println(murid[7][2]);
                    break;
                    case "39":
                    murid[7][3] = nama;
                    System.out.println(murid[7][3]);
                    break;
                    case "40":
                    murid[7][4] = nama;
                    System.out.println(murid[7][4]);
                    break;
                case "3C":
                for (int i = 0; i < murid[0].length; i++) {
                    System.out.println(murid[8][i]);
                }
                System.out.print("Silahkan pilih siswa : ");
                nama = sc.nextLine();
                    case "41":
                    murid[8][0] = nama;
                    System.out.println(murid[8][0]);
                    break;
                    case "42":
                    murid[8][1] = nama;
                    System.out.println(murid[8][1]);
                    break;
                    case "43":
                    murid[8][2] = nama;
                    System.out.println(murid[8][2]);
                    break;
                    case "44":
                    murid[8][3] = nama;
                    System.out.println(murid[8][3]);
                    break;
                    case "45":
                    murid[8][4] = nama;
                    System.out.println(murid[8][4]);
                    break;
        }
    }
}