import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois = null;
		try
		{
			ois = new ObjectInputStream(new FileInputStream("D:/testfiles/mydata1.txt"));
			Emp [] empty = new Emp[3];
			for(int i=0;i<empty.length;i++)
			{
				empty[i] = (Emp)ois.readObject();
				System.out.println(empty[i]);
			}
			
			/*for(Emp e : empty)
				System.out.println(e);*/
			ois.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

	}


