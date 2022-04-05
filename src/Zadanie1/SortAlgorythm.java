package Zadanie1;

import java.util.Comparator;

public class SortAlgorythm<T>
{
    private Comparator<T> comparator;

    public SortAlgorythm(Comparator<T> comparator_)
    {
        this.comparator = comparator_;
    }

    public void setComparator(Comparator<T> comparator)
    {
        this.comparator = comparator;
    }

    public Comparator<T> getComparator() {
        return comparator;
    }

    public T [] sortInsert(T [] array)
    {
        for (int i = 1; i < array.length; ++i)
        {
            T value = array[i];
            T temp;
            int j;
            for (j = i; j > 0 && comparator.compare(value, temp = array[j -1]) < 0; --j)
            {
                array[j] = temp;
            }
            array[j] = value;
        }
        return array;
    }


    public T[] sortSelect(T [] array)
    {
        int size = array.length;
        for (int slot = 0; slot < size - 1; ++slot)
        {
            int smallest = slot;
            for (int check = slot + 1; check < size; ++check)
            {
                if (comparator.compare(array[check], array[smallest]) < 0)
                {
                    smallest = check;
                }
                swap(array, smallest, slot);
            }
        }
        return array;
    }


    private void swap(T [] array , int left, int right) {
            T temp = array[left];
            array[left] = array[right];
            array[right] = temp;
    }

    public T [] sortBubble(T [] array)
    {
        int size = array.length;
        for (int pass = 1; pass < size; ++pass)
        {
            for (int left = 0; left < (size - pass); ++left)
            {
                int right = left + 1;
                if (comparator.compare(array[left], array[right]) > 0)
                {
                    swap(array, left, right);
                }
            }
        }
        return array;
    }


}
