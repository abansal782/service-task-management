package service.task.management.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.NoArgsConstructor
import javax.persistence.Entity
import javax.persistence.Column
import javax.persistence.Enumerated
import javax.persistence.EnumType
import javax.persistence.Table

@NoArgsConstructor
@Entity
@Table(name = "employee")
data class Employee (

    @Column(name = "employee_name")
    @JsonProperty("employee_name")
    val employeeName: String? = null,

    @Column(name = "employee_email", unique = true)
    @JsonProperty("employee_email")
    val employeeEmail: String? = null,

    @Column(name = "password")
    @JsonProperty("password")
    var password: String? = null,

    @Column(name = "employee_role")
    @Enumerated(EnumType.STRING)
    @JsonProperty("employee_role")
    val employeeRole: Role? = null,

    @Column(name = "phone_no", unique = true)
    @JsonProperty("phone_no")
    var phoneNo: Long? = null,

    @Column(name = "employee_address")
    @JsonProperty("employee_address")
    var employeeAddress: String? = null,

    @Column(name = "pin_code")
    @JsonProperty("pin_code")
    var pinCode: Int? = null,

    @Column(name = "gender")
    @JsonProperty("gender")
    val gender: Gender? = null
) : BaseModel()

enum class Role {
    ADMIN, MANAGER, USER
}

enum class Gender {
    MALE, FEMALE, TRANSGENDER
}