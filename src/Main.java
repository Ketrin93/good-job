public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("Итерация цикла " + i);
        }
        System.out.println(" Task 2");
        for (int i = 10; i > 1; i = i - 1) {
            System.out.println(" Итерация цикла " + i);
        }
        System.out.println(" Task 3");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(" Итерация " + i);
        }
        System.out.println(" Task 4");
        for (int i = 10; i >= -10; i--) {
            System.out.println(" Итерация цикла " + i);
        }
        System.out.println(" Task 5");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(" Високосный год " + i);
        }
        System.out.println(" Task 6");
        for (int i = 7; i < 98; i = i + 7) {
            System.out.println(" Итерация цикла " + i);
        }
        System.out.println(" Task 7");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i + ";");
        }
        System.out.println(" Task 8");
        int salary = 29000;
        int total = 0;
        for (int i = 0; i < 12; i = i + 1) {
            total = total + salary;
            System.out.println("Месяц" + (i + 1) + " сумма накоплений равна" + total + "рублей");
        }

        System.out.println(" Task 9");
        for (int i = 0; i < 12; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println(" Месяц " + i + " Итого" + total);
        }
        System.out.println(total);

        System.out.println("Task 10");

        for (int i = 1; i <= 10; i++) {
            System.out.println("2 * " + i + " = " + 2 * i);
        }
        System.out.println("Задача 1");
        int deposit = 15000;
        int summ = 0;
        int day = 0;
        while (summ < 2459000) {
            summ = summ + deposit;
            day++;
            System.out.println("день " + day + " Итого " + summ);
        }
        System.out.println("Задача 2");
        int start = 1;
        while (start < 10) {
            System.out.print("1 2 3 4 5 6 7 8 9 10 ");
            start = start + 1;
        }
        System.out.println();
        for (int i = 10; i > 1; i--) {
            System.out.print(" 10 9 8 7 6 5 4 3 2 1");


        }
        System.out.println("Задача 3");

        int population = 12_000_000;
        int birthRatePer1000 = 17;
        int mortalPer1000 = 8;
        int yearNow = 2024;
        for (int year = yearNow; year < yearNow + 10; year++) {
            population += population / 1000 * birthRatePer1000 - population / 1000 * mortalPer1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println("Задача 4");
        int deposit2 = 15000;
        double monthlyPercent = 0.07;
        int totalAmount = 12_000_000;
        int numberMonth = 1;

        while (deposit <= totalAmount) {
            deposit += deposit2 * monthlyPercent;
            System.out.printf("Месяц %d, сумма накоплений: %d%n", numberMonth, deposit);
            numberMonth++;
        }


        System.out.println("Задача 5");
        int vasyaPut = 15000;
        int zlato = 0;
        while (vasyaPut < 12000000) {
            vasyaPut = vasyaPut + vasyaPut / 100 * 7;
            zlato = zlato + 1;
            if (zlato % 6 == 0) {
            }
            System.out.println("Месяц" + zlato + "вклад равен" + vasyaPut);
        }
        System.out.println("Задача 6");

        int sum = 15000;
        int year = 9;
        int monthInTheYear = 12;
        int month2 = 0;
        int totalMonth = year * monthInTheYear;
        while (total  <= totalMonth)
            total = total + sum;
        total = total + (total * 7) / 100;
        if (month2 % 6 == 0) {
            System.out.println(" Месяц" + month2 + "сумма накоплений равна" + total);
        }
        System.out.println("Задача 7");
        int friday = 1;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + " -е число.Необходимо подготовить отчет");
            friday += 7;
        }
        System.out.println(" Задание 8");
        int yearBefore = 2024 - 200;
        int yearAfter = 2024 + 100;

        for (year = yearBefore; year < yearAfter; year ++) {
            if (year % 79 == 0){
                System.out.println(year);}
        }
    }
}








