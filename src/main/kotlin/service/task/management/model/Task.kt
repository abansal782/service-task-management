package service.task.management.model

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Enumerated
import javax.persistence.EnumType
import javax.persistence.FetchType
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table


@Entity
@Table(name = "task")
data class Task (

    @Column(name = "task_description")
    @JsonProperty("task_description")
    private val taskDescription: String? = null,

    @Column(name = "summary")
    @JsonProperty("summary")
    private val summary: String? = null,

    @Column(name = "is_assigned")
    @JsonProperty("is_assigned")
    private val isAssigned: Boolean? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_assigned_to", referencedColumnName = "id")
    @JsonProperty("assigned_to")
    var assignedTo: Employee? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "task_assigned_by", referencedColumnName = "id")
    @JsonProperty("assigned_by")
    var assignedBy: Employee? = null,

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    @JsonProperty("status")
    private val status: Status? = null,
) : BaseModel()

enum class Status {
    OPEN, IN_PROGRESS, IN_REVIEW, BLOCKED, CLOSED
}