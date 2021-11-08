package co.com.automation.utest.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.utest.com/")
public class UtestPagina extends PageObject {
    public static final Target BOTTON_REGISTRO = Target.the("Join Today").located(By.cssSelector("div.unauthenticated-container div.navbar.navbar-default.navbar-fixed-top.unauthenticated-nav-bar div.unauthenticated-nav-bar__links.navbar-right.hidden-sm.hidden-xs ul.nav.navbar-nav:nth-child(2) li:nth-child(2) > a.unauthenticated-nav-bar__sign-up"));
}
