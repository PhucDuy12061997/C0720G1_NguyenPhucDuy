package services.impl;

import org.springframework.stereotype.Service;
import services.Calculator;
@Service
public class CalculatorImpl implements Calculator {
    @Override
    public double calculator(double so1, double so2, String boNho) {
        switch (boNho){
            case "+":
                return so1+so2;

            case "-":
                return  so1-so2;

            case "*":
                return so1*so2;
            case "/":
                if(so2!=0)
                    return so1/so2;
                else
                    throw new RuntimeException("\n" +
                            "không thể chia hết");
            default:
                throw new RuntimeException("\n" +
                        "giá trị không hợp lệ");

        }
    }
}
