package com.phraseapp.i18n.dynamiclanguage.repository;

import java.util.List;
import java.util.Map;

import com.phraseapp.i18n.dynamiclanguage.entity.LanguageEntity;

public interface LanguageServiceInf {
	
	public List<LanguageEntity> getAllByLocale(String locale);
	
	public Map<String,String> getAllMessageByLocale(String locale);
}
