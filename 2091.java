class Solution {
    public int minimumDeletions(int[] nums) {
        int max = 0 , min = 0;
        
        int l = nums.length;
             
        for (int i = 0; i < l; i++) {
            if (nums[i] < nums[min]) min = i;
            if (nums[i] > nums[max]) max = i;
        }

        int maxl = Math.max(min, max);
        int minl = Math.min(min, max);
        
        // from front 
        int f = minl + 1;
        
        // from back 
        int b = l - maxl; 

        int both = (minl + 1) + (l - maxl);

        return Math.min(f, Math.min(b, both));
    }
}

