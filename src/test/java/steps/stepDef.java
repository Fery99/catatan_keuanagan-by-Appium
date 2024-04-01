package steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.pageOfCatatanKeuangan;

public class stepDef {

    pageOfCatatanKeuangan pageCatatanKeuangan = new pageOfCatatanKeuangan();


    @Given("^: user on login dashboard$")
    public void userOnLoginDashboard() {
        pageCatatanKeuangan.userOnLoginDashboard();

    }

    @When("^: user click Login button$")
    public void userClickLoginButton() {
        pageCatatanKeuangan.userClickLoginButton();

    }

    @And("^: user input username \"([^\"]*)\"$")
    public void userInputUsername(String username) throws Throwable {
        pageCatatanKeuangan.userInputUsername(username);
    }

    @And("^: user input password \"([^\"]*)\"$")
    public void userInputPassword(String password) throws Throwable {

        pageCatatanKeuangan.userInputPassword(password);
    }

    @And("^: user click button$")
    public void userClickButton() {
        pageCatatanKeuangan.userClickButton();
    }

    @Then("^: user on homepage dashboard$")
    public void userOnHomepageDashboard(String screenName) {
        pageCatatanKeuangan.userOnHomepageDashboard(screenName);
    }


//Start Here

    @Given("^: user close notification$")
    public void userCloseNotification() {
        pageCatatanKeuangan.userCloseNotification();
    }

    @Given("^: user launch apps and on Transaction dashboard$")
    public void userLaunchAppsAndOnTransactionDashboard() {
        pageCatatanKeuangan.userLaunchAppsAndOnTransactionDashboard();
    }


    @When("^user tap add button$")
    public void userTapAddButton() {
        pageCatatanKeuangan.userTapAddButton();
    }

    @And("^user on Page Create Transaction$")
    public void userOnPageCreateTransaction() {
        pageCatatanKeuangan.userOnPageCreateTransaction();
    }

    @And("^user tap income$")
    public void userTapIncome() {
        pageCatatanKeuangan.userTapIncome();
    }

    @And("^user tap date income$")
    public void userTapDateIncome() {
        pageCatatanKeuangan.userTapDateIncome();
    }

    @And("^user select date one$")
    public void userSelectDateOne() {
        pageCatatanKeuangan.userSelectDateOne();
    }


    @And("^user tap OK$")
    public void userTapOK() {
        pageCatatanKeuangan.userTapOK();

    }

    @And("^user tap Category income$")
    public void userTapCategoryIncome() {
        pageCatatanKeuangan.userTapCategoryIncome();
    }

    @And("^user tap Category One$")
    public void userTapCategoryOne() {
        pageCatatanKeuangan.userTapCategoryOne();
    }

    @And("^user tap Amount and input Ammount \"([^\"]*)\"$")
    public void userTapAmountAndInputAmmount(String incomeOne) throws Throwable {
        pageCatatanKeuangan.userTapAmountAndInputAmmount(incomeOne);

    }

    @And("^user input Note \"([^\"]*)\"$")
    public void userInputNote(String Freelance) throws Throwable {
        pageCatatanKeuangan.userInputNote(Freelance);
    }

    @And("^tap save button$")
    public void tapSaveButton() {
        pageCatatanKeuangan.tapSaveButton();
    }

    @And("^user tap Expense$")
    public void userTapExpense() {
        pageCatatanKeuangan.userTapExpense();
    }

    @And("^user tap date expence$")
    public void userTapDateExpence() {
        pageCatatanKeuangan.userTapDateExpence();
    }

    @And("^user tap Category expence$")
    public void userTapCategoryExpence() {
        pageCatatanKeuangan.userTapCategoryExpence();
    }

    @And("^user tap Category two$")
    public void userTapCategoryTwo() {
        pageCatatanKeuangan.userTapCategoryTwo();
    }

    @And("^user select date three$")
    public void userSelectDateThree() {
        pageCatatanKeuangan.userSelectDateThree();
    }

    @And("^user select date fourth$")
    public void userSelectDateFourth() {
        pageCatatanKeuangan.userSelectDateFourth();
    }

    @And("^user tap Category fourth$")
    public void userTapCategoryFourth() {
        pageCatatanKeuangan.userTapCategoryFourth();
    }

    @And("^user select date five$")
    public void userSelectDateFive() {
        pageCatatanKeuangan.userSelectDateFive();
    }

    @And("^user tap Category five$")
    public void userTapCategoryFive() {
        pageCatatanKeuangan.userTapCategoryFive();
    }

    @And("^user tap other on top corner$")
    public void userTapOtherOnTopCorner() {
        pageCatatanKeuangan.userTapOtherOnTopCorner();

    }


    @And("^user select Chart$")
    public void userSelectChart() {
        pageCatatanKeuangan.userSelectChart();
    }

    @And("^user on page chart$")
    public void userOnPageChart() {
        pageCatatanKeuangan.userOnPageChart();
    }

    @And("^user select view option$")
    public void userSelectViewOption() {
        pageCatatanKeuangan.userSelectViewOption();
    }

    @And("^user select Overview$")
    public void userSelectOverview() {
        pageCatatanKeuangan.userSelectOverview();
    }

    @Then("^user get inform summary of income and expence$")
    public void userGetInformSummaryOfIncomeAndExpence() {
        pageCatatanKeuangan.userGetInformSummaryOfIncomeAndExpence();
    }

    @And("^user select date six$")
    public void userSelectDateSix() {
        pageCatatanKeuangan.userSelectDateSix();
    }

    @When("^user tap day two result$")
    public void userTapDayTwoResult() {
        pageCatatanKeuangan.userTapDayTwoResult();
    }

    @And("^user tap transaction selected$")
    public void userTapTransactionSelected() {
        pageCatatanKeuangan.userTapTransactionSelected();
    }

    @And("^user can delete transaction$")
    public void userCanDeleteTransaction() {
        pageCatatanKeuangan.userCanDeleteTransaction();
    }

    @And("^user select YES$")
    public void userSelectYES() {
        pageCatatanKeuangan.userSelectYES();
    }

    @And("^user back to home$")
    public void userBackToHome() {
        pageCatatanKeuangan.userBackToHome();
    }

    @When("^from chart back to homepage$")
    public void fromChartBackToHomepage() {
        pageCatatanKeuangan.fromChartBackToHomepage();
    }
}



