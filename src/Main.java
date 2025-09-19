import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void checkYear(int year) {
                if ((year >= 1584 && year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
                System.out.println(year + " год — високосный год");
            } else {
                System.out.println(year + " год — невисокосный год");
            }
    }

    public static void printAppVersionRecommendation(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите стандартную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите стандартную версию приложения для Android по ссылке");
        }
    }

    public static int calculatingDeliveryTime(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance < 60) {
            return 2;
        } else if (deliveryDistance < 100) {
           return 3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Задание 1");
        checkYear(1587);

        System.out.println("Задание 2");
        printAppVersionRecommendation(0, 2014);

        System.out.println("Задание 3");
        int days = calculatingDeliveryTime(50);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставка не возможна");
        }
    }
}