import java.util.Arrays;

class Solution {
	
	public static void main(String[] args) {
		int[] nums= {1,1,1};
		System.out.println(removeDuplicates(nums));
				System.out.println(Arrays.toString(nums));
	}
    public static int removeDuplicates(int[] nums) {
        int count=0;
        int index=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==nums[i-1])
            {
                count++;
            }
            else
            {
                count=0;
            }
            if(count<=1)
            {
                nums[index]=nums[i];
                index++;
            }
        }
        return index;
    }
}