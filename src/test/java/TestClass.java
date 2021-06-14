import com.test.model.pages.CalculatorPage;
import com.test.model.pages.GooglePage;
import com.test.utils.Webdriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class TestClass {

    WebDriver driver = Webdriver.getChromeDriver();
    GooglePage googlePage = new GooglePage(driver);
    CalculatorPage calculatorPage = new CalculatorPage(driver);


    @Before
    public void setUp(){
        driver.get(googlePage.pageUrl);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void integerOperation() {
        googlePage.typeSearchText();
        googlePage.submitSearchButton();
        calculatorPage.clickOpenBracket();
        calculatorPage.clickNumberOne();
        calculatorPage.clickPlus();
        calculatorPage.clickNumberTwo();
        calculatorPage.clickCloseBracket();
        calculatorPage.chooseMultiplication();
        calculatorPage.clickNumberThree();
        calculatorPage.clickMinus();
        calculatorPage.clickNumberFour();
        calculatorPage.clickNumberZero();
        calculatorPage.chooseDivide();
        calculatorPage.clickNumberFive();
        calculatorPage.clickEqual();

        String expectedMemoryStringText = "(1 + 2) × 3 - 40 ÷ 5 =";
        String receiveMemoryStringText = calculatorPage.getMemoryStringText();

        Assert.assertEquals(expectedMemoryStringText, receiveMemoryStringText);
    }

    @Test
    public void divisionByZero() {

        googlePage.typeSearchText();
        googlePage.submitSearchButton();

        calculatorPage.clickNumberSix();
        calculatorPage.chooseDivide();
        calculatorPage.clickNumberZero();
        calculatorPage.clickEqual();

        String expectedMemoryStringText = "6 ÷ 0 =";
        String receiveMemoryStringText = calculatorPage.getMemoryStringText();


        String expectedResultStringText = "Infinity";
        String receiveResultStringText = calculatorPage.getResultStringText();

        Assert.assertEquals(expectedMemoryStringText, receiveMemoryStringText);
        Assert.assertEquals(expectedResultStringText, receiveResultStringText);

    }

    @Test
    public void checkError() {
        googlePage.typeSearchText();
        googlePage.submitSearchButton();
        calculatorPage.clickSineCharacter();
        calculatorPage.clickEqual();

        String expectedMemoryStringText = "sin() =";
        String receiveMemoryStringText = calculatorPage.getMemoryStringText();

        String expectedResultStringText = "Error";
        String receiveResultStringText = calculatorPage.getResultStringText();

        Assert.assertEquals(expectedMemoryStringText, receiveMemoryStringText);
        Assert.assertEquals(expectedResultStringText, receiveResultStringText);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

