package com.proyectofinal.co.definitions;

import com.proyectofinal.co.steps.calculate.CalculateStep;
import com.proyectofinal.co.steps.validations.ValidationStep;
import com.proyectofinal.co.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class CalculatorDef {
    @Steps(shared = true)
    WebSite url;
    @Steps(shared = true)
    CalculateStep calculate;

    @Steps(shared = true)
    ValidationStep validate;

    @Given("el usuario entra al url")
    public void userNavigateTo(){
        url.navigateTo("https://testsheepnz.github.io/BasicCalculator.html#main-body");
    }

    @When("selecciona formulario 2")
    public void userSelectForm2(){
        calculate.selectBuild("2");
        calculate.typeNumber1("3");
        calculate.typeNumber2("7");
        calculate.clickCalculate();
    }

    @Then("mostrar formulario 2")
    public void systemShowAnswer(){
        Assert.assertTrue(validate.txt_answerIsVisible());
    }

    @When("selecciona formulario 9")
    public void userSelectForm9(){
        calculate.selectBuild("9");
        calculate.typeNumber1("3");
        calculate.typeNumber2("7");
        calculate.clickCalculate();
    }

    @Then("montrar formulario 9")
    public void systemShowAnswer9(){
        Assert.assertTrue(validate.txt_answerIsVisible());
    }

    @When("usuario lee los datos de base de datos {word}")
    public void operaciones(String id){
        calculate.selectBuild(calculate.readBD(Integer.parseInt(id),"build"));
        calculate.typeNumber1(calculate.readBD(Integer.parseInt(id),"number1"));
        calculate.typeNumber2(calculate.readBD(Integer.parseInt(id),"number2"));
        calculate.selectOperation(calculate.readBD(Integer.parseInt(id),"operation"));
        calculate.clickCalculate();
    }

    @Then("realizar todas las operaciones guaradadas en bd")
    public void validarOperaciones(){
        Assert.assertTrue(validate.validarOperaciones());
    }


}
