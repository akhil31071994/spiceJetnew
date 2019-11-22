package spiceJet;

import org.testng.annotations.Test;

public class RND {

	@Test(groups = { "random" })
	public void write()

	{
		System.out.println("random part 1)++++++++++++++++++++++++++");

	}

	@Test(groups = { "random" })
	public void xyz() {
		System.out.println("xyz****************************8");
	}

	@Test
	public void deps() {
System.out.println("=================depends on me===================");
	}

}
