
public class Main {
    public static void main(String[] args) {
        int[] expenses = {1000,200,5000,350,20000};
        int expensesSum = 0;
        for (int expens : expenses){
            expensesSum += expens;
        }
        System.err.println("Сумма трат за месяц составила "+expensesSum+" рублей");
        System.err.println();

        int minExpens = expenses[0];
        int maxExpens = expenses[0];

        for (int expens : expenses){
            if (expens > maxExpens){
                maxExpens = expens;
            }
            else if (expens < minExpens){
                minExpens = expens;
            }
        }
        System.err.println("Минимальная сумма трат за неделю составила "+minExpens+" рублей. Максимальная сумма трат за неделю составила "+maxExpens+" рублей");
        System.err.println();

        double averageExpens = expensesSum / expenses.length;
        System.err.println("Средняя сумма трат за месяц составила "+averageExpens+" рублей");
        System.err.println();

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        String fixedName = "";

        for (int i=reverseFullName.length-1; i >= 0 ; i--){
            fixedName += reverseFullName[i];
        }
        System.err.println(fixedName);
        System.err.println();


    }

}