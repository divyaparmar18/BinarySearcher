package searcher;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class searcherTest {
    @Test
    public void theIndexofTheNumberShouldBeGiven() {
        int[] toBeSearchedIn = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(5, BinarySearcher.getNumberFinder(6, toBeSearchedIn, 11, 0));
    }
    @Test
    public void theIndexOfTheNumberToBeSearchedShouldBeGiven() {
        int[] toBeSearchedIn = {3,5,8,12,14,15,17,18,20};
        assertEquals(3, BinarySearcher.getNumberFinder(12, toBeSearchedIn, 9, 0));
    }
    @Test
    public void ifTheNumberIsNotInTheArray() {
        int[] t0BeSearchedIn = {3,5,8,12,14,15,17,18,20};
        assertEquals(-1, BinarySearcher.getNumberFinder(29, t0BeSearchedIn, 9, 0));
    }
}
