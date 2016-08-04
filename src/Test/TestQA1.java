package Test;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestQA1 {

    AppiumDriver wd;

@Test
public  void Test2() throws  Exception{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.0");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "9.3");
        capabilities.setCapability("deviceName", "iPhone 6");
        capabilities.setCapability("app", "/Users/vityabuchok/Library/Developer/Xcode/DerivedData/VikePlayer-atrkbrjbdlgitehefyortwrphtnx/Build/Products/Release-iphonesimulator/VikePlayer.app");
        wd = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAImage[1]")).click();
       Thread.sleep(500);
         wd.findElement(By.xpath(" //UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIACollectionView[1]/UIACollectionCell[1]")).click();
    Thread.sleep(500);

    wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
    Thread.sleep(500);
     wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
    Thread.sleep(500);

        wd.close();
        }
        }
