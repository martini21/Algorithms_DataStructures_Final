public class BubbleSortLegos {
    private String pieceName;

    public BubbleSortLegos(String pieceName){
        this.pieceName = pieceName;
    }

    //return name of the piece
    public String getPieceName() {
        return pieceName;
    }

    public String toString(){
        return getPieceName();
    }
}
