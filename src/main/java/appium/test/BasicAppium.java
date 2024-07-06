package appium.test;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.AndroidDriver;

public class BasicAppium {
	@Test
	public static void Test1() throws MalformedURLException {

		// process appium code--->Appium Server--->mobile Device
		UIAutomator2Options option = new UIAutomator2Options();
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127:0.0.1:4723"), "Capabilities");

	}

}
