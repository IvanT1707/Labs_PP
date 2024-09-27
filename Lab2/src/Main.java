import java.util.Scanner;
/**
 * Основний клас Main
 */
public class Main {
    public static void main(String[] args) {

        Car[] cars = new Car[10];

        // Ініціалізація автомобілів з параметрами (id, рік випуску, ціна, модель, номерний знак)
        cars[0] = new Car(1, 2018, 65000, "Toyota", "АА 1234 ВК");
        cars[1] = new Car(2, 2020, 120000, "BMW", "КВ 5678 АІ");
        cars[2] = new Car(3, 2017, 90000, "Audi", "АІ 2345 ОН");
        cars[3] = new Car(4, 2019, 70000, "Volkswagen", "АВ 4567 МХ");
        cars[4] = new Car(5, 2021, 140000, "Mercedes", "АХ 6789 ВТ");
        cars[5] = new Car(6, 2016, 55000, "Nissan", "КА 9123 ІС");
        cars[6] = new Car(7, 2019, 80000, "Hyundai", "ВС 3412 НН");
        cars[7] = new Car(8, 2020, 95000, "Mazda", "АІ 7856 КМ");
        cars[8] = new Car(9, 2016, 60000, "Toyota", "КТ 9483 ВС");
        cars[9] = new Car(10, 2021, 100000, "Audi", "АВ 2341 ІТ");

        // Пошук автомобілів за моделлю
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть Модель автомобілів які хочете знайти: ");
        String model = scanner.nextLine();

        // Прапорець для перевірки чи знайдено авто
        boolean check = false;

        System.out.println("Автомобілі заданої моделі(" + model + "):");

        for(int i = 0; i < 10;i++){
            if(cars[i].getModel().equals(model)){
                cars[i].output();
                System.out.println();
                check = true;
            }
        }
        if(!check)
            System.out.println("Автомобілів із заданою моделю не знайдено");

        check = false;

        // Пошук автомобілів за моделлю та мінімальною кількістю років експлуатації
        System.out.print("Введіть Модель автомобілів які хочете знайти: ");
        model = scanner.nextLine();
        System.out.println("Введіть  мінімальну кількість років експулатації автомобіля: ");
        int year = scanner.nextInt();

        System.out.println("Автомобілі заданої моделі(" + model + ") які експлуатуються більше " + year + " років:");

        for(int i = 0; i < 10;i++){
            if(cars[i].getModel().equals(model) && 2024 - cars[i].getYear() > year){
                cars[i].output();
                System.out.println();
                check = true;
            }
        }
        if(!check)
            System.out.println("Автомобілів із заданими параметрами не знайдено");

        // Пошук автомобілів за мінімальною ціною і роком випуску
        System.out.print("Введіть мінімальну ціну автомобіля який хочете знайти: ");
        long price = scanner.nextLong();
        System.out.print("Введіть рік випуску автомобіля який хочете знайти: ");
        int year1 = scanner.nextInt();

        for(int i = 0; i < 10;i++){
            if(cars[i].getYear() == year1 && cars[i].getPrice() > price){
                cars[i].output();
                System.out.println();
                check = true;
            }
        }
        if(!check)
            System.out.println("Автомобілів із заданими параметрами не знайдено");

    }
}