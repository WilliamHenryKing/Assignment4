package org.example;

;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest {

    Map<Integer, String> expectedMap;
    Map<Integer, String> resultMap;
    Set<Integer> expectedSet;
    List<String> expectedList = new ArrayList<>();
    List<String> resultList = new ArrayList<>();
    boolean hasMapIsTrue = false;

    /**
     * Rigorous Test :-)
     */

    public void setMaps() {

        //artificially sets up the values for the hashmap.
        expectedMap = new HashMap<>();
        expectedMap.put(1, "Danny");
        expectedMap.put(2, "Samantha");
        expectedMap.put(3, "Yasmin");
        expectedMap.put(4, "Kanicka");
        expectedMap.put(5, "Henry");

        resultMap = new HashMap<>();
        resultMap.put(1, "Danny");
        resultMap.put(2, "Samantha");
        resultMap.put(3, "Yasmin");
        resultMap.put(4, "Kanicka");
        resultMap.put(5, "Henry");

    }

    @Test
    public void testMapHasMap() {

        setMaps();
        Assert.assertTrue("The equality of both expected and result maps are indeed true.",
                expectedMap.equals(resultMap));
        //if the above code runs true, the variable below will run true.
        hasMapIsTrue = true;

    }

    @Test
    public void testKeys() {

        testMapHasMap();
        if (hasMapIsTrue) {
            expectedSet = expectedMap.keySet();

            // the expected Set is tested against the result Map
            Assert.assertEquals(expectedSet, resultMap.keySet());
        }

    }

    @Test
    public void testList() {

        testMapHasMap();
        if (hasMapIsTrue) {
            //artificially sets up values for the expected List.
            expectedList.add("Danny");
            expectedList.add("Samantha");
            expectedList.add("Yasmin");
            expectedList.add("Kanicka");
            expectedList.add("Henry");

            //creates a collection from the task of extracting values from the result Map
            Collection<String> collection = Collections.unmodifiableCollection(resultMap.values());
            resultList.addAll(collection);

            Assert.assertEquals("The lists come out as expected.", expectedList, resultList);
        }
    }

}
