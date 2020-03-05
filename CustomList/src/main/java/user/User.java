package user;
import CustomList.CustomList.*;
import java.util.*;
public class User {
	public static void main(String[] args) {
		CustomList<Integer> list = new CustomList<Integer>();
		 Scanner sc=new Scanner(System.in);
		 
		 System.out.println("1.Add Elements\n2.Remove Element\n3.Get Element\n4.Print List\nEnter your input, Enter -1 to exit");
		 
		 int input=sc.nextInt();
		 
		 while(input!=-1) {
		 
			 switch(input) {
	// add element
		 case 1: System.out.println("Enter elements and -1 at the end to exit");	 
			 	 int addtolist=sc.nextInt();
		 		 while(addtolist!=-1)
		 		 {
		 			 list.add(addtolist);
		 			 addtolist=sc.nextInt();
		 		 }
		 		 break;
	// remove element
		 case 2:	System.out.println("Enter the index of element to remove");
			 		int removefromlist=sc.nextInt();
 		 			System.out.println("Element removed is: "+list.remove(removefromlist));
 		 			break;
 	// get element
		 case 3:    System.out.println("Enter the index of element to fetch");
			 		int getelement=sc.nextInt();
		 			System.out.println("Element at index "+getelement+" is "+list.get(getelement));
		 			break;
	// print list 		
		 case 4:  	System.out.print("list: ");
			 		System.out.println(list);
		 			break;
		 }
			 
		 input=sc.nextInt();
		 }

}		
	}
