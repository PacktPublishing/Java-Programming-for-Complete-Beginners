package junittestreports;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestDemo {
	@Test
	public void instanceOfTest() {
		assertThat(new ArrayList(), instanceOf(List.class));
	}
	
	@Test
	public void assertTest() {
		assertTrue(true);
	}

}
