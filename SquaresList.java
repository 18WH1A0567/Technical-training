package day.two;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SquaresList {

	public static void main(String[] args) {
		
		int n, i = 0, count = 0;
		System.out.println("Enter elements: ");
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		
		String []numbers = s.split(" ");
		n = numbers.length;
		
		List<Integer> list = new ArrayList<Integer>();
		while(i < n) {
			int x = Integer.parseInt(numbers[i]);
			list.add(x * x);
			i++;
		}
		
		Collections.sort(list);
		for(Integer in : list) {
			System.out.print(in + " ");
		}
		

	}

}
