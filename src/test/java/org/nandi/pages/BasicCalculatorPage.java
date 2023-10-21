package org.nandi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasicCalculatorPage {
    private WebDriver driver;
    WebElement footer;
    Actions actions;
    Select buildSelect;
    WebElement firstNumber;
    WebElement secondNumber;
    Select operationSelect;
    WebElement btnCalculate;
    WebElement answer;



    public BasicCalculatorPage (WebDriver wb) {
        this.driver = wb;
        this.footer = driver.findElement(By.xpath("//*[@id=\"page-top\"]/footer"));
        this.actions = new Actions(driver);
        this.buildSelect = new Select(driver.findElement(By.xpath("//*[@id=\"selectBuild\"]")));
        this.firstNumber = driver.findElement(By.xpath("//*[@id=\"number1Field\"]"));
        this.secondNumber = driver.findElement(By.xpath("//*[@id=\"number2Field\"]"));
        this.operationSelect = new Select(driver.findElement(By.xpath("//*[@id=\"selectOperationDropdown\"]")));
        this.btnCalculate = driver.findElement(By.xpath("//*[@id=\"calculateButton\"]"));
        this.answer = driver.findElement(By.xpath("//*[@id=\"numberAnswerField\"]"));
    }


    public void InsertingData (int buildSelectIndex, int firstNumber, int secondNumber, int operationSelectIndex) {
        this.actions.moveToElement(this.footer).perform();
        this.buildSelect.selectByIndex(buildSelectIndex);
        this.firstNumber.sendKeys(Integer.toString(firstNumber));
        this.secondNumber.sendKeys(Integer.toString(secondNumber));
        this.operationSelect.selectByIndex(operationSelectIndex);
        this.btnCalculate.click();
    }
    public void InsertingData (int buildSelectIndex, String firstString, String secondString, int operationSelectIndex) {
        this.actions.moveToElement(this.footer).perform();
        this.buildSelect.selectByIndex(buildSelectIndex);
        this.firstNumber.sendKeys(firstString);
        this.secondNumber.sendKeys(secondString);
        this.operationSelect.selectByIndex(operationSelectIndex);
        this.btnCalculate.click();
    }

    public String getAnswer () {
        return this.answer.getAttribute("value");
    }

}
