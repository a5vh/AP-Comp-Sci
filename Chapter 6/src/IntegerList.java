public class IntegerList
{
    int[] list; //values in the list
    int numOfElements = 0;
    //-------------------------------------------------------
//create a list of the given size
//-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        numOfElements = size;
    }
    //-------------------------------------------------------
//fill array with integers between 1 and 100, inclusive
//-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
        {
            list[i] = (int)(Math.random() * 100) + 1;
            numOfElements++;
        }

    }
    //-------------------------------------------------------
//print array elements with indices
//-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public void increaseSize()
    {
        int [] temp = new int [list.length*2];
        for (int a = 0; a < numOfElements; a++)
        {
            temp[a] = list[a];
        }

        list = temp;
    }

    public void addElement(int newVal)
    {
        if (numOfElements == list.length)
        {
          increaseSize();
        }

        list [numOfElements] = newVal;
        numOfElements++;
    }

    public void removeFirst(int newVal)
    {
        boolean foundFirstOccurrence = false;
        int [] temp = new int [list.length];
        int numIndex = 0;
        for (int i = 0; i < list.length; i++)
        {
            if (newVal != list[i] || foundFirstOccurrence)
            {
                temp[numIndex] = list[i];
                numIndex++;
            }
            else foundFirstOccurrence = true;
        }
        list = temp;
    }

    public void removeAll(int newVal)
    {
        int [] temp = new int [list.length];
        int numIndex = 0;
        for (int i = 0; i < list.length; i++)
        {
            if (newVal != list[i])
            {
                temp[numIndex] = list[i];
                numIndex++;
            }
        }
        list = temp;
    }

    public void sort()
    {
        Sorts.insertionSort(list);
    }
}


