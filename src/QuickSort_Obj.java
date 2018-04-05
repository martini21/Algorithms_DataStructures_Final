public class QuickSort_Obj implements Comparable<QuickSort_Obj> {

    private int pieceCode;

    public QuickSort_Obj(int pieceCode){
        this.pieceCode = pieceCode;
    }

    public int getPieceCode() {
        return pieceCode;
    }

    public String toString(){
        return "Piece Code: "+ getPieceCode();
    }

    public int compareTo(QuickSort_Obj o) {
        QuickSort_Obj e = (QuickSort_Obj)o;
        if(this.pieceCode > e.getPieceCode())
            return 1;
        if(this.pieceCode < e.getPieceCode())
            return -1;
        if(this.pieceCode == e.getPieceCode())
            return 0;
        return 0;
    }
}
