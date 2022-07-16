import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		binarytreeexample tree1=new binarytreeexample();
		 Scanner sc=new Scanner(System.in);
		 int data,choice=1;
		 do
		 {
			 System.out.println("1. Add Node ");
			 System.out.println("2. Display ");
			 System.out.println("0. Exit ");
			 System.out.println("Enter Your Choice  ");
			 choice=sc.nextInt();
			 switch(choice)
			 {
			 case 1:
				 System.out.println("\nEnter Data to Insert ");
				 data=sc.nextInt();
				 tree1.addNode(data);
				 break;
			 case 2:
				 System.out.println(" \n----------- Inorder ----------\n");
				 tree1.inorder(tree1.getRoot());
				 System.out.println(" \n----------- preorder ----------\n");
				 tree1.preorder(tree1.getRoot());
				 System.out.println(" \n----------- postorder ----------\n");
				 tree1.postorder(tree1.getRoot());
			 }
					 
		 }while(choice !=0);
	}


}
