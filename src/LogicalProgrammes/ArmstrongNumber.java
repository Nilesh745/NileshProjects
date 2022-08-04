package LogicalProgrammes;

public class ArmstrongNumber {

	public static void main(String[] args) {
		//Armstrong Number is the number whose cube of each integer and then their sum is equal to that number.

		int A=153; //1^3+5^3+3^3=153
		int sum=0;
		for(int i=A;i>0;i=i/10) {
			int remainder = i%10;
			sum=sum+remainder*remainder*remainder;
		}
		System.out.println(sum);
		if (A==sum) {
		System.out.println("The number is Armstrong Number");	
		}else {
			System.out.println("The number is regular number");
		}
		
	}

}
