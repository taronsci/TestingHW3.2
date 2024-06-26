package pages;

import constants.locators.CocokindHomePageConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CocokindHomePage extends BasePage{

    private By searchButton = By.xpath(CocokindHomePageConstants.SEARCHBUTTON);
    private By searchField = By.xpath(CocokindHomePageConstants.SEARCHFIELD);
    private By shadowHost = By.id(CocokindHomePageConstants.SHADOWHOST);
    private By shadowRoot = By.cssSelector(CocokindHomePageConstants.SHADOWROOT);
    private By SearchButton = By.xpath(CocokindHomePageConstants.SEARCHBUTTON2);

    public CocokindHomePage(WebDriver driver){
        super(driver);
    }

    public void search_button(){
        WebElement e = getDriver().findElement(searchButton);
        e.click();
    }

    public void close_Ad(){
        getDriver().findElement(shadowHost).getShadowRoot().findElement(shadowRoot).click();
    }

    public void setSearch(String product){
        search_button();
        getDriver().findElement(searchField).sendKeys(product);
    }

    public SearchResultsPage click_search_button(){
        getDriver().findElement(SearchButton).click();
        return new SearchResultsPage(getDriver());
    }
}
