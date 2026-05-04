package com.testhymeleaf.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.testhymeleaf.main.Model.Absen;
import com.testhymeleaf.main.Repository.OrangnyaRepo;

@Controller
@RequestMapping("/test")
public class OrangnyaController {

    @Autowired
    private OrangnyaRepo orangnyaRepo;

    @GetMapping
    public String getAllStudents(Model model) {
        Iterable<Absen> absen = orangnyaRepo.findAll();
        model.addAttribute("absenList", absen);

        return "all.html";
    }

    @PostMapping("/add")
    public String addStudent() {
        return "all";
    }
}