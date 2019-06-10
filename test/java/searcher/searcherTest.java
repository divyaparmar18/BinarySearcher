package searcher;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class searcherTest {
    @Test
    public void theIndexofTheNumberShouldBeGiven() {
        Integer[] toBeSearchedIn = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(5, BinarySearcher.indexFinder(6, toBeSearchedIn, 11, 0));
    }
    @Test
    public void theIndexOfTheNumberToBeSearchedShouldBeGiven() {
        Integer[] toBeSearchedIn = {3,5,8,12,14,15,17,18,20};
        assertEquals(3, BinarySearcher.indexFinder(12, toBeSearchedIn, 9, 0));
    }
    @Test
    public void ifTheNumberIsNotInTheArray() {
        Integer[] t0BeSearchedIn = {3,5,8,12,14,15,17,18,20};
        assertEquals(-1, BinarySearcher.indexFinder(29, t0BeSearchedIn, 9, 0));
    }
    @Test
    public void ifTheNameIsInTheArray() {
        String[] t0BeSearchedIn = {"divya","gauri","kajal","priya","zoyaa"};
        assertEquals(4, BinarySearcher.indexFinder("zoyaa", t0BeSearchedIn, 5, 0));
    }
    @Test
    public void ifTheNumberIsInTheArray() {

        Double [] t0BeSearchedIn = {0.0,1.2,2.4,3.6,7.7,8.9};
        assertEquals(1, BinarySearcher.indexFinder(1.2, t0BeSearchedIn, 6, 0));
    }
}
