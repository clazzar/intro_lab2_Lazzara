package lab_11;

import java.util.*;
public class lab_11 {
	static int fibonacci(int n)
	{
	if(n<0)
	return -1;
	else if (n <= 1)
	return n;
	return fibonacci(n-1) + fibonacci(n-2);
	}

	public static void main (String args[])
	{
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	System.out.printf("fibonacci(%d) is %d" ,n, fibonacci(n));
	}
}
	

