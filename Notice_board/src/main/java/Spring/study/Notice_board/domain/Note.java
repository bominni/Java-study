package Spring.study.Notice_board.domain;

import java.time.LocalDateTime;

public class Note {
    private Long idx;

    private String title;

    private String content;

    private String writer;

    private LocalDateTime time;

    private Long count;


    public Note(String title, String content, String writer) {
        this.title = title;
        this.content = content;
        this.writer = writer;
    }

    public Note(String title, String content, String writer, LocalDateTime time, Long count){
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.time = time;
        this.count = count;
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

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
