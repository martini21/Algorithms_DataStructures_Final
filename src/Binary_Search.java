public class Binary_Search<T extends Comparable<T>> {
    public boolean contains(T[]array, T value) {
        //For the first loop set the start and end of the array leave them as is
        int start = 0;
        int end = array.length;
        while (start <= end) {
            //Set the mid of the array
            //If the mid is equal to the value we want to find return true.
            int mid = (start + end) / 2;
            if (array[mid].compareTo(value) == 0) {
                return true;
            }
            //Find in which half the value we want to find lies and adjust the parameters accordingly
            if (array[mid].compareTo(value) > 0) {
                end = mid - 1;
                System.out.println("array");
            } else {
                start = mid + 1;
                System.out.println("value");
            }
        }
        return false;
    }
    public static void main(String[] args) {

    }

}
