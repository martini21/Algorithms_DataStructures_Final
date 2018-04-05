public class Binary_Search {
    //TODO: change parameter name

    public static int contains(int[]a, int b) {
        //For the first loop set the start and end of the array leave them as is
        int start = 0;
        int end = a.length;
        while (start <= end) {
            //Set the mid of the array
            //If the mid is equal to the value we want to find return true.
            int mid = (start + end) / 2;
            if (a[mid] == b) {
                return b;
            }
            //Find in which half the value we want to find lies and adjust the parameters accordingly
            if (a[mid] > b) {
                end = mid - 1;
                System.out.println("a");
            } else {
                start = mid + 1;
                System.out.println("b");
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Key 14's position: "+contains(arr, 16));
        int[] arr1 = {6,34,78,123,432,900};
        System.out.println("Key 432's position: "+contains(arr1, 900));
    }

}
