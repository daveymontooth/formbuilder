package com.scriptapp.formbuilder.controllers;

import com.scriptapp.formbuilder.domain.Form;
import com.scriptapp.formbuilder.services.IFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class FormController {

    @Autowired
    IFormService formService;

    @GetMapping("/forms")
    public List<Form> get() {
        return formService.findAll();
    }

    @GetMapping("/forms/{id}")
    public Form get(@PathVariable("id") Long id) {
        return formService.findById(id);
    }

    @PostMapping("/forms")
    public Form post(@RequestBody Form form) {
        return formService.save(form);
    }

}
