import java.util.Comparator;

public class BubbleSortMain {

    public static void main(String[] args) {
        BubbleSortLegos[]legos = new BubbleSortLegos[5];
        BubbleSortLegos lego = new BubbleSortLegos("Hohn");
        legos[0] = lego;
        lego = new BubbleSortLegos("Zary");
        legos[1] = lego;
        lego = new BubbleSortLegos("Blex");
        legos[2] = lego;
        lego = new BubbleSortLegos("Aavid");
        legos[3] = lego;
        lego = new BubbleSortLegos("Shaun");
        legos[4] = lego;


        System.out.println("\nSorting in ascending order on basis of employeeLastName...\n");
        printArray(legos);
        sort(legos,new BubbleSortLegoCompare());
        System.out.println("After sorting...");

        printArray(legos);
    }

    public static<T> void sort(T []a, Comparator<? super T> comparator){
        bubbleSortInAscOrder(a,comparator);
    }

    private static<T> void bubbleSortInAscOrder(T []a,Comparator<? super T>comparator){
        int left = 0;
        int right = a.length-1;
        // the outer loop, runs from right to left
        for(int i=right;i>1;i--){
            // the inner loops, runs from left to the right, limited by the outer loop
            for(int j=left;j<i;j++){
                // if the left item is greater than the right one, swaps
                if(comparator.compare(a[j], a[j+1]) > 0){
                    swap(a,j, j+1);
                }
            }
        }

    }

    // This method is used to swap the values between the two given index
    private static void swap(Object []a, int left,int right){
        Object temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

    //print all array
    public static<T> void printArray(T []a){
        for(T t : a){
            System.out.println(t);
        }
    }
}