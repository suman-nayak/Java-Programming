 //Write a Java Program to find the largest of three numbers.
 class Large{
	public static void main (String args[]){
		int num1 = 1, num2 = 2, num3 = 3, largest;
		largest = ((num1 > num2)? ((num1 > num3)? num1 : num3) : ((num2 > num3)? num2 : num3));
		System.out.println("The largest number is:"+largest);
	}
}