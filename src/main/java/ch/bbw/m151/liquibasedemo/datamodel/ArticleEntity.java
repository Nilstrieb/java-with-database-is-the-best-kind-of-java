package ch.bbw.m151.liquibasedemo.datamodel;
import java.sql.Date;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Version;

@Getter()
@Setter()
@Entity
@Table(name = "articles")
public class ArticleEntity {
    @Id
    @GeneratedValue
    @Column(columnDefinition = "uuid")
    private UUID id;
    @Column(nullable = false)
    String title;
    @Column
    String text;
    @Version
    int version;
    @CreatedDate
    Date createdTs;

    @OneToMany
    private List<CommentEntity> comments;
}