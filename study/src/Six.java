/**
 * Created by raiona on 2018/1/18.
 */
public class Six {
    public int minNumberInRotateArray(int [] array) {
        if(array==null||array.length<=0){
           return 0;
        }
        int low=0;
        int hi=array.length-1;
        int mid=low;
       //未排序的话 需要进行指针移动
        while(array[low]>=array[hi]){
            if(hi-low==1){
                mid=hi;
                break;
            }
            mid=(low+hi)/2;
            //若hi low mid相等
            if(array[low]==array[hi]&&array[mid]==array[low]){
                return minIn(array);
            }
            if(array[mid]>=array[low]){
                low=mid;
            }
            if(array[mid]<=array[hi]){
                hi=mid;
            }
        }
        return array[mid];
    }
    private int minIn(int array[]){
        int re=array[0];
        for(int i=1;i<=array.length;i++){
            if(re>array[i]){
                re=array[i];
            }
        }
        return re;
    }
}
