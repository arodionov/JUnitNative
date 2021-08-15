package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class JUnitNativeTest {

	@Test
	public void test() {
		System.out.println("Test");
	}

	@Test
	@Timeout(100)
	public void timeoutTest() {
		System.out.println("Timeout test");
	}

}
