package com.sourcefile;

public class Admin  extends Emp implements ITraveller{

	public Admin(int eid, double salary) {
		super(eid, salary);

		// TODO Auto-generated constructor stub
	}

	@Override
	public void calculateTA() {
		double TA=0;
		// TODO Auto-generated method stub
		System.out.println("Not allowed to travel");
		System.out.println("Salary of Admin:"+(salary+TA));
	}

}
