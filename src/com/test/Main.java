package com.test;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //  comment
        // first lesson Вывод данных (Базовые концепции)

        /*
        System.out.print("hello ");
        System.out.print("World ");
        System.out.println("!");
        System.out.print("\"hello\n\t  world\n\t\t   !\"");
        System.out.print("\nStart\n\"Привет\"\n\"Привет\"");
        System.out.print("\n\"hello\n hello\"");
        */

        // lesson two Переменные в джава. Типы данных
        /*
        System.out.println("переменные и типы данных");
        int age;
        age = 56;
        System.out.println("Возвраст: " + age + ".");
        age = 24;
        System.out.println("new value: " + age);
        byte ageb = 127;
        short val = 128;
        float val1 = 4.56f;
        double val2 = 4.5757d;
        byte ch = 't';
        String  name = "Test";
        System.out.println(name);
        boolean ishappy = false;
        */

        //lesson free Данные от пользователя. Математические действия
        // inport class scaner

        /*
        Scanner scan = new Scanner(System.in);
        System.out.print("Input name: ");
        String  username = scan.nextLine();
        System.out.println("Hi, " + username);
        System.out.println("Input nuber 1: ");
        float nam1 = scan.nextFloat();

        System.out.println("Input nuber 2: ");
        float nam2 = scan.nextFloat();

        float res1 = nam1 + nam2;
        float res2 = nam1 - nam2;
        float res3 = nam1 * nam2;
        float res4 = nam1 / nam2;
        System.out.println("Result: " );
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4);
        */

        //lesson four
        //Условные конструкции if-else; swich case break; тернарное условие;
        /*
        int x = 15, y = 10;
        char sym1 = 'A', sym2 = 'a';
        boolean isHasCar = false;

        if (x > y)
        {
            System.out.println("Да верно X больше Y");
        }
        if (sym1 != sym2)
            {
            System.out.println("Да верно a != A");
            }
//         (isHasCar) or (!isHasCar)
        if (isHasCar && x == y && sym1 != sym2)
        {
            System.out.println("Да верно no car");
        } else if(isHasCar)
        {
            System.out.println("Да верно no car");
        }

            else {
                    System.out.println("Не верно it car");
               }

        Scanner scanner = new Scanner(System.in); //Обьявляем класс Scanner scanner = new Scanner(System.in)
        System.out.print("Input the role: ");     //Выводим строку на экран
        String role = scanner.nextLine();         //Вводим строку
        System.out.print("Input the password: ");     //Выводим строку на экран
        String pass = scanner.nextLine();
        if(role.equals("admin") && pass.equals("admin"))                  //для проверки строки используется метод .equals
            {
                System.out.println("Oll Users");
            } else
                {
                    System.out.println("Hi, what is your name?");
                    String name = scanner.nextLine();

                }


        //swich-case

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        switch (num)
            {
                case 1:
                    System.out.println("Number is 1");
                    break;
                case 2:
                    System.out.println("Number is 2");
                    break;
                case 3:
                    System.out.println("Number is 3");
                    break;
                case 5:
                    System.out.println("Number is 5");
                    break;
                default:
                    System.out.println("Default");

            }
            */
        // Calc program
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("input first number: ");
        int num1 = scanner.nextInt();

        System.out.print("input second number: ");
        int num2 = scanner.nextInt();

        int res;

        System.out.print("input action: ");
        String action = scanner.nextLine(); //Перезапишем скрытый символ при вводе предпоследнего числа
        action = scanner.nextLine(); //Повторяем запрос на ввод действия

        switch (action){
            case "+":
                res = num1 + num2;
                System.out.println("Result: " + res);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Result: " + res);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Result: " + res);
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("Error");
                else {
                    res = num1 / num2;
                    System.out.println("Result: " + res);
                     }
                break;
            default:
                System.out.println("Incorrect input");
              }
             */

            //Циклы
            /*

            for (float i = 100; i > 1; i -= 10)
                {
                    System.out.println("element: " + i);
                }
            int i = 5;
            while (i <= 10)
                {
                    i++;
                    System.out.println("element: " + i);
                }
            do {
                i += 10;
                System.out.println("element: " + i);
                } while (i < 100);
             */

            //Операторы  в цыклах
            /*

            for (int i = 5; i < 25; i += 2)
                {
                    if (i % 3 == 0)
                        continue; //пропуск итерации возврат к циклу

                    if (i >= 17)
                        break; //выход из цыкла
                    System.out.println("element: " + i);
                }
             */
        // Задание Вывести квадраты чисел от 10 до 20
        /*

        for (int i = 10; i <= 20; i++)
            {
                System.out.println("Квадрат числа-i " + i + " = " + i * i);
            }
        int j = 10;
        while (j <= 20)
            {
                System.out.println("Квадрат числа-j " + j + " = " + j * j);
                j++;
            }
        int h = 10;
        do {
            System.out.println("Квадрат числа-h " + h + " = " + h * h);
            h++;
            }while (h <= 20);
         */

        // Массивы данных, одномерные и многомерные
        /*
        char[] stroka;
        int number[]; //no fault
        int[] nums = new int[10];
        nums[0] = 1; //добавление елемента в массив из 4 елементов
        int[] arr =  new int[] {9,3,6,4,5}; //обьявление и заполнение массива
        int[] arr_new = Arrays.copyOf(arr, arr.length); //копирование массива в новый массив
        System.out.println("Massive lenght: " + arr.length);

         */

        //найти в массиве найбольший элемент
        //первый вариант
        /*
        int i = 0;
        int var = arr[i];
        Arrays.sort(arr);
        while (i < arr.length)
        {
            System.out.print(arr[i]);
            if (var < arr[i])
                {
                var = arr[i];
                 }
            ++i;
        }
        System.out.println("  beggest element :" + var);
         */

        //второй вариант

        /*
        int var = arr[0];
        for (int i = 0; i < arr.length; i++)
            {
                System.out.print(" Element : " + arr[i]);
                if (var < arr[i])
                    {
                        var = arr[i];
                    }
            }
        System.out.println("  MAX Element : " + var);

        //многомерные массивы

        char[][] syms = new char[2][2];
        syms[0][0] = 't';
        System.out.println(syms[0][0]);
        byte[][] num = new byte[][]
                {
                    {5, 7},
                    {7, 3},
                    {2, 0}
                };
        num [1][1] = 69;
        System.out.println(num [1][1]);
        System.out.println(num [1][0]);
         */

        //Collection Java Framework (Коллекции)
        /*
        ArrayList<Integer> number = new ArrayList<>();
        LinkedList<Integer> numbers = new LinkedList<>();
        number.add(1);
        number.add(5);
        number.add(10);
        number.add(number.size());
        numbers.add(121);
        numbers.add(122);
        numbers.add(123);
        numbers.add(124);
        numbers.addFirst(120);
        numbers.addFirst(numbers.getLast() );

        // перебираем елементы коллекции с помощью цикла
        for(Integer el : number){
            System.out.println(el);
        }
        for(Integer els : numbers){
            System.out.println(els);
        }
         */

        //Function (Функции Методы)
        /*
        test();
        test();
        test1("hELLOY");
        String java = "java";
        info(java);
        info("");
         */

        /*
        int result1 = summa((short) 5,(short) 7);
        short num = 8;
        int result2 = summa((short) 5, num);
        info(String.valueOf(result2));
        byte[] nums1 = new byte[] {1,3,5};
        int summ1 = summaArray(nums1);
        System.out.println("Summa 1: " + summ1);

         */
        // Основы ООП Урок 11


    }
    // Записываем методы в не функций
    //Функции которые не возвращают результат
    public static void summa1(short a,short b){
        int res = a + b;
        String result = "Result " + res;
        info(result);
    }
    public static void test(){
        System.out.println("Output TXT");
    }
    public static void info(String word) {
        System.out.print(word);
        System.out.println("!");
    }
    //Функции которые  возвращают результат
    public static int summa(short a,short b) {
        int res = a + b;
        String result = "Result " + res;
        info(result);
        return res;
    }

    //Методы в Java - функция сложения елементов массива
    public static int summaArray(byte[] arr) {
        int summa = 0;
        for (byte i = 0; i < arr.length; i++){
                summa += arr[i];
        }
        return summa;
    }

}



