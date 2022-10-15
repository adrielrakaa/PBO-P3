package Sesi3;

import java.util.Scanner;

public class Nilai {
    public static void main (String [] arg){

        String nama , nim ;

        int nilai;
        
        char grade;
        Scanner input = new Scanner (System.in);

  System.out.println("===== Menghitung Nilai Mahasiswa=====\n");

        System.out.print("Masukan nama : ");

        nama = input.nextLine();

        System.out.print("Masukan NIM : ");

        nim = input.nextLine();

        System.out.print("Nilai tugas : ");

        nilai = input.nextInt();
        if (nilai >= 90 && nilai <=100){
            grade = 'A';
        }
        else if (nilai > 95 && nilai < 85){
            grade = 'B';
        }
        else if (nilai > 85 && nilai < 75){
            grade = 'C';
        }
        else if (nilai > 60 && nilai < 65){
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        if (grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println("\n"+nama+" dengan NIM "+nim+" memiliki nilai akhir "+nilai+" = ("+grade+")"+""
                    + "\n dan dinyatakan Lulus");
        }
        else {
            System.out.println("\n"+nama+" dengan NIM "+nim+" memiliki nilai akhir "+nilai+" = ("+grade+")"+""
                    + "\n dan dinyatakan Tidak Lulus");
        }  
    }
}
