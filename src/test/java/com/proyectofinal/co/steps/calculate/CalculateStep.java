package com.proyectofinal.co.steps.calculate;

import com.proyectofinal.co.pages.calculator.CalculatorPage;
import net.thucydides.core.annotations.Step;
import utils.data.AppDB;
import utils.data.ConnectionManagerDB;
import utils.data.QueriesConstants;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

import static utils.UtilConstants.*;

public class CalculateStep extends CalculatorPage {

    // son los pasos que realiza nuestra calculadora---
    @Step("Seleccionar build")
    public void selectBuild(String build){
        selectBuild.sendKeys(build);
    }
    @Step("Ingresar numero 1")
    public void typeNumber1(String number1){
        txt_number1.sendKeys(number1);
    }
    @Step("Ingresar numero 2")
    public void typeNumber2(String number2){
        txt_number2.sendKeys(number2);
    }

    @Step("Selecciona Operacion")
    public void selectOperation(String opcion){
        operationRest.sendKeys(opcion);
    }
    @Step("Click en calculate")
    public void clickCalculate(){
        botonCalculate.click();
    }

    // metodos de busqueda en base de datos
    @Step("Sacar de bd los valores por codigo id")
    public String readBD(Integer id,String campo){

        ResultSet resultSet;
        HashMap<String,String> hashMap;
        try {
            Connection connection = ConnectionManagerDB.util().crearConexionMySql(MYSQL_URL,MYSQL_USER,MYSQL_PASSWORD);
            resultSet = AppDB.executeSelect(String.format("select * from calculator where codigo="+id),connection);
            hashMap = (HashMap<String, String>) AppDB.fillHashWithResultSetRecord(resultSet);
            ConnectionManagerDB.util().closeConnection(connection);
        } catch (SQLException e) {
            throw new RuntimeException("error obteniendo valor de la base de datos, mensaje: " + e.getMessage());
        }
        return hashMap.get(campo);
    }
}
