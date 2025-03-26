//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 764789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println();

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();

        var firstGuyWeight = 78.2;
        var secondGuyWeight = 82.7;

        var bothGuysWeight = firstGuyWeight + secondGuyWeight;
        System.out.println(bothGuysWeight);

        var weight_difference = secondGuyWeight - firstGuyWeight;
        System.out.println(weight_difference);
        System.out.println();

        var divisionReminder = secondGuyWeight % firstGuyWeight;
        System.out.println(divisionReminder);
        System.out.println();

        var globalHoursToWork = 640;
        var singleHoursToWork = 8;
        var employeesAmount = globalHoursToWork / singleHoursToWork;
        System.out.println("Всего работников в компании — " + employeesAmount + " человек");
        System.out.println();

        var extraEmployeesAmount = 94;
        employeesAmount = employeesAmount + extraEmployeesAmount;
        var extraSingleHoursToWork = globalHoursToWork / employeesAmount;
        System.out.println("Если в компании работает "+employeesAmount+" человек, то всего "+extraSingleHoursToWork+" часов работы может быть поделено между сотрудниками");
    }
}