/**
 * lecood第九题
 */
public class t9 {
    public static void main(String[] args) {
        int x=1212121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s=""+x;
        int right=s.length()-1;
        int left=0;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;

            }
            left++;
            right--;
        }
        return true;

    }
}
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        else {
            String s=x +"";
            int a= 0;
            int b=s.length() -1;
            while(a<b)
                if(s.charAt(a++) !=s.charAt(b--))
                    return false;
        }
        return true;
    }
}
