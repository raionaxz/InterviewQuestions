/**
 * Created by raiona on 2018/1/26.
 */
public class Nine {
   public int JumpFloorII(int target) {
        if (target <= 0) {
            return 0;
        } else if (target == 1) {
            return 1;
        } else {
            return 2 * JumpFloorII(target - 1);
        }
   }
}
