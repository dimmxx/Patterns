package main.java.algorithm.binary_search;

public class BinarySearch {

    public static void main(String[] args) {

        int[] array = {15, 29, 3054, 4547, 5000, 6777, 7145};
        // 0, 1, 2, 3, 4, 5
        int item = 0;

        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(array, item));
    }

    public int binarySearch(int[] array, int item) {

        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            if (array[high] == item) {
                return high;
            } else if (array[low] == item) {
                return low;
            }
            int mid = (low + high) / 2;
            if (item == array[mid]) {
                return mid;
            } else if (item < array[mid]) {
                high = mid;
            } else if (item > array[mid]) {
                low = mid;
            }
        }
        return -1;
    }
}
