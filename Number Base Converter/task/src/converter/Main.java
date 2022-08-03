package converter;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter two numbers in format: {source base} {target base} (To quit type /exit) ");
            String maybeSourceBase = scanner.next();
            if ("/exit".equals(maybeSourceBase)) {
                return;
            }

            int targetBase = scanner.nextInt();
            convertOperation(Integer.parseInt(maybeSourceBase), targetBase, scanner);

        } while (true);
    }


    private static void convertOperation(int sourceBase, int targetBase, Scanner scanner) {
        do {
            System.out.printf("Enter number in base %d to convert to base %d (To go back type /back) ", sourceBase, targetBase);
            String maybeSource = scanner.next();
            if ("/back".equals(maybeSource)) {
                return;
            }

            String target = new BigInteger(maybeSource, sourceBase).toString(targetBase).toUpperCase();
            System.out.println("Conversion result: " + target);

        } while (true);
    }
}
