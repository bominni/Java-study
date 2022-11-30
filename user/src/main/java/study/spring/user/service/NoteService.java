package study.spring.user.service;

import study.spring.user.domain.Note;

import java.util.List;

public interface NoteService {
    public Note writeNote(Note note);

    public List<Note> getList();

    public Note read(Long idx);

    public void update(Note note);

    public void delete(Long idx);
}
