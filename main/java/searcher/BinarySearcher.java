package searcher;

public class BinarySearcher {
    public static void main(String[] args) {
        int toBeSearched = 1;
        String name = "akshay";
        Integer[] searchNumberIn = {1, 2, 3, 4};
        String[] names = {"akshay","divya","pratik","zoyaa"};
        Double[] n = {0.0,1.2,2.4,3.6,7.7,8.9};
        double a = 1.2;
        int highestIndex = searchNumberIn.length, lowestIndex = 0;
        System.out.println(indexFinder(toBeSearched, searchNumberIn, highestIndex, lowestIndex));
        System.out.println(indexFinder(name, names, names.length, lowestIndex));
        System.out.println(indexFinder(a,n,6,0));
    }

    public static <T extends Comparable<T>> int indexFinder(T toBeSearched, T[] searchIn, int highestIndex, int lowestIndex) {
        if (lowestIndex < searchIn.length - 1) {
            int middileIndex = getMiddileIndex(highestIndex, lowestIndex);
            if (searchIn[middileIndex].equals(toBeSearched)){
                return (middileIndex);
            } else if (searchIn[middileIndex].compareTo(toBeSearched) > 0) {
                return indexFinder(toBeSearched, searchIn, middileIndex, lowestIndex);
            } else if (searchIn[middileIndex].compareTo(toBeSearched) < 0) {
                return indexFinder(toBeSearched, searchIn, highestIndex, middileIndex);
            }
        }
        return (-1);
    }

    private static int getMiddileIndex(int highestIndex, int lowestIndex) {
        return (highestIndex + lowestIndex) / 2;
    }

}

