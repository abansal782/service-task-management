package service.task.management.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.MappedSuperclass;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
public class BaseModel {

    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    @Id
    private UUID id;

    @Column(name = "ip_address")
    @JsonProperty("ip_address")
    private String ipAddress;

    @Column(name = "device_id")
    @JsonProperty("device_id")
    private String deviceId;

    @Column(name = "created_at")
    @JsonProperty("created_at")
    private Long createdAt;

    @Column(name = "created_by")
    @JsonProperty("created_by")
    private String createdBy;

    @Column(name = "updated_at")
    @JsonProperty("updated_at")
    private Long updatedAt;

    @Column(name = "updated_by")
    @JsonProperty("updated_by")
    private String updatedBy;
}
