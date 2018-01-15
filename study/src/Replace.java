import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by raiona on 2018/1/14.
 */
public class Replace {
    public static String replaceSpace(StringBuffer str) {
        //return str.toString().replaceAll(" ","%20");
        String s=str.toString();
        char []c=s.toCharArray();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<c.length;i++){
           if(c[i]==' '){
               sb.append("%20");
           }
           else {
               sb.append(c[i]);
           }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("we have happy");
        //Scanner cin= new Scanner(System.in);
        //str.append(cin.next());
        System.out.println(replaceSpace(str));
    }
}
