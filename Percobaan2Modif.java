import java.util.Scanner;

public class Percobaan2Modif {
   
    static int hitungPangkat(int x, int y) {
        if (y == 0) {
            return (1);
        } else {
            if (y > 1) {
                System.out.print(x + " x ");
            } else {
                System.out.print(x);
            }
            return (x * hitungPangkat(x, y - 1));
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int bilangan, pangkat;

    System.out.print("Bilangan yang dihitung: ");
    bilangan = sc.nextInt();
    System.out.print("Pangkat: ");
    pangkat = sc.nextInt();

    int hasil = hitungPangkat(bilangan, pangkat);
    System.out.println(" = " + hasil);

    sc.close();
    }
}
