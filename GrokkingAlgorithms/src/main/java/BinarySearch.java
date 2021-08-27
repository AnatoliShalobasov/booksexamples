public class BinarySearch {
    public int binarySearch(int[] sortedArray, int itemForSearch) {
        int low = 0;
        int high = sortedArray.length - 1;
        int mid;
        int guess;
        while (low <= high) {
            mid = (low + high) / 2;
            guess = sortedArray[mid];
            if (guess == itemForSearch) {
                return mid;
            } else if (guess < itemForSearch) {
                low = mid + 1;
            } else {
                high = high - 1;
            }
        }
        return -1;
    }
}
