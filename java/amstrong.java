import java.util.*;
public class amstrong
{
public static void main(String args[] )
{
	Scanner s=new Scanner(System.in);
 int num, number, temp,total=0;
 System.out.println("Enter the 3 digit number");
 num=s.nextInt();
 s.close();
 number=num;
 
 for(;number!=0;number/=10)
	{
	temp=number%10;
	total=total+temp*temp*temp;
	}
	
	if(total==num)
		System.out.println("Number is amstrong");
	
	else
		System.out.println("Number is amstrong");				
}
}
