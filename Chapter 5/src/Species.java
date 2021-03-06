import java.util.Scanner;
/**
 Class for data on endangered species.
 */
public class Species
{
    private String name, fName, sName;
    private int population, fPopulation, sPopulation;
    private double growthRate, fGrowthRate, sGrowthRate;

    //Reads user input, User single names for species/
    public void readInput(){
        Scanner scan = new Scanner(System.in);

        for(int x = 1; x <= 2; x++){
            switch(x){
                case 1:
                    System.out.println("First Species:\n");

                    System.out.println("What is the species' name?");
                    name = scan.nextLine();

                    System.out.println("What is the population of the species?");
                    population = scan.nextInt();

                    System.out.println("Enter growth rate (% increase per year):");
                    growthRate = scan.nextDouble();

                    setSpecies1();
                    break;

                case 2:
                    System.out.println("\nSecond Species:\n");

                    System.out.println("What is the species' name?");
                    name = scan.next();

                    System.out.println("What is the population of the species?");
                    population = scan.nextInt();

                    System.out.println("Enter growth rate (% increase per year):");
                    growthRate = scan.nextDouble();

                    setSpecies2();
                    break;
            }
        }

    }

    /*Using user input, the first species will be stored in this method.
    An error will appear when species is less than 1*/
    public void setSpecies1(){

        fName = name;

        if(population >= 0){
            fPopulation = population;
        }else{
            System.out.println("ERROR: using a negative population.");
            System.exit(0);
        }
        fGrowthRate = growthRate;

        System.out.println("First Species:");
        System.out.println("Name: " + fName);
        System.out.println("Population: " + fPopulation);
        System.out.println("Growth rate: " + fGrowthRate + "%");
    }

    /*Using user input, the second species will be stored in this method.
    An error will appear when species is less than 1*/
    public void setSpecies2(){

        sName = name;

        if(population >= 0){
            sPopulation = population;
        }else{
            System.out.println("ERROR: using a negative population.");
            System.exit(0);
        }
        sGrowthRate = growthRate;

        System.out.println("First Species:");
        System.out.println("Name: " + sName);
        System.out.println("Population: " + sPopulation);
        System.out.println("Growth rate: " + sGrowthRate + "%");
    }

    public void predictPopulation(){

        double populationAmount1 = fPopulation, populationAmount2 = sPopulation;
        double smGrowthRate = fGrowthRate, hGrowthRate = sGrowthRate;
        double lowestPopulation = fPopulation, highestPopulation = 0;
        String lowsetName = fName, highestName = sName;
        int years = 0;

        if(fPopulation > sPopulation){
            smGrowthRate = sGrowthRate;
            lowestPopulation = sPopulation;
            populationAmount1 = sPopulation;
            lowsetName = sName;

            hGrowthRate = fGrowthRate;
            highestPopulation = fPopulation;
            populationAmount2 = fPopulation;
            highestName = fName;
        }

        while((lowestPopulation < highestPopulation) && (years <= 100)){
            populationAmount1 = (populationAmount1 + (smGrowthRate / 100) * populationAmount1);
            lowestPopulation = populationAmount1;

            populationAmount2 = (populationAmount2 + (hGrowthRate / 100) * populationAmount2);
            highestPopulation = populationAmount2;

            years++;
        }

        if(years > 1000){
            System.out.println("");
            System.out.println(lowsetName + " will not exceed " + highestName
                    + " within the next 100 years.");
        }else{
            System.out.println("");
            System.out.println(lowsetName + " will exceed " + highestName
                    + " within the next " + years + " years.");
        }
    }
}