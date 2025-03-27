//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        short age = 18;

        System.out.print("Если возраст человека равен "+age+", ");
        if (age >= 18) {
            System.out.println("он совершеннолетний");
        }
        else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();

        short temperature = 6;

        System.out.print("На улице "+temperature+" градусов, ");
        if (temperature <= 5) {
            System.out.println("нужно надеть шапку");
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else {
            System.out.println("можно идти без шапки");
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println();

        short speed = 40;

        System.out.print("Если скорость "+speed+", то ");
        if (speed >= 60) {
            System.out.println("придется заплатить штраф");
        }
        else {
            System.out.println("можно ездить спокойнои");
        }
        System.out.println();

        short childAge = 25;

        System.out.print("Если возраст человека равен "+ childAge +", то ему нужно ходить ");
        if (2 <= childAge && childAge <= 6) {
            System.out.println("в детский сад");
        } else if (7 <= childAge && childAge <= 17) {
            System.out.println("в школу");
        } else if (18 <= childAge && childAge <= 24) {
            System.out.println("в университет");
        }
        else {
            System.out.println("на работу");
        }
        System.out.println();

        short customerAge = 25;

        System.out.print("Если возраст ребенка равен "+ customerAge +", то ему ");
        if (customerAge <= 5) {
            System.out.println("нельзя кататься на аттракционе");
        } else if (5 <= customerAge && customerAge <= 14) {
            System.out.println("можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("можно кататься без сопровождения взрослого");
        }
        System.out.println();

        short trainCapacity = 102;
        short trainSittingCapacity = 60;
        short passengersAmount = 61;

        if (passengersAmount <= trainSittingCapacity) {
            System.out.println("Есть место в вагоне, сидячее");
        } else if (passengersAmount <= trainCapacity) {
            System.out.println("Есть место в вагоне, cтоячее");
        }
        else {
            System.out.println("Вагон уже полностью забит");
        }
        System.out.println();

        int one = 5;
        int two = 1;
        int three = 3;

        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > three) {
            System.out.println(two);
        }else {
            System.out.println(three);
        }
    }
}