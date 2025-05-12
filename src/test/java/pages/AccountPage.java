package pages;

import org.openqa.selenium.By;
import utils.BasePage;


public class AccountPage extends BasePage {

    public AccountPage() {
        super(By.xpath("//a[contains(@class,'is-home')]"), "Account");
    }

}
