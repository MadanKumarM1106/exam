public class rotat {
  public static void main(String[] args) {
    int[] arr={5,6,7,8,9,1,2};
    System.out.println(rotate(arr));
    
  }
  public static int rotate(int[] arr)
  {
    for(int i=1;i<arr.length;i++)
    {
       if(arr[i]<arr[i-1])
        return i-arr.length;
    }
    return 0;
  }
}
