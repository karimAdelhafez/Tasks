package com.tv.jawwy.subscribe.pages;

import com.tv.jawwy.subscribe.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PackagesPage extends BasePage {

    public PackagesPage(WebDriver driver){
        super(driver);
    }

   @FindBy(className = "country-current")
    protected WebElement changeCountryButton;
    @FindBy(id="country-selct")
    protected WebElement selectCountry;
    @FindBy(css = "#main > .container")
    protected WebElement container;

    public PackagesPage load() {
        driver.get("https://subscribe.jawwy.tv/");
        return this;

    }

    public WebElement ChangeCountry(String country){
    changeCountryButton.click();
    WebElement countryA = selectCountry.findElement(By.id(country));
    countryA.click();
    return countryA;

}

    public WebElement CheckCurrency(String currency){

        WebElement currencyvalue = container.findElement(By.xpath(currency));
        return currencyvalue;

    }
    public WebElement CheckPrice(String price){

        WebElement pricevalue = container.findElement(By.xpath(price));
        return pricevalue;

    }


public WebElement checkPackageName(String pckName){
    WebElement packageName= container.findElement(By.id(pckName));
    return packageName;

}
}

