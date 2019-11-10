package com.scriptapp.formbuilder.domain;

import javax.persistence.*;

@Entity
@Table(name = "Form")
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String json;

    protected Form() {}

    public Form(String name, String json) {
        this.name = name;
        this.json = json;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJson() {
        return json;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJson(String json) {
        this.json = json;
    }
}
