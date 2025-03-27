//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte clientOS = 0;
        short clientDeviceYear = 2017;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }else  {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();

        if (clientDeviceYear < 2015) {
            if (clientOS == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        }else {
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }else  {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        System.out.println();

        short year = 2000;

        if (year <= 1584 || (year % 400 != 0 && year % 100 == 0) || year % 4 != 0) {
            System.out.println(year+" год не является високосным");
        } else {
            System.out.println(year+" год является високосным");
        }
        System.out.println();

        short deliveryDistance = 95;

        if (deliveryDistance > 100) {
            System.out.println("доставки нет");
        } else if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1");
        }else {
            System.out.println("Потребуется дней: "+deliveryDistance/40);
        }
        System.out.println();

        byte monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("неизвестно");
        }


    }
}