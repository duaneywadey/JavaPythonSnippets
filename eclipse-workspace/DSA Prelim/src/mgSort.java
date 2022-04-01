
public class mgSort {
	
	public static  void merge(int[] nums1, int m, int[] nums2, int n) {
	 	m--; n--;
	 	int index = nums1.length-1;
	 	while (index >=0){
	 		if(m<0){
	 			nums1[index] = nums2[n--];
	 		}

	 		else if (n < 0){
	 			nums1[index] = nums1[m--];
	 		}

	 		else{
	 			if(nums1[m]> nums2[n]){
	 				nums1[index] = nums1[m--];
	 			}
	 			else{
	 				nums1[index] = nums2[n--];
	 			}
	 		}
	 		index--;
	 	}

        
    }


	public static void main(String[] args) {
		int arrTest[] = {1,2,5,7,9};
		int arr2[] = {2,3,4,2,1};
		merge(arrTest, 5, arr2, 5);


		


	}

}
