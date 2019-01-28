package com.phraseapp.i18n.dynamiclanguage.resource;

import java.text.MessageFormat;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractMessageSource;
import org.springframework.stereotype.Component;

import com.phraseapp.i18n.dynamiclanguage.entity.LanguageEntity;
import com.phraseapp.i18n.dynamiclanguage.repository.LanguageService;

@Component("messageSource")
public class DBMessageSource extends AbstractMessageSource{
    
    @Autowired
    LanguageService langService;

    @Override
    protected MessageFormat resolveCode(String code, Locale locale) {
        List<LanguageEntity> messages = langService.getAllByLocale(locale.getLanguage());
        return new MessageFormat(messages.get(0).getContent(), locale);
    }

}
