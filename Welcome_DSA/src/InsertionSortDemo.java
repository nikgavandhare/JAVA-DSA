public class InsertionSortDemo
{
    public static void main(String[] args)
    {
        int arr[]= {3,6,2,1,5};

        System.out.println("BEfore Sorting");
        for(int nums:arr)
        {
            System.out.print(nums+ " ");
        }

        // write logic
        int n=arr.length;



        for(int i=1;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;

            while( j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }

        System.out.println();
        System.out.println("After Sorting");
        for(int nums:arr)
        {
            System.out.print(nums+ " ");
        }
    }
}
