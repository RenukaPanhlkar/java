import java.util.*;
public class Demo {
	
	public static void main(String[] args) {
	 
		binarystree tree1=new binarystree();
		 Scanner sc=new Scanner(System.in);
		 int data,choice=1;
		 do
		 {
			 System.out.println("1. Add Node ");
			 System.out.println("2. display ");
			 System.out.println("3.Smmalest Element");
			 System.out.println("4.Bigest Element");
			 //System.out.println("5.Delete");
			 System.out.println("0. Exit ");
			 System.out.println("\nEnter Your Choice  ");
			 choice=sc.nextInt();
			 switch(choice)
			 {
			 case 1:
				 System.out.println("Enter Data to Insert ");
				 data=sc.nextInt();
				 tree1.addNode(data);break;
			 case 2:
				 System.out.println(" \n----------- Inorder ----------\n");
				 tree1.inorder(tree1.getRoot());
				 System.out.println(" \n----------- preorder ----------\n");
				 tree1.preorder(tree1.getRoot());
				 System.out.println(" \n----------- postorder ----------\n");
				 tree1.postorder(tree1.getRoot());
			 case 3:
				 System.out.println("The Smallest node is:");
				 int ele=tree1.min();
				 System.out.println(ele);
				 break;
			 case 4:System.out.println("The bigest node is:");
			 int m=tree1.max();
			 System.out.println(m);
			 break;
			 case 5:System.out.println("Enter the element you want to delete");
			 int key=sc.nextInt();
			// deleteNode(Root,key);
			 }
					 
		 }while(choice !=0);
	}
}
