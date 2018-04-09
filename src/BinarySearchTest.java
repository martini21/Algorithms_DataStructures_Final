import static org.junit.Assert.*;

public class BinarySearchTest {
    private BinarySearch bs;
    private SmartBubbleSort sbs;

    @org.junit.Before
    public void Before() {
        this.bs = new BinarySearch();
        this.sbs = new SmartBubbleSort();
        //This might need to be removed
        Legocsv reader = new Legocsv();
    }

    @org.junit.Test
    public void contains (){
        //Arrange
        LegoItem itemToCompare = Legocsv.itemsArray[3];
        LegoItem[] items = new LegoItem[5];
        items[0] = Legocsv.itemsArray[0];
        items[1] = Legocsv.itemsArray[1];
        items[2] = Legocsv.itemsArray[2];
        items[3] = Legocsv.itemsArray[3];
        items[4] = Legocsv.itemsArray[4];
        items = this.sbs.SmartBubbleSort(items);
        //Act
        Boolean doesItContain = this.bs.BinarySearch(items, itemToCompare);
        //Assert
        assertTrue(doesItContain);
    }
}