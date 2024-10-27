/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: AdvertiseEmail.java
 * Description: This class represents an advertisement email that extends the Email class.
 */
package edu.bu.met.cs665.hw3;

/**
 * This is the AdvertiseEmail class
 * This class is responsible for generating the content of an
 * advertisement email using a provided Generator.
 */
public class AdvertiseEmail extends Email{
    Generator generator;

    /**
     * Constructs an AdvertiseEmail object with the specified Generator.
     * @param generator The Generator used to create email elements such as greeting, closing, and signature.
     */
    public AdvertiseEmail(Generator generator) {
        this.generator = generator;
        this.title = "Advertise Email";
    }

    /**
     * Generates the content for the advertisement email.
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
     * Returns a string representation of the AdvertiseEmail object.
     * @return A string indicating that this is an advertisement email.
     */
    @Override
    public String toString() {
        return "This is a Advertise email";
    }
}
