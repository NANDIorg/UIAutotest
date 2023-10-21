package org.nandi.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TheNumberGamePage {
    private WebDriver driver;
    WebElement footer;
    Actions actions;
    Select buildSelect;
    WebElement btnRollTheDice;
    WebElement numberGuess;
    WebElement btnCheckNumberGuess;

    WebElement answer;
    WebDriverWait wait;
    public TheNumberGamePage(WebDriver wb) {
        this.driver = wb;
        this.footer = driver.findElement(By.xpath("//*[@id=\"page-top\"]/footer"));
        this.actions = new Actions(driver);
        this.buildSelect = new Select(driver.findElement(By.xpath("//*[@id=\"buildNumber\"]")));
        this.btnRollTheDice = driver.findElement(By.xpath("//*[@id=\"rollDiceButton\"]"));
        this.numberGuess = driver.findElement(By.xpath("//*[@id=\"numberGuess\"]"));
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.btnCheckNumberGuess = driver.findElement(By.xpath("//*[@id=\"submitButton\"]"));

    }

    public void InsertingData(int buildSelectIndex, String numberGuessText) {
        this.actions.moveToElement(this.footer).perform();
        this.buildSelect.selectByIndex(buildSelectIndex);
        this.btnRollTheDice.click();
        wait.until(ExpectedConditions.visibilityOf(this.numberGuess));
        this.numberGuess.sendKeys(numberGuessText);
        btnCheckNumberGuess.click();
        this.wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"feedbackLabel\"]/font/b/i"))));
        this.answer = driver.findElement(By.xpath("//*[@id=\"feedbackLabel\"]/font/b/i"));
    }

    public String getAnswer () { return this.answer.getAttribute("innerText"); }
}
