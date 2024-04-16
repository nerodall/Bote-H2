package ru.gb.noteh2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gb.noteh2.model.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {

}
