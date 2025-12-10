import java.util.Scanner;

public class ceil {
   static int bunsearch(int arr[],int m)
   {
    int low=0;
    int high=arr.length-1;
    
    
          while(low<=high)
          {
            int md=low+(high-low)/2;
            if(arr[md]==m)
              return md;
            else if(m>arr[md])
              low=md+1;
            else{
               
              high=md-1;
              }
            
          }
     return high;
   }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of array elements :");
     int n=sc.nextInt();
     System.out.println("Enter the sorted array elements :");
     int[] arr=new int[n];
     for(int i=0;i<arr.length;i++)
     {
       arr[i]=sc.nextInt();
     }
     System.out.println("Enter the elements to be searched :");
     int m=sc.nextInt();
     System.out.println(bunsearch(arr,m));
  }
}
