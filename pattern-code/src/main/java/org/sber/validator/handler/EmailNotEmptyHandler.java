package org.sber.validator.handler;

public class EmailNotEmptyHandler extends AbstractHandler {
    public EmailNotEmptyHandler(Handler next) {
        super(next);
    }

    @Override
    protected boolean process(String email) {
        if (email == null || email.isBlank()) {
            System.out.println("Email не может быть пустым или null");
            return false;
        }
        return true;
    }
}
