package com.springbootproject.phrasesapi.service;

import com.springbootproject.phrasesapi.model.Phrase;
import java.util.List;
import java.util.Optional;

public interface PhraseService {
    List<Phrase> getAllPhrases();
    Optional<Phrase> getPhraseById(Long id);
    Phrase createPhrase(Phrase phrase);
    Phrase updatePhrase(Long id, Phrase phrase);
    void deletePhrase(Long id);
}

