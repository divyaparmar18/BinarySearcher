package searcher;

public class BinarySearcher {
    public static void main(String[] args) {
        int toBeSearched = 1;
        String name = "shinuu";
        Integer[] searchNumberIn = {1, 2, 3, 4};
        String[] names = {"akshay","divya","shinuu","zoyaa"};

        int highestIndex = searchNumberIn.length, lowestIndex = 0;
        System.out.println(indexFinder(toBeSearched, searchNumberIn, highestIndex, lowestIndex));
        System.out.println(indexFinder(name, names, names.length, lowestIndex));
    }

    public static <T extends Comparable<T>> int indexFinder(T toBeSearched, T[] searchNumberIn, int highestIndex, int lowestIndex) {
        if (lowestIndex < searchNumberIn.length - 1) {
            int middileIndex = getMiddileIndex(highestIndex, lowestIndex);
            if (searchNumberIn[middileIndex] == toBeSearched) {
                return (middileIndex);
            } else if (searchNumberIn[middileIndex].compareTo(toBeSearched) > 0) {
                return indexFinder(toBeSearched, searchNumberIn, middileIndex, lowestIndex);
            } else if (searchNumberIn[middileIndex].compareTo(toBeSearched) < 0) {
                return indexFinder(toBeSearched, searchNumberIn, highestIndex, middileIndex);
            }
        }
        return (-1);
    }

    private static int getMiddileIndex(int highestIndex, int lowestIndex) {
        return (highestIndex + lowestIndex) / 2;
    }

}

