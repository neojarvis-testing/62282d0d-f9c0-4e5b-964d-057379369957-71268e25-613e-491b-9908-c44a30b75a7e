package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {

    public static By search = By.xpath("//a[@class='button--small button--search']");
    public static By searchbar = By.cssSelector("#search-input");
    public static By result = By.cssSelector("#site-stats-main");
    public static By firstResp = By.cssSelector("#site-hits > div:nth-child(1) > h2 > a > strong");
    public static By verifyResp = By.cssSelector(".hero-content__title");
}
