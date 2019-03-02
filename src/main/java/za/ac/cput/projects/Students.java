package za.ac.cput.projects;

import java.util.HashMap;

public class Students {

    public String studentNum() {

        String studnum = "215063414";
        return studnum;

    }

    public int age() {

        HashMap<String,Integer> studentAge = new HashMap();
        studentAge.put("211263589", 18);
        studentAge.put("215063414", 23);
        studentAge.put("211354784", 26);

        int studAge = studentAge.get(2);

        return studAge;

    }

}
