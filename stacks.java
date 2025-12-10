import java.util.Stack;

class stacks{
  public static void main(String[] args) {
    Stack<Integer> k=new Stack<>();
    k.push(25);
    k.push(26);
    k.push(28);
    System.out.println(k.pop());
    for(int j:k)
    {
      System.out.println(j);
    }
    System.out.println(k.peek());
    
  }
}