public class Cat
{
    private String catName;

    private boolean catSatiety;
    private int catAppetite;

    public Cat(String catName, int catAppetite)
    {
        this.catName = catName;
        this.catAppetite = catAppetite;
        catSatiety = false;
    }

    public void eat(Plate plate)
    {
        if (plate.plateFullness(catAppetite) && !catSatiety)
        {
            plate.decreaseFoodInPlate(catAppetite);
            catSatiety = true;
            System.out.println(catName + " покушал из тарелки");
        }
        else if (catSatiety)
        {
            System.out.println(catName + " сыт");
        }
        else
        {
            System.out.println("Еды недостаточно для " + catName);
        }
    }
}
