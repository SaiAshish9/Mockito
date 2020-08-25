package com.mockito.mockitoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessStubTest {

	@Test
	void testFindGreatest() {
//		fail("Not yet implemented");
		SomeBusiness business=new SomeBusiness(
				new DataServiceStub()
				);
		int result = business.findTheGreatest();
		assertEquals(24,24);
	}
}

//Stub --> to test new case we need new stub again and again that's where mocks come .It helps to dynamically create new classes 

class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
//		return null;
		return new int [] {24,6,15};
	}
	
}
