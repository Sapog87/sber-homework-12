package org.sber.validator.handler;

public class EmailLengthHandler extends AbstractHandler {
    public EmailLengthHandler(Handler next) {
        super(next);
    }

    @Override
    protected boolean process(String email) {
        if (email.length() > 255) {
            System.out.println("Длина email не должна превышать 255 символов");
            return false;
        }
        return true;
    }
}
