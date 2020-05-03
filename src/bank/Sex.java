package bank;

public class Sex {
    private int sex;

    public Sex(int sex)
    {
        this.sex = sex;
    }

    boolean isMale()
    {
        return sex < 0;
    }

    boolean isFemale()
    {
        return sex > 1;
    }

    boolean isIt()
    {
        return sex==0;
    }
}
