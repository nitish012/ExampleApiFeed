package com.example.apifeed;

import android.net.Uri;

public class Data {

//    String id;
//    String employee_name;
//    String employee_age;
//    String employee_salary;
//    String employee_image;
//
//    public Data(String id, String employee_name, String employee_age, String employee_salary, String employee_image) {
//        this.id = id;
//        this.employee_name = employee_name;
//        this.employee_age = employee_age;
//        this.employee_salary = employee_salary;
//        this.employee_image = employee_image;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String age) {
//        this.id = age;
//    }
//
//    public String getEmployee_name() {
//        return employee_name;
//    }
//
//    public void setEmployee_name(String employee_name) {
//        this.employee_name = employee_name;
//    }
//
//    public String getEmployee_age() {
//        return employee_age;
//    }
//
//    public void setEmployee_age(String employee_age) {
//        this.employee_age = employee_age;
//    }
//
//    public String getEmployee_salary() {
//        return employee_salary;
//    }
//
//    public void setEmployee_salary(String employee_salary) {
//        this.employee_salary = employee_salary;
//    }
//
//    public String getEmployee_image() {
//        return employee_image;
//    }
//
//    public void setEmployee_image(String employee_image) {
//        this.employee_image = employee_image;
//    }

    String author;
    String title;
    String description;
    String url;


    public Data(String author, String title, String description, String url) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
