package bank;

public class Person {
    private String name;
    private String surname;
    private int age;
    private Sex sex;
    private boolean isAlive = true;

    private Person parent1;
    private Person parent2;

    private Dog dog;

    public void dead()
    {
        isAlive=false;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public Person(String name, String surname, int age, Sex sex)
    {
        this.name = name;
        this.surname = surname;
        setAge(age);
        this.sex = sex;
    }

    public Person(String name, String surname, int age, Sex sex, Person parent1, Person parent2)
    {
        this.name = name;
        this.surname = surname;
        setAge(age);
        this.sex = sex;

        if(!parent1.sex.isIt() && !parent2.sex.isIt() && ((parent1.sex.isFemale() && parent2.sex.isMale()) || (parent2.sex.isFemale() && parent1.sex.isMale())))
        {
            this.parent1 = parent1;
            this.parent2 = parent2;
        }
    }

    public void setAge(int age) {
        if(age>=0)
        {
            this.age = age;
        }
        else
        {
            this.age =0;
        }
    }

    public void ageUp()
    {
        age++;
    }

    public int getAge()
    {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Person getParent1() {
        return parent1;
    }

    public void setParent1(Person parent1) {
        if(parent1.sex.isIt())
        {
            return;
        }
        if(parent2==null)
        {
            this.parent1 = parent1;
        }
        else
        {
            if(parent2.sex.isFemale() && parent1.sex.isMale() || parent2.sex.isMale() && parent1.sex.isFemale())
            {
                this.parent1 = parent1;
            }
        }
    }

    public Person getParent2() {
        return parent2;
    }

    public void setParent2(Person parent2) {
        if(parent2.sex.isIt())
        {
            return;
        }
        if(parent1==null)
        {
            this.parent2 = parent2;
        }
        else
        {
            if(parent2.sex.isFemale() && parent1.sex.isMale() || parent2.sex.isMale() && parent1.sex.isFemale())
            {
                this.parent2 = parent2;
            }
        }
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void dogFas(Person p)
    {
        if(this.dog!=null)
        {
            dog.Fas(p);
        }
    }
}
