package org.sber.validator;

import org.sber.validator.handler.Handler;

public class EmailValidatorImpl implements EmailValidator {

    private final Handler handler;

    public EmailValidatorImpl(Handler handler) {
        this.handler = handler;
    }

    @Override
    public boolean isValid(String email) {
        return handler.handle(email);
    }
}