package com.example.note_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.note_api.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note,Long>{
}





