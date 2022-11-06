package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    // Responds to /hello?name=LaunchCode
    @RequestMapping(value = "hello", method = {RequestMethod.GET,RequestMethod.POST})
    @ResponseBody
    public String hello(@RequestParam String name) {
        return "Hello, II + name";
    }
    // Responds to /hello/LaunchCode
    @GetMapping( "hello/{name}")
    @ResponseBody
    public String helloAgain(@PathVariable String name) {
        return "Hello, в + name +";
    }
    @GetMapping( "form")
    public String helloForm() {
        return "form";
    }
}


//    @PostMapping("goodbye")
//    @ResponseBody
//    public String goodbye() {
//        return "Good BYE!";
//    }
//}
//    @RequestMapping(value = "helloGoodbye", method = {RequestMethod.GET, RequestMethod.POST})
//    public String helloGoodBye(){
//        return "Hello, Goodbye";
//    }


