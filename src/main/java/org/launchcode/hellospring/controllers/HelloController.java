package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
        @GetMapping("hello")
    @ResponseBody
    public String hello (@PathVariable String name){

            return "Hello, " + name + "!";
    }
    @GetMapping("hello/{name}")
    @ResponseBody
    public String helloWithQueryParameter(@PathVariable String name) {
        return "Hello, " + name + "!";

    }
    @GetMapping("form")
    @ResponseBody
    public String helloForm() {
        return "<html>" +
                "<body>" +
                "<form action = 'hello'>" +
                "<input type = 'text' name = 'name'>" +
                "<input type = 'submit' value='Greet me!' >" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("goodbye")
    @ResponseBody
    public String goodbye() {
        return "Good BYE!";
    }
}
//    @RequestMapping(value = "helloGoodbye", method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloGoodBye(){
//        return "Hello, Goodbye";
//    }


