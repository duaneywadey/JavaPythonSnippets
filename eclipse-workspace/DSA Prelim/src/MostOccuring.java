
public class MostOccuring {
	
	static int mostFrequent(int arr[], int n)
    {
          
 
        int max_count = 1, res = arr[0];
        int curr_count = 1;
          
        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else 
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }
      
        // If last element is most frequent
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = arr[n - 1];
        }
      
        return res;
    }

	public static void main(String[] args) {
		int arr[] = {1,5,7,1,3,5,7,7,7,7,8,8,8,8,6,2,1};
        int n = arr.length;
          
        System.out.println(mostFrequent(arr,n));
		
	}

}
