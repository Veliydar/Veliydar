public class Task_2
//Задание 2
{
    public static void main(String[] args)
    {
        int[] arr = new int[8];
        int a = 0;
        for (int i = 0; i < arr.length; i++, a = a + 3)
        {
            arr[i] = a;
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print (arr[i]+ " ");
        }
    }
}
