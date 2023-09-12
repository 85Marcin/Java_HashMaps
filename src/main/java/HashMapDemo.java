import java.sql.SQLOutput;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args){
//        HashMap<String, String> favouriteFruits =  new HashMap<String, String>();
//        favouriteFruits.put("Alice", "Apple");
//        favouriteFruits.put("Sarah", "Banana");
//        favouriteFruits.put("Bob", "Strawberry");
//        System.out.println(favouriteFruits.get("Alice"));
//
//        HashMap<String, Integer> ages = new HashMap<String, Integer>();
//
//        ages.put("Alice", 52);
//        ages.put("Bob", 24);
//
//        Integer aliceAge = ages.get("Alice");
//
//        String output = "Alice's age is " + aliceAge.toString();
//        System.out.println(output);


        HashMap<String, Country> countries = new HashMap<String, Country>();

        countries.put("UK", new Country("Europe", "London", 64100000));
        countries.put("Germany", new Country("Europe", "Berlin", 80620000));
        countries.put("France", new Country("Europe", "Paris", 60030000));
        countries.put("Japan", new Country("Asia", "Tokyo", 127300000)); countries.get("UK").setPopulation(64100000);

        countries.get("Germany").setPopulation(80620000);
        countries.get("France").setPopulation(60030000);
        countries.get("Japan").setPopulation(127300000);

        for (String country : countries.keySet()) {
            Country c = countries.get(country);
            System.out.println("In " + country + " there are " + c.getPopulation() + " people. The capital of " + country +
                    " is " + c.getCapital() + " and it is in " + c.getContinent() + ".");
        }

    }
}
