import java.util.Scanner;

public class Algoritm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа через пробел");
        String input = scanner.nextLine();

        String[] numbers = input.split(" ");

        System.out.println("Элементы массива, кратные 3:");
        for (String number: numbers) {
            int num = Integer.parseInt(number);
            if (num % 3 == 0 & num != 0) {
                System.out.println(num);
            }
        }
    }
}
