import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Data
@Entity(name = "tb_tasks")
public class TaskModel {



    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    private String description;
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;
    private String priority;


    @CreationTimestamp
    private LocalDateTime createdAt;
    private UUID idUser;
}
