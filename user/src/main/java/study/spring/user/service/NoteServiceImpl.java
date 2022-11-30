package study.spring.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.spring.user.domain.Note;
import study.spring.user.entity.NoteEntity;
import study.spring.user.repository.NoteRepository;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service(value = "noteService")
public class NoteServiceImpl implements NoteService {
    private NoteRepository noteRepository;

    @Autowired
    public void setNoteRepository(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    @Override
    public Note writeNote(Note note) {
        NoteEntity noteEntity = new NoteEntity();
        noteEntity.setTitle(note.getTitle());
        noteEntity.setContent(note.getContent());
        noteEntity.setWriter(note.getWriter());
        noteEntity.setTime(note.getTime());
        noteEntity.setCount(note.getCount());

        noteRepository.save(noteEntity);

        return note;
    }

    @Override
    public List<Note> getList() {
        List<NoteEntity> list = noteRepository.findAll();

        List<Note> result = new ArrayList<>();
        for (NoteEntity item : list) {
            Note note = new Note(item.getTitle(), item.getContent(), item.getWriter(), item.getTime(), item.getCount()
            );

            note.setIdx(item.getIdx());

            result.add(note);
        }

        return result;
    }

    @Override
    public Note read(Long idx) {
        Optional<NoteEntity> optional = noteRepository.findById(idx);

        if(optional.isPresent()) {
            NoteEntity entity = optional.get();
            Note note = new Note(entity.getTitle(),
                    entity.getContent(), entity.getWriter(), entity.getTime(), entity.getCount());

            note.setIdx(entity.getIdx());

            return note;
        } else {
            throw new IllegalArgumentException("잘못된 IDX 입니다.");
        }
    }

    @Override
    public void update(Note note) {
        NoteEntity entity = new NoteEntity(note.getIdx(), note.getTitle(),
                note.getContent(), note.getWriter(), note.getTime(), note.getCount());

        noteRepository.save(entity);
    }

    public void delete(Long idx) {
        noteRepository.deleteById(idx);
    }
}
