
public class Main {
    
    public static void whichApp(int clientOS,int clientDeviceYear){
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
    }
    
    public static void isLeapYear(int year){
        if (year <= 1584 || (year % 400 != 0 && year % 100 == 0) || year % 4 != 0) {
            System.out.println(year+" год не является високосным");
        } else {
            System.out.println(year+" год является високосным");
        }
    }
    
    public static int getDeliveryDistance(int deliveryDistance){
        if (deliveryDistance > 100) {
            return-1;//нет доставки
        } else if (deliveryDistance <= 20) {
            return 1;
        }else {
            return deliveryDistance/40;
        }
    }
    
    public static void main(String[] args) {
        int year = 2025;
        
        isLeapYear(year);
        
        whichApp(1,year);
        
        System.out.println(getDeliveryDistance(95));

    }

}