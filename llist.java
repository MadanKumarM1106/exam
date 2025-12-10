 
class llist{
  private node head;
  private node tail;
  private int size;
  public llist()
  {
    this.size=0;
  }
   private class node{
    private int val;
    private node next;
    public node(int val)
    {
      this.val=val;
    }
    public node(int val, node next)
    {
      this.val=val;
      this.next=next;
    }
  }
    public void insertfirst(int val)
    {
      node newnode=new node(val);
      newnode.next=head;
      head=newnode;
      if(tail==null)
      {
        tail=head;
      }
       
      size+=1;
    }
    public void insertrec(int val,int index)
    {
      head=insertrec(val, index, head);

    }
    private node insertrec(int val,int index,node n)
    {
      if(index==0)
      {
        node temp=new node(val,n);
        size++;
        return temp;
      }
      n.next=insertrec(val, index-1, n.next);
      return n;
    }
    public int  deletefirst()
    {
      int v=head.val;
      head=head.next;
      if(head==null)
      {
        tail=null;
      }
      size--; 
      return v;

    }
    public void insertlast(int val)
    {
      if(tail==null)
      {
        insertfirst(val);
        return;
      }
      node newnode=new node(val);
      tail.next=newnode;
      tail=newnode;
      size++;

    }
    public void insertbetween(int val,int index)
    {
       
      node temp=head;
       
      if(index==0)
      {
        insertfirst(val);
        return;
      }
      if(index==size)
      {
        insertlast(val);
        return;
      }
      for(int i=1;i<index;i++)
      {
        temp=temp.next;
      }
      node newnode=new node(val, temp.next);
      temp.next=newnode;
      size++;

    }
    public void display()
    {
      node temp=head;
      while(temp!=null)
      {
        System.out.print(temp.val+" -> ");
        temp=temp.next;
      }
      System.out.println("End");
    }
    public node find(int value) {
    node temp = head;
    while (temp != null) {
        if (temp.val == value) {
            return temp;  
        }
        temp = temp.next;
    }
    return null;  
    }
    public int  deletelast()
    {
      if(size<=1)
         return deletefirst();
       int vali=tail.val;
       node temp=head;
       while(temp.next!=tail)
       {
          temp=temp.next;
       }
       temp.next=null;
       size--;
       return vali;
       
    }
    public int  delete1(int index)
    {
      if(index==0) return deletefirst();
      if(index==size) return deletelast();
      node n=get(index-1);
      int vall=n.next.val;
      n.next =n.next.next;

      return vall;

    }
    public node get(int index)
    {
      node n=head;
      for(int i=0;i<index;i++)
      {
        n=n.next;
      }
      return n;
    }

    public int getsize()
    {
      return size;
    }
  public static void main(String[] args) {
     llist add=new llist();
     add.insertfirst(52);
     add.insertfirst(56);
     add.insertfirst(520);
     add.insertfirst(55);
     add.insertlast(22);
    //  node target=add.find(569);
     
     add.insertbetween(66,2);

     System.out.println(add.getsize());
     
     add.display();
     System.out.println(add.deletefirst());
     add.display();
     System.out.println(add.deletelast());
     add.display();
     System.out.println(add.delete1(2));
     add.display();
     add.insertrec(1, 2);
     add.display();
  }
}