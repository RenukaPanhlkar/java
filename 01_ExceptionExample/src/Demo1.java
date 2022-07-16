
public class Demo1 {
public static void main(String []args)
{
	try
	{
		int no1;
		int no2;
		float res;
		System.out.println("The elements are: ");
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i] );
		}
		no1= Integer.parseInt(args[0]);
		no2=Integer.parseInt(args[1]);
		res=(float)no1/no2;
		System.out.println("Result:" +res);
	}	
	
		catch(ArithmeticException ex)

		{

		System.out.println("Error in division !");

		}

		catch(ArrayIndexOutOfBoundsException e)

		{

		System.out.println("Array out of bound!/Insufficient arguments");

		}

	
/*	if(args.length!=2)
	{
		System.out.println("Insufficient arguments");
		return;
	}*/
}
}
