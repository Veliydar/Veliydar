package com.company;

import java.util.Random;
import java.util.Scanner;

public class lesson3
{

    public static void main(String[] args)
    {
        System.out.println("Введите число, соответствующее номеру задания");
        switch (StartTask())
        {
            case 1:
                Task1();
                break;
            case 2:
                Task2();
                break;
        }
    }

    static int StartTask()
    {
        Scanner scanner = new Scanner(System.in);
        do
        {
            if (scanner.hasNextInt())
            {
                return scanner.nextInt();
            }
        }
        while (true);
    }

    static void Task1()
    {
        Random random = new Random();
        do
        {
            int RandomNumber = random.nextInt(9);
            for (int remainingAttempts = 2; remainingAttempts >= 0; remainingAttempts--)
            {
                int playerInputNumber;
                do
                {
                    System.out.println("Необходимо отгадать загадное число, введите число от 0 до 9");
                    playerInputNumber = playerInputNumber();
                }
                while (!(0 <= playerInputNumber && playerInputNumber <= 9));

                if (playerInputNumber == RandomNumber)
                {
                    System.out.println("Загаданое число угадано");
                    break;
                }

                System.out.println("Загаданное число не угадано. Количество оставшихся попыток: " + remainingAttempts);
            }

            System.out.println("Нажмите 1 чтобы начать заного || Нажмите 0 чтобы завешить игру)");
        }

        while (playerInputNumber() != 0);
    }

    static int playerInputNumber()
    {
        Scanner scanner = new Scanner(System.in);
        do
        {
            if (scanner.hasNextInt())
            {
                return scanner.nextInt();
            }
        }
        while (true);
    }


    static void Task2()
    {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Необходимо отгадать загадное число, введите слово из списка");

        Random random= new Random();
        int convertRandomArrayValueToString = random.nextInt(words.length);
        String randomWordFromArray = words[convertRandomArrayValueToString];

        String playerInputWord;
        Scanner scanner = new Scanner(System.in);
        do
        {
            playerInputWord = scanner.nextLine();

            if (playerInputWord.equals(randomWordFromArray))
            {
                System.out.println("Загаданное слово верно, игра завершена");
                break;
            }
            else
            {
                System.out.println("Загаданное слово неверно, введите другое слово");
            }

        }
        while (true);
    }
}
