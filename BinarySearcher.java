import java.util.List;

public class BinarySearcher {
    public static void main(String[] args) {
        int toBeSearched = Integer.parseInt(args[0]);
        int[] searchNumberIn = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 13};
        int highestIndex = searchNumberIn.length, lowestIndex = 0;
        getNumberFinder(toBeSearched, searchNumberIn, highestIndex, lowestIndex);
    }

    private static void getNumberFinder(int toBeSearched, int[] searchNumberIn, int highestIndex, int lowestIndex){
        for (int i = 0; i < searchNumberIn.length; i++) {
            int middileIndex = getMiddileIndex(highestIndex, lowestIndex);
            if(searchNumberIn[middileIndex] == toBeSearched){
                System.out.println("The number is present in the list at the index " + middileIndex);
                return;
            }
            else if (searchNumberIn[middileIndex] > toBeSearched){
                highestIndex = middileIndex;
            }
            else if (searchNumberIn[middileIndex] < toBeSearched){
                lowestIndex = middileIndex;
            }

        }
        System.out.println("Number not in the list");
    }
    private static int getMiddileIndex(int highestIndex, int lowestIndex) {
        return (highestIndex+lowestIndex)/2;
    }

    }

