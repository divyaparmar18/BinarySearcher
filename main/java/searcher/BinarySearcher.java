package searcher;

public class BinarySearcher {
    public static void main(String[] args) {
        int toBeSearched = Integer.parseInt(args[0]);
        int[] searchNumberIn = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int highestIndex = searchNumberIn.length, lowestIndex = 0;
        System.out.println(getNumberFinder(toBeSearched, searchNumberIn, highestIndex, lowestIndex));
    }

    public static int getNumberFinder(int toBeSearched, int[] searchNumberIn, int highestIndex, int lowestIndex) {
        if(lowestIndex < searchNumberIn.length-1) {
            int middileIndex = getMiddileIndex(highestIndex, lowestIndex);
            if (searchNumberIn[middileIndex] == toBeSearched) {
                return ( middileIndex);
            } else if (searchNumberIn[middileIndex] > toBeSearched) {
                return getNumberFinder(toBeSearched, searchNumberIn, middileIndex, lowestIndex);
            } else if (searchNumberIn[middileIndex] < toBeSearched) {
                return getNumberFinder(toBeSearched, searchNumberIn, highestIndex, middileIndex);
            }
        }

        return (-1);
    }

    private static int getMiddileIndex(int highestIndex, int lowestIndex) {
        return (highestIndex+lowestIndex)/2;
    }

    }

