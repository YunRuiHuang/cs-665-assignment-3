/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: ContactEmail.java
 * Description: This class represents a contact email that extends the Email class.
 */
package edu.bu.met.cs665.hw3;

/**
 * This is the ContactEmail class.
 * This class is responsible for generating the content of a
 * contact email using a provided Generator.
 */
public class ContactEmail extends Email{
    Generator generator;

    /**
     * Constructs a ContactEmail object with the specified Generator.
     * @param generator The Generator used to create email elements such as greeting, closing, and signature.
     */
    public ContactEmail(Generator generator) {
        this.generator = generator;
        this.title = "Contact Email";
    }

    /**
     * Generates the content for the contact email.
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
     * Returns a string representation of the ContactEmail object.
     * @return A string indicating that this is a contact email.
     */
    @Override
    public String toString() {
        return "This is a contact email";
    }
}
