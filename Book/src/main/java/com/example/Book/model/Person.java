package com.example.Book.model;

import java.time.LocalDate;
import java.util.List;

public class Person {
    private String name;
    private Integer age;
    private Integer sex;
    private boolean isMarried;
    private LocalDate createTime;
    private List<String> language;

    public Person(List<String> language, LocalDate createTime, boolean isMarried, Integer sex, String name, Integer age) {
        this.language = language;
        this.createTime = createTime;
        this.isMarried = isMarried;
        this.sex = sex;
        this.name = name;
        this.age = age;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getLanguage() {
        return language;
    }

    public void setLanguage(List<String> language) {
        this.language = language;
    }

    public LocalDate getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDate createTime) {
        this.createTime = createTime;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}