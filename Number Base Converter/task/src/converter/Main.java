package converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number in decimal system: ");
        int decimal = scanner.nextInt();

        System.out.print("\nEnter target base: ");
        int base = scanner.nextInt();

        String result = Integer.toString(decimal, base);
        System.out.print("\nConversion result:");
        System.out.print(result);

    }
}
