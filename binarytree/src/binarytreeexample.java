import java.util.*;

public class binarytreeexample {
private Node root;
	
	public Node getRoot() {
		return root;
	}
	public binarytreeexample()
	{
		root=null;
		
	}
	public String toString()
	{
		return " " +root;
	}
	public void addNode(int data)
	{
		Node newnode=new Node(data);
		String ans;
		Scanner sc=new Scanner(System.in );
		if(root==null)
		{
			root=newnode;
			System.out.println("Root Created !!! ");
			return ;
		}
		else
		{
			Node move=root;
			while(true)
			{
				System.out.println(" Left or right of "+move.getData());
				ans=sc.next();
				if(ans.equals("left"))
				{
					if(move.getLeft()==null)
					{
						move.setLeft(newnode);
						System.out.println(" Node Added At Left Of "+move.getData());
						break;
					}
					else
						move=move.getLeft();
				}
				else if(ans.equals("right")) {
					if(move.getRight()==null)
					{
						move.setRight(newnode);
						System.out.println(" Node Added At right Of "+move.getData());
						break;
					}
					else
						move=move.getRight();
				}
				else {
				    System.out.println(" Not Valid Option ");
					break;
			        }
			}
			
			
		}
		
	}
	public void inorder(Node move)
	{
		if(move!=null)
		{
			inorder(move.getLeft());
			System.out.print(" "+move.getData());
			inorder(move.getRight());
			
		}
	}
	
	public void preorder(Node move)
	{
		if(move!=null)
		{
			System.out.print(" "+move.getData());
			preorder(move.getLeft());
			preorder(move.getRight());
			
		}
	}
	public void postorder(Node move)
	{
		if(move!=null)
		{
			postorder(move.getLeft());
			postorder(move.getRight());
			System.out.print(" "+move.getData());
			
		}
	}

}
