public class Plate
{
    private int remainingFoodInPlate;

    public Plate(int food)
    {
        this.remainingFoodInPlate = food;
    }

    public void decreaseFoodInPlate(int catAppetite)
    {
        remainingFoodInPlate = remainingFoodInPlate - catAppetite;
    }

    public boolean plateFullness(int catAppetite)
    {
        return catAppetite <= remainingFoodInPlate;
    }

}
