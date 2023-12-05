package com.proyectofinal.co.utilities.website;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebSite {
    @Steps(shared = true)
    PageObject calculateW;
    @Step("Navegar al sitio web")
    public void navigateTo(String url){
        calculateW.setDefaultBaseUrl(url);
        calculateW.open();
    }
}
