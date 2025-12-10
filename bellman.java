
import java.util.Scanner;

public class bellman {
  private int D[];
  private int num_ver;
  public static final int max_value=999;
  public static void main(String[] args) {
    int num_ver=0;
    int source;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of vertices ");
    num_ver=sc.nextInt();
    int A[][]=new int[num_ver+1][num_ver+1];
    System.out.println("Enter the adjascent matrix : ");
    for(int sn=1;sn<=num_ver;sn++)
    {
      for(int dn=1;dn<=num_ver ;dn++)
      {
        A[sn][dn]=sc.nextInt();

        if(sn==dn)
        {
          A[sn][dn]=0;
          continue;
        }
        if(A[sn][dn]==0)
        {
          A[sn][dn]=max_value;
        }
      }
    }
    

  }
}
