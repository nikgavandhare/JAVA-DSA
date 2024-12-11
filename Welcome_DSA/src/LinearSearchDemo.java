public class LinearSearchDemo
{

    public static int Linear_Search(int[] arr,int target)
    {
        int steps=0;

        for(int i=0;i<arr.length;i++)
        {
            steps++;
            
            if(arr[i]==target)
            {
                System.out.println("steps taken by Linear Search to find target: "+ steps);
                return i;
            }
        }

        System.out.println("steps taken by Linear Search to find target: "+ steps);
        return  -1;
    }


    public static void main(String[] args)
    {
        int arr[]={1,3,5,7,9,11,13};
        int target=3;

        int result= Linear_Search(arr,target);

        if(result!= -1)

            System.out.println("Element found at index:  " + result);

        else
            System.out.println("element not found in the array");
    }
}