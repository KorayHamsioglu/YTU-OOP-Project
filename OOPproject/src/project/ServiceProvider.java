package project;

public interface ServiceProvider {
public void addSubscriptionPlan(SubscriptionPlan subscriptionplan);
public SubscriptionPlan findSubscriptionPlan(String subscriptionPlanName);
public String getName();
public void setName(String name);
	
}
