package za.ac.cput.projects;

import java.util.ArrayList;

public class List {

    public String Mylist() {

        ArrayList names = new ArrayList<>();

        names.add("Zinzi");
        names.add("Sean");
        names.add("Anthony");

        return names.get(1).toString();
    }

}
