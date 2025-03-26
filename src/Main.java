//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 20000;
        byte b = 127;
        short c = 32767;
        long d = 92233634;
        float f = 3.14f;
        double g = 3.141592653;

        System.out.println("Значение переменной a с типом int равно "+a);
        System.out.println("Значение переменной b с типом byte равно "+b);
        System.out.println("Значение переменной c с типом short равно "+c);
        System.out.println("Значение переменной d с типом long равно "+d);
        System.out.println("Значение переменной f с типом float равно "+f);
        System.out.println("Значение переменной g с типом double равно "+g);
        System.out.println();

        float h = 27.12f;
        long k = 987678965549L;
        double l = 2.786;
        short m = 568;
        short n = -159;
        short p = 27897;
        byte q = 67;

        short firstClass = 23;
        short secondClass = 27;
        short thirdClass = 30;
        float paperAmount = 480;
        float paperPerStudent = paperAmount / (firstClass + secondClass + thirdClass);

        System.out.println("На каждого ученика рассчитано "+paperPerStudent+" листов бумаги.");
        System.out.println();

        int bottlePerMinute = 16 / 2;
        byte minutes = 20;
        int dayMinutes = 86400;
        int threeDaysMinutes = dayMinutes * 3;
        int monthMinutes = dayMinutes * 31;

        int minutesDone = minutes * bottlePerMinute;
        int dayDone = dayMinutes * bottlePerMinute;
        int threeDaysDone = threeDaysMinutes * bottlePerMinute;
        int monthDone = monthMinutes * bottlePerMinute;

        System.out.println("За 20 минут машина произвела "+minutesDone+" штук бутылок");
        System.out.println("За 24 часа машина произвела "+dayDone+" штук бутылок");
        System.out.println("За 3 дня машина произвела "+threeDaysDone+" штук бутылок");
        System.out.println("За 31 день машина произвела "+monthDone+" штук бутылок");
        System.out.println();

        byte whiteJarsPerClass = 2;
        byte brownJarsPerClass = 4;
        short jarsNeeded = 120;
        int classesAmount = jarsNeeded / (whiteJarsPerClass + brownJarsPerClass);
        int whiteJarsAmount = whiteJarsPerClass * classesAmount;
        int brownJarsAmount = brownJarsPerClass * classesAmount;

        System.out.println("В школе, где "+classesAmount+" классов, нужно "+whiteJarsAmount+" банок белой краски и "+brownJarsAmount+" банок коричневой краски");
        System.out.println();

        short gramsBanana = 80;
        short gramsMilk = 105;
        short gramsIceCream = 100;
        short gramsRawEgg = 70;

        short amountBananas = 5;
        short amountMilks = 200 / 100;
        short amountIceCreams = 2;
        short amountRawEggs = 4;

        float gramsSalt = (gramsBanana * amountBananas) + (gramsMilk * amountMilks) + (gramsIceCream * amountIceCreams) + (gramsRawEgg * amountRawEggs);
        float kgSalt = gramsSalt / 1000;

        System.out.println(kgSalt);
        System.out.println();

        short kgToLose = 7;
        int gramsToLose = kgToLose * 1000;
        short minPerDay = 250;
        short maxPerDay = 500;
        float medPerDay = (float) (minPerDay + maxPerDay) / 2;

        int bestCaseDays = gramsToLose / maxPerDay;
        int worstCaseDays = gramsToLose / minPerDay;
        int realCaseDays = (int) (gramsToLose / medPerDay);

        System.out.println("Худеть придётся "+bestCaseDays+" дня/день/дней в лучшем случае");
        System.out.println("Худеть придётся "+worstCaseDays+" дня/день/дней в худшом случае");
        System.out.println("Худеть придётся "+realCaseDays+" дня/день/дней в среднем случае");
        System.out.println();

        double mashaPayment = 67760;
        double denisPayment = 83690;
        double krestinaPayment = 76230;

        mashaPayment = mashaPayment * 1.1;
        denisPayment = denisPayment * 1.1;
        krestinaPayment = krestinaPayment * 1.1;

        double mPaymentDiff = mashaPayment / 11;
        double dPaymentDiff = denisPayment / 11;
        double kPaymentDiff = krestinaPayment / 11;

        System.out.println("Маша теперь получает "+mashaPayment+" рублей. Годовой доход вырос на "+mPaymentDiff+" рублей");
        System.out.println("Денис теперь получает "+denisPayment+" рублей. Годовой доход вырос на "+dPaymentDiff+" рублей");
        System.out.println("Крестина теперь получает "+krestinaPayment+" рублей. Годовой доход вырос на "+kPaymentDiff+" рублей");
        System.out.println();

    }
}