
public class MergeSort {
	
	/* Merge Sort Implementation */
	
	  void merge(int arr[], int l, int m, int r)
	    {
	        int n1 = m - l + 1;
	        int n2 = r - m;
	        int L[] = new int [n1];
	        int R[] = new int [n2];

	        for (int i=0; i<n1; ++i)
	            L[i] = arr[l + i];
	        for (int j=0; j<n2; ++j)
	            R[j] = arr[m + 1+ j];

	        int i = 0, j = 0;
	        int k = l;
	        while (i < n1 && j < n2)
	        {
	            if (L[i] <= R[j])
	            {
	                arr[k] = L[i];
	                i++;
	            }
	            else
	            {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }

	        while (i < n1)
	        {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }

	        while (j < n2)
	        {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }

	    
	  void sort(int arr[], int l, int r)
	  {
	        if (l < r)
	        {
	            // Find the middle point
	            int m = (l+r)/2;

	            // Sort first and second halves
	            sort(arr, l, m);
	            sort(arr , m+1, r);

	            // Merge the sorted halves
	            merge(arr, l, m, r);
	        }
	    }
	 
		
		public static void main(String[] args ){
			
			int[] l1 = {5,5,5,53,2,3,4234,3,44,4,4,5,8,9};
			MergeSort obj = new MergeSort(); 
			obj.sort(l1, 0, l1.length - 1);
			for(int i:l1)
			{
				System.out.println(i);
			}
			
		}

}
