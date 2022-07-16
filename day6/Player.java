//Containtment Example
import java.util.*;
class Player
{
private int id;
private String name;
public Player()
{
id=0;
name="NA";
}
public Player(int id,String name)
{
this.id=id;
this.name=name;
}
public void showPlayer()
{
System.out.println( " " +id+ " "+name);
}
public void setName(String name)
{
this.name=name;
}
public void setId(int id)
{
this.id=id;
}
}
