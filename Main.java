import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Cat cat = new Cat(200, 2);
        Dog dog = new Dog(500, 10, 0.5f);

        System.out.println("Кот");

        cat.run(250);
        cat.swim(10);
        cat.jump(2);

        System.out.println();
        System.out.println("Собака");

        dog.run(350);
        dog.swim(7);
        dog.jump(1);

        Animal newCat = addNewCat();
        Animal newDog = addNewDog();

        System.out.println();
        System.out.println("Новый кот");
        System.out.println("Может пробежать: " + newCat.maxRunLength + " метров");
        System.out.println("Может совершить прыжок высотой: " + newCat.maxJumpHeight + " метров");

        newCat.run(200);
        newCat.jump(3.5f);
        newCat.swim(10);

        System.out.println();
        System.out.println("Новая собака");
        System.out.println("Может пробежать: " + newCat.maxRunLength + " метров");
        System.out.println("Может совершить прыжок высотой: " + newCat.maxJumpHeight + " метров");
        System.out.println("Может проплыть расстояние: " + newCat.maxSwimLength + " метров");

        newDog.run(450);
        newDog.jump(0.9f);
        newDog.swim(100);

    }

    static Animal addNewCat()
    {
        Random random = new Random();

        float maxRun = random.nextInt(400);
        float maxJump = random.nextInt(3);

        Cat cat = new Cat(maxRun, maxJump);

        return cat;
    }

    static Animal addNewDog()
    {
        Random random = new Random();

        float maxRun = random.nextInt(1000);
        float maxJump = random.nextInt(5);
        float maxSwim = random.nextInt(50);

        Dog dog = new Dog(maxRun, maxSwim, maxJump);

        return dog;
    }
}
