package BaeSyoon.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello model");
        return "hello";
    }

    @GetMapping("hello_mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("hello_mvc", name);
        return "hello_template";
    }

    @GetMapping("hello_string")
    @ResponseBody
    public String helloString(@RequestParam("name") String name) {
        return "hello_string: " + name;
    }

    @GetMapping("hello_api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name) {
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }

    static class Hello {
        private String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}
