package org.sber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmailValidator validator = new EmailValidatorImpl();

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