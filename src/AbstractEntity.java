import java.time.LocalDateTime;
import java.util.UUID;

public abstract class AbstractEntity {
    private String id;
    private LocalDateTime createdAt;

    public AbstractEntity() {
        this.id = UUID.randomUUID().toString();
        this.createdAt = LocalDateTime.now();
    }
}
