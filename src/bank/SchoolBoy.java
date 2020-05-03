package bank;

public class SchoolBoy extends  Person
{
    int grade=1;
    public SchoolBoy(String name, String surname, int age, int grade)
    {
        super(name, surname, age, new Sex(-1));
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
