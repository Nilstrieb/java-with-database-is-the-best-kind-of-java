package ch.bbw.m151.liquibasedemo.datamodel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "comments")
public class CommentEntity {
    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String author;

    @Column
    private String content;

    @ManyToOne
    private ArticleEntity articleId;
}
