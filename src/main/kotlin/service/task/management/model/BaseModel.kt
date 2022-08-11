package service.task.management.model

import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.annotations.GenericGenerator
import javax.persistence.MappedSuperclass
import javax.persistence.Column
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@MappedSuperclass
open class BaseModel(
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "uuid2")
    @Column(name = "id", updatable = false, nullable = false)
    @Id
    val id: String? = null,

    @Column(name = "ip_address")
    @JsonProperty("ip_address")
    var ipAddress: String? = null,

    @Column(name = "device_id")
    @JsonProperty("device_id")
    var deviceId: String? = null,

    @Column(name = "created_at")
    @JsonProperty("created_at")
    var createdAt: Long? = null,

    @Column(name = "created_by")
    @JsonProperty("created_by")
    var createdBy: String? = null,

    @Column(name = "updated_at")
    @JsonProperty("updated_at")
    var updatedAt: Long? = null,

    @Column(name = "updated_by")
    @JsonProperty("updated_by")
    var updatedBy: String? = null
)
