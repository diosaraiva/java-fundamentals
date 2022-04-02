package com.diosaraiva.javafundamentals.designpatterns.creational.factorymethod;

class GetPlanFactory{  

	//use getPlan method to get object of type Plan   
	public Plan getPlan(String planType){  
		if(planType == null){  
			return null;  
		}  
		if(planType.equalsIgnoreCase("DOMESTICPLAN") || planType.equalsIgnoreCase("1")) {  
			return new DomesticPlan();  
		}   
		else if(planType.equalsIgnoreCase("COMMERCIALPLAN") || planType.equalsIgnoreCase("2")){  
			return new CommercialPlan();  
		}   
		else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN") || planType.equalsIgnoreCase("3")) {  
			return new InstitutionalPlan();  
		}  
		return null;  
	}  
}