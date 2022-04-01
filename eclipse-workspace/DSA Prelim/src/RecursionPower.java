
public class RecursionPower {
	
	public static int power(int base, int powerRaised) {
        if (powerRaised != 0)
            return (base * power(base, powerRaised - 1));
        else
            return 1;
    }

	public static void main(String[] args) {
		 System.out.println(power(2,4));
	}

}
