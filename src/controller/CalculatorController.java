package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {
    @GetMapping("/calculator")
    public String getCalculator() {
        return "calculator";
    }

    @PostMapping("/calculator")
    public String showResult (@RequestParam ("number1") int number1, @RequestParam ("number2") int number2,
                                    @RequestParam ("operator") String operator, Model model ) {
        int result;
        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        model.addAttribute("result", result);
        return "calculator";
    }
}
