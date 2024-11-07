//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("dog = " + dog + ", " + "cat = " + cat + ", " + "paper = " + paper);

        dog += 4;
        cat += 4;
        paper += 4;
        System.out.println("dog = " + dog + ", " + "cat = " + cat + ", " + "paper = " + paper);

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog + ", " + "cat = " + cat + ", " + "paper = " + paper);

        var friend = 19;
        System.out.println("friend = " + friend);
        friend += 2;
        System.out.println("friend = " + friend);
        friend /= 7;
        System.out.println("friend = " + friend);

        var frog = 3.5;
        System.out.println("frog = " + frog);
        frog *= 10;
        System.out.println("frog = " + frog);
        frog /= 3.5;
        System.out.println("frog = " + frog);
        frog += 4;
        System.out.println("frog = " + frog);

        var mass1 = 78.2;
        var mass2 = 82.7;
        var totalMass = mass1 + mass2;
        System.out.println("Общая масса двух бойцов = " + totalMass);
        var diffMass = mass1 - mass2;
        System.out.println("Разница между массами двух бойцов = " + Math.abs(diffMass));
        var balance = mass2 % mass1;
        System.out.println("Остаток от деления = " + balance);

        var totalHours = 640;
        var hoursPerPerson = 8;
        var people = totalHours / hoursPerPerson;
        System.out.println("Всего работников в компании = " + people);

        people += 94;
        hoursPerPerson = totalHours/people;
        System.out.println("Если в компании работает " + people + " человек, то всего " + hoursPerPerson + " часов работы может быть поделено между сотрудниками");


    }
}


