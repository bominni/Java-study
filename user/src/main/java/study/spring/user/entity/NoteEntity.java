package study.spring.user.entity;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "note")
public class NoteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    @Column(length = 100)
    private String title;

    @Column(length = 1000)
    private String content;

    @Column(length = 50)
    private String writer;

    private LocalDateTime time;

    private Long count;

    public NoteEntity() {

    }

    public NoteEntity(Long idx, String title, String content, String writer) {
        this.idx = idx;
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public NoteEntity(Long idx, String title, String content, String writer, LocalDateTime time, Long count) {
        this.idx = idx;
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.time = time;
        this.count = count;
    }
    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
