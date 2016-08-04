package Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import java.net.URL;
import java.util.concurrent.TimeUnit;


public class test2 {

        AppiumDriver wd;

        @BeforeTest
        public void SetUp() throws Exception {
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("appium-version", "1.0");
                capabilities.setCapability("platformName", "iOS");
                capabilities.setCapability("platformVersion", "9.3");
                capabilities.setCapability("deviceName", "iPhone 6");
                capabilities.setCapability("app", "/Users/vityabuchok/Library/Developer/Xcode/DerivedData/VikePlayer-atrkbrjbdlgitehefyortwrphtnx/Build/Products/Release-iphonesimulator/VikePlayer.app");
                wd = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities) {
                };


        }


        @org.testng.annotations.Test
        public void Test1() throws InterruptedException {
                wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAImage[1]")).click();
                Thread.sleep(500);
                wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIACollectionView[1]/UIACollectionCell[1]")).click();
                Thread.sleep(500);
                wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
                Thread.sleep(500);
                wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
                wd.closeApp();

        }
        @org.testng.annotations.Test
        public void Test2() throws InterruptedException {
                wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAImage[1]")).click();
                Thread.sleep(500);
                wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIACollectionView[1]/UIACollectionCell[1]")).click();
                Thread.sleep(500);
                wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();
                Thread.sleep(500);
                wd.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIANavigationBar[1]/UIAButton[1]")).click();

        }

        @AfterTest
        public void testDown() throws Exception {

                //wd.closeApp();
                wd.close();

        }

}