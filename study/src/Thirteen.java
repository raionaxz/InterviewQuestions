/**
 * Created by raiona on 2018/1/21.
 */
public class Thirteen {
    public void reOrderArray(int [] array) {
       /* if(array==null||array.length==0){
            return;
        }
        int start=0;
        int end=array.length-1;
        while(start<end){
            while(start<end&&(array[start]%2!=0)){
                start++;
            }
            while (start<end&&(array[end])%2==0){
                end--;
            }
            if(start<end){
                int t=array[start];
                array[start]=array[end];
                array[end]=t;
            }
        }*///不考虑要奇奇偶偶之间的相对顺序
        //考虑相对顺序
        if(array==null||array.length==0)
            return;
        for(int i=0;i<array.length;i++){
            int t;
            if(array[i]%2==0){//第一个偶数
                for(int j=i;j<array.length;j++){
                    if(array[j]%2==1){
                        t=array[j];//偶数后第一个奇数
                        while(i<j){
                            array[j]=array[j-1];//偶数后都移动一位
                            j--;
                        }
                        array[i++]=t;//奇数放在第一个偶数处此时i j相等
                    }
                }
                break;
            }
        }
    }
}
