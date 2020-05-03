package bank;

public class FactotyPerson {

    public static Person CreateMan(String name, String surname, int age)
    {
        if(age<18)
        {
            return  new SchoolBoy(name, surname, age, 1);
        }
        else if(age>=18 && age<25)
        {
            return  new Student(name, surname, age, new Sex(-1), 1);
        }
        return new Person(name, surname, age, new Sex(-1));
    }

}
