public class SequentialSearch {
    //Supply the "collection" and the value we wish to find
    public boolean SequentialSearch(LegoItem[] array, LegoItem item) {
        //Loop through the "collection" if the value is found return true otherwise return false
        for (LegoItem currentItem:array) {
            if(currentItem.compareTo(item) == 0){
                return true;
            }
        }
        return false;
    }
}