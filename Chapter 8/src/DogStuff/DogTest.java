package DogStuff;

// ****************************************************************
// DogStuff.DogTest.java
//
// A simple test class that creates a DogStuff.Dog and makes it speak.
//
// ****************************************************************
public class DogTest
{
    public static void main(String[] args)
    {
        Labrador lab = new Labrador("Doug", "black");
        System.out.println(lab.getName() + " says " + lab.speak());

        Yorkshire yorkie = new Yorkshire("Yorkie");
        System.out.println(yorkie.getName() + " says " + yorkie.speak());

        System.out.println("\nLabrador Avg Weight: " + lab.avgBreedWeight());
        System.out.println("Yorkshire Avg Weight: " + yorkie.avgBreedWeight());
    }
}