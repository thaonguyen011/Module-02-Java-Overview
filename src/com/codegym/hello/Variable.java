package com.codegym.hello;

public class Variable {
    public static void main(String[] args) {
        String fullName = "Nguyen Van Teo";
        System.out.println(fullName);
        System.out.print(fullName);
        System.out.println(fullName);
        System.out.print(fullName);

        int age = 18;
        System.out.printf("My age is: %d\n",age); // printf in gia tri cua bien trong chuoi
        // %d: in so
        // %s: in chuoi
        System.out.printf("Hello %s\n", fullName);

    }
}
