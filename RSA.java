import java.util.Scanner;

public class RSA {
  static int mult(int a,int b,int c)
  {
    int res=1;
    for(int i=0;i<b;i++)
    {
      res=(res*a)%c;
    }
    return res;
  }
  static int gcd(int a,int b)
  {
    if(b==0) return a;
    else return gcd(b, a%b);
  }
   static int isPrime(int num)
   {
     if(num<=1) return 0;
     for(int j=2;j<=num/2;j++)
     {
       if(num%j==0)
       {
         System.out.println("Number is not a prime number");
         return 0;
       }

     }
     System.out.println(num +"is a prime number");
     return num;
   }
  public static void main(String[] args) {
    int msg,cipher,plain;
    int p,q,n,z,d=0,i,e;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the values of p and q");
    p=sc.nextInt();
    q=sc.nextInt();
    int a=isPrime(p);
    int b=isPrime(q);
    if((a==p&&b==q) && (a!=0 && b!=0))
    {
       System.out.println("Enter a message");
       msg=sc.nextInt();
       n=p*q;
       z=(p-1)*(q-1);
       do { 
           System.out.println("Choose the value of the e such that gcd is 1");
           e=sc.nextInt();
       } while (gcd(z,e)!=1);
       i=2;
        while(true)
        {
           if((i*e)%z==1)
           {
             d=i;
             break;
           }
           i++;
        }
        System.out.println("The public keys are "+e+" and "+n);
        System.out.println("The private keys are "+d+" and "+n);
        cipher=mult(msg,e,n);
        System.out.println("The encrypted message is "+cipher);
        plain=mult(cipher,d,n);
        System.out.println("The decrypted message is "+plain);
    }

  }
}
