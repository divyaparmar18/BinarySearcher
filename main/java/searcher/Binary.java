package searcher;

public class Binary {


    public static <T extends Comparable<T>> int getNumberFinder(T toBeSearched, T[] searchNumberIn, int highestIndex, int lowestIndex) {
        if(lowestIndex < searchNumberIn.length-1) {
            int middileIndex = getMiddileIndex(highestIndex, lowestIndex);
            if (searchNumberIn[middileIndex] == toBeSearched) {
                int middileIndex1 = middileIndex;
                return middileIndex1;
            }if( toBeSearched.compareTo( searchNumberIn[middileIndex] ) > 0 )
                return index(searchNumberIn, toBeSearched, middileIndex+1, highestIndex);
            else if( toBeSearched.compareTo( searchNumberIn[middileIndex] ) < 0 )
                return index( searchNumberIn, toBeSearched, lowestIndex, middileIndex-1 );
            else
                return middileIndex;
    }
        return (-1);
    }

    private static int getMiddileIndex(int highestIndex, int lowestIndex) {
        return highestIndex+lowestIndex;
    }
    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }
    public static <T extends Comparable<T>> int index( T[] items, T key, int low, int high )
    {
        if ( key == null )
            return -1;

        if( low > high  )
            return -1;

        int mid = low+(high-low)/2;

        if( key.compareTo( items[mid] ) > 0 )
            return index(items, key, mid+1, high);
        else if( key.compareTo( items[mid] ) < 0 )
            return index( items, key, low, mid-1 );
        else
            return mid;
    }

}
