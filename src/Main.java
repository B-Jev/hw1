public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

    }

    private static void task2() {
        System.out.println("Задача 2");
        var dog = 8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        System.out.println(paper);
    }
    private static void task3() {
        System.out.println("Задача 3");
        var dog = 8.0;
        dog = dog + 4;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat + 4;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper + 4;
        paper = paper - 7639;
        System.out.println(paper);
    }
    private static void task4() {
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    private static void task5() {
        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    private static void task6() {
        System.out.println("Задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг.");
        var weightDifference = boxer2 - boxer1;
        System.out.println("Разница между весами бойцов " + weightDifference + " кг.");
    }
    private static void task7() {
        System.out.println("Задача 7");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var weightDifference1 = boxer2 - boxer1;
        System.out.println("Разница между весами бойцов вариант (1)  " + weightDifference1 + " кг.");
        var weightDifference2 = boxer2 % boxer1;
        System.out.println("Разница между весами бойцов вариант (2)  " + weightDifference2 + " кг.");
    }

    private static void task8() {
        System.out.println("Задача 8");
        var workingHours = 640;
        var workerNorm = 8;
        var numberWorkers = workingHours / workerNorm;
        System.out.println("Всего работников в компании — " + numberWorkers + " человек");
        var additionalStaff = 94;
        var numberWorks1 = numberWorkers + additionalStaff;
        var workerNorm1 = workerNorm * numberWorks1;
        System.out.println("Если в компании работает " + numberWorks1 + " человек, то всего " + workerNorm1 + " часов работы может быть поделено между сотрудниками");
    }


}