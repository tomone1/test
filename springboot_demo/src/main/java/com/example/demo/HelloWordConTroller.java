package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author tom
 * @Date 2018/1/31 16:56
 */
@Controller
public class HelloWordConTroller {
  @GetMapping("/")
  @ResponseBody
  public String index(){
     return "helloword";
   }
}
