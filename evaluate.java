package EVALUATION;
import java.util.*;
public class evaluate {
	static String[] name=new String[5];    //declaring arrays of names of students
	static double[] s1=new double[4];      //declaring araays for storing marks  record of each student
	static double[] s2=new double[4];
	static double[] s3=new double[4];
	static double[] s4=new double[4];
	static double[] s5=new double[4];
			
		static char[] grades=new char[5];
	static double average=0;
		
		
		public static void getdetails()         //method to get input details from user
		
        {
			Scanner input = new Scanner(System.in);
		     for(int i=0;i<5;i++)
		{
		System.out.print("Enter names the students : ");
		       name[i] = input.nextLine();
		   	
		}
		     System.out.print("\nEnter marks for student 1 : ");
		     for(int i=0;i<4;i++)
				{
			
				s1[i] = input.nextInt();
				if(s1[i]<0 || s1[i]>100)
					{System.out.println("INVALID ENTRY");
				break;}
				}
		     System.out.print("\nEnter marks for student 2: ");
		     for(int i=0;i<4;i++)
				{
				
				 s2[i] = input.nextInt();
				 if(s2[i]<0 || s2[i]>100)
						{System.out.println("INVALID ENTRY");
					break;
						}
				}
		 	System.out.print("\nEnter marks for student 3:");
		     for(int i=0;i<4;i++)
				{
			
				 s3[i] = input.nextInt();
				 if(s3[i]<0 || s3[i]>100)
						{System.out.println("INVALID ENTRY");
					break;
						}
				}
		     System.out.print("\nEnter marks for student 4:");
		     for(int i=0;i<4;i++)
				{
				
				s4[i] = input.nextInt();
				if(s4[i]<0 || s4[i]>100)
					{System.out.println("INVALID ENTRY");
				break;}
				
				}
		     System.out.print("\nEnter marks for student 5: ");
		     for(int i=0;i<4;i++)
				{
				
				 s5[i] = input.nextInt();
				 if(s5[i]<0 || s5[i]>100)
						{System.out.println("INVALID ENTRY");
					break;}
					
				}
		     
		}
		public static String namedetails(String name)    //method to return name
		{return name;}
		public static double avg(double[]s)              //method to calculate and return average marks of a student
		{ double sum=0;
			for(int i=0;i<4;i++)
				sum=sum+s[i];
			average=sum/4;
			return average;
         }
		public static  char grade(double avg)               //method to calculate and return grade of a student
		{ 
		if(avg>=90 && avg<=100)
			return 'A';
		else if(avg>=80 && avg<90)
			return 'B';
		else if(avg>=70 && avg<80)
			return 'C';
		else if(avg>=60 && avg<70)
			return 'E';
		else
			return 'F';
		}
		
			public static void main(String[] args)        // main method

			{
				getdetails();
				System.out.println("Details of Student 1:");
				System.out.println("NAME:"+namedetails(name[0]));
				 double avrg1=avg(s1);
				System.out.println("SCORE:"+avrg1);
				System.out.println("GRADE:"+grade(avrg1));
				
				System.out.println("Details of Student 2:");
				System.out.println("NAME:"+namedetails(name[1]));
				 double avrg2=avg(s2);
				System.out.println("SCORE:"+avrg2);
				System.out.println("GRADE:"+grade(avrg2));
			
				System.out.println("Details of Student 3:");
				System.out.println("NAME:"+namedetails(name[2]));
				 double avrg3=avg(s3);
				System.out.println("SCORE:"+avrg3);
				System.out.println("GRADE:"+grade(avrg3));
			
				System.out.println("Details of Student 4:");
				System.out.println("NAME:"+namedetails(name[3]));
				 double avrg4=avg(s4);
				System.out.println("SCORE:"+avrg4);
				System.out.println("GRADE:"+grade(avrg4));
			
				System.out.println("Details of Student 5:");
				System.out.println("NAME:"+namedetails(name[4]));
				 double avrg5=avg(s5);
				System.out.println("SCORE:"+avrg5);
				System.out.println("GRADE:"+grade(avrg5));
			
			}
		}

