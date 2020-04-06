package main.java.algorithm.binary_search;

public class BinarySearch {

    int[] array = {1, 2, 3, 4, 5, 6};
                // 0, 1, 2, 3, 4, 5
    int item = 2;


    public int binarySearch(int[] orderedArray, int item) {

        int low = 0;
        int high = orderedArray.length - 1;

        while (low < high){

            int mid = (low + high)/2;

            if(mid == item){
                return  mid;
            }
        }








        return 0;
    }


}
