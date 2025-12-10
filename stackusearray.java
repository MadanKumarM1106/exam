public class stackusearray {
  public static void main(String[] args) {
    int[] stac=new int[10];
    int top=-1;
    stac[++top]=2;
    stac[++top]=5;
    top--;
    System.out.println(stac[top]);


  }
}
