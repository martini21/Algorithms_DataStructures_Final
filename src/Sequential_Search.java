public class Sequential_Search {
    //TODO: change parameter name
    //Supply the "collection" and the value we wish to find
    public boolean contains(LegoItem[] array, LegoItem item) {
        //Loop through the "collection" if the value is found return true otherwise return false.
        for (LegoItem currentItem:array) {
            if(currentItem.compareTo(item) == 0){
                return true;
            }
        }
        return false;
    }
}
