package com.example.saigunasbirbalas.controller;

import com.example.saigunasbirbalas.model.PriceCalculation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MokesciaiController {

    @GetMapping()
    public String showForm() {
        return "form";
    }

    @PostMapping("/calculate")
    public String calculatePrice(@RequestParam double priceWithVat,
                                 @RequestParam int quantity,
                                 Model model) {
        double priceWithoutVat = priceWithVat / 1.21;
        double vatAmount = priceWithVat - priceWithoutVat;
        double totalPriceWithoutVat = priceWithoutVat * quantity;
        double totalVatAmount = vatAmount * quantity;
        double totalPriceWithVat = priceWithVat * quantity;

        PriceCalculation priceCalculation = new PriceCalculation(priceWithoutVat, vatAmount,
                totalPriceWithoutVat, totalVatAmount, totalPriceWithVat, quantity);

        model.addAttribute("priceCalculation", priceCalculation);
        return "result";
    }

}