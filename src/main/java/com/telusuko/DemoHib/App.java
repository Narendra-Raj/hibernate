package com.telusuko.DemoHib;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("please select the data you want");
    	System.out.println("enter 1 for insert the data");
    	System.out.println("enter 2 for update the data");
    	System.out.println("enter 3 for delete the data");
    	
    	Scanner scan=new Scanner(System.in);
    	int a=scan.nextInt();
    		if(a==1)
    		{
    	App1.create();
    		}
    		else if(a==2)
    		{
    		
    			App1.updateData();
    		}
    		else if(a==3)
    		{
    		
    			App1.deleteData();
    		}
    }
}
