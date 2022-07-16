import java.util.*;
class Team
{
private int noofplayers;
private Player []arr;
public Team()
{
noofplayers=2;
arr=new Player[noofplayers];
}
public Team(int noofplayers)
{
this.noofplayers=noofplayers;
arr=new Player[noofplayers];
}
public void createTeam()

{
int id;
String name;
Player p;
Scanner sc=new Scanner(System.in);
for(int i=0;i<noofplayers;i++)
{
System.out.println("Enter Player id");
id=sc.nextInt();
System.out.println("Enter Player name");
name=sc.next();
p=new Player(id,name);
arr[i]=p;
}
}
public void showTeam()
{
for(int i=0;i<noofplayers;i++)
{
arr[i].showPlayer();
}
}
}