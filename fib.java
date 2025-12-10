public class fib {
  public static void main(String[] args) {
    int[] arr={1,2,23,45,56};
    int target=25;
    System.out.println(bin(arr,target,0,arr.length));
  }
  static int  bin(int[] arr,int target,int s,int e){
    if(s>e)
    {
      return -1;
    }
    int m=s+(e-s)/2;
    if(arr[m]==target)
    {
      return m;
    }
    if(arr[m]>target)
    {
      return bin(arr, target, 0, m-1);
    }
    else{
      return bin(arr, target, m+1, e);
    }
     
     
  }
}
