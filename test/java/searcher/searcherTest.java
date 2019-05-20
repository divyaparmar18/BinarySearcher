package searcher;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class searcherTest {
    @Test
    public void theNumberShouldBeTheSumOfElements() {
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String obj = "The number is present in the list at the index 5";
        assertEquals(obj, BinarySearcher.getNumberFinder(6, expected, 11, 0));
    }
    @Test
    public void theIndexOfTheNumberToBeShownShouldBeGiven() {
        int[] expected = {3,5,8,12,14,15,17,18,20};
        String obj = "The number is present in the list at the index 3";
        assertEquals(obj, BinarySearcher.getNumberFinder(12, expected, 9, 0));
    }
    @Test
    public void ifTheNumberIsNotInTheArrayItShouldSayNotInTheArray() {
        int[] expected = {3,5,8,12,14,15,17,18,20};
        String obj = "Number not in the list";
        assertEquals(obj, BinarySearcher.getNumberFinder(29, expected, 9, 0));
    }
}
