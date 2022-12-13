package com.orangehrmlive.sw.testbase;


//import com.herokuapp.internet.propertyreader.PropertyReader;
//import com.herokuapp.internet.utility.Utility;

import com.orangehrmlive.sw.propertyreader.PropertyReader;
import com.orangehrmlive.sw.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        closeBrowser();
    }

}
