package desktopappTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.Test;

public class Addition {

	@Test
	public void addition() throws MalformedURLException {
		
		DesktopOptions option=new DesktopOptions();
		
		option.setApplicationPath("C:\\Windows\\System32\\calc.exe");
		
		WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"), option);
		
		driver.findElement(By.name("Seven")).click();
		
		driver.findElement(By.name("Plus")).click();

		driver.findElement(By.name("Nine")).click();
		
		driver.findElement(By.name("Equals")).click();

		String output=driver.findElement(By.id("0")).getText();
		
		System.out.println(output);

		
	}

}
