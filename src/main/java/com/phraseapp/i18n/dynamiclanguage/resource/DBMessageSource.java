package com.phraseapp.i18n.dynamiclanguage.resource;

import java.text.MessageFormat;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractMessageSource;
import org.springframework.stereotype.Component;

import com.phraseapp.i18n.dynamiclanguage.entity.LanguageEntity;
import com.phraseapp.i18n.dynamiclanguage.repository.LanguageRepository;

@Component("messageSource")
public class DBMessageSource extends AbstractMessageSource {

	@Autowired
	private LanguageRepository languageRepository;

	@Override
	protected MessageFormat resolveCode(String code, Locale locale) {
		LanguageEntity message = languageRepository.findByKeyAndLocale(code,locale.getLanguage());
		if (message != null) {
			return new MessageFormat(message.getContent(), locale);
		}
		return new MessageFormat("", locale);
	}

}
