package com.utils;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Random;

import static net.serenitybdd.core.Serenity.getDriver;

public class SelectorElements {

    private WebDriver driver;

    public SelectorElements(WebDriver driver){
        this.driver = driver;
    }

    public void bordearElemento(WebElementFacade webLocalizador) {
        ((JavascriptExecutor) getDriver()).executeScript("arguments[0].style.border='4px dashed red'", webLocalizador);
    }

    public void posicionarElemento(WebElementFacade strWebElement) {
        Actions actions=new Actions(getDriver());
        actions.moveToElement(strWebElement).perform();
    }

    public void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static String generarNumeroAleatorio() {
        Random rand = new Random();
        int numeroAleario = rand.nextInt(50) + 1;
        String capturaNumeroAleatorio = Integer.toString(numeroAleario);
        return capturaNumeroAleatorio;
    }
}
