package com.proyectofinal.co.steps.validations;

import com.proyectofinal.co.pages.validations.ValidationsPage;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationsPage {
    @Step("Validar si answer se muestra algun valor")
    public Boolean txt_answerIsVisible(){
        String aux = txt_answer.getValue();
        if (aux.isEmpty()){
            return false;
        }else{
            return true;
        }
    }
    @Step("Validar que las operaciones se realicen correctamente")
    public Boolean validarOperaciones(){
        int num1 = Integer.parseInt(txt_number_1.getValue()) ;
        int num2 = Integer.parseInt(txt_number_2.getValue()) ;
        int answer = Integer.parseInt(txt_answer.getValue()) ;
        int operation = Integer.parseInt(txt_answer.getValue()) ;
        if ((num1+num2)==answer && operation==0){
            return true;
        }else{
            if ((num1-num2)==answer && operation==1){
                return true;
            }else{
                if ((num1*num2)==answer && operation==2){
                    return true;
                }else{
                    if ((num1/num2)==answer && operation==3){
                        return true;
                    }else{
                        if ((num1+""+num2).equals(answer+"") && operation==5){
                            return true;
                        }else{
                            return false;
                        }
                    }
                }
            }
        }
    }
    @Step("Validar resta")
    public Boolean validarResta(){
        int num1 = Integer.parseInt(txt_number_1.getValue()) ;
        int num2 = Integer.parseInt(txt_number_2.getValue()) ;
        int answer = Integer.parseInt(txt_answer.getValue()) ;
        if ((num1-num2)==answer){
            return true;
        }else{
            return false;
        }

    }
}
