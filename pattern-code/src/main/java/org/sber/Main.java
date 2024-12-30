package org.sber;

import org.sber.validator.EmailValidator;
import org.sber.validator.EmailValidatorImpl;
import org.sber.validator.handler.EmailFormatHandler;
import org.sber.validator.handler.EmailLengthHandler;
import org.sber.validator.handler.EmailNotEmptyHandler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmailValidator validator = new EmailValidatorImpl(
                new EmailNotEmptyHandler(
                        new EmailFormatHandler(
                                new EmailLengthHandler(null))));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите email: ");
            String email = scanner.nextLine();
            if (validator.isValid(email)) {
                break;
            }
        }
        System.out.println("Email верен");
    }
}