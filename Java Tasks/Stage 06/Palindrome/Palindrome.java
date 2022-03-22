
public class Palindrome {
	
	public static boolean findPalindrome(int number) {
		
	    int a = number / 1000;
	    int b = (number % 1000) / 100;
	    int c = (number % 100)/ 10;
	    int d = number % 10;
	    
	    return a == d || b == c;
		
	}
	
}
