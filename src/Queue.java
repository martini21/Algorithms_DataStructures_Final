class Queue
{
    private int rear;
    private int size;
    private Object[] array;

    //Constructor for the queue, all it's parameters
    public Queue(int size) {
        this.size = size;
        this.rear = 0;
        this.array = new Object[this.size];
    }

    // Queue is full when this.rear is equal to this.size - 1
    public boolean isFull()
    {
        return ((this.size) == this.rear);
    }

    // Queue is empty when rear is 0
    public boolean isEmpty()
    {
        return (this.rear == 0);
    }

    // Method to add an item to the queue
    // It changes rear
    public boolean enqueue(Object item)
    {
        if (isFull()) return false;

        this.array[this.rear] = item;
        this.rear++;

        return true;
    }

    // Method to remove the first item from queue
    // It changes rear
    public Object dequeue()
    {
        if (isEmpty()) return null;

        Object item = this.array[0];
        for(int i = 0; i < this.rear - 1; i++)
        {
            this.array[i] = this.array[i + 1];
        }
        this.rear--;

        return item;
    }

    // Method to get front of queue
    public Object front()
    {
        if (isEmpty()) return null;

        return this.array[0];
    }

    // Method to get rear of queue
    public Object rear()
    {
        if (isEmpty()) return null;

        return this.array[this.rear - 1];
    }
}