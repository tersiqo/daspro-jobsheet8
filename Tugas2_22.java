
import java.util.Scanner;

public class Tugas2_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] cabangOlahraga = {"Badminton", "Tenis Meja", "Basket", "Bola Voli"};
        
        int jumlahAtlet = 5;
        
        System.out.print("Masukkan jumlah Politeknik yang berpartisipasi: ");
        int jumlahPoliteknik = scanner.nextInt();
        scanner.nextLine(); 
        
        String[][][] atlet = new String[jumlahPoliteknik][cabangOlahraga.length][jumlahAtlet];
        
        for (int p = 0; p < jumlahPoliteknik; p++) {
            System.out.println("Politeknik #" + (p + 1));
            for (int c = 0; c < cabangOlahraga.length; c++) {
                System.out.println("Masukkan nama 5 atlet untuk cabang " + cabangOlahraga[c] + ":");
                for (int a = 0; a < jumlahAtlet; a++) {
                    System.out.print("Atlet " + (a + 1) + ": ");
                    atlet[p][c][a] = scanner.nextLine();
                }
            }
            System.out.println();
        }
        
        System.out.println("\n=== Informasi Nama Atlet ===");
        for (int p = 0; p < jumlahPoliteknik; p++) {
            System.out.println("Politeknik #" + (p + 1) + ":");
            for (int c = 0; c < cabangOlahraga.length; c++) {
                System.out.println("Cabang Olahraga: " + cabangOlahraga[c]);
                for (int a = 0; a < jumlahAtlet; a++) {
                    System.out.println("  Atlet " + (a + 1) + ": " + atlet[p][c][a]);
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
}