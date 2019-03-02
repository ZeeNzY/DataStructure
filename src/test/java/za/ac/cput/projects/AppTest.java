package za.ac.cput.projects;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testList(){

        List names = new List();
        String studentnames = names.Mylist();

        String name = "Sean";

        Assert.assertEquals(name,studentnames);

    }

    @Test
    public void testSet(){

        SetApp set = new SetApp();
        String mysett = set.Myset();

        String equipment = "[Lights, Backdrop, Camera]";

        Assert.assertEquals(equipment,mysett);

    }

    @Test
    public void testMap(){

        MapApp map = new MapApp();
        String mymap = map.Students();

        String sss = "20";

        Assert.assertEquals(sss,mymap);

    }





}
