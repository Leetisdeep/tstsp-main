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

        salary = 0;
        int month = 1;
        while (salary < 2_459_000) {
            salary += 15_000;
            month++;
        }
        System.out.println("Месяц "+month+", сумма накоплений равна "+salary+" рублей");
        System.out.println();

        int i = 0;
        while (i < 10){
            i++;
            System.out.print(i+" ");
        }
        System.out.println();
        for (; i >= 1;i--) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println();

        long population = 12_000_000;
        int j = 1;
        for (; j <= 10; j++) {
            long deathsAmount = population / 1000 * 8;
            long bornAmount = population / 1000 * 17;

            population -= deathsAmount;
            population += bornAmount;

            System.out.println("Год "+j+", численность населения составляет "+population);
        }
        System.out.println();

        double bank = 15_000;
        int mountsAmount = 0;
        while (bank < 12_000_000){
            mountsAmount++;
            bank += bank * 0.07;
            System.out.println(bank);
        }
        System.out.println(mountsAmount);
        System.out.println();

        bank = 15_000;
        mountsAmount = 0;
        while (bank < 12_000_000){
            mountsAmount++;
            bank += bank * 0.07;
            if (mountsAmount % 6 == 0) {
                System.out.println(bank);
            }
        }
        System.out.println(mountsAmount);

        bank = 15_000;
        mountsAmount = 0;
        for (int m=1; m <= 9 * 12; m++){
            mountsAmount++;
            bank += bank * 0.07;
            if (mountsAmount % 6 == 0) {
                System.out.println(bank);
            }
        }
        System.out.println();

        byte firstFriday = 4;
        for (int m=0;m <= 3;m++){
            System.out.println("Сегодня пятница, "+(firstFriday + 7*m)+"-е число. Необходимо подготовить отчет");
        }
        if (firstFriday <= 3){
            System.out.println("Сегодня пятница, "+(firstFriday + 7*4)+"-е число. Необходимо подготовить отчет");
        }
        System.out.println();

        int year = 2025;
        int cometFly = 79;
        int negativeInterval = 200;
        int positiveInterval = 100;

        int cometYear = year - year % cometFly;
        int timesCometFlewBefore = (negativeInterval-(year-cometYear)) / cometFly;
        int timesCometFlewAfter = (year+positiveInterval-cometYear) / cometFly;

        for (int tc=timesCometFlewBefore;tc >= 0;tc--){
            System.out.println(cometYear - (cometFly * tc));
        }
        for (int tc=1;tc <= timesCometFlewAfter;tc++){
            System.out.println(cometYear + (cometFly * tc));
        }

    }
}