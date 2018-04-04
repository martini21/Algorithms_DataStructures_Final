import static org.junit.Assert.*;

public class QueueTest {
    private Queue queue;

    @org.junit.Before
    public void Before()
    {
        this.queue = new Queue(3);
    }

    @org.junit.Test
    public void isFull()
    {
        this.queue.enqueue(5);
        this.queue.enqueue(5);
        this.queue.enqueue(5);
        assertTrue(this.queue.isFull());
        this.queue.dequeue();
        assertFalse(this.queue.isFull());
    }

    @org.junit.Test
    public void isEmpty()
    {
        this.queue.enqueue(5);
        this.queue.dequeue();
        assertTrue(this.queue.isEmpty());
        this.queue.enqueue(5);
        assertFalse(this.queue.isEmpty());
    }

    @org.junit.Test
    public void enqueue()
    {
        assertTrue(this.queue.enqueue(5));
        this.queue.enqueue(5);
        this.queue.enqueue(5);
        assertFalse(this.queue.enqueue(5));
    }

    @org.junit.Test
    public void dequeue()
    {
        assertEquals(null, this.queue.dequeue());
        this.queue.enqueue(5);
        assertEquals(5, this.queue.dequeue());
    }

    @org.junit.Test
    public void front()
    {
        assertEquals(null, this.queue.front());
        this.queue.enqueue(5);
        assertEquals(5, this.queue.front());
    }

    @org.junit.Test
    public void rear()
    {
        assertEquals(null, this.queue.rear());
        this.queue.enqueue(5);
        this.queue.enqueue(3);
        assertEquals(3, this.queue.rear());
    }
}