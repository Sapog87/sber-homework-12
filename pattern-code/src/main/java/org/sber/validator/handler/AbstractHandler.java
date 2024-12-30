package org.sber.validator.handler;

public abstract class AbstractHandler implements Handler {
    private final Handler next;

    protected AbstractHandler(Handler next) {
        this.next = next;
    }

    protected abstract boolean process(String input);

    public boolean handle(String input) {
        if (process(input)) {
            if (next == null)
                return true;
            return next.handle(input);
        }
        return false;
    }
}