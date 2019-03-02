package za.ac.cput.projects;

import java.util.HashMap;
import java.util.Map;

public class MapApp {

    public String Students(){
    Map students = new HashMap();

    students.put("Zinzi", 26);
    students.put("Zinzi", 20);
    students.put("Sean", 23);
    students.put("Tumelo", 18);


    String sss = students.get("Zinzi").toString();

    return sss;

    //return students.toString();

    }
}
