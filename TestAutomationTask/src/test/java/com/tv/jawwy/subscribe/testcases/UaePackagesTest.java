package com.tv.jawwy.subscribe.testcases;

import com.tv.jawwy.subscribe.base.BaseTest;
import com.tv.jawwy.subscribe.pages.PackagesPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UaePackagesTest extends BaseTest {
    @Test
    public void CheckPackage1Info(){

       //Loading the site and Select Country >>>builder pattern
       PackagesPage packagesPage =new PackagesPage(driver);
       packagesPage.load().ChangeCountry("ae-contry-lable");

        //check package1 name
        String pck1 = packagesPage.checkPackageName("name-لايت").getText();
        Assert.assertEquals(pck1,"لايت");
       // Check Package1 Currency
        String currency1= packagesPage.CheckCurrency("//div[@id='currency-لايت']/i").getText();
        Assert.assertEquals(currency1,"دولار أمريكي/شهر");

        //Check Package1 Price
        String pk1Price = packagesPage.CheckPrice("//div[@id='currency-لايت']/b").getText();
        Assert.assertEquals(pk1Price , "5.4");

}


    @Test
    public void CheckPackage2Info(){

        //Loading the site and Select Country >>>builder pattern
        PackagesPage packagesPage =new PackagesPage(driver);
        packagesPage.load().ChangeCountry("ae-contry-lable");

        //check package2 name
        String pck1 = packagesPage.checkPackageName("name-الأساسية").getText();
        Assert.assertEquals(pck1,"الأساسية");
        // Check Package12Currency
        String currency1= packagesPage.CheckCurrency("//div[@id='currency-الأساسية']/i").getText();
        Assert.assertEquals(currency1,"دولار أمريكي/شهر");

        //Check Package2 Price
        String pk1Price = packagesPage.CheckPrice("//div[@id='currency-الأساسية']/b").getText();
        Assert.assertEquals(pk1Price , "10.9");

    }
    @Test
    public void CheckPackage3Info(){

        //Loading the site and Select Country >>>builder pattern
        PackagesPage packagesPage =new PackagesPage(driver);
        packagesPage.load().ChangeCountry("ae-contry-lable");

        //check package3 name
        String pck1 = packagesPage.checkPackageName("name-بريميوم").getText();
        Assert.assertEquals(pck1,"بريميوم");
        // Check Package3 Currency
        String currency1= packagesPage.CheckCurrency("//div[@id='currency-بريميوم']/i").getText();
        Assert.assertEquals(currency1,"دولار أمريكي/شهر");

        //Check Package3 Price
        String pk1Price = packagesPage.CheckPrice("//div[@id='currency-بريميوم']/b").getText();
        Assert.assertEquals(pk1Price , "16.3");

    }

}
