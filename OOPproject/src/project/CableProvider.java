package project;

public class CableProvider implements ServiceProvider {
	private String name;
	private SubscriptionPlan[] subscriptionPlans;
	public CableProvider(String name) {
	  this.subscriptionPlans=new SubscriptionPlan[10];
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addSubscriptionPlan(SubscriptionPlan subscriptionPlan) {
		for(int i=0;i<subscriptionPlans.length;i++) {
			if(subscriptionPlans[i]==null) {
				subscriptionPlans[i]=subscriptionPlan;
				return;
			}
			
		 }
	
	}
	public SubscriptionPlan findSubscriptionPlan(String subscriptionPlanName) {
		for (SubscriptionPlan subplan : subscriptionPlans) {
			if(subplan!=null && subplan.getName().equals(subscriptionPlanName)) {
				return subplan;
			}
		}
		return null;
	}
}
