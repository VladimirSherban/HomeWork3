package com.skyPro;

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

    public static void task1() {
        System.out.println("Задача 1" + "\n");
        byte bananas = 3;
        short potato = 15;
        int apple = 10;
        long idPerson = 900600300L;
        float timeSpend = 3.5f;
        double maximumSpeed = 325.100;

        System.out.println("Значение переменной bananas с типом byte = " + bananas);
        System.out.println("Значение переменной potato с типом short = " + potato);
        System.out.println("Значение переменной apple с типом int = " + apple);
        System.out.println("Значение переменной idPerson с типом long = " + idPerson);
        System.out.println("Значение переменной timeSpend с типом float = " + timeSpend);
        System.out.println("Значение переменной maximumSpeed с типом double = " + maximumSpeed);
    }

    public static void task2() {
        System.out.println("\n" + "Задача 2" + "\n");
        float f = 2.12f;
        long l = 987678965549L;
        float f1 = 2.786f;
        short s = 569;
        short s1 = -159;
        short s2 = 27897;
        byte b = 67;
        System.out.println("float f = " + f + " long l = " + l + " float f1 = " + f1 + " short s = " + s +
                " short s1 = " + s1 + " short s2 = " + s2 + " byte b = " + b);
    }

    public static void task3() {
        System.out.println("\n" + "Задача 3" + "\n");
        byte studentOfLudmilaPavlovna = 23;
        byte studentOfAnnaSergeevna = 27;
        byte studentOfEkaterinaAndreevna = 30;
        short totalPaper = 480;
        int paperForStudent = totalPaper / (studentOfLudmilaPavlovna + studentOfAnnaSergeevna + studentOfEkaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");
    }

    public static void task4() {
        System.out.println("\n" + "Задача 4" + "\n");
        byte machinePerformanceInMinutes = 8;
        int machinePerformanceInTwentyMinutes = machinePerformanceInMinutes * 20;
        int machinePerformancePerDay = machinePerformanceInMinutes * 1440;
        int machinePerformanceInFreeDays = machinePerformancePerDay * 3;
        int machinePerformancePerMonth = machinePerformancePerDay * 30;
        System.out.println("Производительность машины за 20 минут = " + machinePerformanceInTwentyMinutes + " бутылок." +
                "\nПроизводительность машины в сутки  = " + machinePerformancePerDay + " бутылок." +
                "\nПроизводительность машины за три дня = " + machinePerformanceInFreeDays + " бутылок." +
                "\nПроизводительность машины за месяц = " + machinePerformancePerMonth + " бутылок.");
    }

    public static void task5() {
        System.out.println("\n" + "Задача 5" + "\n");
        byte totalPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int totalClasses = totalPaint / (whitePaint + brownPaint);
        int totalWhitePaint = totalClasses * whitePaint;
        int totalBrownPaint = totalClasses * brownPaint;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint + " банок белой краски и " +
                totalBrownPaint + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("\n" + "Задача 6" + "\n");
        int bananas = 80;
        int milk = 105;
        int iceCream = 100;
        int eggs = 70;
        float grPerKg = 1000f;
        int breakfastInGrams = bananas * 5 + milk * 2 + iceCream * 2 + eggs * 4;
        float breakfastInKg = breakfastInGrams / grPerKg;
        System.out.println("Вес спортзавтрака в граммах = " + breakfastInGrams + " гр" +
                "\nВес спортзавтрака в кг = " + breakfastInKg + " кг");
    }

    public static void task7() {
        System.out.println("\n" + "Задача 7" + "\n");
        int weightLoss = 250;
        int highWeightLoss = 500;
        int needToLose = 7000;

        int days = needToLose / weightLoss;
        int daysFastWeightLoss = needToLose / highWeightLoss;
        int daysAverage = (days + daysFastWeightLoss) / 2;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, уйдет " + days + " дней," +
                "\nесли каждый день будет худеть на 500 грамм, уйдет " + daysFastWeightLoss + " дней," +
                "\nв среднем потребуется " + daysAverage + " день.");
    }

    public static void task8() {
        System.out.println("\n" + "Задача 8" + "\n");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float salaryIncrease = 0.1f;

        int salaryMashaIncr = (int) (salaryMasha * salaryIncrease + salaryMasha);
        int salaryDifferentMasha = salaryMashaIncr - salaryMasha;
        int salaryDenisIncr = (int) (salaryDenis * salaryIncrease + salaryDenis);
        int salaryDifferentDenis = salaryDenisIncr - salaryDenis;
        int salaryKristinaIncr = (int) (salaryKristina * salaryIncrease + salaryKristina);
        int salaryDifferentKristina = salaryKristinaIncr - salaryKristina;
        System.out.println("После повышения зарплаты на 10% сотридники будут получать :" +
                "\nМаша - " + salaryMashaIncr + " рублей в месяц" +
                "\nДенис - " + salaryDenisIncr + " рублей в месяц" +
                "\nКристина - " + salaryKristinaIncr + " рублей в месяц" +
                "\nРазница между годовым доходом с нынешней зарплатой и после повышения : " +
                "\nМаша - " + salaryDifferentMasha + " рублей" +
                "\nДенис - " + salaryDifferentDenis + " рублей" +
                "\nКристина - " + salaryDifferentKristina + " рублей");
    }
}
