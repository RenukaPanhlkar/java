class Line
{
private  int Startpoint,Endpoint;
public Line()
{
Startpoint=Endpoint=10;
}
public Line(int Startpoint,int EndPoint)
{
this.Startpoint=Startpoint;
this.Endpoint=Endpoint;
}
public void showpoint()
{
System.out.println("The  Startpoint and Endpoint coordinates are" +"["+Startpoint+","+Endpoint +"]");
}
}

