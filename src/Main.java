import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        printLeapYearOrNot(2024);
        System.out.println("Task2");
        installOS(2024, 1);
        System.out.println("Task3");
        int deliveryDistance = 95;
        countDeliveryDays(deliveryDistance);
    }

    public static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printLeapYearOrNot(int year) {
        String yearLeap = "год является високосным";
        String yearNotLeap = "год не является високосным";
        String answer = isLeap(year) ? yearLeap : yearNotLeap;
        System.out.printf("%d %s %n", year, answer);
    }

    public static boolean isActualYear(int year) {
        return year >= LocalDate.now().getYear();
    }

    public static void installOS(int year, int typeOS) {
        String clientOS = typeOS == 0 ? "iOS" : "Android";
        String installLightVersion = "Устанавливаю облегченную версию ";
        String installFullVersion = "Устанавливаю полную версию ";
        String answer = isActualYear(year) ? installFullVersion : installLightVersion;
        System.out.printf("%s %s %n", answer, clientOS);
    }

    public static void countDeliveryDays(int distance) {
        int deliveryDays = 1;
        if (distance > 20) deliveryDays++;
        if (distance > 60 && distance <= 100) deliveryDays++;
        else System.out.println("Доставки нет");
        System.out.printf("Потребуется дней: %d", deliveryDays);
    }
}