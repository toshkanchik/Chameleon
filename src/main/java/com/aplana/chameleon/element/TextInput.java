package com.aplana.chameleon.element;

import com.aplana.chameleon.elements.selenium.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextInput extends WebElementFacade {
    public TextInput(WebElement element, String elementName, int waitTimeOut, String driverId) {
        super(element, elementName, waitTimeOut, driverId);
    }

    @Override
    public String getPlaceholder() {
        getDriver().executeScript("return arguments[0].scrollIntoView(false)", getWrappedElement());
        return getWrappedElement().findElement(By.xpath("./../..//*[contains(@data-marker, 'Error')]")).getText();
    }

    @Override
    public String getErrorMsg() {
        return null;
    }

    @Override
    public String getLabel() {
        return null;
    }
}
