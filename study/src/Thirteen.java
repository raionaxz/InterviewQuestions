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
        }*///������Ҫ����żż֮������˳��
        //�������˳��
        if(array==null||array.length==0)
            return;
        for(int i=0;i<array.length;i++){
            int t;
            if(array[i]%2==0){//��һ��ż��
                for(int j=i;j<array.length;j++){
                    if(array[j]%2==1){
                        t=array[j];//ż�����һ������
                        while(i<j){
                            array[j]=array[j-1];//ż�����ƶ�һλ
                            j--;
                        }
                        array[i++]=t;//�������ڵ�һ��ż������ʱi j���
                    }
                }
                break;
            }
        }
    }
}
