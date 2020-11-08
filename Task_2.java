package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task_2
{
    public static void main(String[] args)
    {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Введите загаданное слово");

        Random random = new Random();
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
