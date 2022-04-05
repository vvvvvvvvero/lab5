package Zadanie1;

import java.util.Comparator;

public class ComparratorYearOfBirth implements Comparator<Person>
{

    @Override
    public int compare(Person o1, Person o2)
    {
        if (o1.getYearOfBirth() < o2.getYearOfBirth())
        {
            return -1;
        }
        else if (o1.getYearOfBirth() > o2.getYearOfBirth())
        {
            return 1;
        }
        return 0;
    }
}
