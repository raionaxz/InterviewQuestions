import java.util.Scanner;

/**
 * Created by raiona on 2018/1/14.
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Seek {
    public static boolean Find(int target, int[][] array) {
        int row=array.length;//行
       int col=array[0].length;//列
        if(row+col==0){
            return false;
        }
      else{//右上角
            int i = 0;
            int j = col - 1;
            while (i <= row-1 && j >= 0) {
                if (target == array[i][j]) {
                    return true;
                } else if (target < array[i][j]) {
                    j--;
                } else
                    i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int a[][]={ {1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        Scanner cin=new Scanner(System.in);
        int t=cin.nextInt();
        boolean h=Find(t,a);
        System.out.print(h);
    }
}
