public class checkZero {
  
  public static void main(String[] args) {
     int count=0;
    System.out.println(check(3020,count));
     
  }
  static int check(int n,int count)
  {
    if( n==0)
    {
      return count;
    }
    if(n%10==0)
    {
       return check(n/10, count+1);
      
    }
     else
     {
       return check(n/10, count);
     }

  }
}
