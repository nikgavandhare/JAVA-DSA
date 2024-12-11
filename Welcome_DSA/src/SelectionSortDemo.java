public class SelectionSortDemo
{
    public static void main(String[] args)
    {

        int arr[]={7,8,3,1,2};

        System.out.println("Before Sort");
        for(int nums: arr)
        {
            System.out.print(nums+ " ");
        }
        System.out.println();


     // write logic for selection sort for min value at first place
        int i,j;
        int n= arr.length;  // n ise size of arr
        int temp=0;

        for(i=0;i<n-1;i++)
        {
            int minINDEX=i;
            for(j=i+1;j<n;j++)
            {
                if(arr[j]<arr[minINDEX])
                    minINDEX=j;
            }
            // swap
            temp=arr[minINDEX];
            arr[minINDEX]=arr[i];
            arr[i]= temp;

            // create for loop to print each iteration while sorting
            System.out.println();
            for(int nums:arr)
            {
                System.out.print(nums+" ");
            }
            System.out.println("Printing Each Iteration Of swapping Min Value ahead");
        }


    //after sort
        System.out.println();
        System.out.println("After Sort");
        for(int nums: arr)
        {
            System.out.print(nums + " ");
        }
    }
}
