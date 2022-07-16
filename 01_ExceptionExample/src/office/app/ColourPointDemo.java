package office.app;
import office.model.*;
import java.util.Scanner;

public class ColourPointDemo {

	public static void main(String[] args)
	{
int x,y;
String color;
Scanner sc=new Scanner(System.in);

		// TODO Auto-generated method stub
		try {
for(int i=0;i<2;i++) {
			System.out.println("Enter points x and y");
x=sc.nextInt();
y=sc.nextInt();
System.out.println("Enter Colorname");
color=sc.next();
			Point p1 = new ColourPoints(x ,y,color);
		p1.Display();
}

//		Point p2 = new ColourPoints(123 ,50,"somecolor");
	//	p2.Display();

	}
		catch(InvalidcolorException e)
		{
			System.out.println(e.getmessage());
		}

}
}

