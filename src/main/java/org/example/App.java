package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

            Scanner scanner=new Scanner(System.in);

            System.out.println("Введите число a ");
            int a = scanner.nextInt();

            System.out.println("Введите число b ");
            int b = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Введите знак ");
            String c= scanner.nextLine();

            Claculation claculation=new Claculation();

            switch (c) {
                case "+" -> System.out.println(claculation.plus(a, b));
                case "-" -> System.out.println(claculation.minus(a, b));
                case "*" -> System.out.println(claculation.umnozh(a, b));
                case "/" -> System.out.println(claculation.delenie(a, b));
            }

    }
}
