
import java.util.Scanner;

public class hasht {
  public static void main(String[] args) {
    System.out.println("Enter the input as a string :");
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    int[] hash=new int[256];
    for(int i=0;i<s.length();i++)
        hash[s.charAt(i)]++;
    System.out.println("Enter the number of queries :");
    int n=sc.nextInt();
    while(n>0)
    {
      System.out.println("Enter the character :");
      char c=sc.next().charAt(0);
      System.out.println(hash[c]);
      n--;
    }
  }
}
