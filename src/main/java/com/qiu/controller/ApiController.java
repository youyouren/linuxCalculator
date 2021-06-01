package com.qiu.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
public class ApiController{
        
    @PostMapping("/calculator")
    public Float calculator(@RequestBody Map param){
        Float firstNum = Float.valueOf(param.get("firstNum") + "");
        Float secondNum = Float.valueOf(param.get("secondNum") + "");
        String operation = param.get("operation")+ "";
        switch (operation){
            case "+":{
                return firstNum+secondNum;
            }
            case "-":{
                return firstNum-secondNum;
            }
            case "*":{
                return firstNum*secondNum;
            }
            case "/":{
                return firstNum/secondNum;
            }
            default:return -1f;
        }
    }
}