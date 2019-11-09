package com.ksp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ksp.Models.Laptop;
import com.ksp.Repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class MainController {

    @Autowired
    LaptopRepository laptopRepository;

    @GetMapping
    public String start() {
        return "HTML/info";
    }

    @GetMapping("/laptop")
    public String laptop(Model model) {
        Iterable<Laptop> laptops = laptopRepository.findAll();
        model.addAttribute("laptops", laptops);
        return "HTML/table";
    }

    @PostMapping("/laptop")
    public String laptop(@RequestParam String maker,
                         @RequestParam String model,
                         @RequestParam Integer capacity,
                         Model mod) {
        laptopRepository.save(new Laptop(maker,model,capacity));
        Iterable<Laptop> laptops = laptopRepository.findAll();
        mod.addAttribute("laptops", laptops);
        return "HTML/table";
    }
}
