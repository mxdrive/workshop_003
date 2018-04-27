package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	    roundArr();
//        contInput();
//        deposite();
//        evenNumbered();
        maxRepeat();
    }

    //Найти среднее арифметическое элементов массива.
    private static void roundArr() {
        int sum = 0;
        int[] arr = {3,5,7,2,9,11};
        for (int a :
                arr) {
            sum += a;
        }
        System.out.println((double) sum /arr.length);
        System.out.println(Math.rint((double) sum/arr.length * 100)/100);
    }


    //Организовать беспрерывный ввод чисел с клавиатуры, пока пользователь не введет 0. После ввода нуля, показать на экран
    // количество чисел, которые были введены, их общую сумму и среднее арифметическое. Подсказка: необходимо объявить
    // переменную-счетчик, которая будет считать количество введенных чисел, и переменную, которая будет накапливать общую сумму чисел.
    private static void contInput() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        int count = 0;

        while (true){
            System.out.println("Type number and press enter. Type 0 for stop");
            number = scanner.nextInt();
            if (number == 0) break;
            sum += number;
            count++;
        }
        System.out.println(count + " numbers;\n" + "Sum is " + sum + ";\nMean is " + (double) sum/count);
    }

    //Создать депозитный калькулятор. В него ввести сумму вклада и процент по депозиту. Какой будет сумма вклада через N лет
    private static void deposite() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type amount");
        int amount = scanner.nextInt();
        System.out.println("Type percent");
        int percent = scanner.nextInt();
        System.out.println("Type years");
        int years = scanner.nextInt();

        while (years > 0) {
            amount += amount * percent / 100;
            years--;
        }
        System.out.println(amount);
    }

    //Создать второй массив из четных элементов первого массива.
    private static void evenNumbered() {
        int[] arr1 = {2, 3, 9, 5, 12, 1, 67, 20, 77, 4, 43, 3};
        int[] arr2 = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (i == 0) {
                arr2[0] = arr1[0];
                System.out.println("arr1[0] = " + arr1[0] + "\narr2[0] = " + arr2[0] + "\n_____________");
            }
            else if (i%2 == 0) {
                arr2[i/2] = arr1[i];
                System.out.println("arr1[" + i + "] = " + arr1[i] + "\narr2[" + i/2 + "] = " + arr2[i/2] + "\n_____________");
            }
        }
    }

    //Найти в массиве число, которое повторяется наибольшее количество раз.
    private static void maxRepeat() {
        int[] arr = {2, 5, 2, 3, 2, 4, 4, 4, 4, 4, 3, 3, 8, 2, 3, 3};
        int counterIn;
        StringBuilder whatNumber = null;
        int counterState = 0;

        for (int i = 0; i < arr.length; i++) {
            counterIn = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    counterIn++;
                }
            }
            if (counterState < counterIn) {
                counterState = counterIn;
                whatNumber = new StringBuilder(String.valueOf(arr[i]));
            } else if (counterState == counterIn && !whatNumber.toString().contains(String.valueOf(arr[i]))) {
                whatNumber.append(", ").append(String.valueOf(arr[i]));
            }
        }
        System.out.println("Most recently appeared number(s): " + whatNumber);
    }

    //Нарисовать треугольник из символов с числом рядов, определяемым пользователем (ввод с консоли).
    private static void triangle() {

    }

    //Имеется кусок ткани длиной M метров. От него последовательно отрезают куски равной длины. Все данные по использованию ткани заносятся в компьютер. Компьютер должен выдать сообщение о том, что материала не хватает, если будет затребован кусок ткани больше длины, чем имеется.





}
