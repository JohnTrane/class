package bank;

public class Dog {

    private String name;

    public Dog(String name)
    {
        this.name = name;
    }

    public void GavGav()
    {
        System.out.println("Gav-Gav");
    }

    public void Fas(Person p)
    {
        p.dead();
        System.out.println("Kil " + p.getName());
    }
}
