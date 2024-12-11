public class QuickSortDemo
{
    public static void quickSort(int arr[],int low,int high)
    {
        if(low<high)
        {
            int pi= Partition(arr,low,high);

            // recursion of quicksort function(
            quickSort(arr,low,pi-1);  // for sort the left  sub-array

            quickSort(arr,pi+1,high);   // for sort the right  sub-array

        }

    }



    // create fun for partion
    private static int Partition(int[] arr, int low,int high)
    {
        int pivot=arr[high];   // pivot is selected at last element i.e high
        int i=low-1;

        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];   // swap
                arr[j]=temp;
            }
        }

        int temp=arr[i+1];
        arr[i+1]=arr[high];  // swap
        arr[high]=temp;

        return i+1;
    }

    public static void main(String[] args)
    {
        int arr[]={6,5,1,4,2,8,9,13};



        // use adv for loop for print the sorted arr aray
        System.out.println("Before Quick Sort");
        for(int nums:arr)
        {
            System.out.print(nums+" ");
        }

        // aplyy quick sort logic to sort array
        quickSort( arr,0,arr.length-1);

        System.out.println();
        System.out.println("After Quick Sort");
        for(int nums:arr)
        {
            System.out.print(nums+" ");
        }


    }
}
