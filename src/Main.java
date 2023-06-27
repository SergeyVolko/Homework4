public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " +
                    age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " +
                    age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int t = 4;
        if (t <= 5) {
            System.out.println("На улице " + t +
                    " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + t +
                    " градусов,  можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 65;
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 20;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
        } else {
            if (age <= 18){
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
            } else {
                if (age <= 24) {
                    System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
                } else {
                    System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
                }
            }
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 9;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционе");
        } else {
            if (age < 14) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе "
                        + "в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе "
                        + "без сопровождения взрослого");
            }
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int places = 102;
        int seatPlaces = 60;
        int passengers = 65;
        if (passengers < seatPlaces) {
            System.out.println("Есть сидячее место.");
        } else {
            if (passengers < places) {
                System.out.println("Есть стоячее место");
            } else {
                System.out.println("Мест нет");
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 7;
        int two = 3;
        int three = 10;
        int max;
        if (one > two) {
            max = one;
        } else {
            max = two;
        }
        if (max < three) {
            max = three;
        }
        System.out.println(max);
    }
}