
public class BinarySearch {
	
	/* Binary Search Implementation */

	/* Algorithm Steps
	 * -------------------
	 * 1. Set high, low, and middle index variables
	 * 2. Test middle value
	 * 3. If middle value is correct then return it
	 * 4. If middle value is < value, then move low index up to middle index + 1
	 * 5. If middle value is > value, then move high index down to middle index - 1
	 * 6. Repeat until high == low, or an index is found
	 * 7. Return index
	 */
	
	public int search(int[] arr, int val)
	{
		int ind = -1; 	
		int high = arr.length - 1;
		int low = 0; 
		int mid = arr.length / 2; 
		
		while(high >= low && ind == -1)
		{
			if(arr[mid] == val)
			{
				ind = mid; 
			} 
			else if(arr[mid] > val)
			{
				high = mid - 1; 
				mid = (high + low)/2;
			} 
			else 
			{
				low = mid + 1;
				mid = (high + low)/2; 
		    }
		}
		
		return ind; 
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,4,8,12,24,42};
		BinarySearch obj = new BinarySearch(); 
		System.out.println(obj.search(arr, 42));
	}
}
