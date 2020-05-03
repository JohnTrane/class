package bank;

public class Program {

    public static void main(String[] args)
    {

        Person p1 = FactotyPerson.CreateMan("Ivan", "Petrov", 12);//new Person("Ivan", "Petrov", 66, new Sex(-1));
        Person p2 = new Person("Vasiliy", "Ivanov", 45, new Sex(-1));
        Person p3 = FactotyPerson.CreateMan("Oleg", "Ivanov", 18);//new Person("Irina", "Ivanovna", 18, new Sex(9));

        p1.ageUp();
        p1.setAge(-90);
        p2.setAge(90);
        p1.setParent1(p2);
        p1.setParent2(p3);


        Dog dog = DogFarm.GetDogFromFarm("Ipalit");
        dog.GavGav();
        p1.setDog(dog);
        p1.dogFas(p2);
    }
}
