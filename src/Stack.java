class Stack
{
    private int size;
    private int top;
    private Object[] array;

    //Constructor for the stack, all it's parameters
    public Stack(int size)
    {
        this.top = -1;
        this.size = size;
        this.array = new Object[this.size];
    }

    // Queue is empty when top is smaller than 0
    public boolean isEmpty()
    {
        return (this.top < 0);
    }

    // Method to push an item to the stack
    // It changes top
    public boolean push(Object item)
    {
        if (this.top == this.size - 1)
        {
            return false;
        }
        else
        {
            this.array[++this.top] = item;
            return true;
        }
    }

    // Method to pop an item from the stack
    // It changes top
    public Object pop()
    {
        if (this.top < 0)
        {
            return 0;
        }
        else
        {
            Object item = this.array[this.top--];
            return item;
        }
    }
}