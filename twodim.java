
import java.util.Arrays;
import java.util.Scanner;

public class twodim{
  public static void main(String[] args) {
    int[][] arr=new int[3][];
    int[][] ar1={
      {1,2,3},
      {2,3},
      {2}
    };
    System.out.print(Arrays.toString(ar1[0]));
    Scanner sc=new Scanner(System.in);
    String[][] a=new String[5][1];
    for(int i=0;i<a.length;i++)
    {
      for(int j=0;j<a[i].length;j++)
      {
        a[i][j]= sc.nextLine();
      }
    }
    
  }
}