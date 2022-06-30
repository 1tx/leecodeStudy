import java.util.HashMap;
//解决双数之
public class test {
   public static int[] nums = {1,2,3,4,5,6,7,8,9,10};
    public static int[] ToSum(int[] nums, int target) {
        //暴力枚举
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j< nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {0,0};
    }
    public static int[] Tosum2(int[] nums, int target) {
        //通过hashmap来解决
        HashMap<Integer, Integer> HashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (HashMap.containsKey(target - nums[i])) {
                return new int[]{HashMap.get(target-nums[i]), i};
            }
            HashMap.put(nums[i], i);

        }
        return new int[]{0, 0};
    }
    public static void main(String[] args) {

       int[] res = ToSum(nums,1);
       int[] res2 = Tosum2(nums,10);
       for (int i =0;i<res.length;i++){
           System.out.print(res[i]+",");
       }
        System.out.println();
        for (int i =0;i<res2.length;i++){
            System.out.print(res2[i]+",");
        }
    }
}
