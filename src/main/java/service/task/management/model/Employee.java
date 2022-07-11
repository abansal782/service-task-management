package service.task.management.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name="employee")
public class Employee extends BaseModel {

    enum Role {
        ADMIN,
        MANAGER,
        USER
    }

    enum Gender {
        MALE,
        FEMALE,
        TRANSGENDER
    }

    @Column(name="employee_name")
    @JsonProperty("employee_name")
    private String employeeName;

    @Column(name = "employee_email")
    @JsonProperty("employee_email")
    private String employeeEmail;

    @Column(name = "password")
    @JsonProperty("password")
    private String password;

    @Column(name = "employee_role")
    @Enumerated(EnumType.STRING)
    @JsonProperty("employee_role")
    private Role employeeRole;

    @Column(name = "phone_no")
    @JsonProperty("phone_no")
    private Long phoneNo;

    @Column(name = "employee_address")
    @JsonProperty("employee_address")
    private String employeeAddress;

    @Column(name = "pin_code")
    @JsonProperty("pin_code")
    private int pinCode;

    @Column(name = "gender")
    @JsonProperty("gender")
    private Gender gender;
}
