package com.scriptapp.formbuilder.repositories;

import com.scriptapp.formbuilder.domain.Form;
import org.springframework.data.repository.CrudRepository;

public interface FormRepository extends CrudRepository<Form, Long> { }
