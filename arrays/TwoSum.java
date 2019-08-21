package arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static void main(String[] args) {
		
		int[] nums = {1, 4, 6, 11};
		int target = 12;
		
		
		int[] twoIndexs = twoSum(nums, target);
		
		for(int i = 0; i < 2; i++) {
			System.out.print(twoIndexs[i]);
		}
		
	}
	
	public static int[] twoSum(int[] nums, int target) {

	    /* array to return result */
	    int[] arr = new int[2];

	    /* map for num and index pair */
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	    /* iterate through the array */
	    for (int i = 0; i < nums.length; i++) {
	        /* check if the map has an element
	        * which is equal to the difference
	        * between the target and current element
	        */
	    	
	    	int curItem = nums[i];
	    	
	        Integer val = map.get(target - curItem);

	        if (val == null) {

	            /* no match found, add the current item and index to map*/
	            map.put(nums[i], i);
	        } else {

	            /* match found, update the index values */
	            arr[0] = val;
	            arr[1] = i;
	            break;
	        }
	    }
	    
	    return arr;
	}
	
}
