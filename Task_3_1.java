package com.company;

import java.util.Random;
import java.util.Scanner;

public class Task_3_1
{
    public static void main(String[] args)
    {
        Random random = new Random();
        do
            {
            int RandomNumber = random.nextInt(9);
            for (int remainingAttempts = 2; remainingAttempts >= 0; remainingAttempts--) {
                int playerInputNumber;
                do
                {
                    System.out.println("Необходимо отгадать загадное число, введите число от 0 до 9.");
                    playerInputNumber = playerInputNumber();
                }
                while (!(0 <= playerInputNumber && playerInputNumber <= 9));

                if (playerInputNumber == RandomNumber) {
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

}
