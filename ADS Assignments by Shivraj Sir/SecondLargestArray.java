/*Pseudocode
START

Create an integer array

Set largest = first element of array
Set secondLargest = smallest possible integer value

FOR each element from index 1 to the end of the array

    IF current element > largest THEN

        Set secondLargest = largest
        Set largest = current element

    ELSE IF current element < largest
            AND current element > secondLargest THEN

        Set secondLargest = current element

    END IF

END FOR

IF secondLargest is still the smallest possible integer value THEN

    Print "Second largest distinct element does not exist"

ELSE

    Print "Second Largest = " + secondLargest

END IF

END
 */
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

//Time Complexity = O(n)