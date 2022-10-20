package Spring.study.Notice_board.service;

import Spring.study.Notice_board.domain.Note;

import java.util.List;

public interface NoteService {
    public Note addNote(Note note);

    public List<Note> getList();

    public Note read(Long idx);

    public void update(Note note);

    public void delete(Long idx);
}
