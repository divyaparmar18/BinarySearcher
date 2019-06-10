package searcher;

public class BinarySearcher {
    public static void main(String[] args) {
        int toBeSearched = 9;
        Integer[] searchNumberIn = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int highestIndex = searchNumberIn.length, lowestIndex = 0;
        System.out.println(getNumberFinder(toBeSearched, searchNumberIn,highestIndex, lowestIndex));
    }

    public static <T extends Comparable<T>>int getNumberFinder(T toBeSearched, T[] searchNumberIn, int highestIndex, int lowestIndex) {
        if(lowestIndex < searchNumberIn.length-1) {
            int middileIndex = getMiddileIndex(highestIndex, lowestIndex);
            if (searchNumberIn[middileIndex] == toBeSearched) {
                return ( middileIndex);
            } else if (searchNumberIn[middileIndex].compareTo(toBeSearched)>0) {
                return getNumberFinder(toBeSearched, searchNumberIn, middileIndex, lowestIndex);
            } else if (searchNumberIn[middileIndex].compareTo(toBeSearched)<0) {
                return getNumberFinder(toBeSearched, searchNumberIn, highestIndex, middileIndex);
            }
        }
        return (-1);
    }

    private static int getMiddileIndex(int highestIndex, int lowestIndex) {
        return (highestIndex+lowestIndex)/2;
    }

    }

