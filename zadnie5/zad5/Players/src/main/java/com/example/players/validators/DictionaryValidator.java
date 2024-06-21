package com.example.players.validators;

import com.example.players.annotations.Dictionary;
import com.example.players.clients.DictionaryClient;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class DictionaryValidator implements ConstraintValidator<Dictionary, String> {

    @Autowired
    private DictionaryClient dictionaryClient;

    private String dictionaryName;

    @Override
    public void initialize(Dictionary dictionary) {
        this.dictionaryName = dictionary.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        }
        return dictionaryClient.checkValue(dictionaryName, value);
    }
}