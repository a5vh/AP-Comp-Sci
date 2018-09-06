package DogStuff;

// ****************************************************************
// DogStuff.Labrador.java
//
// A class derived from DogStuff.Dog that holds information about
// a labrador retriever. Overrides DogStuff.Dog speak method and includes
// information about avg weight for this breed.
//
// ****************************************************************
public class Labrador extends Dog
{
    private String color; //black, yellow, or chocolate?
    private int breedWeight = 75;

    public Labrador(String name, String color)
    {
        super(name);
        this.color = color;
        super.speak();
    }
    // ------------------------------------------------------------
// Big bark -- overrides speak method in DogStuff.Dog
// ------------------------------------------------------------
    public String speak()
    {
        return "WOOF";
    }
    // ------------------------------------------------------------
// Returns weight
// ------------------------------------------------------------
    public int avgBreedWeight()
    {
        return breedWeight;
    }
}