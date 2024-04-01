package pages;

import gherkin.lexer.Th;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import utils.AndroidUtils;
import utils.AppiumDriverFactory;

public class pageOfCatatanKeuangan {

    AppiumDriver driver;
    AppiumDriverFactory appiumDriverFactory = AppiumDriverFactory.getInstanceOfAppiumDriverFactory();
    AndroidUtils androidUtils;

    private static final By header_logo = By.xpath("//android.widget.TextView[@text=\"Welcome to U by Prodia!\"]\n");
    private static final By input_userClickLoginButton= By.xpath("//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View[2]/android.widget.Button\n");
    //    private static final By flight_icon = By.xpath("//android.widget.ImageView[@content-desc='Flights']");
    private static final By Input_userInputUsername= By.xpath("//android.widget.ScrollView/android.widget.EditText[1]\n");

    private  static final By input_userInputPassword= By.xpath("//android.widget.ScrollView/android.widget.EditText[2]\n");
    private static  final By input_userClickButton= By.xpath("//android.widget.ScrollView/android.view.View[3]/android.widget.Button");
    private  static final By input_userOnHomepageDashboard=By.xpath("//android.widget.TextView[@text=\"Health Score Assessment\"]\n");

//Start Here
    private static final By input_userCloseNotification =  By.xpath("//android.widget.ScrollView[@resource-id=\"android:id/buttonPanel\"]\n");
    public static final By input_userLaunchAppsAndOnTransactionDashboard= By.xpath("//android.widget.TextView[@text=\"Income\"]\n");
    public static final By input_useruserTapAddButtonAddButton= By.xpath("//android.widget.ImageButton[@resource-id=\"com.chad.financialrecord:id/fabMenu\"]\n");
    public static final By input_userOnPageCreateTransaction= By.xpath("//android.widget.TextView[@text=\"Income\"]\n");
    public static final By input_userTapIncome= By.xpath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/btnIncome\"]\n");
    public static final By input_useruserTapDateIncome= By.xpath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/tvDate\"]\n");
    public static final By input_userSelectDateOne= By.xpath("//android.view.View[@content-desc=\"01 April 2024\"]\n");
    public static final By input_userTapOK= By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]\n");
    public static final By input_userTapCategoryIncome= By.xpath("//android.widget.Spinner[@resource-id=\"com.chad.financialrecord:id/spCategory\"]\n");
    public static final By input_userTapCategoryOne= By.xpath("//android.widget.ListView/android.widget.LinearLayout[10]\n");
    public static final By input_userTapAmountAndInputAmmount= By.xpath("//android.widget.EditText[@resource-id=\"com.chad.financialrecord:id/etAmount\"]\n");
    public static final By input_useruserInputNote= By.xpath("//android.widget.AutoCompleteTextView[@resource-id=\"com.chad.financialrecord:id/etNote\"]\n");
    public static final By input_usertapSaveButton= By.xpath("//android.widget.Button[@resource-id=\"com.chad.financialrecord:id/btSave\"]\n");
    public static final By input_useruserTapExpense= By.xpath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/btnExpense\"]\n");
    public static final By input_userTapDateExpence= By.xpath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/tvDate\"]\n");
    public static final By input_userTapCategoryExpence= By.xpath("//android.widget.Spinner[@resource-id=\"com.chad.financialrecord:id/spCategory\"]\n");
    public static final By input_userTapCategoryTwo= By.xpath("//android.widget.ListView/android.widget.LinearLayout[5]\n");
    public static final By input_userSelectDateThree= By.xpath("//android.view.View[@content-desc=\"02 April 2024\"]\n");
    public static final By input_userSelectDateFourth=  By.xpath("//android.view.View[@content-desc=\"03 April 2024\"]\n");
    public static final By input_userTapCategoryFourth= By.xpath("//android.widget.ListView/android.widget.LinearLayout[1]\n");
    public static final By input_userSelectDateFive= By.xpath("//android.view.View[@content-desc=\"03 April 2024\"]\n");
    public static final By input_userTapCategoryFive= By.xpath("//android.widget.ListView/android.widget.LinearLayout[5]\n");
    public static final By input_userTapOtherOnTopCorner= By.xpath("//android.widget.ImageButton[@resource-id=\"com.chad.financialrecord:id/ibSetting\"]\n");
    public static final By input_userSelectChart= By.xpath("//android.widget.TextView[@text=\"Chart\"]\n");
    public static final By input_userOnPageChart= By.xpath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/toolbarTitle\"]\n");
    public static final By input_userSelectViewOption= By.xpath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/tvType\"]\n");
    public static final By input_userSelectOverview= By.xpath("//android.widget.TextView[@text=\"Overview\"]\n");
    public static final By input_userGetInformSummaryOfIncomeAndExpence= By.xpath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/tvSort\"]\n");
    public static final By input_userSelectDateSix= By.xpath("//android.view.View[@content-desc=\"04 April 2024\"]\n");
    public static final By input_userTapDayTwoResult= By.xpath("//android.widget.TextView[@resource-id=\"com.chad.financialrecord:id/tvDateThree\" and @text=\"Tuesday\"]\n");
    public static final By input_userTapTransactionSelected= By.xpath("//android.widget.LinearLayout[@resource-id=\"com.chad.financialrecord:id/llRoot\"]/android.widget.LinearLayout\n");
    public static final By input_userCanDeleteTransaction= By.xpath("//android.widget.ImageButton[@resource-id=\"com.chad.financialrecord:id/ibDelete\"]\n");
    public static final By input_userSelectYES= By.xpath("//android.widget.Button[@resource-id=\"android:id/button1\"]\n");
    public static final By input_userBackToHome= By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]\n");
    public static final By input_fromChartBackToHomepage= By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]\n");


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

//Start Here
    public void userCloseNotification(){
        MobileElement userclicknotif = (MobileElement) driver.findElement(input_userCloseNotification);
        userclicknotif.click();
    }

    public void userLaunchAppsAndOnTransactionDashboard(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);
        Assert.assertTrue(androidUtils.Assert(input_userLaunchAppsAndOnTransactionDashboard), "Income");

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void userTapAddButton(){
        MobileElement userclickaddbutton = (MobileElement) driver.findElement(input_useruserTapAddButtonAddButton);
        userclickaddbutton.click();

        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void userOnPageCreateTransaction(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        // Langsung menggunakan assertTrue tanpa logika if
        Assert.assertTrue(androidUtils.Assert(input_userOnPageCreateTransaction), "Income\n");
    }

    public void userTapIncome(){
        MobileElement useruserTapIncome = (MobileElement) driver.findElement(input_userTapIncome);
        useruserTapIncome.click();
    }

    public void userTapDateIncome(){
        MobileElement useruserTapDateIncome = (MobileElement) driver.findElement(input_useruserTapDateIncome);
        useruserTapDateIncome.click();
    }

    public void userSelectDateOne(){
        MobileElement useruserSelectDateOne = (MobileElement) driver.findElement(input_userSelectDateOne);
        useruserSelectDateOne.click();
    }

    public void userTapOK(){
        MobileElement useruserTapOK = (MobileElement) driver.findElement(input_userTapOK);
        useruserTapOK.click();
    }

    public void userTapCategoryIncome() {
        MobileElement useruserTapCategoryIncome = (MobileElement) driver.findElement(input_userTapCategoryIncome);
        useruserTapCategoryIncome.click();
    }

    public void userTapCategoryOne(){
        MobileElement useruserTapCategoryOne = (MobileElement) driver.findElement(input_userTapCategoryOne);
        useruserTapCategoryOne.click();
    }

    public void userTapAmountAndInputAmmount(String incomeOne){
        MobileElement useruserTapAmountAndInputAmmount = (MobileElement) driver.findElement(input_userTapAmountAndInputAmmount);
        useruserTapAmountAndInputAmmount.sendKeys(incomeOne);

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    public void userInputNote(String Freelance){
        MobileElement useruserInputNote = (MobileElement) driver.findElement(input_useruserInputNote);
        useruserInputNote.sendKeys(Freelance);

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void tapSaveButton(){
        MobileElement usertapSaveButton = (MobileElement) driver.findElement(input_usertapSaveButton);
        usertapSaveButton.click();
    }

    public void userTapExpense(){
        MobileElement useruserTapExpense = (MobileElement) driver.findElement(input_useruserTapExpense);
        useruserTapExpense.click();
    }

    public void userTapDateExpence(){
        MobileElement useruserTapDateExpence = (MobileElement) driver.findElement(input_userTapDateExpence);
        useruserTapDateExpence.click();

    }

    public void userTapCategoryExpence(){
        MobileElement useruserTapCategoryExpence = (MobileElement) driver.findElement(input_userTapCategoryExpence);
        useruserTapCategoryExpence.click();

    }

    public void userTapCategoryTwo(){
        MobileElement useruserTapCategoryTwo = (MobileElement) driver.findElement(input_userTapCategoryTwo);
        useruserTapCategoryTwo.click();
    }

    public void userSelectDateThree(){
        MobileElement useruserSelectDateThree = (MobileElement) driver.findElement(input_userSelectDateThree);
        useruserSelectDateThree.click();
    }

    public void userSelectDateFourth(){
        MobileElement useruserSelectDateFourth = (MobileElement) driver.findElement(input_userSelectDateFourth);
        useruserSelectDateFourth.click();

    }

    public void userTapCategoryFourth(){
        MobileElement useruserTapCategoryFourth = (MobileElement) driver.findElement(input_userTapCategoryFourth);
        useruserTapCategoryFourth.click();
    }

    public void userSelectDateFive(){
        MobileElement useruserSelectDateFive = (MobileElement) driver.findElement(input_userSelectDateFive);
        useruserSelectDateFive.click();
    }

    public void userTapCategoryFive(){
        MobileElement useruserTapCategoryFive = (MobileElement) driver.findElement(input_userTapCategoryFive);
        useruserTapCategoryFive.click();
    }

    public void userTapOtherOnTopCorner(){
        MobileElement useruserTapOtherOnTopCorner = (MobileElement) driver.findElement(input_userTapOtherOnTopCorner);
        useruserTapOtherOnTopCorner.click();
    }

    public void userSelectChart(){
        MobileElement useruserSelectChart = (MobileElement) driver.findElement(input_userSelectChart);
        useruserSelectChart.click();
    }

    public void userOnPageChart(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        Assert.assertTrue(androidUtils.Assert(input_userOnPageChart), "Chart");
    }

    public void userSelectViewOption(){
        MobileElement useruserSelectViewOption = (MobileElement) driver.findElement(input_userSelectViewOption);
        useruserSelectViewOption.click();
    }

    public void userSelectOverview(){
        MobileElement useruserSelectOverview = (MobileElement) driver.findElement(input_userSelectOverview);
        useruserSelectOverview.click();
    }

    public void userGetInformSummaryOfIncomeAndExpence(){
        driver = appiumDriverFactory.getDriver();
        androidUtils = new AndroidUtils(driver);

        Assert.assertTrue(androidUtils.Assert(input_userGetInformSummaryOfIncomeAndExpence), "Most");
    }

    public void userSelectDateSix(){
        MobileElement useruserSelectDateSix = (MobileElement) driver.findElement(input_userSelectDateSix);
        useruserSelectDateSix.click();
    }

    public void userTapDayTwoResult(){
        MobileElement useruserTapDayTwoResult = (MobileElement) driver.findElement(input_userTapDayTwoResult);
        useruserTapDayTwoResult.click();
    }

    public void userTapTransactionSelected(){
        MobileElement useruserTapTransactionSelected = (MobileElement) driver.findElement(input_userTapTransactionSelected);
        useruserTapTransactionSelected.click();
    }

    public void userCanDeleteTransaction(){
        MobileElement useruserCanDeleteTransaction = (MobileElement) driver.findElement(input_userCanDeleteTransaction);
        useruserCanDeleteTransaction.click();
    }

    public void userSelectYES(){
        MobileElement useruserSelectYES = (MobileElement) driver.findElement(input_userSelectYES);
        useruserSelectYES.click();

    }

    public void userBackToHome(){
        MobileElement useruserBackToHome = (MobileElement) driver.findElement(input_userBackToHome);
        useruserBackToHome.click();
    }

    public void fromChartBackToHomepage(){
        MobileElement userfromChartBackToHomepage = (MobileElement) driver.findElement(input_fromChartBackToHomepage);
        userfromChartBackToHomepage.click();
    }
}
