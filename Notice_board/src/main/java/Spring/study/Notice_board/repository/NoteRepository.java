package Spring.study.Notice_board.repository;

import Spring.study.Notice_board.entity.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<NoteEntity, Long> {
}
