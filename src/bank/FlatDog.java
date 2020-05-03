package bank;

public class FlatDog extends Dog
{

    public FlatDog(String name)
    {
      super(name);
    }

    @Override
    public void Fas(Person p)
    {
        System.out.println("Kus' " + p.getName());
    }
}
