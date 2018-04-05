import java.util.Comparator;

public class BubbleSortLegoCompare implements Comparator<BubbleSortLegos> {

    @Override
    //sorts employee surname by alphabetical order
    public int compare(BubbleSortLegos o1, BubbleSortLegos o2) {
        if(o1.getPieceName().compareTo(o2.getPieceName()) > 0){
            return 1;
        }else if(o1.getPieceName().compareTo(o2.getPieceName()) < 0){
            return -1;
        }else{
            return 0;
        }

    }
}