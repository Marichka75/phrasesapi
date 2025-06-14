package com.springbootproject.phrasesapi.repository;

import com.springbootproject.phrasesapi.model.Phrase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhraseRepository extends JpaRepository<Phrase, Long> {
}


