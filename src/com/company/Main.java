package com.company;

import command.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operations operations = new Operations();
        Collection collection = new Collection();
        String[] command;
        FileReader fileReader = new FileReader();
        fileReader.fileReader(collection);
        do {
            System.out.println("Type - help - if you want to see a list of commands");
            command = scanner.nextLine().toLowerCase().trim().split(" ");
            operations.operations(command, operations, collection);
        } while(!command[0].equals("exit"));
        scanner.close();
    }
}
