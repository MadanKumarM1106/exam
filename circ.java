public class circ {
  private  node head;
  private node tail;
  public circ(){
    this.head=null;
    this.tail=null;
  }
  private  class node{
    int val;
    node next;
    public node(int val){
      this.val=val;

    }
    public node(int val,node next)
    {
      this.val=val;
      this.next=next;
    }
  }
  public void insert(int x)
  {
    node newnode=new node(x);
    if(head==null)
    {
       head=newnode;
       tail=newnode;
       newnode.next=head;      
    }
    tail.next=newnode;
    tail=newnode;
     newnode.next=head;
  }
  public void delete(int val)
  {
    node temp=head;
    if(head==null)
    {
      return;
    }
    if(temp.val==val)
    {
       head=head.next;
       tail.next=head;
       return;  
    }
    do { 
        
      if(temp.next.val==val)
      {
        temp.next=temp.next.next;
        if(tail.val==val)
        {
          tail=temp;
        }
        return;
      }
      temp=temp.next;
    } while (temp!=head);
  }
  public void display()
  {
    if(head==null)
    {
      return;
    }
    node temp=head;
    do
    {
      System.out.print(temp.val+"->");
      temp=temp.next;
    }while(temp!=head);
    System.out.print("head");



  }
  public static void main(String[] args) {
    circ k=new circ();
    k.insert(45);
    k.insert(22);
      k.insert(220);
        k.insert(202);
          k.insert(2);
    k.delete(220);
    k.display();
    
  }
}
