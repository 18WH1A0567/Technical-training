package day.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class EvenOddSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		
		System.out.println("Enter the string: ");
		String st = scan.nextLine();
		int l = st.length();
		
		for(int i = 0;i < l; i++) {
			if (Character.isDigit(st.charAt(i))) {
				set.add(Character.getNumericValue(st.charAt(i)));
			}
		}
		List<Integer> list = new ArrayList<Integer>(set);
		Collections.sort(list, Collections.reverseOrder());
		
		for(Integer i : list) {
			System.out.print(i);
		}
		System.out.println();
		

	}
}
