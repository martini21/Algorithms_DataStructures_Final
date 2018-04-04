import static org.junit.Assert.*;

public class LinkedListTest {
    private LinkedList list;

    @org.junit.Before
    public void Before()
    {
        this.list = new LinkedList();
    }

    @org.junit.Test
    public void push()
    {
        this.list.push(5);
        assertEquals(5, this.list.head.data);
        this.list.push(3);
        assertEquals(3, this.list.head.data);
    }

    @org.junit.Test
    public void insertAfter()
    {
        this.list.push(5);
        this.list.insertAfter(this.list.head, 3);
        assertEquals(3, this.list.head.next.data);
    }

    @org.junit.Test
    public void append()
    {
        this.list.append(2);
        assertEquals(2, this.list.head.data);
        this.list.append(3);
        assertEquals(3, this.list.head.next.data);
    }
}