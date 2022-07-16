package com.app;
import com.module.*;

public class Demoemp {
	public static void main(String []args)
	{
		/*Emp e0=new Emp(11,"Meeta",29,4000);
		 SalesManager e1=new SalesManager(1,"Neeta",23,5000,60);
		 Programmer e2=new Programmer(2,"geeta",34,1000,20,100);
		 Admin e3=new Admin(3,"Meeta",27,2000,1000);	
				
	e0.display();
	e1.display();
	e2.display();
	e3.display();
	*/
		Emp e[]=new Emp[3];
		//e[0]=new Emp(11,"Meeta",29,4000);
		e[0]=new SalesManager(1,"Neeta",23,5000,60);
		e[1]=new Programmer(2,"geeta",34,1000,20,100);
		e[2]=new Admin(3,"Meeta",27,2000,1000);
		for(int i=0;i<3;i++)
		{
			e[i].display();
			e[i].CalculateSal();
			//e[i].display();
		}

}
}
