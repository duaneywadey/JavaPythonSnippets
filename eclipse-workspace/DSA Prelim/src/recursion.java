
public class recursion {
	
	public static int factorialTry(int n) {
        if (n!=0)
            return n *(factorialTry(n-1));
        else
            return 1;
    }
	public static void main(String[] args) {
		System.out.println(factorialTry(12));
	
	}

}
