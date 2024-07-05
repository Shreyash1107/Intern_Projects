package org.calci;
import java.util.*;
import static java.lang.System.*;
class Operation
{
	int a,b;  //instance variable
	public void setvalues(int a, int b)
	{
		this.a = a;  //20
		this.b = b;	//30
	}
	public int getAdd()
	{
		return a+b;
	}
	public int getdiff()
	{
		return a - b;
	}
	public int getmul()
	{
		return a*b;
	}
	public double getdiv()  //a = 27,  b = 12
	{
		return (double)a/b;
	}
}
public class CalculatorApp
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int x,y,choice,sum,diff,prod;
		double div;
		out.println("Enter the First Number:");
		x = sc.nextInt();  //20
		out.println(" ");
		out.println("Enter the Second Number:");
		y = sc.nextInt();//30
		out.println(" ");
		Operation op = new Operation();
		op.setvalues(x,y); //20 30
		do
		{
			out.println("1.Addition");
			out.println("2.Subtraction");
			out.println("3.Multiplication");
			out.println("4.Division");
			out.println(" ");
			out.println("Enter the Choice:");  //2
			choice = sc.nextInt();
			out.println(" ");
			switch(choice)  //1
			{
			case 1:
				sum = op.getAdd();
				out.println("Addition is " + sum);
				out.println(" ");
				break;
			case 2: 
				diff = op.getdiff();
				out.println("Difference is " + op.getdiff());
				out.println(" ");
				break;
			case 3:
				prod = op.getmul();
				out.println("Product is " + prod);
				out.println(" ");
				break;
			case 4:
				div = op.getdiv();
				out.println("Division is " + div);
				out.println(" ");
				break;
				default:
					out.println("THANK YOU");
					break;
			}
		}while(choice!=5);
}
}