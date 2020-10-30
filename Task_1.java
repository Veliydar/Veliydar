public class Task_1
    //Задание 1
    {
       public static void main(String[] args)
        {
            int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
            for (int i = 0; i < arr.length; i++)
                if (arr[i] > 0)
                {
                    arr[i] = 0;
                }
                else arr[i] = 1;

            for (int i = 0; i < arr.length; i++)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }

