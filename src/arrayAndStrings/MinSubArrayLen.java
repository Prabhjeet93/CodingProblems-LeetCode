package arrayAndStrings;

public class MinSubArrayLen {
	
	public int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int left = 0;
        int sum = 0;
        int rst = Integer.MAX_VALUE;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            System.out.println(" sum : "+sum);
            while (sum >= s) {
                rst = Math.min(rst, right - left + 1);
                sum -= nums[left++];
                System.out.println(" sum whilee : "+sum+" rst : "+rst);
            }
        }

        return rst == Integer.MAX_VALUE ? 0 : rst;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
