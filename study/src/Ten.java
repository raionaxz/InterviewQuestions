/**
 * Created by raiona on 2018/1/19.
 */
public class Ten {
    public int RectCover(int target) {
        if(target<= 1){
            return 1;
        }
        if(target*2 == 2){
            return 1;
        }else if(target*2 == 4){
            return 2;
        }else{
            return RectCover((target-1))+RectCover(target-2);
        }
    }
}
