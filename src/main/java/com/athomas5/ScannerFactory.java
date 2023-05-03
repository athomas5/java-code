package com.athomas5;

import java.util.Scanner;

public class ScannerFactory {
    private final Scanner scanner = new Scanner(System.in);

    public String askName() {
        System.out.println("What is your name?");
        return this.scanner.nextLine();
    }
}
