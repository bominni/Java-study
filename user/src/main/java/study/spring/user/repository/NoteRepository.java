package study.spring.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.spring.user.entity.NoteEntity;

public interface NoteRepository extends JpaRepository<NoteEntity, Long> {
}
