package converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean cont = true;
        String choice = "";
        String number = "0";
        int base = 0;
        while (cont) {
            System.out.print("Do you want to convert /from decimal or /to decimal? (To quit type /exit) ");
            choice = scanner.next();
            switch (choice) {
                case "/from" :
                    System.out.print("Enter a number in decimal system: ");
                    number = scanner.next();
                    System.out.print("Enter the target base: ");
                    base = scanner.nextInt();
                    if (base == 2 || base == 8 ||base == 16) {
                        System.out.println("Conversion result: " + Integer.toString(Integer.parseInt(number), base));
                    } else {
                        System.out.println("Wrong base");
                    }
                    break;
                case "/to" :
                    System.out.print("Enter source number:");
                    number = scanner.next();
                    System.out.print("Enter the source base: ");
                    base = scanner.nextInt();
                    if (base == 2 || base == 8 ||base == 16) {
                        System.out.println("Conversion to decimal result: "  + Integer.parseInt(number, base));
                    } else {
                        System.out.println("Wrong base");
                    }
                    break;
                case "/exit" :
                    cont = false;
                    break;
                default :
                    System.out.println("Wrong choise");
            }
        }
    }
}
