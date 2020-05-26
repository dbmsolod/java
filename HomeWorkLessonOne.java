package ru.geekbrains.lesson1;

public class HomeWorkLessonOne {

    public static void main(String[] args) {

        // exercise 2
        byte byteVal = -128;
        short shortVal = 32767;
        int intVal = 1234567890;
        long longVal = 905000L;
        float floatVal = 36.6f;
        double doubleVal = 311.456;
        char charVal = 'G';
        boolean booleanVal = true;

        int a =  1, b = 100, c = 4, d = 2;

        System.out.println("- - - - - - - - - - Упражнение 3: - - - - - - - - - -");
        System.out.println("\nРезультат выражения " + a +" * (" + b + " + (" + c + " / " + d + ")) = " + arithmeticOperation(a, b, c, d));


        System.out.println("\n\n- - - - - - - - - - Упражнение 4: - - - - - - - - - -");
        int firstNumber = 5, secondNumber = 11;

        if (twoNumbers(firstNumber, secondNumber)) {
            System.out.println("\nСумма чисел " + firstNumber + " + " + secondNumber + " лежит в пределах от 10 до 20 включительно.");
        } else
        {
            System.out.println("\nСумма чисел " + firstNumber + " + " + secondNumber + " в диапазон от 10 до 20 не попадает.");
        }

        System.out.println("\n\n- - - - - - - - - - Упражнение 5: - - - - - - - - - -");
        positiveOrNegative(0);

        System.out.println("\n\n- - - - - - - - - - Упражнение 6: - - - - - - - - - -");
        int someNumber = -1290;
        if (isNumberNegative(someNumber)) {
            System.out.println("\n Метод вернул true, т.к. число " + someNumber + " является отрицательным.");
        } else {
            System.out.println("\n Метод вернул false, т.к. число " + someNumber + " является положительным.");
        }

        System.out.println("\n\n- - - - - - - - - - Упражнение 7: - - - - - - - - - -");
        String myName = "Аркадий Райкин";
        whatIsYourName(myName);
    }

    // exercise 3
    public static int arithmeticOperation(int a, int b, int c, int d) {

        int res = a * (b + (c / d));

        return res;
    }

    // exercise 4
    public static boolean twoNumbers(int firstNumber, int secondNumber) {

        int summ = firstNumber + secondNumber;
        boolean res;

        if (summ >= 10 && summ <= 20) {
            res = true;
        } else {
            res = false;
        }

        return res;
    }

    // exercise 5
    public static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("\n Число " + a + " является положительным.");
        } else {
            System.out.println("\n Число " + a + " является отрицательным.");
        }
    }

    // exercise 6
    public static boolean isNumberNegative(int someNumber) {
        if (someNumber < 0) {
            return true;
        } else {
            return false;
        }
    }

    // exercise 7
    public static void whatIsYourName(String name) {
        System.out.println("\nПривет, " + name + "!");
    }

}
