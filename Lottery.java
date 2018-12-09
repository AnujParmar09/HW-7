package EVALUATION;
import java.util.*;

public class Lottery {
	static int[] lotterynumbers=new int[5];     //array of random lottery digits
	Lottery()
	{
		for(int i=0;i<5;i++)                       //constructor to initialize lottery digits
		{
			Random random=new Random();
		lotterynumbers[i]=random.nextInt(10);
	}
		
	}
	public static void compare(int user[])               //method to compare lottery digits with user entry
	{ int f=0,c=0;
		for(int i=0;i<5;i++)
		{ if(user[i]!=lotterynumbers[i])
			{f=1; break;}
			else c++;}
		if(f==1)
			System.out.println("hard luck next time only these no of characters match :"+c);
				 else
					 System.out.println("congo !!!!! you won a lottery");
					 
	}
	public static int[] copy()
	{                                                      //copy randomly generated digits
		int[] ln=new int[5];   
		for(int i=0;i<5;i++)
		ln[i]=lotterynumbers[i];
		return ln;
	}
	public static void main(String[] args)                        //main method
	{
		Lottery ob=new Lottery();
		Scanner input = new Scanner(System.in);
		System.out.println("the randomly generated lottery digits: ");             //display lottery number
		for(int i=0;i<5;i++)
			System.out.println(lotterynumbers[i]);
			
		
	
		  System.out.println("Enter lottery digits: ");              //taking lottery digit input from user
		  int[] user=new int[5]; 
		     for(int i=0;i<5;i++)
				user[i] = input.nextInt();
		     compare(user);                                            //calling compare function
		     int[] cp=new int[5];
		     cp=copy();		
		 	System.out.println("the copied lottery digits: ");           //display copied array
			for(int i=0;i<5;i++)
				System.out.println(cp[i]);
		     
	}
	

}
