package com.example.barbershop.web;

import com.example.barbershop.model.Record;
import com.example.barbershop.repository.RecordRepository;
import com.example.barbershop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    RecordRepository recordRepository;


    @GetMapping()
    public String userRecords(Model model) {

        List<Record> list = recordRepository.findAll();

        model.addAttribute("records", list);

        return "admin";
    }

    @GetMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        recordRepository.deleteById(id);
        return "redirect:/admin";
    }
}
