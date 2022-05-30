package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/caculator")
    public String caculator(@RequestParam int value1, int value2, String value3, Model model){
        if(value3.equals("Addition")){
            int result = value1 + value2;
            model.addAttribute("result1",value3);
            model.addAttribute("result",result);
        } else if (value3.equals("Subtraction")){
            int result = value1 - value2;
            model.addAttribute("result1",value3);
            model.addAttribute("result",result);
        }else if (value3.equals("Multiplication")){
            int result = value1 * value2;
            model.addAttribute("result1",value3);
            model.addAttribute("result",result);
        } else if (value3.equals("Division")){
            int result = value1 / value2;
            model.addAttribute("result1",value3);
            model.addAttribute("result",result);
        }
        return "index";
    }
}
