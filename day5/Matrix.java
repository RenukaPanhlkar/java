public class Matrix
{
public static void main(String []arg)
{
int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
int i,j;
int []r={0,0,0};
int []c={0,0,0};

for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
r[i]=r[i]+arr[i][j];
}

}
System.out.println("the MAtrix is");
for(i=0;i<3;i++)
	
{
	System.out.println();

for(j=0;j<3;j++)
{
System.out.print( "   "  +arr[i][j]);
}
}
System.out.println();
System.out.println("Row wise sum:");
for(i=0;i<3;i++)
{
//System.out.println();
System.out.println(+r[i]);
}



System.out.println();
System.out.println("Column wise sum is:");
//System.out.println();
for(j=0;j<3;j++)
{
for(i=0;i<3;i++)
{
c[i]=c[i]+arr[j][i];
}

}

for(i=0;i<3;i++)
	


System.out.println(+c[i]);

}
}