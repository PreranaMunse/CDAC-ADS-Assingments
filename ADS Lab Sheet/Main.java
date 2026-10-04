import java.util.Arrays;

class CircularDeque<T>
{
    T[] arr;
    int front;
    int size;
    int capacity;

    //Constructor
    CircularDeque(int capacity)
    {
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
        front = 0;
        size = 0;
    }
        
        //addFirst
        void addFirst(T item)
        {
            if(size == capacity)
            {
                System.out.println("Deque is Full ");
                return;
            }
         front = (front - 1 + capacity) % capacity;
         arr[front] = item;
         size++;

         System.out.println("addFirst(" + item + ")");
         display();
       }

        // addLast
        void addLast(T item)
        {
            if(size == capacity)
            {
                System.out.println("Deque is full");
                return;
            }
            int rear = (front + size)% capacity;
            arr[rear] = item;
            size++;

            System.out.println("addLast(" + item + ")");
            display();
        }
        // removeFirst
        T removeFirst()
        {
            if(size == 0)
            {
                System.out.println("Deque is empty");
                return null;
            }
            T iteam = arr[front];
            arr[front] = null;

            front = (front + 1)% capacity;
            size--;

            System.out.println("removeFirst() -> " + item);
            display();

            return item;
        }

        // removeLast
        T removeLast()
        {
            if(size == 0)
            {
                System.out.println("Deque is empty");
                return null;
            }
            int rear = (front + size - 1)% capacity;

            T item = arr[rear];
            arr[rear] = null;
            size--;

            System.out.println("removeLast() -> " + item);
            display();

            return item;
        }
        // peekFirst 
        T peekFirst()
        {
            if(size == 0)
            {
                System.out.println("Deque is full");
                return null;
            }
            T item = arr[front];
            System.out.println("PeekFirst() -> " + item);
            display();

            return item;
        }
        // peekLast
        T peekLast() {
        if (size == 0) {
            System.out.println("Deque is empty!");
            return null;
        }

        int rear = (front + size - 1) % capacity;
        T item = arr[rear];

        System.out.println("peekLast() -> " + item);
        display();

        return item;
    }
     // Print raw array, front, and size
    void display() {
        System.out.println("Raw Array: " + Arrays.toString(arr));
        System.out.println("front = " + front);
        System.out.println("size = " + size);
        System.out.println("-------------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        CircularDeque<Integer> deque = new CircularDeque<>(5);

        deque.display();

        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);

        deque.removeFirst();

        deque.addFirst(5);
        deque.addFirst(1);

        deque.peekFirst();
        deque.peekLast();

        deque.removeLast();
        deque.removeFirst();

        deque.addLast(40);
        deque.addLast(50);
    }
}

    

    

