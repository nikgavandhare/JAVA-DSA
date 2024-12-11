public class BinarySearchDemo
{
    public static int Binary_Search(int[] arr,int target)
    {
        int steps=0;    // steps is for calulating stpes taken to find the no
        int left=0;
        int right=arr.length-1;
        int mid;

        while (left<=right)
        {
            steps++;

            mid=(left+right)/2;

            if(arr[mid]==target) {
                System.out.println("steps taken Binary Search to find target is: " + steps);
                return mid;
            }
            else if (arr[mid]<target)
            {
                left=mid+1;
            }
            else {
                right = mid - 1;
            }
        }

        System.out.println("steps taken Binary Search to find target is: " + steps);
        return  -1;
    }


    public static void main(String[] args)
    {
        int arr[]={1,3,5,7,9,11,13};   // array must be sorted
        int target=5;

        int result= Binary_Search(arr,target);

        if(result!= -1)

            System.out.println("Element found at index:  " + result);

        else
            System.out.println("element not found in the array");
    }
}
