package Mockitol;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class Mockito1 {

	@Test
	public void test() {
		//fail("Not yet implemented");
		System.out.println("in test method");
		List<String> mockList=mock(List.class);
		when(mockList.size()).thenReturn(5);
		assertTrue(mockList.size()==5);
		System.out.println("end of test method");
	}

}
