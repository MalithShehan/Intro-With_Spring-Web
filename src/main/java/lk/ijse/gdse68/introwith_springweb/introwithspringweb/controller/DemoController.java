package lk.ijse.gdse68.introwith_springweb.introwithspringweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
    @GetMapping(params = "test=all")
    public String params() {
        return "All are tested";
    }
}