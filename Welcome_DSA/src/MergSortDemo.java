public class MergSortDemo
{
    public static void MergeSort(int[] arr,int left, int right)
    {
        if(left<right)
        {
            //find mid
            int mid=(left+right)/2;

            MergeSort(arr,left,mid);  // for first half

            MergeSort(arr,mid+1,right);  // for second half

            merge(arr,left,mid,right);
        }
    }

    private static  void merge(int[] arr,int left,int mid,int right)
    {
        int n1=mid-left+1;
        int n2=right-mid;

        int Left_Arr[]=new int[n1];
        int Right_Arr[]=new int[n2];



        for(int x=0;x<n1;x++)
        {
            Left_Arr[x]=arr[left+x];
        }

        for(int x=0;x<n2;x++)
        {
            Right_Arr[x]=arr[mid+1+x];
        }

        int i=0;
        int j=0;
        int k=left;

        while( i<n1 && j<n2)
        {
            if(Left_Arr[i] <= Right_Arr[j])
            {
                arr[k]=Left_Arr[i];
                i++;
            }
            else
            {
                arr[k]=Right_Arr[j];
                j++;
            }

        k++;

        }

        // for copying element into Left_Arr
        while(i<n1)
        {
            arr[k]=Left_Arr[i];
            i++;
            k++;
        }

        // for copying element into Right_Arr
        while(i<n2)
        {
            arr[k]=Right_Arr[i];
            j++;
            k++;
        }

    }




    public static void main(String[] args)
    {
        int arr[]={3,7,11,9,1,4};

        System.out.println("Before Merge Sort");
        for(int nums:arr)
        {
            System.out.print(nums+" ");
        }
        System.out.println();

        // aply merge sort lof=gic to sort array
        MergeSort(arr,0,arr.length-1);

        System.out.println("After Merge Sort");
        for(int nums:arr)
        {
            System.out.print(nums+" ");
        }

    }
}
