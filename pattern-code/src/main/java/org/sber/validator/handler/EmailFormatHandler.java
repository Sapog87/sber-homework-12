package org.sber.validator.handler;

public class EmailFormatHandler extends AbstractHandler {
    public EmailFormatHandler(Handler next) {
        super(next);
    }

    @Override
    protected boolean process(String email) {
        if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            System.out.println("Email имеет неверный формат");
            return false;
        }
        return true;
    }
}
