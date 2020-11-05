public class all_in_one
{
    //Задание 2
        public static void main(String[] args)
        {
            //целые числа
            byte a = 127;
            short b = -32768;
            int c = 2147483647;
            long d = -9223L;
            //значения с плавающими запятыми
            float e = 12.23f;
            double f = -115.2525325;
            //символьный тип кодировки
            char g = '\uffaa';
            //логический тип
            boolean val1 = true;
            boolean val2 = false;
        }


    // Задание 3
        public static void main(String[] args)
    {
        int val = calculate(2, 1, 10,5);
        System.out.println("val=" + val);
    }

    public static int calculate(int a, int b, int c, int d)
    {
        return a * (b + (c / d));
    }


    // Задание 4
    public static void main(String[] args)
    {

    }
    public static boolean isSumFrom10to20(int a, int b)
    {
        int sum = a + b;
        if (sum >= 10 && sum <= 20)
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    // Задание 5
    public static void main(String[] args)
    {
        int a = -10;
        if (a >= 0)
        {
            System.out.println("Число положительное");
        }
        else
            System.out.println("Число отрицательное");
    }


    // Задание 6
    public static void main(String [] args)
    {

    }
    public static boolean number(int a)
    {
        a = 10;
        if (a <= 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }


    // Задание 7
    public static void main(String [] args)
    {

    }
    public static void printName(String inName)
    {
        System.out.println("Привет, " + inName + "!");
    }


    // Задание 8
    public static void main(String [] args)
    {
        int year = 2020;
        if (year % 4 == 0 && year % 100 != 0)
        {
            System.out.println(year + " год високосный");
        }
        else if (year % 400 == 0)
        {
            System.out.println(year + " год НЕ високосный");
        }
        else
        {
            System.out.println(year + " год НЕ високосный");
        }
    }
}














}
