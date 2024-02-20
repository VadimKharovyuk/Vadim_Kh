package com.example.vadim_kh.controller;

import com.example.vadim_kh.model.Customer;
import com.example.vadim_kh.repositoty.CustomerREpo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class MainController {
    private final CustomerREpo  customerREpo ;
    @GetMapping("/")
    public String main(Model model){
        model.addAttribute("list",customerREpo.findAll());
        return "main";
    }
    @PostMapping("/")
    public String save(Customer customer){
        customerREpo.save(customer);
        return "redirect:/";
    }
    @PostMapping("/{id}")
    public String deletebyId(@PathVariable ("id") Long id){
        customerREpo.deleteById(id);
        return "redirect:/";
    }

}
