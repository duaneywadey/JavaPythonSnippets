package ooppractice;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class listsBasic {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> salita = new ArrayList<String>();
		for(int dg=0; dg<=20; dg++) {
			salita.add("Help " + dg);
			salita.add("Pls " + dg);
		}
		 for (String salit : salita) {
		        System.out.println(salit);
		    }
	System.out.println("Desperation scale: " + salita.size());
	ArrayList<Integer> listofnum = new ArrayList<Integer>();
	for(int cc=1; cc<=100; cc++) {
			if(cc%2==0) {
			listofnum.add(cc);
			}
			else {
				continue;
				
			}
			
			}
	int laman = listofnum.size();
	System.out.println(laman);
	int sum=0;
	
		for(Integer ab: listofnum) {
			System.out.println(ab);
		}
		
		for (Integer nm: listofnum) {
			sum+=nm;
			
		}
		System.out.println();
		System.out.println(sum);
	
		while(listofnum.contains(Integer.valueOf(10))) {
			listofnum.remove(Integer.valueOf(10));
		}
		System.out.println("Numbers after removal: ");
		for (Integer numero: listofnum) {
			System.out.println(numero);
		}
	}
	
	}


