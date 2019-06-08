package groupingexample;

import org.testng.annotations.*;

public class Groupingexample1 {

	@Test(groups = { "A" })
	public void m1() {

		System.out.println("This is group : a");
	}

	@Test(groups = { "B" })
	public void m2() {

		System.out.println("This is group : b");
	}

	@Test(groups = { "B" })
	public void m3() {

		System.out.println("This is group : b");
	}

	@Test(groups = { "A" })
	public void m4() {

		System.out.println("This is group : a");
	}

}
