class pattern{
  public static void main(String[] args) {
    pattern8(5);
  }
  static void pattern1(int n)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<i+1;j++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
  static void pattern2(int n)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n;j++)
      {
        System.out.print(" * ");
      }System.out.println();
    }
  }
   static void pattern3(int n)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<n-i;j++)
      {
        System.out.print(" * ");
      }System.out.println();
    }
  }
   static void pattern4(int n)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<i+1;j++)
      {
        System.out.print(j+1 +" ");
      }System.out.println();
    }
  }
   static void pattern5(int n)
  {
    for(int i=1;i<=2*n-1;i++)
    {
       int totalcol = i <= n ? i : 2*n - i;
       int numspace=n-totalcol;
       for(int k=1;k<=numspace;k++)
       {
        System.out.print(" ");
       }

      for(int j=1;j<=totalcol;j++)
      {
        System.out.print("* ");
      }System.out.println();
    }
     
    
  }
  static void pattern8(int n)
  {
    for(int i=1;i<=n;i++)
    {
       int sp=n-i;
       for(int k=1;k<=sp;k++)
       {
        System.out.print(" ");
       }
      for(int j=i;j>=1;j--)
      {
        System.out.print(" "+j);
      }
      for(int j=2;j<=i;j++)
      {
        System.out.print(" "+j);
      }
      System.out.println();
    }
  }
  static void pattern1(int n)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=0;j<i+1;j++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }

}