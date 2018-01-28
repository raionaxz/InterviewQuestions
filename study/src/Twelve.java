/**
 * Created by raiona on 2018/1/20.
 */
public class Twelve {
    boolean flag=false;
    public double Power(double base, int exponent) {
        flag=false;
        if(equal(base,0.0)&&exponent<0){
            flag=true;
            return 0.0;
        }
        int ex=exponent;
        if(exponent<0){
            ex=-exponent;
        }
        double result=powwiththis(base,ex);
        if(exponent<0){
            result=1.0/result;
        }
        return result;
    }
    private double powwiththis(double base,int exponent){
        if(exponent==0){
            return 1;
        }if(exponent==1){
            return base;
        }else {
            double result=powwiththis(base,exponent>>1);
            result*=result;
            if(exponent%2==1){//&0x1
                result*=base;
            }
            return result;
        }
    }
    private boolean equal(double num1,double num2){
        if(num1-num2>-0.000001&&num1-num2<0.000001){
            return true;
        }
        else return false;
    }
}
