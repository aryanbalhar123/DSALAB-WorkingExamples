class Queue
{
    int front, size,capacity;
    int array[];

    public Queue (int length) {
        capacity = length;
        front = size = 0;
        array = new int[capacity];
    }
    //QUEUE IS FULL WHEN SIZE BECOMES EQUAL TO THE CAPACITY
    // THE CAPACITY
    boolean isFull()
    {
        return (size == capacity);
    }
    //QUEUE IS EMPTY WHEN SIZE IS 0
    boolean isEmpty()
    {
        return (size == 0);
    }
    //method to add an item to the queue.
    // it change the rear the size
    void enqueue (int item)
    {
         if (isFull() )
             return;
         int pos;
         pos = (front+size)%capacity;
         array[pos] = item;
         size=size+1;
         System.out.println(item+" enqueued to queue");

    }
    //method to remove an item from queue.
    //it change front and size
    int dequeue()
    {
        if(isEmpty())
            return 0;
        int item = array[front];
        front = (front + 1)%capacity;
        size = size - 1;
        return item;
    }
    //method to get front of queue
    int front()
    {
        if (isEmpty())
            return 0;
    }
}

public class Lab07 {
    public static void main(String[]args) {
        Queue queue = new Queue(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        System.out.println("" +queue.size);
        queue.enqueue(77);

        System.out.println(queue.dequeue() + "dequeue from queue\n");
        System.out.println("Front item is " + queue.front());
    }
}