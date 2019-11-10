package com.scriptapp.formbuilder.services;

import com.scriptapp.formbuilder.domain.Form;
import com.scriptapp.formbuilder.repositories.FormRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FormService implements IFormService {

    @Autowired
    private FormRepository repository;

    @Override
    public List findAll() {
        return (List<Form>) repository.findAll();
    }

    @Override
    public Form findById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Form save(Form form) {
        return repository.save(form);
    }

}
