import org.junit.Test;

import static org.junit.Assert.*;

public class MinMaxTest {

    private MinMax mm;

    @org.junit.Before
    public void Before() {
        this.mm = new MinMax();
        //This might need to be removed
        Legocsv reader = new Legocsv();
    }

    @org.junit.Test
    public void minMax()
    {
        //Arrange
        LegoItem[] itemsToCompare = Legocsv.itemsArray;
        //Act
        mm.MinMax(itemsToCompare);
        //Assert
        assertEquals(0, mm.getMin().getPieces());
        assertEquals(5922, mm.getMax().getPieces());
    }

}