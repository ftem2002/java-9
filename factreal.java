package halakat;

import java.util.Scanner;

public class factreal 
{

	public static void main(String[] args) 
	{
		int n , i , fact ;
		Scanner scan = new Scanner(System.in);
		System.out.println( " enter the num : ");
		n = scan.nextInt();
		fact = 1 ;
		for(i = 1 ; i <= n ; i++ )
			fact = fact * i ;
		
		System.out.println(" n =  " + n  + " = " + fact);
	}

}
