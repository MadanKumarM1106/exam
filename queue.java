//implementation of que using the 2 stacks

import java.util.Stack;

public class queue {
  static Stack<Integer> s1=new Stack<>();
  static Stack<Integer> s2=new Stack<>();
  public static void main(String[] args) {
    
    
    push(25 );
    push(26);
    push(89);
     
    System.out.println(s1);
     pop();
     push(56);
     System.out.println(s1);


  }
  static void push(int x )
  {
    while(!s1.isEmpty())
    {
        s2.push(s1.pop());

    }
    s1.push(x);
    while (!s2.isEmpty()) {
      s1.push(s2.pop());
      
    }
   

  }
   static void pop()
  {
    if(s1.isEmpty())
    {
      return;
    }
    s1.pop();


  }
}
