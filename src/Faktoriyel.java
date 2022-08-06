import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {
        int a, total = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Faktoriyel Sayisini giriniz:");
        a = inp.nextInt();

        for (int i = 1; i <= a; i++) {
            total *= i;
        }

        System.out.println(a+" faktoriyel:"+total);
    }
}

