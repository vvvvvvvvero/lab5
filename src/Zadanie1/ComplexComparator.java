package Zadanie1;

import java.util.Comparator;

public class ComplexComparator implements Comparator<Person>
{

    @Override
    public int compare(Person o1, Person o2)
    {
        if (o1.getSurname().compareTo(o2.getSurname()) == 0)
        {
            if (o1.getName().compareTo(o2.getName()) == 0)
            {
                return Integer.compare(o1.getYearOfBirth(), o2.getYearOfBirth());
            }
            return o1.getName().compareTo(o2.getName());
        }
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
