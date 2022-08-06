import java.util.Scanner;

public class Kombinasyon {
    public static void main(String[] args) {
        int n, r;
        int nTotal = 1, rTotal = 1, kTotal = 1;
        double result;

        //n'in r'li kombinasyonunu bulma:
        //C(n,r) = n! / (r! * (n-r)!)

        Scanner veri = new Scanner(System.in);
        System.out.print("n eleman  giriniz:");
        n = veri.nextInt();
        System.out.print("r eleman  giriniz:");
        r = veri.nextInt();

        for (int i = 1; i <= n; i++) {
            nTotal *= i;
        }
        for (int i = 1; i <= r; i++) {
            rTotal *= i;
        }
        for (int i = 1; i <= (n - r); i++) {
            kTotal *= i;
        }

        result = nTotal / (rTotal * kTotal);

        System.out.println(result);

    }
}
