package bank;
import java.util.Random;

public class DogFarm
{

    public static Dog GetDogFromFarm(String name)
    {
        Dog dog = null;

        if(Math.random()>0.5)
        {
            dog = new Dog(name);

        }
        else {
            dog = new FlatDog(name);
        }
        return dog;
    }
}
