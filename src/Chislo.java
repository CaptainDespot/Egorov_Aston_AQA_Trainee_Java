import java.util.Scanner;

public class Chislo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введи число");
        int a = scanner.nextInt();

        if (a > 7) {
            System.out.println("Привет");
        }
    }
}
