/**
 * Created by 19augusthummert on 11/21/2017.
 */
public class SpeciesTest {

    public static void main(String[] args) {

        Species species1 = new Species();
        Species species2 = new Species();

        species1.readInput();

        species1.predictPopulation();
        species2.predictPopulation();
    }
}
