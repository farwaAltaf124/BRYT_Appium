import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class brytBase extends bryt {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		  AndroidDriver<AndroidElement> driver = Capabilities();
	        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
	}

}
