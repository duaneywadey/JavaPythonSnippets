package ooppractice;
import java.util.Scanner;

public class Perimeter {
	static int width;
	static int height;

	
	static int getArea(int width, int height) {
		int area = width * height;
		return area;
	}
	static int getPerimeter(int width, int height) {
		int perimeter = (width*height) * 2;
		return perimeter;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the width: ");
		int wd = scan.nextInt();
		System.out.println("Enter the height: ");
		int ht = scan.nextInt();
		System.out.println("AREA: "  + getArea(wd,ht));
		System.out.println("PERIMETER: "  + getPerimeter(wd,ht));
		
		int input = 0;
	    int entered=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a series of values (0 to quit): ");
		while ((input = in.nextInt()) != 0) {
			entered+=1;
			if (entered%2==0) {
				System.out.println("More!");
			}
			else if (entered%3==0) {
				System.out.println("MOOORE!");
			}
	        }
		
		System.out.println("Numbers entered: " + entered);
		}
		
	
	
	}



