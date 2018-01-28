import java.util.Scanner;

/**
 * Created by raiona on 2018/1/20.
 */
public class Eleven {
    public static int NumberOf1(int n) {
        int count=0;
        while(n!=0){
            ++count;
            n=(n-1)&n;//最右边的1变成0 变化多少次就有多少个
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int n=9;
        int h=NumberOf1(n);
        System.out.println(h);
    }
}
