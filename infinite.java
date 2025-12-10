import java.util.Scanner;

public class infinite {
  static int bunisearch(int arr[],int m,int low,int high)
   {
     
    
    
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
     return -1;
   }
   static int setend(int[] arr,int m)
   {

      int start=0;
      int end=1;
      while(m>arr[end])
      {
        int newstr=end+1;
        end=end+(end-start+1)*2;
        start=newstr;
      }
    return bunisearch(arr, m, start, end);

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
     System.out.println(setend(arr,m));
  }
}
