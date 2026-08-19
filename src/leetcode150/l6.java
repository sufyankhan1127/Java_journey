package leetcode150;

public class l6 {

}

class Solution {
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> list = new ArrayList<>();

        int candidate1 = 0;
        int candidate2 = 0;
        int count1 = 0;
        int count2 = 0;

        // Find candidates
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == candidate1) {
                count1++;
            }
            else if (nums[i] == candidate2) {
                count2++;
            }
            else if (count1 == 0) {
                candidate1 = nums[i];
                count1 = 1;
            }
            else if (count2 == 0) {
                candidate2 = nums[i];
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        // Verify candidates
        int actualCount1 = 0;
        int actualCount2 = 0;

        for (int num : nums) {
            if (num == candidate1) {
                actualCount1++;
            }

            if (num == candidate2) {
                actualCount2++;
            }
        }

        if (actualCount1 > nums.length / 3) {
            list.add(candidate1);
        }

        if (actualCount2 > nums.length / 3 && candidate2 != candidate1) {
            list.add(candidate2);
        }

        return list;
    }
}
