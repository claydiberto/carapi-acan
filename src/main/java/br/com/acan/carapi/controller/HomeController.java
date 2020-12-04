package br.com.acan.carapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HomeController {

    @GetMapping("/")
    public String getHome(){
        return "<h2>Bem vindo ao CAR API</h2><hr /><p>Para acessar a API <a href:/api/car>clique aqui</a></p>";
    }
}
