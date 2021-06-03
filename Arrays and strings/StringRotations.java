package day.two;

import java.util.Scanner;

public class StringRotations {
	
	 static String leftrotate(String str, int d)
	    {
	            String ans = str.substring(d) + str.substring(0, d);
	            return ans;
	    }
	 
	    // function that rotates s towards right by d
	    static String rightrotate(String str, int d)
	    {
	            return leftrotate(str, str.length() - d);
	    }

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String s = scanner.nextLine();
		String []pairs = s.split(",");
		int len = pairs.length;
		
		int i = 0, sum = 0;
		
		for(i = 0;i < len; i++) {
			
			sum = 0;
			String []pair = pairs[i].split(":");
			int k = pair[1].length();
			
			for(int j = 0;j < k; j++) {
				sum += (int)(pair[1].charAt(j));
			}
			
			if(sum % 2 == 0) {
				System.out.println(rightrotate(pair[0], 1));
			}
			else {
				System.out.println(leftrotate(pair[0], 2));
			}
			
		}

	}

}
