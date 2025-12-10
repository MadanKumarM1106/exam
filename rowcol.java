import java.util.Arrays;

public class rowcol {
  
  public static void main(String[] args) {
    int[][] arr={
      {1,23,56},
      {15,56,89},
      {17,59,95}

    };
    System.out.println(Arrays.toString(search(arr,100)));
    
  }
  static int[] search(int[][] matrix,int target)
  {
    int r=0;
    int c=matrix.length-1;
    while(r<matrix.length && c>=0)
    {
      if(matrix[r][c]==target)
       {
        return new int[]{r,c};
       }
       if(matrix[r][c]<target)
       {
        r++;
       }
       else
       {
        c--;
       }
    }
    return new int[]{-1,-1};
  }
}
