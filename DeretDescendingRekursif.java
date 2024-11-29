import java.util.Scanner;

public class DeretDescendingRekursif {
    
    public static void tampilkanRekursif(int n) {
        if (n < 0) {
            return; 
        }
        System.out.print(n + " ");
        tampilkanRekursif(n - 1); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        int n = sc.nextInt();
        
        System.out.println("Deret dari " + n + " sampai 0 (rekursif):");
        tampilkanRekursif(n);
        
        sc.close();
    }
}
