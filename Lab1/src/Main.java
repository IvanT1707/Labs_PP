import java.util.Scanner;

// Основний клас Main
public class Main {

    // Основна функція Main
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість перших чисел Люка: ");
        int b = scanner.nextInt();

        // Ініціалізація масиву об'єктів Luke
        Luke[] LukeNumbers = new Luke[b];

        // Ініціалізуємо перші два числа Люка L_0 і L_1
        if (b > 0) LukeNumbers[0] = new Luke(0, 2); // L_0 = 2
        if (b > 1) LukeNumbers[1] = new Luke(1, 1); // L_1 = 1

        System.out.println("Сума квадратів " + b + " перших чисел Люка:");

        long sum = 0;

        for (int i = 0; i < b; i++) {
            if (i == 0) {
                sum += LukeNumbers[0].getvalue2();
                System.out.println("L_0 = " + LukeNumbers[0].getvalue() + ", L_0^2 = " + LukeNumbers[0].getvalue2());
            } else if (i == 1) {
                sum += LukeNumbers[1].getvalue2();
                System.out.println("L_1 = " + LukeNumbers[1].getvalue() + ", L_1^2 = " + LukeNumbers[1].getvalue2());
            } else {
                // Ініціалізуємо наступне число Люка
                LukeNumbers[i] = new Luke(i, LukeNumbers[i - 1].getvalue() + LukeNumbers[i - 2].getvalue());
                sum += LukeNumbers[i].getvalue2();
                System.out.println("L_" + i + " = " + LukeNumbers[i].getvalue() + ", L_" + i + "^2 = " + LukeNumbers[i].getvalue2());
            }
        }

        for(int j = 0; j < b - 1; j++) {
            System.out.print(LukeNumbers[j].getvalue2() + " + ");
        }

        System.out.println(LukeNumbers[b - 1].getvalue2() + " = " + sum);
        System.out.println("Обчислена сума квадратів: " + sum);
    }
}