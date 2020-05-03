package bank;

public class Student extends Person
{
    int year=1;

    public Student(String name, String surname, int age, Sex sex, int year)
    {
        super(name, surname, age, sex);
        this.year =year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
