package day.two;

import java.util.Scanner;

public class EvenNumbersInArray {

	public static void main(String[] args) {
		
		int n, i = 0, count = 0;
		System.out.println("Enter elements: ");
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		
		String []numbers = s.split(" ");
		n = numbers.length;
		
		while(i < n) {
			if(numbers[i].length() % 2 == 0) {
				count++;
			}
			i++;
		}
		System.out.println(count);

	}

}
