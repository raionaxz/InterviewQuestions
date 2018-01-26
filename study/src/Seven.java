/**
 * Created by raiona on 2018/1/18.
 */
public class Seven {
    public int Fibonacci(int n) {
        int re[]={0,1};
        if(n<2) return re[n];
        long one=1;
        long two=0;
        long f=0;
        for(int i=2;i<=n;++i){
            f=one+two;
            two=one;
            one=f;
        }
        return (int) f;
    }
}
