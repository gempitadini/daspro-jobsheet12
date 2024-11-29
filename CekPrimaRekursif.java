import java.util.Scanner;

public class CekPrimaRekursif {

    static boolean cekPrimaRekursif(int n, int i) {
        if (n < 2) {
            return false;
        } if (i == 1) {
            return true;
        } if (n % i == 0) {
            return false;
        } return cekPrimaRekursif(n, i - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int n = sc.nextInt();

        boolean prima = cekPrimaRekursif(n, n - 1);

        if (prima) {
            System.out.println(n + " adalah bilangan prima");
        } else {
            System.out.println(n + " bukan bilangan prima");
        }
        sc.close();
    }
}