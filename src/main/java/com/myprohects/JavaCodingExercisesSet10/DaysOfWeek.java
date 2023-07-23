package com.myprohects.JavaCodingExercisesSet10;

import java.util.Scanner;

enum DaysOfWeek {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String name;

    DaysOfWeek(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isWeekday() {
        return this != SATURDAY && this != SUNDAY;
    }

    public boolean isHoliday() {
        return this == SATURDAY || this == SUNDAY;
    }

    private static DaysOfWeek getEnumFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the enum: ");
        String stringProvidedByUser = scanner.nextLine();
        DaysOfWeek enumProvidedByUser = DaysOfWeek.valueOf(stringProvidedByUser);
        return enumProvidedByUser;
    }

    public static void main(String[] args) {
        System.out.println("Enum " + MONDAY + " is: " + MONDAY.getName());
        System.out.println("Enum " + MONDAY + " is week day: " + MONDAY.isWeekday());
        System.out.println("Enum " + MONDAY + " is week-end day: " + MONDAY.isHoliday());

        DaysOfWeek enumFromUser = getEnumFromUser();
        System.out.println("Enum " + enumFromUser + ", provided by user is: " + enumFromUser.getName());
        System.out.println("Enum " + enumFromUser + ", provided by user is week day: " + enumFromUser.isWeekday());
        System.out.println("Enum " + enumFromUser + ", provided by user is week-end day: " + enumFromUser.isHoliday());
    }
}