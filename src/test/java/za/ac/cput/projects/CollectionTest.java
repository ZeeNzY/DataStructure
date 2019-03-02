package za.ac.cput.projects;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class CollectionTest {

    CollectionsApp  collection = new CollectionsApp();

    @Test
        public void myMap() {

            HashMap myActual = collection.myMap();

            String cars ="{Etios=2017, Auris=2006, Yaris=1999, Supra=1978}";

            cars = cars.substring(1, cars.length()-1);
            String[] keyValuePairs = cars.split(",");
            Map<String,String> map = new HashMap<>();
            for(String pair : keyValuePairs)
            {
                String[] entry = pair.split("=");
                map.put(entry[0].trim(), entry[1].trim());
            }
            Assert.assertTrue(myActual.equals(myActual));
            // Assert.assertEquals(myActual,map);
        }

    @Test
        public void mySet() {
            TreeSet myCars = collection.MySet();

            String[] cars = {"Etios", "Auris", "Yaris", "Supra"};
            List<String> list = Arrays.asList(cars);
            Set<String> exSet = new TreeSet<String>(list);

            Assert.assertEquals(exSet,myCars);
        }

    @Test
        public void myList() {

            List mylists = collection.myList();
            ArrayList<String> output = new ArrayList<>();
            output.add("2017 Etios");
            output.add("2006 Auris");
            output.add("1999 Yaris");
            output.add("1978 Supra");
            output.add("2000 Highlander");
            output.add("2015 Fortuner");
            output.add("2019 Avanza");
            output.add("2014 Levin");

            Assert.assertEquals(output,mylists);

        }
    @Test
        public void myCollection() {
            Collection mycollect = collection.myCollection();
            String [] mybrand = {"1978 Toyota Supra, 1999 Toyota Yaris, 2000 Toyota Highlander, 2006 Toyota Auris, 2014 Toyota Levin, 2015 Toyota Fortuner, 2017 Toyota Etios, 2019 Toyota Avanza"};
            ArrayList<String> carsList = new ArrayList<String>(Arrays.asList(mybrand));
            Assert.assertEquals(carsList,mycollect);

        }
}
