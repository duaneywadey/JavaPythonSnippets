package listspractice;
import java.util.ArrayList;
import java.util.Collections; 
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
public class listprac {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> t = new ArrayList <Integer>();
		t.add(377);
		t.add(236);
		t.add(457);
		t.add(13);
		t.add(346);
		t.get(4);
		t.set(4, 69);
		boolean xy = t.contains(4);
		int bl = t.size();
		System.out.println(t);
		System.out.println(xy);
		System.out.println("Size: " + bl );
		if (xy == true) {
		System.out.println("Well done");
		}
		else {
			System.out.println("Error");
		}
		System.out.println(t.subList(0, 4));
		Map k = new TreeMap(); 
		k.put("Auden",19);
		k.put("Yssa",20);
		k.put("Kris",29);
		k.put("Baldwin", 40);
		System.out.println(k.get("Auden"));
		System.out.println(k.values());
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Beach");
		arr.add("Apple");
		arr.add("Green");
		arr.add("Pancake");
		arr.add("Hotdogs");
		arr.add("Equator");
		Collections.sort(arr);
		for(String i :arr) {
			System.out.println(i);
		
		}
		System.out.println();
		
		HashMap<String, String> prachash = new HashMap <String,String>();
		prachash.put("Auden", "Bass");
		prachash.put("Nate", "weights");
		prachash.put("Cole", "Basketball");
		prachash.put("Kyle", "Skating");
		prachash.get("Cole");
		for (String lp:prachash.keySet()) {
			System.out.println(lp + " " + prachash.get(lp));
			
		}
		do {
		System.out.println("Welcome to my website!!!");
		System.out.println("Members: ");
		ArrayList<String> web = new ArrayList<String>();
		web.add("Austin");
		web.add("Rivers");
		web.add("Kale");
		web.add("Kris");
		for (String user:web) {
			System.out.println("\t" + user);
		}
		do {
		System.out.println("Do you wanna add?(y/n): ");
		String ask = scan.next();
		if (ask.equalsIgnoreCase("y")) {
			System.out.println("Enter your name: ");
			String nm = scan.next();
			web.add(nm);
			System.out.println("Current members: ");
			for (String user:web) {
				System.out.println("\t" + user);
			}
			System.out.print("Do you want to continue");
			String tuloy = scan.next();
			if (tuloy.equalsIgnoreCase("y")) {
				;
			}
			else {
				break;
			}
		}
		else {
			System.out.println("Thanks!");
			break;
		}
		
		
		} while (scan.next().equalsIgnoreCase("y"));
	
		
	} while (scan.next().equalsIgnoreCase("y"));
}
}
