public class BubleSortDemo
{
    public static void main(String[] args)
    {
        int arr[]={7,8,3,1,2,87,88,99,22,33,44,55,66,77,11,21,34,67,89,100};



        System.out.println("Before sorting");
        // adv for loop for printing values
        for(int nums:arr)
        {
            System.out.print(nums+ " ");
        }

        // lets do buble sorting

        int n= arr.length;  // here n is size of arr
        int temp=0;
        // here i is for iteration and j is for internal iteration while swaping 2 no
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    // swap using temp
                    temp=arr[j];
                    arr[j]=arr[j+1];   // swaping of j & j+1 is done here at this line
                    arr[j+1]=temp;
                }
            }
            // lets see how many itertion it has take to sort values
            System.out.println();
            for(int nums:arr)
            {

                System.out.print(nums +" ");
            }
            System.out.println("Values After Each Iteration");
        }

        System.out.println();
        System.out.println("After Sorting");
        for(int nums:arr)
        {
            System.out.print(nums+ " ");
        }
    }
 }
