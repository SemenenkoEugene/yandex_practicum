package Sprint1_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Praktikum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год арабскими цифрами:");

        while (true) {
            try {
                int year = scanner.nextInt();
                if (year < 0) {
                    System.out.println("Вы ввели неправильный номер года. Нужно вводить год больше 0.");
                } else {
                    if (isLeapYear(year)) {
                        System.out.println("День программиста отмечаем 12.09." + year);
                        printMessage(scanner);
                        break;
                    } else {
                        System.out.println("День программиста отмечаем 13.09." + year);
                        printMessage(scanner);
                        break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели не цифры! Пожалуйста запустите программу заново!");
                break;
            }
        }

    }

    public static boolean isLeapYear(int year) {

        return year % 400 == 0 && year % 4 == 0;
    }

    public static void printMessage(Scanner scanner) {
        System.out.println("Введите год арабскими цифрами или введите \"0\" для выхода");
        if (scanner.nextInt() == 0) {
            System.out.println("Выход из программы.");

        }
    }
}


