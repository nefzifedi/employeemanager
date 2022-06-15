package tech.gettarrays.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;
@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private long id;
    private String name;
    private String email;
    private String  jobTitle ;
    private  String phone ;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String employeeCode;


    public Employee(){}

    public  Employee(String name , String email,String  jobTitle, String phone,String imageUrl, String employeeCode) {
        this.name=name;
        this.imageUrl=imageUrl;
        this.employeeCode=employeeCode;
        this.email=email;
        this.phone=phone;
        this.jobTitle=jobTitle;


    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    @Override
    public String toString()
    {
        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", phone='" + this.phone + '\''  + ", email='" + this.email + '\'' + ",employeeCode ='" + this.employeeCode +", jobTitle='" + this.jobTitle + '\''  + ", imageUrl='" + this.imageUrl + '\'' +'}';
    }

}
