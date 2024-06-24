package edubridge;

import java.util.*;
public class Practice {
	public static void main(String []args) {
		
		/* 1.⁠ ⁠Write a Java program to print 'Hello' on screen and your name on a separate line.
		Expected Output :
		Hello
		Your Name*/
		System.out.println("Q.1 \nHell0\nMahesh\n");
		
		/*2.⁠ ⁠Write a Java program to print the sum of two numbers.
		Test Data:
		74 + 36
		Expected Output :
		110 */
		int a=74;
		int b=36;
		int c = a+b;
		System.out.println("Q.2 \nSum of two numbers: "+c );
		
		/*3.⁠ ⁠Write a Java program to divide two numbers and print them on the screen.
		Test Data :
		50/3
		Expected Output : 16
		 */
		
		int a1=50;
		int b1=3;
		int c1=a1/b1;
		System.out.println("\nQ.3 \nDivision of Two no: "+c1);
		
		/*4.⁠ ⁠Write a Java program to print the results of the following operations.
		Test Data:
		a. -5 + 8 * 6
		b. (55+9) % 9
		c. 20 + -3*5 / 8
		d. 5 + 15 / 3 * 2 - 8 % 3
		Expected Output :
			43
			1
			19
			13 */
		
		int a2 = 5;
		int b2 = 8;
		int c3 = 6;
		int d= -a2+b2*c3; // -5+8*6;
		System.out.println("/nQ.4\n(a)\n"+d);
		
		
		int d1=(55+9)%9;
		System.out.println("\n(b)\n"+d1);
		
		int d2=20 + -3*5 / 8;
		System.out.println("\n(c)\n"+d2);
		
		int d3=5 + 15 / 3 * 2 - 8 % 3;
		System.out.println("\n(d)\n"+d3);
		
		
		/*5.⁠ ⁠Write a Java program that takes two numbers as input and displays the product of two numbers.
		Test Data:
		Input first number: 25
		Input second number: 5
		Expected Output :
		25 x 5 = 125 */
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no: ");
		int n = sc.nextInt();
		
		System.out.println("Entr second no: ");
		int m = sc.nextInt();
		System.out.println(m*n);
		
		
		/*6.⁠ ⁠Write a Java program to display the following pattern.
		Sample Pattern :

		   J    a   v     v  a                                                  
		   J   a a   v   v  a a                                                 
		J  J  aaaaa   V V  aaaaa                                                
		 JJ  a     a   V  a     a   */
		
		
		        System.out.println("   J    a   v     v  a");
		        System.out.println("   J   a a   v   v  a a");
		        System.out.println("J  J  aaaaa   V V  aaaaa");
		        System.out.println(" JJ  a     a   V  a     a");
		  
		
		
		
	}

}
