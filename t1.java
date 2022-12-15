/**
 * lecood第一题
 */
public class t1 {
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int target=9;
        System.out.println(twoSum1(nums,target));
    }

    /**
     * 执行用时：
     * 29 ms
     * , 在所有 Java 提交中击败了
     * 48.03%
     * 的用户
     * 内存消耗：
     * 41.4 MB
     * , 在所有 Java 提交中击败了
     * 81.41%
     * 的用户
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int ans[] = new int[0];
        for(int i=0;i<nums.length-1;i++){

                int re=target-nums[i];//re的另一个对象
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==re){
                         ans= new int[]{i, j};//最终返回值
                        break;
                    }else {
                        continue;
                    }
                }
            }

        return ans;

    }
    public static int[] twoSum1(int[] nums, int target){
        int ans[] = new int[0];
        for(int i=0;i<nums.length-1;i++){
            if(target>0){
                if(nums[i]>target){
                    break;
                }
            }else {
                if (nums[i]<target){
                    break;
                }
            }

            int re=target-nums[i];//re的另一个对象
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==re){
                    ans= new int[]{i, j};//最终返回值
                    break;
                }else {
                    continue;
                }
            }
        }

        return ans;
    }
}
