package uistore;

import org.openqa.selenium.By;

public class HomePageLocators {

    //TestCase 05[Rewa]

    public static By healthLibrary_diseaseAndCondition = By.cssSelector("[title='Diseases & Conditions']");
    public static By healthLibrary_diseaseAndConditionNew = By.cssSelector("h1[class='page-header__title lede']");

    public static By healthLibrary_diagnosticsAndTesting = By.cssSelector("[href='/health/diagnostics']");
    public static By healthLibrary_diagnosticsAndTestingNew = By.cssSelector("h1[class='page-header__title lede']");

    public static By healthLibrary_treatmentsAndProcedure = By.cssSelector("[href='/health/treatments']");
    public static By healthLibrary_treatmentsAndProcedureNew = By.cssSelector("h1[class='page-header__title lede']");
    
    public static By healthLibrary_bodySystemsAndOrgans= By.cssSelector("[href='/health/body']");
    public static By healthLibrary_bodySystemsAndOrgansNew= By.cssSelector("h1[class='page-header__title lede']");
    
    public static By healthLibrary_drugsDevicesSupplements= By.cssSelector("[href='/health/drugs']");
    public static By healthLibrary_drugsDevicesSupplementsNew= By.cssSelector("h1[class='page-header__title lede']");
    
    public static By healthLibrary_titleHealth = By.cssSelector("div[class='care-widget__title js-care-widget__title']");
    
    ///// TestCase 06[Rewa]
    
   public static By forProviders_joinOurNursingTeam= By.xpath("//h3[@id='join-our-nursing-tea']");
    
    public static By forProviders_nursingAtCleveland= By.cssSelector("[href='https://jobs.clevelandclinic.org/nursing/']");
    public static By forProviders_nursingAtClevelandNew=By.cssSelector("span[class='sitettl']"); 

    
    public static By forProviders_careers= By.xpath("//h3[@id='careers']");
    
    public static By forProviders_findYourCareer= By.xpath("//a[contains(text(),'Find your career')]");
    
    public static By forProviders_referPatient= By.xpath("//h3[@id='refer-a-patient']");
    
    public static By forProviders_referringPhysician= By.xpath("//a[contains(text(),'Referring Physician team')]");
    
    public static By forProviders_consultQd= By.id(("consultqd"));
    
    public static By forProviders_siteForPhysician= By.cssSelector("[href='https://consultqd.clevelandclinic.org/']");
    
    public static By forProviders_education= By.id(("education"));
    
    public static By forProviders_trainingAndEducation = By.cssSelector("[href='/departments/education']");



}
