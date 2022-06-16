package Basics;

import java.util.Iterator;
import java.util.Scanner;

public class datatypes {
	static int sum(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		System.out.println("hello world");
		
		
	    String name= "harshal";
	    System.out.println(name);
	    int a= 20;
	    System.out.println(a);
	    float b=7.1f;
	    System.out.println(b);
	    boolean isadult=true;
	    System.out.println(isadult);
	    char grade='A';
	    System.out.println(grade);
        byte e=-45;
        System.out.println(e);
        double f=4.6436664d;
        System.out.println(f);
        int num1=36, num2=69;
        System.out.println(num1+num2);
        System.out.println(num1*=3);
        System.out.println(num2/=1);
        System.out.println(num1%=4);
        
        
       
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name + " got " + grade + " grade ");
        System.out.println(name.contains("sha"));
        System.out.println(Math.max(num1, num2));
        System.out.println(Math.min(num1, num2));
        System.out.println(Math.sqrt(144));
        System.out.println(Math.abs(-39));
        System.out.println(Math.random());
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=scan.nextInt();
//        if(age>18) {
//        	System.out.println("your an adult");
//        }
//        else if(age>5){
//        	System.out.println("you are not a kid");
//        }
//        else {
//        	System.out.println("your are a kid");
//        }
//        switch (number) {
//		case 1:System.out.println("sunday");
//		break;
//		case 2:System.out.println("monday");
//		break;
//		case 3:System.out.println("tuesday");
//		break;
//		case 4:System.out.println("wednesday");
//		break;
//		case 5:System.out.println("thursday");
//		break;
//		case 6:System.out.println("friday");
//		break;
//		case 7:System.out.println("saturday");
//		break;
//		default:
//			throw new IllegalArgumentException("Unexpected value: ");
//		}
//        int i=0;
//        while(i<20) {
//        System.out.println(i);
//        i+=1;
//        }
//        for(int i=0;i<=10;i++){
//        System.out.println(i);
//        
//        }
        int [] marks= {1,2,3,5};
        marks[3]=69;
        System.out.println(marks[3]);
        System.out.println(marks[2]);
        for(int i=0;i<marks.length;i++) {
        	System.out.println(marks[i]);
        }
        String [] Name= {"harshal","jaynesh","ashish"};
        for(String value:Name) {
        	System.out.println(value);
        }
        System.out.println(sum(4,3));
        
	float number_1,number_2;
	System.out.println("Enter first number");
	Scanner scan2=new Scanner(System.in);
	number_1 = scan.nextFloat();
	
	 System.out.println("Enter second number");
	 Scanner scan3=new Scanner(System.in);
	 number_2=scan.nextFloat();
	 
	 String prompt="Enter 0 for addition,1 for subtraction,"
	 		+ "2 for multiplication,3 for division";
	 System.out.println(prompt);
	 int input=scan.nextInt();
	 switch(input) {
	 case 0:
		 System.out.println("Adding these numbers");
	 	System.out.println("the result is:");
	 	System.out.println(number_1+number_2);
	 	break;
	 case 1:
		 System.out.println("substracting these numbers");
	 	System.out.println("the result is:");
	 	System.out.println(number_1-number_2);
	 	break;
	 case 2:
		 System.out.println("multiplying these numbers");
	 	System.out.println("the result is:");
	 	System.out.println(number_1*number_2);
	 	break;
	 case 3:
		 System.out.println("dividing these numbers");
	 	System.out.println("the result is:");
	 	System.out.println(number_1/number_2);
	 	break;
	 	default:
	 		System.out.println("invalid input");
	 		}
	 
	
	}
}
