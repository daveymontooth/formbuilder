package com.scriptapp.formbuilder.services;

import com.scriptapp.formbuilder.domain.Form;

import java.util.List;

public interface IFormService {
    List<Form> findAll();
    Form findById(Long id);
    Form save(Form form);
}
