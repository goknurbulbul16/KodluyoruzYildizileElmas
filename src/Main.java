import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int k = n; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int k = 1; k <= n; k++) {
            for (int l = 1 ; l <= k; l++) {
                System.out.print(" ");
            }
            for (int m = n; m > k ; m--) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}