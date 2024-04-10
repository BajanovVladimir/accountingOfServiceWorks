package ru.bazhanov.contacts.dto;




public class ContactDTO {
    private Integer organizationID;
    private String lastName;
    private String firstName;
    private String patronymic;
    private String phone;
    private String email;



    public ContactDTO(){};
    public ContactDTO(Integer organizationID, String lastName, String firstName, String patronymic, String phone, String email){
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.phone = phone;
        this.email = email;
        this.organizationID = organizationID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getOrganizationID() {
        return this.organizationID;
    }

    public void setOrganizationID(Integer id) {
        this.organizationID = id;
    }
}
