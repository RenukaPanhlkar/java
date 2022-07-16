class Person
{
private String name;
private Date birthdate;

public Person()
{
name="NULL";
birthdate=new Date();
}

public Person(String name,Date birthdate)
{
this.name=name;
this.birthdate=birthdate;
}

public Person(String name,int dd,int mm,int yy)
{
this.name=name;
this.birthdate=new Date(dd,mm,yy);
}

public void showPerson()
{
System.out.println("Name:"+name);
birthdate.showDate();
}

}
