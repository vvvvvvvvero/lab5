package Zadanie1;

import java.util.Comparator;

public class ComparatorSurname implements Comparator<Person>
{
    @Override
    public int compare(Person o1, Person o2)
    {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
