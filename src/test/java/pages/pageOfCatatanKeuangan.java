package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.AndroidUtils;
import utils.AppiumDriverFactory;

import java.util.concurrent.TimeUnit;

public class pageOfProdiaMobile {

    AppiumDriver driver;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
    AndroidUtils androidUtils;
    /** Page Objects **/
//    private static final By header_logo = By.id("net.skyscanner.android.main:id/header_logo");
//    private static final By flight_icon = By.xpath("//android.widget.ImageView[@content-desc='Flights']");

//    public void launchApp(){
//        driver = appiumDriverFactory.getDriver();
//            androidUtils = new AndroidUtils(driver);
//            if(androidUtils.objectExists(header_logo)){
//                System.out.println("Application Launched!");
//                Assert.assertTrue(true,"Application Launched Successfully!");
//            }else{
//                Assert.assertTrue(false,"Unable to launch application!");
//            }
//
//    }

//    public void validateScreen(String screenName){
//        By screen_name_obj = By.xpath("//android.widget.FrameLayout[@content-desc='"+screenName+"']/android.view.ViewGroup/android.widget.TextView");
//        if(androidUtils.objectExists(screen_name_obj)){
//           Assert.assertTrue(true,"I am in "+screenName);
//        }else{
//            Assert.assertTrue(false,"failed to be in "+screenName);
//        }
//
//    }


    private static final By header_logo = By.xpath("//android.widget.TextView[@text=\"Welcome to U by Prodia!\"]\n");
    private static final By input_userClickLoginButton= By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.widget.Button\n");
    //    private static final By flight_icon = By.xpath("//android.widget.ImageView[@content-desc='Flights']");
    private static final By Input_userInputUsername= By.xpath("//android.widget.ScrollView/android.widget.EditText[1]\n");

    private  static final By input_userInputPassword= By.xpath("//android.widget.ScrollView/android.widget.EditText[2]\n");
    private static  final By input_userClickButton= By.xpath("//android.widget.ScrollView/android.view.View[3]/android.widget.Button");
    private  static final By input_userOnHomepageDashboard=By.xpath("//android.widget.TextView[@text=\"Health Score Assessment\"]\n");

    public void userOnLoginDashboard(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        // Langsung menggunakan assertTrue tanpa logika if
        Assert.assertTrue(androidUtils.Assert(input_userClickLoginButton), "");

//        try{
//            Thread.sleep(3000);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

    }


    public void userClickLoginButton(){
        MobileElement userClickLoginButton= (MobileElement) driver.findElement(input_userClickLoginButton);
        userClickLoginButton.click();

        try{
            Thread.sleep(2);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

//    public void validateScreen(String screenName){
//        By screen_name_obj = By.xpath("//android.widget.FrameLayout[@content-desc='"+screenName+"']/android.view.ViewGroup/android.widget.TextView");
//        if(androidUtils.objectExists(screen_name_obj)){
//            Assert.assertTrue(true,"I am in "+screenName);
//        }else{
//            Assert.assertTrue(false,"failed to be in "+screenName);
//        }
//
//
//    }

    public void userInputUsername(String username) throws Throwable {
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        androidUtils.Sendkeys(Input_userInputUsername, username);

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void userInputPassword(String password){
        MobileElement inputPassword = (MobileElement) driver.findElement(input_userInputPassword);
        inputPassword.sendKeys(password);

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void userClickButton(){
        MobileElement userclickbutton= (MobileElement) driver.findElement(input_userClickButton);
        userclickbutton.click();
    }

    public void userOnHomepageDashboard(String screenName){
        driver = appiumDriverFactory.getDriver();
        if(androidUtils.Assert(input_userOnHomepageDashboard)){
            Assert.assertTrue(true,"Health Score Assessment"+screenName);
        }else{
            Assert.assertTrue(false,"failed to be in "+screenName);
        }

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void userCanEnterAutomation(){

    }


}
