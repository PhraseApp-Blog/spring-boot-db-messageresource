package com.phraseapp.i18n.dynamiclanguage.resource;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractMessageSource;
import org.springframework.stereotype.Component;

import com.phraseapp.i18n.dynamiclanguage.repository.LanguageService;

@Component("messageSource")
public class DBMessageSource extends AbstractMessageSource{
    
    @Autowired
    private LanguageService langService;

    @Override
    protected MessageFormat resolveCode(String code, Locale locale) {
        Map<String,String> messages = langService.getAllMessageByLocale(locale.getLanguage());
        if (messages.containsKey(code)) {
        	return new MessageFormat(messages.get(code), locale);
        }
        return new MessageFormat("", locale);
    }

}
