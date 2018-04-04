public class Sequential_Search {
    //TODO: change parameter name
    //Supply the "collection" and the value we wish to find
    public boolean contains(int[]a, int b) {
        //Loop through the "collection" if the value is found return true otherwise return false.
        for (int i:a) {
            if(i==b){
                return true;
            }
        }
        return false;
    }
}
