package service.task.management.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import java.util.UUID;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Getter
@Setter
@Table(name="task")
public class Task {

    public enum Status {
        OPEN,
        IN_PROGRESS,
        IN_REVIEW,
        BLOCKED,
        CLOSED
    }

    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    @Id
    private UUID id;

    @Column(name="task_description")
    @JsonProperty("task_description")
    private String taskDescription;

    @Column(name = "summary")
    @JsonProperty("summary")
    private String summary;

    @Column(name="is_active")
    @JsonProperty("is_active")
    private Boolean isActive;

    @Column(name="is_assigned")
    @JsonProperty("is_assigned")
    private Boolean isAssigned;

    @Column(name="assigned")
    @JsonProperty("assigned")
    private UUID assigned;

    @Column(name="assigned_by")
    @JsonProperty("assigned_by")
    private UUID assignedBy;

    @Column(name="status")
    @Enumerated(EnumType.STRING)
    @JsonProperty("status")
    private Status status;

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
