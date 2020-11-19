public abstract class Animal
{
    protected float maxRunLength;
    protected float maxSwimLength;
    protected float maxJumpHeight;

    public Animal(float maxRunLength, float maxSwimLength, float maxJumpHeight)
    {
        this.maxRunLength = maxRunLength;
        this.maxSwimLength = maxSwimLength;
        this.maxJumpHeight = maxJumpHeight;
    }

    public void run(float length)
    {
        System.out.println("Возможность бегать на заданное растояние: " + animalActionCheckOut(length, maxRunLength));
    }

    public void swim(float length)
    {
        System.out.println("Возможность плавать на заданное растояние: " + animalActionCheckOut(length, maxSwimLength));
    }

    public void jump(float height)
    {
        System.out.println("Возможность прыгать на заданное растояние: " + animalActionCheckOut(height, maxJumpHeight));
    }

    private boolean animalActionCheckOut(float maxAvailableValue, float realValue)
    {
        return maxAvailableValue <= realValue;
    }
}
