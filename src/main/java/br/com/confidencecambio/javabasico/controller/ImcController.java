package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.service.ImcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImcController {

    @Autowired
    private ImcService imcService;

    @GetMapping("/calcularIMC")
    public double calcularIMC(@RequestParam double peso, @RequestParam double altura) {
        return imcService.calcularIMC(peso, altura);
    }
}
