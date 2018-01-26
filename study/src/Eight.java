/**
 * Created by raiona on 2018/1/19.
 */
public class Eight {
    public int JumpFloor(int target) {
        if(target<=0){
            return 0;
        }
        int f1=1;
        int f2=2;
        int f=0;
        if(target<=2){
            return target==1?f1:f2;
        }
        while(target>2){
            f=f1+f2;
            f1=f2;
            f2=f;
            target--;
        }
        return f;
    }
}
