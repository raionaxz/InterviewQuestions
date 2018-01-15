import java.util.Scanner;

/**
 * Created by raiona on 2018/1/14.
 * ��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 * �����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 */
public class Seek {
    public static boolean Find(int target, int[][] array) {
        int row=array.length;//��
       int col=array[0].length;//��
        if(row+col==0){
            return false;
        }
      else{//���Ͻ�
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
