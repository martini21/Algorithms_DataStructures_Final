import static org.junit.Assert.*;

public class SmartBubbleSortTest {
    private SmartBubbleSort sbs;

    @org.junit.Before
    public void Before()
    {
        this.sbs = new SmartBubbleSort();
        //This might need to be removed
        Legocsv reader = new Legocsv();
    }

    @org.junit.Test
    public void smartBubbleSort() {
        //Arrange
        LegoItem[] items = new LegoItem[5];
        items[0] = Legocsv.itemsArray[0];
        items[1] = Legocsv.itemsArray[1];
        items[2] = Legocsv.itemsArray[2];
        items[3] = Legocsv.itemsArray[3];
        items[4] = Legocsv.itemsArray[4];
        //Act
        LegoItem[] sorted = this.sbs.SmartBubbleSort(items);
        //Assert
        assertTrue(sorted[0].getPieces() < sorted[1].getPieces());
        assertTrue(sorted[1].getPieces() < sorted[2].getPieces());
        assertTrue(sorted[2].getPieces() < sorted[3].getPieces());
        assertTrue(sorted[3].getPieces() < sorted[4].getPieces());
    }
}