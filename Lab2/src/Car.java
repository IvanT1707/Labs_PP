/**
 * Клас Car представляє автомобіль
 */
public class Car {
    int id, year;
    long price;
    String model, num;

    /**
     * Конструктор для створення об'єкта Car.
     * @param id    Унікальний ідентифікатор автомобіля.
     * @param year  Рік випуску автомобіля.
     * @param price Ціна автомобіля.
     * @param model Модель автомобіля.
     * @param num   Реєстраційний номер автомобіля.
     */
    Car(int id, int year, long price, String model, String num) {
        this.id = id;
        this.year = year;
        this.price = price;
        this.model = model;
        this.num = num;
    }

    /**
     * Виводить інформацію про автомобіль на екран.
     */
    void output() {
        System.out.println("ID: " + id);
        System.out.println("Рік випуску: " + year);
        System.out.println("Ціна: " + price);
        System.out.println("Модель: " + model);
        System.out.println("Реєстраційний номер: " + num);
    }

    /**
     * Повертає ID автомобіля.
     * @return ID автомобіля.
     */
    int getId() {
        return id;
    }

    /**
     * Повертає рік випуску автомобіля.
     * @return Рік випуску автомобіля.
     */
    int getYear() {
        return year;
    }

    /**
     * Повертає ціну автомобіля.
     * @return Ціна автомобіля.
     */
    long getPrice() {
        return price;
    }

    /**
     * Повертає модель автомобіля.
     * @return Модель автомобіля.
     */
    String getModel() {
        return model;
    }

    /**
     * Повертає реєстраційний номер автомобіля.
     * @return Реєстраційний номер автомобіля.
     */
    String getNum() {
        return num;
    }

    /**
     * Встановлює новий ID автомобіля.
     * @param id Новий ID автомобіля.
     * @return Новий ID автомобіля.
     */
    int setID(int id) {
        this.id = id;
        return id;
    }

    /**
     * Встановлює новий рік випуску автомобіля.
     * @param year Новий рік випуску автомобіля.
     * @return Новий рік випуску автомобіля.
     */
    int setYear(int year) {
        this.year = year;
        return year;
    }

    /**
     * Встановлює нову ціну автомобіля.
     * @param price Нова ціна автомобіля.
     * @return Нова ціна автомобіля.
     */
    long setPrice(long price) {
        this.price = price;
        return price;
    }

    /**
     * Встановлює нову модель автомобіля.
     * @param model Нова модель автомобіля.
     * @return Нова модель автомобіля.
     */
    String setModel(String model) {
        this.model = model;
        return model;
    }

    /**
     * Встановлює новий реєстраційний номер автомобіля.
     * @param num Новий реєстраційний номер автомобіля.
     * @return Новий реєстраційний номер автомобіля.
     */
    String setNum(String num) {
        this.num = num;
        return num;
    }
}
