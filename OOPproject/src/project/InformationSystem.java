package project;

import java.util.Date;
import java.util.Scanner;

public class InformationSystem {
	

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//Creating scanner object to take all inputs of the program
		Scanner input=new Scanner(System.in);
		System.out.println("Type 1 for GUI, type 2 for text-based I/O: ");
		// Starting or program via GUI or text-based I/O system
		String choise=input.nextLine();
		if(choise.equals("1")) {
			GUI gui=new GUI();
			gui.setVisible(true);
		}
		else if(choise.equals("2")) {
			
		
		
	//Choosing type of the service provider by entering GSM or Cable in text-based system
	//Also member field of the main method		
		System.out.print("Enter Type Of The Service Provider ?(GSM or Cable) : ");
	
		String serviceProviderType=input.nextLine();
		String serviceProviderName;
		ServiceProvider serviceProvider=null;
		SubscriptionPlan[] subscriptionplans;
		int numberOfPlans;
		boolean key=false;
		String customerCitizenshipNr;
		String customerName;
		String customerSubscriptionName;
		String stringdate;
		Date date;
		Subscription subscription;
		
	//Input the name of service provider if type of service provider exists
		if(serviceProviderType.equals("GSM")) {
			System.out.print("GSM Service Provider ? : ");
			serviceProviderName=input.nextLine();
			
		}
		else if(serviceProviderType.equals("Cable")) {
			System.out.print("Cable Service Provider ? : ");
			serviceProviderName=input.nextLine();
		}
	// Error if we enter a service provider type that does not exists ( and returns)
		else {
			System.out.println("Service Provider Doesn't Exists Please Try Again.");
			input.close();
			return;
		}
	//Choosing how many subscription plans the service provider will have and create an array subscriptionplans with the lenght of number of plans we chose
		System.out.print("Number Of Subscription Plans ? :  ");
		 numberOfPlans=input.nextInt();
		 input.nextLine();
		subscriptionplans=new SubscriptionPlan[numberOfPlans];
   //Depending the type of the service provider we create an object of the chosen type service provider
		if(serviceProviderType.equals("GSM")) {
			serviceProvider=new GSMProvider(serviceProviderName);
			
		}
		else if(serviceProviderType.equals("Cable")) {
			serviceProvider=new CableProvider(serviceProviderName);
		}
		
	//Input plan names and for every member of subscriptionplan array we create an object of subscriptionplan with plan name and serviceprovider object then adding subscription plans to service provider object
		for(int i=0;i<numberOfPlans;i++) {
			System.out.print("Name Of The Plan "+String.valueOf(i+1) +" ? : ");
			String planName=input.next();
			subscriptionplans[i]=new SubscriptionPlan(planName,serviceProvider);
			
			serviceProvider.addSubscriptionPlan(subscriptionplans[i]);
		}
	//All objects about company( service provider,subscription plans) created above. Now we can start to take input of customer information
    //Taking Citizenship number and customer name as inputs and creating an object of the class customer via Citizenship number
		System.out.print("Customer Citizenship Number ? :  ");
		customerCitizenshipNr=input.next();
		
		System.out.print("Customer Name ? :  ");
		customerName=input.next();
		ExistingCustomer customer=new ExistingCustomer(customerCitizenshipNr);
	//Setting the name of customer after creating an object of it
		customer.setName(customerName);
	//Taking name of the plan that customer wants to subscribe as an input 
		input.nextLine();
		System.out.print("Name Of The Plan To Be Subscribed ? :  ");
		customerSubscriptionName=input.nextLine();
		
	//Controlling the chosen service provider plan by customer exists in the serviceprovider via findSubscriptionPlan method if not program gives an error and returns	
			if(serviceProvider.findSubscriptionPlan(customerSubscriptionName)!=null) {
				
				key=true;
			}
		
		if(key==false) {
			System.out.println("Entered Subscription Plan Name Doesn't Exists. Please Try Again.");
			input.close();
			return;
		}
	//Taking an input of date as a subscription start date 
		System.out.print("Start Date For Subscription (MM/DD/YYYY)? :  ");
		stringdate=input.nextLine();
		
		date=new Date(stringdate);
   //After getting date and subscription plan name program creates an object of subscription class and adds it into customer object via setSubscription method	
		subscription=new Subscription(date,serviceProvider.findSubscriptionPlan(customerSubscriptionName));
		customer.setSubscription(subscription);
  //Closing the scanner object
		input.close();
 //Printing all information about customer 
		System.out.println("------------------------------");
		System.out.println("Customer Citizenship Number= "+customer.getCitizenshipNr());
		System.out.println("Customer Name= "+customer.getName());
		System.out.println("Service Provider: "+customer.getSubscription().getSubscriptionPlan().getServiceProvider().getName());
		System.out.println("Subscription Start Date: "+(customer.getSubscription().getSubscriptionStartDate().getMonth()+1) +"/"+customer.getSubscription().getSubscriptionStartDate().getDate()+"/"+(customer.getSubscription().getSubscriptionStartDate().getYear()+1900));
		System.out.println("Subscription Plan Name: "+customer.getSubscription().getSubscriptionPlan().getName());
		System.out.println("------------------------------");
		}
 //Error if we chose neither GUI or text-based system we should enter 1 or 2 at the beginning of the program
		else {
			System.out.println("Error : Please enter 1 or 2");
		}
		
		
	}

}
