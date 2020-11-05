public class Task_6
//Задание 6
{
    public static void main(String[] args)
    {

    }

    static boolean arrSidesSumCompare(int[] inputArray)
    {
        int[] arr = new int[10];
        int leftSideSum = 0;
        for (int i = 0; i < arr.length; i++)
        {
            leftSideSum += arr[i];
            int rightSum = 0;
            for (int j = (i + 1); j < arr.length; j++)
            {
                rightSum += arr[j];
            }
            if (leftSideSum == rightSum)
            {
                System.out.println("суммы частей массива равны, возвращено значение true");
                return true;
            }
        }
        System.out.println("суммы частей массива НЕ равны, возвращено значение false");
        return false;
    }
}







