import java.util.Scanner;
public class MyClass {
    
    public int[] sort(int[] arr)
    {
        //BubbleSort Algorithm
        int n=arr.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<=arr.length-1;i++)
        {
            System.out.print(arr[i]+" ");
        }
        return arr;
    }
    
    public int search(int[] arr,int l,int r,int k)
    {
        if(r>=l)
        {
            int mid=l+(r-l)/2;
            if(k==arr[mid])
            return mid;
            if(k>arr[mid])
            return search(arr,mid+1,r,k);
            
            return search(arr,l,mid-1,k);
        }
        return -1;
    }
    public static void main(String args[]) {
        Scanner in=new Scanner(System.in);
        System.out.print("Type in the Length of the Array :");
        int len=in.nextInt();
        int[] arry=new int[len];
        System.out.println("Type in an array Separated by space to Search ");
       for(int i=0;i<=len-1;i++)
       {
          arry[i]=in.nextInt(); 
       }
 
      //int[] arry={2,40,5,41,50};
      int x=40;
      int[] sorted=new MyClass().sort(arry);
      int result=new MyClass().search(sorted,0,sorted.length-1,x);
      if(result==-1)
      System.out.println("Element Not Found..");
      else
      System.out.println("There are "+sorted.length+" Elements and Searching Element is Found at Index "+result+" And Value is "+x);
    }
}