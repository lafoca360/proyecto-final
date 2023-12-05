package com.proyectofinal.co.pages.calculator;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import utils.data.AppDB;
import utils.data.ConnectionManagerDB;
import utils.data.QueriesConstants;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import static utils.UtilConstants.*;

// Captura los elementos de nuestra Pagina
public class CalculatorPage extends PageObject{
    @FindBy(id="selectBuild")
    protected WebElementFacade selectBuild;
    @FindBy(id="number1Field")
    protected WebElementFacade txt_number1;
    @FindBy(id="number2Field")
    protected WebElementFacade txt_number2;

    @FindBy(id="selectOperationDropdown")
    protected WebElementFacade operationRest;

    @FindBy(id="calculateButton")
    protected WebElementFacade botonCalculate;



}
