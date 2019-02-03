package com.phraseapp.i18n.dynamiclanguage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.phraseapp.i18n.dynamiclanguage.entity.LanguageEntity;

@Repository
public interface LanguageRepository extends JpaRepository<LanguageEntity, Integer> {
	
	LanguageEntity findByKeyAndLocale(String key, String locale);

}
