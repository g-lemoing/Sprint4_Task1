package cat.itacademy.s04.t01.n01.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    final String DEFAULT_NAME = "UNKNOWN";

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = DEFAULT_NAME) String nom){
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }

    @RequestMapping(value = {"/HelloWorld2", "/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(required = false) String nom){
        nom = nom == null ? DEFAULT_NAME : nom ;
        return "Hola, " + nom + ". Estàs executant un projecte Maven";
    }
}
