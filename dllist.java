class dllist{
   node head;
  public void insertfirst(int x)
  {
    node newnode=new node(x);
    if(head==null)
    {
       head=newnode;
       return;
    }
    newnode.next=head;
    newnode.prev=null;
    head.prev=newnode;
    head=newnode;
  }
  public void insertlast(int x)
  {
    node newnode=new node(x);
    if(head==null)
    {
       
       head=newnode;
       head.prev=null;
       return;
    }
    node temp=head;
    while(temp.next!=null)
    {
      temp=temp.next;
    }
    temp.next=newnode;
    newnode.prev=temp;
    newnode.next=null;
  }
  public void insertaf(int insertafter,int val)
  {

      if(head==null)
      {
         System.out.println("The list is empty");
         return;
      }
      node p=find(insertafter);
      if(p==null)
      {
        System.out.println("The value is not exist");
        return;
      }
      node newnode=new node(val);
      newnode.next=p.next;
      p.next=newnode;
      newnode.prev=p;
      if(newnode.next!=null)
      {
         newnode.next.prev=newnode;
      }
  }
  public node find(int a)
  {
     node temp=head;
     while(temp!=null)
     {
       if(temp.val==a)
       {
        return temp;
       }
       temp=temp.next;
     }
     return null;
  }
   
  public void display()
  {
    node temp=head;
    if(temp==null)
    {
      return ;
    }
    System.out.print("NULL->");
    while(temp!=null)
    {
       System.out.print(temp.val+"->");
       temp=temp.next;
    }
    System.out.println("NULL");
     
  }
  
   
  private class node{
      int val;
     node next;
     node prev;
     public node(int val)
     {
      this.val=val;
     }
     public node(int val,node  next,node prev)
     {
      this.val=val;
      this.next=next;
      this.prev=prev;
     }



  }
  public static void main(String[] args) {
    dllist a=new dllist();
    a.insertfirst(45);
    a.insertfirst(405);
    a.insertfirst(452);
    a.insertlast(99);

    a.insertlast(85);
    a.insertaf(45, 23);
    a.display();
    
  }
}