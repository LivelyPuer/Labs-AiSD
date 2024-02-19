import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShakerSortTests {
    Integer[] referenceInt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    ArrayList<Integer> referenceIntList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

    @Test
    void shakerSortIntTest() {
        Integer[] arr = {3, 2, 5, 1, 7, 8, 4, 9, 6};

        MySortingArray.shakerSort(arr);

        assertArrayEquals(arr, referenceInt);
    }

    @Test
    void shakerSortIntListTest() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 2, 5, 1, 7, 8, 4, 9, 6));

        MySortingArray.shakerSort(arr);

        assertTrue(referenceIntList.containsAll(arr));
    }
}
