import java.util.Scanner;

public class PenjumlahanRekursif {

    public static int hitungPenjumlahan(int n) {
        if (n <= 0) {
            return 0; 
        } return n + hitungPenjumlahan(n - 1); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("f = ");
        int f = sc.nextInt();
        
        System.out.print("");
        for (int i = 1; i <= f; i++) {
            System.out.print(i);
            if (i < f) {
                System.out.print(" + "); 
            }
        }
        int hasil = hitungPenjumlahan(f);
        System.out.println(" = " + hasil); 
        
        sc.close();
    }
}