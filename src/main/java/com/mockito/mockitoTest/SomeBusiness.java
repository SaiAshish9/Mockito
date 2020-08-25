package com.mockito.mockitoTest;

public class SomeBusiness {
	private DataService dataService;

	public SomeBusiness(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	
	int findTheGreatest() {
    	int[] data=dataService.retrieveAllData();
    	int greatest=Integer.MIN_VALUE ;
    	for(int value:data) {
    		if(value>greatest)
    			greatest=value;
    	}
    	System.out.println(greatest);
    	return greatest;
    }

   
}



