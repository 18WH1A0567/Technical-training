package day.two;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i = 0, m = 0, count = 0;
		System.out.println("Enter elements: ");
		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		
		String []numbers = s.split(" ");
		n = numbers.length;
		
		i = 0;
		while(i < n) {			
			if(numbers[i].equals("1")) {
				count++;
				i++;				
			}
			else {
				m = count > m ? count : m;
				i++;
				count = 0;
			}
			
		}
		m = count > m ? count : m;
		System.out.println(m);
		

	}

}
