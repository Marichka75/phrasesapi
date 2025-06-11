package com.springbootproject.phrasesapi.service;
import com.springbootproject.phrasesapi.repository.PhraseRepository;


import com.springbootproject.phrasesapi.model.Phrase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhraseServiceImpl implements PhraseService {

    private final PhraseRepository phraseRepository;

    @Autowired
    public PhraseServiceImpl(PhraseRepository phraseRepository) {
        this.phraseRepository = phraseRepository;
    }

    @Override
    public List<Phrase> getAllPhrases() {
        return phraseRepository.findAll();
    }

    @Override
    public Optional<Phrase> getPhraseById(Long id) {
        return phraseRepository.findById(id);
    }

    @Override
    public Phrase createPhrase(Phrase phrase) {
        return phraseRepository.save(phrase);
    }

    @Override
    public Phrase updatePhrase(Long id, Phrase phrase) {
        return phraseRepository.findById(id)
                .map(existingPhrase -> {
                    existingPhrase.setText(phrase.getText());
                    existingPhrase.setAuthor(phrase.getAuthor());
                    return phraseRepository.save(existingPhrase);
                }).orElseThrow(() -> new RuntimeException("Frase no encontrada"));
    }

    @Override
    public void deletePhrase(Long id) {
        phraseRepository.deleteById(id);
    }
}

