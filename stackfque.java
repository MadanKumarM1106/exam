import java.util.LinkedList;
import java.util.Queue;
public class stackfque {
   static Queue<Integer> q1=new LinkedList<>();
   static Queue<Integer> q2=new LinkedList<>();
   static void push(int x)
   {
     q2.add(x);
     while (!q1.isEmpty()) {
       q2.add(q1.peek());
       q1.remove();
      
     }
     Queue<Integer> t=q1;
     q1=q2;
     q2=t;
   }
   static void pop()
   {
     if(q1.isEmpty())
        return;
     q1.remove();
   }
    
  public static void main(String[] args) {
   push(56);
   push(52);
   push(50);
   push(45);
   System.out.println(q1);
   pop();
   System.out.println(q1);

  }
}
