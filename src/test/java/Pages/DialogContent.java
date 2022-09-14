package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogContent extends Parent {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Create an Account")
    private WebElement registerBtn;

    @FindBy(id = "firstname")
    private WebElement firstname;

    @FindBy(id = "lastname")
    private WebElement lastname;

    @FindBy(id = "email_address")
    private WebElement emailAdress;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "password-confirmation")
    private WebElement passwordConfirm;

    @FindBy(xpath = "//span[text()='Create an Account']")
    private WebElement createBtn;

    @FindBy(xpath = "//*[contains(text(),'Thank')]")
    private WebElement success;

    @FindBy(css = "[class='authorization-link']>a")
    private WebElement signIn;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "pass")
    private WebElement pass;

    @FindBy(css = "[id='send2']>span")
    private WebElement signIn2;

    @FindBy(xpath = "//span[contains(text(),'Welcome')]")
    private WebElement welcome;


    @FindBy(id = "telephone")
    private WebElement telephone;

    @FindBy(id = "street_1")
    private WebElement street;

    @FindBy(id = "city")
    private WebElement city;

    @FindBy(id = "zip")
    private WebElement zip;

    @FindBy(id = "country")
    private WebElement country;

    @FindBy(xpath = "//option[text()='Turkey']")
    private WebElement turkey;

    @FindBy(css = "button[data-action='customer-menu-toggle']")
    private WebElement customerButton;

    @FindBy(linkText = "My Account")
    private WebElement myaccountButton;

    @FindBy(linkText = "Manage Addresses")
    private WebElement manageButton;

    @FindBy(css = "button[role='add-address']")
    private WebElement addNewAdd;

    @FindBy(css = "[class='messages']>div>div")
    private WebElement saved;

    @FindBy(id = "form-validate")
    private WebElement space;

    @FindBy(css = "button[data-action='save-address']")
    private WebElement saveButton;


    @FindBy(xpath = "//div[text()='L']")
    private WebElement sizeButton;

    @FindBy(css = "div[id='option-label-color-93-item-56']")
    private WebElement colorButton;

    @FindBy(css = "[id='product-addtocart-button']")
    private WebElement addcartButton;

    @FindBy(css = "[data-block=minicart]>a")
    private WebElement shopcartButton;

    @FindBy(css = "[id='top-cart-btn-checkout']")
    private WebElement proceedcButton;

    @FindBy(xpath = "//button[@data-role='opc-continue']/span")
    private WebElement nextButton;

    @FindBy(css = "button[class='action primary checkout'][type='submit']")
    private WebElement placeoButton;

    @FindBy(css = " span[data-ui-id='page-title-wrapper']")
    private WebElement purchase;

    @FindBy(xpath = "(//img[@class='product-image-photo'])[1]")
    private WebElement productButton;


    WebElement myElement;

    public void findAndSend(String strElement, String value) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "firstname":
                myElement = firstname;
                break;
            case "lastname":
                myElement = lastname;
                break;
            case "emailAdress":
                myElement = emailAdress;
                break;
            case "password":
                myElement = password;
                break;
            case "passwordConfirm":
                myElement = passwordConfirm;
                break;
            case "email":
                myElement = email;
                break;
            case "pass":
                myElement = pass;
                break;
            case "telephone":
                myElement = telephone;
                break;
            case "street":
                myElement = street;
                break;
            case "city":
                myElement = city;
                break;
            case "zip":
                myElement = zip;
                break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement) {  // 2.aşama
        // burda string isimden weblemente ulaşıcam
        switch (strElement) {
            case "registerBtn":
                myElement = registerBtn;
                break;
            case "createBtn":
                myElement = createBtn;
                break;
            case "signIn":
                myElement = signIn;
                break;
            case "signIn2":
                myElement = signIn2;
                break;
            case "customerButton":
                myElement = customerButton;
                break;
            case "myaccountButton":
                myElement = myaccountButton;
                break;
            case "manageButton":
                myElement = manageButton;
                break;
            case "addNewAdd":
                myElement = addNewAdd;
                break;
            case "country":
                myElement = country;
                break;
            case "turkey":
                myElement = turkey;
                break;
            case "space":
                myElement = space;
                break;
            case "saveButton":
                myElement = saveButton;
                break;

            case "sizeButton":
                myElement = sizeButton;
                break;
            case "colorButton":
                myElement = colorButton;
                break;
            case "addcartButton":
                myElement = addcartButton;
                break;
            case "shopcartButton":
                myElement = shopcartButton;
                break;
            case "proceedcButton":
                myElement = proceedcButton;
                break;
            case "nextButton":
                myElement = nextButton;
                break;
            case "placeoButton":
                myElement = placeoButton;
                break;
            case "productButton":
                myElement = productButton;
                break;
        }

        if (myElement == turkey || myElement == proceedcButton || myElement == nextButton)
            GWD.Bekle(2);
        clickFunction(myElement);

    }

    public void findAndContainsText(String strElement, String text) {
        switch (strElement) {
            case "success":
                myElement = success;
                break;
            case "welcome":
                myElement = welcome;
                break;
            case "saved":
                myElement = saved;
                break;
            case "purchase":
                myElement = saved;
                break;
        }
        verifyContainsText(myElement, text);
    }
}
