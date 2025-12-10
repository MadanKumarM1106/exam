import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arlist {
  public static void main(String[] args) {
    ArrayList<Integer> mad=new ArrayList<>(2);
    // mad.add(20);
    // mad.add(25);
    // mad.add(55);
    Scanner in=new Scanner(System.in);
    for(int i=0;i<6;i++)
    {
      mad.add(in.nextInt());
    }
    mad.set(0,58);
    mad.remove(2);
    System.out.println(mad.contains(25));
    System.out.println(mad.size());
    System.out.println(mad.get(0));
    System.out.println( mad);

  }
}
