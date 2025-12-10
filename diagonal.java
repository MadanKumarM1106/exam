class diagonal{
  public static void main(String[] args) {
     int[][] a={{1,2,3},{4,5,6},{7,8,9}};
     int primarysum=0;
     int sec=0;

     for(int i=0;i<a.length;i++)
     {
       
         primarysum+=a[i][i];
         sec+=a[i][a.length-i-1];
       
     }
     System.out.println(primarysum+sec);

  }
}