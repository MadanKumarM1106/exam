import java.util.Arrays;

public class cyclicsort {
  public static void main(String args[])
  {
    int[] arr={3,5,2,1,4};
    cycle(arr);
    System.out.println(Arrays.toString(arr));

  }
  static void cycle(int[] arr)
  {
     int n=arr.length;
     int k=0;
     while(k<n)
     {
        int curindex=arr[k]-1;
       if(curindex!=k)
       {
        int temp=arr[k];
       
        arr[k]=arr[curindex];
         arr[curindex]=temp;

       }
       else
       {
        k++;
       }
     }

  }
}
