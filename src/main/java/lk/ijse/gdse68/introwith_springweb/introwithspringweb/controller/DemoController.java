package lk.ijse.gdse68.introwith_springweb.introwithspringweb.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/demo")
@RestController
public class DemoController {
    @GetMapping(value = "/health")
    public String healthCheck() {
        return "DemoController run perfectly";
    }
    @GetMapping(value = "/patternRegex/{id:C\\d{3}}")
    public String pathvariableWithRegex(@PathVariable("id") String id) {
        return "DemoController run perfectly with :"+id;
    }
    @GetMapping(value = "/patternRegex/{id:C\\d{3}}",headers = "X-number")
    public String pathvariableWithRegexAndHeader(@PathVariable("id") String id, @RequestHeader("X-number") int num) {
        return "Path variable is :"+id + " and Header is :"+num;
    }
    @GetMapping(params = "test=all")
    public String params() {
        return "All are tested";
    }

    @PostMapping(params = {"name","quantity"})
    public String paramData(@RequestParam("name") String param01,@RequestParam ("quantity") String param02) {
        return "Param data are "+ param01 + " and " + param02;
    }
}