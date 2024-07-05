package br.com.confidencecambio.javabasico.service.impl;

import br.com.confidencecambio.javabasico.service.ImcService;
import org.springframework.stereotype.Service;

@Service
public class ImcServiceImpl implements ImcService {

    @Override
    public double calcularIMC(double peso, double altura) {
        if (altura <= 0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero");
        }
        return peso / (altura * altura);
    }
}
