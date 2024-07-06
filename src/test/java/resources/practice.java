package resources;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class practice {
	public static AndroidDriver driver;
	public static AppiumDriverLocalService service;
	public static void main(String[] args) throws MalformedURLException {


		service = new AppiumServiceBuilder()
				.withAppiumJS(new File("C:\\Users\\Sandi\\AppData\\Roaming\\npm\\node_modules\\appium\\lib\\main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();

		UiAutomator2Options options = new UiAutomator2Options();
		// options.setDeviceName("RahulPhone"); //emulator
		options.setDeviceName("Android Device");// real device

		options.setChromedriverExecutable("//Users//rahulshetty//documents//chromedriver 11");

		options.setApp("//Users//rahulshetty//workingcode//Appium//src//test//java//resources//ApiDemos-debug.apk");
		// options.setApp("//Users//rahulshetty//workingcode//Appium//src//test//java//resources//General-Store.apk");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


	}

}
