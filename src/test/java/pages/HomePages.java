package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePages {

    public HomePages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Footer // facebook Button
    @FindBy (xpath = "//*[@class='ti-facebook']")
    public WebElement facebook;

}
