package ar.globallogic.com.demo.language.impl;

import org.springframework.stereotype.Component;

import ar.globallogic.com.demo.language.Language;


@Component
public class English implements Language{

	public String getLanguage() {
		return "The language is english.";
	}

}
