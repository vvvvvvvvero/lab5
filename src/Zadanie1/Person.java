package Zadanie1;

public class Person
{
    private String surname;
    private String name;
    private int yearOfBirth;

    public Person(String surname, String name, int yearOfBirth) {
        this.surname = surname;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    @Override
    public String toString()
    {
        return "surname: " + surname + "  name: " + name + "  year of birth: " + yearOfBirth;
    }

}
