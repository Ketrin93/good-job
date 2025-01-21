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
            System.out.println(  i + ";"); }

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
    }


}

