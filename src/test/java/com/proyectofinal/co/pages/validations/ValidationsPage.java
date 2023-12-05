package com.proyectofinal.co.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationsPage extends PageObject {
// captura los elementos para validar.
    @FindBy(id = "numberAnswerField")
    protected WebElementFacade txt_answer;

    @FindBy(id = "number1Field")
    protected WebElementFacade txt_number_1;

    @FindBy(id = "number2Field")
    protected WebElementFacade txt_number_2;
}
