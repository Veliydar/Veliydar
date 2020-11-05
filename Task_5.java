public class Task_5
//Задание 5
{
    public static void main(String[] args)
    {
        int[] arr = {-1, 20, 1, 73, 19, 28, 4, 57};
        int arrValueMin = arr[0], arrValueMax = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > arrValueMax)
            {
                arrValueMax = arr[i];
            }
            else if (arr[i] < arrValueMin)
            {
                arrValueMin = arr[i];
            }
            System.out.println("Минимальное значение " + arrValueMin );
            System.out.println("Максимальное значение " + arrValueMax );
            }
    }
}
