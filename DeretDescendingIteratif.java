import java.util.Scanner;

public class DeretDescendingIteratif {

    public static void tampilkanIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " "); 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan n: ");
        int n = sc.nextInt();
        
        System.out.println("Deret dari " + n + " sampai 0 (iteratif):");
        tampilkanIteratif(n);
        
        sc.close();
    }
}