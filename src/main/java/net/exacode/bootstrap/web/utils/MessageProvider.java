package net.exacode.bootstrap.web.utils;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

/**
 * Localized messages provider.
 * 
 * @author pmendelski
 * 
 */
@SuppressWarnings("restriction")
@Component
public class MessageProvider {

	@Resource(name = "messageSource")
	private MessageSource messageSource;

	public String getMessage(String key) {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage(key, new Object[0], locale);
	}

	public String getMessage(String key, Object[] args) {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage(key, args, locale);
	}

}
