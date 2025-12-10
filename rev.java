public class rev {
   static int revr=0;
   static void  rev(int n )
   {
     if(n==0)
     {
      return ;
     }
      
      int p=n%10;
      revr=revr*10+p;
      rev(n/10);
   }
  public static void main(String[] args) {
    int n=1551;
      
    rev(n );
    
    System.out.println(revr==n);

  }
 
  // static int reverse1(int n)
  // {
  //   int rev=0;
  //   int k2=n;
  //   int p;
  //   while(k2>0)
  //   {
  //       p=k2%10;
  //       rev=rev*10+p;
  //       k2/=10;


  //   }
  //   return rev;
  // }
  
}
