package TestNG;

import org.testng.annotations.Test;

public class Launch {

	public static void main(String[] args) {
		System.out.println("I am Main");
	}
	@Test
	private void main() {
		System.out.println("I am Testng");

	}

}