package com.test.model.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage extends PageFactory {

    public CalculatorPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private WebDriver driver;

    @FindBy(xpath = "//div[text()='(']")
    private WebElement openBracket;

    @FindBy(xpath = "//div[text()=')']")
    private WebElement closeBracket;

    @FindBy(xpath = "//div[text()='1']")
    private WebElement numberOne;

    @FindBy(xpath = "//div[text()='+']")
    private WebElement plus;

    @FindBy(xpath = "//div[text()='2']")
    private WebElement numberTwo;

    @FindBy(xpath = "//div[text()='×']")
    private WebElement multiplication;

    @FindBy(xpath = "//div[text()='3']")
    private WebElement numberThree;

    @FindBy(xpath = "//div[text()='−']")
    private WebElement minus;

    @FindBy(xpath = "//div[text()='4']")
    private WebElement numberFour;

    @FindBy(xpath = "//div[text()='0']")
    private WebElement numberZero;

    @FindBy(xpath = "//div[text()='÷']")
    private WebElement divide;

    @FindBy(xpath = "//div[text()='5']")
    private WebElement numberFive;

    @FindBy(xpath = "//div[text()='=']")
    private WebElement equal;

    @FindBy(xpath = "//div[text()='6']")
    private WebElement numberSix;

    @FindBy(xpath = "//div[text()='sin']")
    private WebElement sineCharacter;

    @FindBy(xpath = "//span[@class='vUGUtc']")
    private WebElement memoryString;

    @FindBy(xpath = "//span[@id='cwos']")
    private WebElement resultString;

    public void clickOpenBracket () {
        openBracket.click();
    }

    public void clickCloseBracket () {
        closeBracket.click();
    }

    public void clickNumberOne () {
        numberOne.click();
    }

    public void clickPlus () {
        plus.click();
    }

    public void clickNumberTwo () {
        numberTwo.click();
    }

    public void chooseMultiplication () { multiplication.click(); }

    public void clickNumberThree () { numberThree.click(); }

    public void clickMinus () {
        minus.click();
    }

    public void clickNumberFour () {
        numberFour.click();
    }

    public void clickNumberZero () {
        numberZero.click();
    }

    public void chooseDivide () {
        divide.click();
    }

    public void clickNumberFive () {
        numberFive.click();
    }

    public void clickEqual () {
        equal.click();
    }

    public void clickNumberSix () { numberSix.click(); }

    public void clickSineCharacter () { sineCharacter.click(); }

    public String getMemoryStringText(){
        return memoryString.getText();
    }

    public String getResultStringText(){
        return resultString.getText();
    }
}


