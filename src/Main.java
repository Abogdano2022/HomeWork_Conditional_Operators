public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int clientOS = 1;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по сслыке");
        }

        int clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию для IOS по ссылке");

        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите обычную версию для Android по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear < 2014) {
            System.out.println("Установите облегченную версию для IOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2014) {
            System.out.println("Установите облегченную версию для Android по ссылке");
        }
        ;

        int year = 2021;
        if (year % 4 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год невисокосный");
        }

        int deliveryDistance = 95;
        int deliveryTime = 1;
        int deliveryTime2 = deliveryTime + 1;
        int deliveryTime3 = deliveryTime2 + 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней " + deliveryTime);
        } else if (deliveryDistance >= 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + deliveryTime2);
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + deliveryTime3);
        }

        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого сезона не существует");

        }
    }}






















