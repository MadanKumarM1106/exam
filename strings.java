
public class strings {
  public static void main(String[] args) {
    // float a=12.32145f;
    // System.out.printf("the formatted number is that %.2f",a);
    // System.out.printf("the rounoff value of pi is that %.2f", Math.PI );
    // System.out.println("Madan"+ new ArrayList<>(Arrays.asList(1,2,3)));
    // System.out.println('a'-'b');
    //  StringBuilder build=new StringBuilder();
    // for(int i=0;i<26;i++)
    // {
    //   char ch=(char)('a'+i);
    //   build.append(ch) ;

    // }
    // System.out.println(build);
    // String name="MADAM";
    // for(int i=name.length()-1;i>=0;i--)
    // {
    //   build.append(name.charAt(i));
    // }
    
    // if(name.equals(build.toString()))
    // {
    //   System.out.println("polin");
    // }
    // else
    // {
    //   System.out.println("nope");
    // }
    String name="MA";
    int s=0;
    int l=name.length()-1;
    boolean make=true;
    while(s<=l)
    {
      if(name.charAt(s)==name.charAt(l))
      {
        s++;
        l--;
      }
      else{
        make=false;
        break;
      }
    }
    if(make)
    {
      System.out.println("Polindrome");
    }
    else{
      System.out.println("nope");
    }
    

  }
}
