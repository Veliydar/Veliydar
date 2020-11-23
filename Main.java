public class Main
{
    public static void main(String[] args)
    {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Мурка", 5);
        cats[1] = new Cat("Матрокин", 6);
        cats[2] = new Cat("Леопольд", 8);

        Plate plate = new Plate(15);

        for (int cat = 0; cat < cats.length; cat++)
        {
            cats[cat].eat(plate);
        }

        for (int cat = 0; cat < cats.length; cat++)
        {
            cats[cat].eat(plate);
        }
    }
}