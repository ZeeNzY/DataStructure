package za.ac.cput.projects;

import java.util.*;

public class CollectionsApp {

    ArrayList<String> toyota = new ArrayList<String>();

    //HashMap Method
        public HashMap myMap(){

            HashMap<String,Integer> brandyear = new HashMap();
            brandyear.put("Etios", 2017);
            brandyear.put("Auris", 2006);
            brandyear.put("Yaris", 1999);
            brandyear.put("Supra", 1978);
            return brandyear;
        }

    //Set
        public TreeSet MySet(){

            String mytoyota[] = {"Etios", "Yaris","Supra","Yaris","Etios","Auris"};
            Set<String> set = new HashSet<String>();
            set.add(mytoyota[0]);
            set.add(mytoyota[1]);
            set.add(mytoyota[2]);
            set.add(mytoyota[3]);
            set.add(mytoyota[4]);
            set.add(mytoyota[5]);

            TreeSet sortedSet = new TreeSet<String>(set);

            return sortedSet;
        }
    //List
        public ArrayList myList(){

            toyota.add("2017 Etios");
            toyota.add("2006 Auris");
            toyota.add("1999 Yaris");
            toyota.add("1978 Supra");
            toyota.add("2000 Highlander");
            toyota.add("2015 Fortuner");
            toyota.add("2019 Avanza");
            toyota.add("2014 Levin");

            return toyota;
        }


            public ArrayList myCollection(){
                toyota.add("2017 Toyota Etios");
                toyota.add("2006 Toyota Auris");
                toyota.add("1999 Toyota Yaris");
                toyota.add("1978 Toyota Supra");
                toyota.add("2000 Toyota Highlander");
                toyota.add("2015 Toyota Fortuner");
                toyota.add("2019 Toyota Avanza");
                toyota.add("2014 Toyota Levin");
                Collections.sort(toyota);

                return toyota;
            }



}
