import java.util.Scanner;
public class binarystree {
private Node root;
	
	public Node getRoot() {
		return root;
	}
	public binarystree()
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
				
				if(data<move.getData())
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
				else if(data>move.getData())
				{
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

	public int min()
	{
		int data=0;
		Node move=root;
		while(move.getLeft()!=null)
		{
			move=move.getLeft();
		}
		return move.getData();
	}
	public int max()
	{
		int data=0;
		Node move=root;
		while(move.getRight()!=null)
		{
			move=move.getRight();
		}
		return move.getData();
	}

	
	/*public void delete(int data)
	{
		Node temp,tag,tr;
		temp=root;
		while(temp!=nu ll||temp.getData()!=data)
		{
			tag=temp;
			if(temp.getData()<data)
			
				temp=temp.getRight();
				else
				temp=temp.getLeft();
			}
		if(temp.getRight()==null)
		{
			if(tag.getData()>data)
				tag.getLeft()=temp.getLeft();
			
		}
		
	/*if(temp.getRight()!=null)
	{
		if(temp.getLeft()!=null)
		{
			for(tr=temp.getRight();tr.getLeft()!=null;tr.setLeft(temp.getLeft()));
		}	
					
	}*/
	/*
		if(tag.getData()<temp.getData())
		{
			tag.setRight(temp.getRight());
		}
		else
		{
			tag.setLeft(temp.getLeft());
		}
		
		}
		
	}*/
 	
	
		        
}