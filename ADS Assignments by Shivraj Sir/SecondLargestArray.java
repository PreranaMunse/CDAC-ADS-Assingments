public class SecondLargestArray
{
    public static void main(String[] args)
    {
        int[] arr = {12, 5, 8, 20, 15, 20, 7};

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 1; i < arr.length; i++ )
        {
            if(arr[i] > largest)
            {
                secondLargest = largest;

                largest = arr[i];
            }
            else if (arr[i] < largest && arr[i] > secondLargest)
            {
                secondLargest = arr[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE)
        {
            System.out.println("Second largest distint elemnet does not exist.");
        }
        else{
            System.out.println("Second largest = " + secondLargest);
        }

    }
}