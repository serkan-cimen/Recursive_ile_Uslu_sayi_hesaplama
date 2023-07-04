import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Tabanı giriniz : ");
        int base = input.nextInt();

        System.out.print("Üssü giriniz : ");
        int exponent = input.nextInt();

        int result = usAlma(base, exponent);
        System.out.println("Sonuç : " + result);
    }

    public static int usAlma(int base,int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * usAlma(base, exponent - 1);
        }
    }
}