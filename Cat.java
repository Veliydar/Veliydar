public class Cat extends Animal
{
    public Cat(float maxRunLength, float maxJumpHeight)
    {
        super(maxRunLength, 0, maxJumpHeight);
    }

    public void swim(float length)
    {
        System.out.println("Кот не умеет плавать");
    }
}