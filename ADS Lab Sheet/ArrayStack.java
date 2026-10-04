import java.util.*;

class ArrayStack<T> {

    T[] stack;
    int top;
    int capacity;

    ArrayStack(int capacity)
    {
        this.capacity = capacity;
        top = -1;

        this.stack = (T[]) new Object[capacity];
    }
    public void push(T element)
    {
        if(top == capacity - 1)
        {
            System.out.println("Stack Overflow");
        }
        else
        {
            top = top + 1;
            stack[top] = element;
            System.out.println(element + "pushed into stack");
        }
    }
    public T pop()
    {
        if(top == -1)
            {
                System.out.println("Stack Underflow");
                return null;
            }
            else
            {
                T element = stack[top];
                stack[top] = null;
                top = top -1;

                return element;
            }
    }
    public T peek()
    {
        if(top == -1)
        {
            //T topElement = stack[top];
            System.out.println("Stack Underflow");
            return null;
        }
        else
        {
            return stack[top];
        }
    }
    public void display()
    {
        if(top == -1)
        {
            System.out.println("Stack is Empty");

            System.out.println("Stack elements : ");

            for(int i = top; i >= 0; i--)
                {
                  System.out.println(stack[i]);
                }
        }
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        ArrayStack<String> stack = new ArrayStack<>(3);
        
        int choice;

        do{
            System.out.println("\n=======Stack Menu========");
            System.out.println("1. Push : ");
            System.out.println("2. Pop : ");
            System.out.println("3. Peep : ");
            System.out.println("4. Display : ");
            System.out.println("5. Exit ");

            choice = sc.nextInt();
            sc.nextLine();

            switch(choice)
            {
                case 1 :
                    System.out.println("Enter the string to push : ");
                    String element = sc.nextLine();
                    break;

                case 2 :
                    String poppedElement = stack.pop();
                    if(poppedElement != null)
                    {
                        System.out.println("Popped element : " + poppedElement); 
                    }
                    break;

                case 3 :
                    String topElement = stack.peek();

                    if(topElement != null)
                    {
                        System.out.println("Top element : " + topElement);
                    }
                    break;

                case 4 :
                    stack.display();
                    break;
                    
                case 5 :
                    System.out.println("Exiting program....");
                    break;

                    default :
                    System.out.println("Invalid choice");    
            }
        }
        while(choice != 5);

        sc.close();
    }
}
