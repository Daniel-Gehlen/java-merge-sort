import org.junit.Test;
import static org.junit.Assert.*;

public class MergeSortTest {
    @Test
    public void testMergeSort() {
        int[] input = {64, 34, 25, 12, 22};
        int[] expected = {12, 22, 25, 34, 64};
        MergeSort.mergeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testEmptyArray() {
        int[] input = {};
        int[] expected = {};
        MergeSort.mergeSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSingleElement() {
        int[] input = {42};
        int[] expected = {42};
        MergeSort.mergeSort(input);
        assertArrayEquals(expected, input);
    }
}
