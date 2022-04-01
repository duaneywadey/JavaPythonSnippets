package oopprojects;

public class swapPractice {

	public static void main (String[] args){
		int[] oldArray = {5,6,7,8};
		int [] newArray = shiftArrayRight(oldArray);
		printArr(newArray);
}

	public static int[] shiftArrayRight(int[]array1){
		int[] array2 = new int[array1.length];
		for(int i=0; i<array1.length-1; i++){
			array2[i+1] = array1[i];
		}

		array2[0] = array1[array1.length-1];
		return array2;


	}

	public static void printArr(int[]arr){
		for(int x : arr){
			System.out.print(x+ ", ");
		}

	}

}