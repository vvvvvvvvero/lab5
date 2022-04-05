package Zadanie1;


public class Test1
{
    public static void main(String[] args)
    {
        Person[] people = new Person[5];
        Person person1 = new Person("Dudek", "Bartosz", 2002);
        Person person2 = new Person("Dudek", "Adam", 2003);
        Person person3 = new Person("Strzecha", "Daria", 1980);
        Person person4 = new Person("Bilewicz", "Krzysztof", 1980);
        Person person5 = new Person("Michalik", "Adam", 1985);

        people[0] = person1;
        people[1] = person2;
        people[2] = person3;
        people[3] = person4;
        people[4] = person5;

        SortAlgorythm<Person> sort = new SortAlgorythm<>(new ComparratorYearOfBirth());

        System.out.println("_____Comparator: Year of Birth and Insert sort______");
        sort.sortInsert(people);
        show(people);

        System.out.println("_____Comparator Name and Select sort______");
        sort.setComparator(new ComparatorName());
        sort.sortSelect(people);
        show(people);

        System.out.println("_____Comparator Surname and Bubble sort______");
        sort.setComparator(new ComparatorSurname());
        sort.sortBubble(people);
        show(people);

        CompoundComparator comparatorComplex = new CompoundComparator();
        comparatorComplex.addComparator(new ComparatorSurname());
        comparatorComplex.addComparator(new ComparatorName());
        comparatorComplex.addComparator(new ComparratorYearOfBirth());

        System.out.println("_________Compound Comparator__________\n");

        Person person6 = new Person("Bilewicz", "Adam", 1980);
        Person person7 = new Person("Bilewicz", "Adam", 1980);

        System.out.println("For data: " + person6 + " | "+ person7);
        System.out.println(comparatorComplex.compare(person6, person7));

        Person person8 = new Person("Placek", "Adam", 1980);
        Person person9 = new Person("Dudek", "Adam", 1980);

        System.out.println("For data: " + person8 + " | "+ person9);
        System.out.println(comparatorComplex.compare(person8, person9));

        Person person10 = new Person("Placek", "Adam", 1980);
        Person person11 = new Person("Placek", "Adam", 1981);

        System.out.println("For data: " + person10 + " | "+ person11);
        System.out.println(comparatorComplex.compare(person10, person11));

        System.out.println();

        System.out.println("Sort by Compound comparator by Surname");
        SortAlgorythm<Person> sort2 = new SortAlgorythm<>(comparatorComplex);
        sort2.sortBubble(people);
        show(people);

        Person person12 = new Person("Placek", "Bartosz", 1980);
        Person person13 = new Person("Placek", "Adam", 1981);
        Person person14 = new Person("Placek", "Felicja", 1980);
        Person person15 = new Person("Placek", "Conrad", 1981);

        Person[] people1 = new Person[4];
        people1[0] = person12;
        people1[1] = person13;
        people1[2] = person14;
        people1[3] = person15;

        System.out.println("Sort by Compound comparator by Name");
        sort2.sortBubble(people1);
        show(people1);

        Person person16 = new Person("Placek", "Conrad", 1985);
        Person person17 = new Person("Placek", "Conrad", 1979);
        Person person18 = new Person("Placek", "Conrad", 2000);
        Person person19 = new Person("Placek", "Conrad", 1950);

        Person[] people2 = new Person[4];
        people2[0] = person16;
        people2[1] = person17;
        people2[2] = person18;
        people2[3] = person19;

        System.out.println("Sort by Compound comparator by Age");
        sort2.sortBubble(people2);
        show(people2);


        System.out.println("___________Sort by Complex compare method___________\n");
        System.out.println("By surname: ");
        SortAlgorythm<Person> sort3 = new SortAlgorythm<>(new ComplexComparator());
        sort3.sortBubble(people);
        show(people);

        System.out.println("By name: ");
        sort3.sortBubble(people1);
        show(people1);

        System.out.println("By age: ");
        sort3.sortBubble(people2);
        show(people2);



    }

    public static void show(Person [] people)
    {
        for (Person person : people)
        {
            System.out.println(person);
        }
        System.out.println();
    }
}
