package com.phraseapp.i18n.dynamiclanguage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phraseapp.i18n.dynamiclanguage.entity.LanguageEntity;

@Repository
public interface LanguageRepository extends JpaRepository<LanguageEntity, Integer>{
    
    List<LanguageEntity> findAllByLocale(String locale);

}
