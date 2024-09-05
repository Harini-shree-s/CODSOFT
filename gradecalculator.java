import java.util.Scanner;
public class gradecalculator
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("_____GRADE CALCULATOR_____");
		System.out.print("Enter the no of sub:");
		int nS=sc.nextInt();
		int total=0;
		for(int i=1; i<=nS; i++)
		{
			System.out.print("enter the marks obtained in "+i+":");
			int marks=sc.nextInt();
			total+=marks;
		}
		double average=(double)total/nS;
		char grade;
		if(average>=90)
		{
			grade='O';
		}
		else if(average>=80)
		{
			grade='A';
		}
		else if(average>=70)
		{
			grade='B';
		}
		else if(average>=60)
		{
			grade='C';
		}
		else
		{
			grade='U';
		}
		System.out.println("THE TOTAL MARK SCORED="+total);
		System.out.println("THE AVERAGE PERCENTAGE ="+average);
		System.out.println("THE GRADE OBTAINED ="+grade);
	}
}