package SortedIntList;

/**
 * Created by 19augusthummert on 3/5/2018.
 */
public class SortedIntList extends IntList {

    public SortedIntList(int size)
    {
        super(5);
    }

    Sorts sort = new Sorts();

    public void add(int value)
    {
        if (numElements == list.length)
            System.out.println("Can't add, list is full");
        else
        {
            list[numElements] = value;
            numElements++;
        }

        Sorts.insertionSort(list);
    }


}
