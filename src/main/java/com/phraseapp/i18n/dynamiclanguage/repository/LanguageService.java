package com.phraseapp.i18n.dynamiclanguage.repository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phraseapp.i18n.dynamiclanguage.entity.LanguageEntity;

@Service
public class LanguageService implements LanguageServiceInf {

	@Autowired
	private LanguageRepository languageRepository;

	public List<LanguageEntity> getAllLanguages() {
		return languageRepository.findAll();
	}

	public List<LanguageEntity> getAllByLocale(String locale) {
		return languageRepository.findAllByLocale(locale);
	}

	@Override
	public Map<String, String> getAllMessageByLocale(String locale) {
		List<LanguageEntity> langList = this.getAllByLocale(locale);
		return langList.stream().collect(Collectors.toMap(x -> x.getKey(), x -> x.getContent()));
	}
}
