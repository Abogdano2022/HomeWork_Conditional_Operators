public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по сслыке");
        }

        int clientDeviceYear = 2014;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {System.out.println("Установите облегченную версию приложения IOS по ссылке");
        } else {
            System.out.println("Установите версию для IOS по ссылке");

        }}
            if (clientOS == 1) {
                if (clientDeviceYear < 2015) {System.out.println("Установите облегченную версию приложения Android по ссылке");
                } else {
                    System.out.println("Установите версию для Android по ссылке");

                }}


        int year = 2021;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год невисокосный");
        }

        int deliveryDistance = 95;
        int deliveryTime = 1;

        if (deliveryDistance > 20) {deliveryTime++;}

        if (deliveryDistance > 60) {deliveryTime++;}

             {
            System.out.println("Потребуется дней " + deliveryTime);
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






















