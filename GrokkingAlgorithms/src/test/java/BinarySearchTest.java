import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    BinarySearch binarySearch;
    private int[] sortedArray;

    @Before
    public void setUp() {
        sortedArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
        binarySearch = new BinarySearch();
    }

    @Test
    public void testValidSearchItem() {
        assertEquals(2, binarySearch.binarySearch(sortedArray, 3));
    }

    @Test
    public void testInvalidSearchItem() {
        assertEquals(-1, binarySearch.binarySearch(sortedArray, -100));
    }
}