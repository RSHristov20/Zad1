import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NumberListOperations {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Изберете опция:");
            System.out.println("1. Добавяне на число");
            System.out.println("2. Извеждане на всички числа");
            System.out.println("3. Намиране на най-голямото число");
            System.out.println("4. Намиране на най-малкото число");
            System.out.println("5. Изход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Въведете число: ");
                    int num = scanner.nextInt();
                    numbers.add(num);
                    break;
                case 2:
                    System.out.println("Всички числа в списъка:");
                    for (int number : numbers) {
                        System.out.println(number);
                    }
                    break;
                case 3:
                    if (!numbers.isEmpty()) {
                        int max = Collections.max(numbers);
                        System.out.println("Най-голямото число в списъка: " + max);
                    } else {
                        System.out.println("Списъкът е празен.");
                    }
                    break;
                case 4:
                    if (!numbers.isEmpty()) {
                        int min = Collections.min(numbers);
                        System.out.println("Най-малкото число в списъка: " + min);
                    } else {
                        System.out.println("Списъкът е празен.");
                    }
                    break;
                case 5:
                    System.out.println("Изход от програмата.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Невалиден избор. Моля, опитайте отново.");
            }
        }
    }
}
