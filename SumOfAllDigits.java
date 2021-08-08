package week1.day1;

public class SumOfAllDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int number=123 ,sum=0 , quotient=99999,remainder=0; 
		/*
		 * while (quotient !=0 ) { quotient=number/10; remainder=number%10;
		 * number=quotient; sum=sum+remainder; System.out.println("the ans is"+ sum); }
		 */

		int sum=123, total = 0, remainder;

		while(sum>0)
		{
			remainder = sum%10;
			System.out.println("The remainder is " +remainder);
			total = remainder+total;
			System.out.println("The total is " +total);
			sum=sum/10;
			System.out.println("The quotient is " +sum);
		}
		System.out.println("The Sum is " +total);


	}

}
