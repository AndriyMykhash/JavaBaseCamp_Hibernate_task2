package com.representation;

import javax.persistence.*;

@Entity
@Table(name = "workers")
public class Workers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "age")
    private Long age;

    @Column(name = "department_id")
    private Long department_id;

    @Column(name = "full_name")
    private String full_name;

    @Enumerated(EnumType.STRING)
    @Column(name = "availability")
    private com.representation.Availability availability;

    public Workers() {
    }

    public Workers(Long age, Long department_id, String full_name, com.representation.Availability availability) {
        this.age = age;
        this.department_id = department_id;
        this.full_name = full_name;
        this.availability = availability;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    public Long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public com.representation.Availability getAvailability() {
        return availability;
    }

    public void setAvailability(com.representation.Availability availability) {
        this.availability = availability;
    }
}