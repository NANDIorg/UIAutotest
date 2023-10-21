package org.nandi;

import org.junit.Assert;
import org.junit.Test;
import org.nandi.pages.TheNumberGamePage;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.nandi.pages.BasicCalculatorPage;


public class AppTest
{
    @Test
    public void DifferenceOfTwoNumbers() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        BasicCalculatorPage basicCalculatorPage = new BasicCalculatorPage(driver);
        basicCalculatorPage.InsertingData(0,2,3,1);
        String answer = basicCalculatorPage.getAnswer();
        driver.quit();
        Assert.assertEquals("-1",answer);
    }

    @Test
    public void ConcatenationOfTwoStrings () {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        BasicCalculatorPage basicCalculatorPage = new BasicCalculatorPage(driver);
        basicCalculatorPage.InsertingData(0,"gs","bu",4);
        String answer = basicCalculatorPage.getAnswer();
        driver.quit();
        Assert.assertEquals("gsbu",answer);
    }

    @Test
    public void AMessageAppearsWhenYouEnterAStringInAField() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testsheepnz.github.io/random-number.html");
        TheNumberGamePage theNumberGamePage = new TheNumberGamePage(driver);
        theNumberGamePage.InsertingData(1, "string");
        String answer = theNumberGamePage.getAnswer();
        driver.quit();
        Assert.assertEquals("string: Not a number!",answer);
    }
}
