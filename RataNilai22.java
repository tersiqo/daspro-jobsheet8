import java.util.Scanner;

public class RataNilai22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i, j;
        float Nilai, TotalNilai, RataNilai;
        i = 1;

        while (i <= 5) {
            j = 1;
            TotalNilai = 0;
            System.out.println("Masukkan Nilai Siswa Ke-" + i);
            while (j <= 5) {
                System.out.print("Masukkan Nilai = ");
                TotalNilai += input.nextInt();
                j++;
            }
            RataNilai = TotalNilai / 5;
            System.out.println("Total nilai dari siswa ke " + i + " \t:" + TotalNilai);
            System.out.println("Rata Rata Nilai \t\t: " + RataNilai + "\n");
            i++;
        }
    }
}