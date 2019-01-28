package com.phraseapp.i18n.dynamiclanguage.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phraseapp.i18n.dynamiclanguage.entity.LanguageEntity;

@Service
public class LanguageService {
    
    @Autowired
    LanguageRepository languageRepository;
    
    public List<LanguageEntity> getAllLanguages(){
        return languageRepository.findAll();
    }
    
    public List<LanguageEntity> getAllByLocale(String locale){
        return languageRepository.findAllByLocale(locale);
    }
}
