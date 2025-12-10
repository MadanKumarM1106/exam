class recarr{
  public static void main(String[] args) {
    int[] arr={1 };
    System.out.println(chec(arr,0));

  }
  static boolean chec(int[] arr,int n)
  {
    if(n==arr.length-1)
    {
      return true;
    }
    return arr[n]<=arr[n+1]&&chec(arr,n+1);
  }
}