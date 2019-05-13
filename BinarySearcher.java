public class BinarySearcher {
    public static void main(String[] args) {
        int toBeSearched = Integer.parseInt(args[0]);
        int [] searchNumberIn = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        int highestIndex = searchNumberIn.length - 1;
        int lowestIndex = 0;
        for (int i = 0; i < searchNumberIn.length; i++) {
            int middileIndex = (highestIndex + lowestIndex) / 2;
            if (searchNumberIn[middileIndex] == toBeSearched) {
                System.out.println("The number is present in the list at the index " + middileIndex);
                return;
            }
        }
    }
}
