package com.mockito.mockitoTest;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockTest {

	@Test
	void testFindGreatest() {
        DataService dataServiceMock = mock(DataService.class);
//		dataServiceMock.retrieveAllData()=>new int[] {24,15,3};
		when(dataServiceMock.retrieveAllData())
		.thenReturn(new int[] {24,15,3});
        SomeBusiness business=new SomeBusiness(dataServiceMock);
		int result = business.findTheGreatest();
		assertEquals(24,result);
	}
	
	@Test
	void testFindGreatest1() {
        DataService dataServiceMock = mock(DataService.class);
//		dataServiceMock.retrieveAllData()=>new int[] {24,15,3};
		when(dataServiceMock.retrieveAllData())
		.thenReturn(new int[] {24});
        SomeBusiness business=new SomeBusiness(dataServiceMock);
		int result = business.findTheGreatest();
		assertEquals(24,result);
	}
	
}
