package org.sber;

public class EmailValidatorImpl implements EmailValidator {
    @Override
    public boolean isValid(String email) {
        if (email == null || email.isEmpty()) {
            System.out.println("Email не может быть пустым или null");
            return false;
        }
        if (!email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            System.out.println("Email имеет неверный формат");
            return false;
        }
        if (email.length() > 255) {
            System.out.println("Длина email не должна превышать 255 символов");
            return false;
        }
        return true;
    }
}