/*Write a Java Program to find the sum of the following series — */
class Ser{
	public static void main (String args[]){
		int num = 8;
		double sum = 0.0;
		for(int i = 1; i <= num; i++)
		{
			sum += 1.0 / i;
		}
		System.out.println("The sum is:"+sum);
	}
}