import java.util.ArrayList;
import java.util.Arrays;

public class alternateorder {
  public static void main(String[] args) {
    int[] arr={-1,-2,-6,-3,20,26,25,-52};
    Alterit(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static  void Alterit(int[] arr)
  {
    int n=arr.length;
    ArrayList<Integer> pos=new ArrayList<>();
    ArrayList<Integer> neg=new ArrayList<>();
     
    for(int i=0;i<n;i++)
    {
       if(arr[i]>0)
       {
          pos.add(arr[i]);
       }
       else
       {
          neg.add(arr[i]);
       }
    }
    if(pos.size()>neg.size())
    {
       for(int  i=0;i<neg.size();i++)
       {
          arr[2*i]=pos.get(i);
          arr[2*i+1]=neg.get(i);

       }
       int index=neg.size()*2;
       for(int i=neg.size();i<pos.size();i++)
       {
          arr[index]=pos.get(i);
          index++;
       }
    }
    else{
       for(int  i=0;i<pos.size();i++)
       {
          arr[2*i]=pos.get(i);
          arr[2*i+1]=neg.get(i);

       }
       int index=pos.size()*2;
       for(int i=pos.size();i<neg.size();i++)
       {
          arr[index]=neg.get(i);
          index++;
       }
    } 
  }
}