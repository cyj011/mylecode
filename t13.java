import java.util.HashMap;
import java.util.Map;

/**
 * lecood第九题
 */
public class t13 {
    public static void main(String[] args) {
        String s="MCMXCIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int re=100000000;//缓冲区，当前数小于后数减两倍缓冲区
        int re1=0;//存储当前数
        int sum=0;//存储结果
        Map<String,Integer> map=new HashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("L",50);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        for (int i=0;i<=s.length()-1;i++){
            re1= map.get(s.charAt(i)+"");
            sum+=re1;
            if(re<re1){
                sum-=(2*re);
            }else{
                re=re1;
            }
        }


        return sum;

    }
}
