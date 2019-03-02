package za.ac.cput.projects;

import java.util.HashSet;
import java.util.Set;

public class SetApp {

    public String Myset(){

        Set<String> photoItems = new HashSet<>();

        photoItems.add("Camera");
        photoItems.add("Lights");
        photoItems.add("Lights");
        photoItems.add("Backdrop");

        return photoItems.toString();

    }
}
