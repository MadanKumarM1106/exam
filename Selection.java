import java.util.Arrays;

public class Selection {
  public static void main(String[] args) {
    int[] arr={6,8,79,567,56,25,81};
    insertion(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void insertion(int[] arr)
  {   
    for(int i=0;i<arr.length;i++)
    {
         int last=arr.length-i-1;
         int max=findmax(arr,0,last);
         swap(arr,max,last);
    }

    
      
  }
  static void swap(int[] arr,int first ,int last)
  {
    int temp=arr[first];
    arr[first]=arr[last];
    arr[last]=temp;
  }
  static int findmax(int[] arr,int low,int last)
  {
    int max=low;
    for(int i=low;i<=last;i++)
    {
      if(arr[max]<arr[i])
      {
         max=i;
      }
    }
    return max;
  }
}
