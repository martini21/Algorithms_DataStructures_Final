import static org.junit.Assert.*;

public class StackTest {
    private Stack stack;

    @org.junit.Before
    public void Before()
    {
        this.stack = new Stack(3);
    }

    @org.junit.Test
    public void isEmpty()
    {
        this.stack.push(5);
        assertFalse(this.stack.isEmpty());
        this.stack.pop();
        assertTrue(this.stack.isEmpty());
    }

    @org.junit.Test
    public void push()
    {
        this.stack.push(5);
        this.stack.push(5);
        this.stack.push(5);
        assertFalse(this.stack.push(5));
    }

    @org.junit.Test
    public void pop()
    {
        this.stack.push(5);
        this.stack.pop();
        assertTrue(this.stack.isEmpty());
    }

    @org.junit.Test
    public void popEmpty()
    {
        this.stack.push(5);
        this.stack.pop();
        assertEquals(0, this.stack.pop());
    }
}