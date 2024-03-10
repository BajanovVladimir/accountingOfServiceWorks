package ru.bazhanov.contacts.dto;

public class OrganizationDTO {
    private String name;
    private String city;
    OrganizationDTO(){
    }
    public String getName(){
        return this.name;
    }
    public  String getCity(){
        return this.city;
    }
    public  void setName(String name){
        this.name = name;
    }
    public void setCity(String city){
        this.city = city;
    }
}
