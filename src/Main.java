public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 0; i <= 17; i+=2) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 1904; i <= 2096; i+=4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();

        for (int i = 7; i <= 98; i+=7) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 1; i <= 512; i*=2) {
            System.out.println(i);
        }
        System.out.println();

        double salary = 0;
        for (int i = 1; i <= 12; i++) {
            salary += 29000;
            System.out.println("Месяц "+i+", сумма накоплений равна "+salary+" рублей");
        }
        System.out.println();

        salary = 0;
        for (int i = 1; i <= 12; i++) {
            salary = salary + 29000 + (salary * 0.01);
            System.out.println("Месяц "+i+", сумма накоплений равна "+salary+" рублей");
        }
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.println("2*"+i+"="+i*2);
        }
        System.out.println();

    }
}