package Guvi;
import java.util.Scanner;
public class Quit {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter any character");
char a=s.nextLine().charAt(0);
switch(a)
{
case 'Q':
	System.exit(0);
default:
	System.out.println("Entered character is "+a);
	
}
	}

}
