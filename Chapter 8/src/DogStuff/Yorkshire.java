package DogStuff;

/**
 * Created by 19augusthummert on 2/27/2018.
 */
// ****************************************************************
// DogStuff.Yorkshire.java
//
// A class derived from DogStuff.Dog that holds information about
// a DogStuff.Yorkshire terrier. Overrides DogStuff.Dog speak method.
//
// ****************************************************************
public class Yorkshire extends Dog
{
    private int breedWeight = 35;

    public Yorkshire(String name)
    {
        super(name);
    }
    // ------------------------------------------------------------
// Small bark -- overrides speak method in DogStuff.Dog
// ------------------------------------------------------------
    public String speak()
    {
        return "woof";
    }

    public int avgBreedWeight()
    {
        return breedWeight;
    }
}