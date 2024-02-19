import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MergeSortTests {
    Integer[] referenceInt = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    ArrayList<Integer> referenceIntList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

    @Test
    void mergeSortIntTest() {
        Integer[] arr = {3, 2, 5, 1, 7, 8, 4, 9, 6};

        MySortingArray.mergeSort(arr);

        assertArrayEquals(arr, referenceInt);
    }

    @Test
    void mergeSortIntListTest() {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3, 2, 5, 1, 7, 8, 4, 9, 6));

        MySortingArray.mergeSort(arr);

        assertTrue(referenceIntList.containsAll(arr));
    }
}


