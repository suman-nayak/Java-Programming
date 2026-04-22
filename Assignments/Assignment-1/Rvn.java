//Write a Java Program to reverse a given number.
class Rvn{
	public static void main (String args[]){
		int num = 144, rev = 0, rem;
		while(num != 0)
		{
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("The reverse number is:"+rev);
	}
}