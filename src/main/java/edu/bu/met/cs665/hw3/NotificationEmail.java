/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: NotificationEmail.java
 * Description: This class represents a notification email that extends the Email class.
 */
package edu.bu.met.cs665.hw3;

public class NotificationEmail extends Email{
    Generator generator;

    /**
     * Constructs a NotificationEmail object with the specified Generator.
     * @param generator The Generator used to create email elements such as greeting, closing, and signature.
     */
    public NotificationEmail(Generator generator) {
        this.generator = generator;
        this.title = "Notify Email";
    }

    /**
     * Generates the content for the notification email.
     * This method populates the greeting, closing, and signature
     * fields using the provided Generator.
     */
    @Override
    void generatEmail() {
        System.out.println("Generation Email for " + this.recipient);
        this.greeting = generator.genarateGreeting();
        this.closing = generator.genarateClosing();
        this.sign = generator.genarateSign();
    }

    /**
     * Returns a string representation of the NotificationEmail object.
     * @return A string indicating that this is a notification email.
     */
    @Override
    public String toString() {
        return "This is a notify email";
    }
}