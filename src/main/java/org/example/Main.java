package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите три целых числа a, b и c для определения треугольника:");//ввод сторон стеугольника
        System.out.println("Введите  a: ");
        int a = scanner.nextInt();
        System.out.println("Введите  b: ");
        int b = scanner.nextInt();
        System.out.println("Введите  с: ");
        int c = scanner.nextInt();

        if ((a + b > c) && (b + c > a) && (c + a > b)) { // проверка треугольник ли это
            if ((a == b) && (b == c)) {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами равностороннего треугольника");//равносторонний
            } else if ((a == b) || (b == c) || (c == a)) {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами равнобедренного треугольника"); // равнобед
            } else if ((a * a + b * b == c * c) || (b * b + c * c == a * a) || (c * c + a * a == b * b)) {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами прямоугольного треугольника"); // прямоугольный
            } else {
                System.out.println(a + ", " + b + " и " + c + " являются сторонами обычного треугольника"); // это база
            }
        } else {
            System.out.println(a + ", " + b + " и " + c + " не являются сторонами треугольника");// ни рыба ни мясо
        }
    }
}
