package com.example.project.Liv2Trainapp.entities;

import com.example.project.Liv2Trainapp.models.Auditable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity

public class TrainingCenter extends Auditable<String> {

    //Primary key in table
    @Id
    @NotBlank(message = "Center Code cannot be empty")
    @Pattern(regexp = "[0-9]+[a-z]+[A-Z]" ,message = "Invalid expression")
    @Size(min = 12,max = 12,message = "Not in desired size range")
    private String CenterCode;

    @NotBlank(message = "Center Name cannot be empty")
    @Size(min = 1, max = 40, message = "Not in desired size range")
    private String CenterName;

    @NotBlank(message = "This field cannot be empty")
    private String address;

    @NotBlank(message = "This field cannot be empty")
    private String City;

    @NotBlank(message = "This field cannot be empty")
    private String State;

    @NotBlank(message = "This field cannot be empty")
    private String Pincode;

    private long stuCapacity;

    private String Courses;

    @Email
    private String email;

    @Size(min = 10,max = 10,message = "incorrect size")
    @NotBlank(message = "This field cannot be empty")
    private String Phone;

    //Default constructor
    public TrainingCenter(@NotBlank @Pattern(regexp = "^[\\p{Alnum}]{1,12}$") String centerCode,
                          @NotBlank @Size(min = 1, max = 40) String centerName, String address, String city, String state,
                          String pincode, long stuCapacity, String courses, @Email String email, @NotBlank String phone) {
        super();
        CenterCode = centerCode;
        CenterName = centerName;
        this.address = address;
        City = city;
        State = state;
        Pincode = pincode;
        this.stuCapacity = stuCapacity;
        Courses = courses;
        this.email = email;
        Phone = phone;
    }
    public TrainingCenter() {
        super();

    }

    //Getters and Setters Here
    public String getCenterCode() {
        return CenterCode;
    }
    public void setCenterCode(String centerCode) {
        CenterCode = centerCode;
    }
    public String getCenterName() {
        return CenterName;
    }
    public void setCenterName(String centerName) {
        CenterName = centerName;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return City;
    }
    public void setCity(String city) {
        City = city;
    }
    public String getState() {
        return State;
    }
    public void setState(String state) {
        State = state;
    }
    public String getPincode() {
        return Pincode;
    }
    public void setPincode(String pincode) {
        Pincode = pincode;
    }
    public long getStuCapacity() {
        return stuCapacity;
    }
    public void setStuCapacity(long stuCapacity) {
        this.stuCapacity = stuCapacity;
    }
    public String getCourses() {
        return Courses;
    }
    public void setCourses(String courses) {
        Courses = courses;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return Phone;
    }
    public void setPhone(String phone) {
        Phone = phone;
    }
    @Override
    public String toString() {
        return "TrainingCenter [CenterCode=" + CenterCode + ", CenterName=" + CenterName + ", address=" + address
                + ", City=" + City + ", State=" + State + ", Pincode=" + Pincode + ", stuCapacity=" + stuCapacity
                + ", Courses=" + Courses + ", email=" + email + ", Phone=" + Phone + "]";
    }
}
