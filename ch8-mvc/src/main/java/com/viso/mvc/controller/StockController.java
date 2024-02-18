package com.viso.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.viso.mvc.model.Stock;
import com.viso.mvc.model.StockSymbol;
import com.viso.mvc.service.StockServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/stocks")
public class StockController {
    @Autowired
    private StockServiceImpl stockService;

    @GetMapping
    private String getStocks(Model model) {
        List<Stock> stocks = stockService.getAllStocks();
        model.addAttribute("stocks", stocks);
        model.addAttribute("stockSymbol", new StockSymbol());
        return "stocks";
    }
}
