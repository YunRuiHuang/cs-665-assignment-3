/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: FrequentGenerator.java
 * Description: This class defines a method for generate frequent customers email components.
 */
package edu.bu.met.cs665.hw3;

/**
 * This is the FrequentGenerator class
 * This class implements the Generator interface and provides specific
 * implementations for generating greetings, closings, and signatures
 * intended for frequent customer communications.
 */
public class FrequentGenerator implements Generator{

    /**
     * Generates a greeting for frequent customers.
     * @return A String containing the greeting for the email.
     */
    @Override
    public String genarateGreeting() {
        return "Dear Frequent Customer";
    }

    /**
     * Generates a closing line for emails directed at frequent customers.
     * @return A String containing the closing statement for the email.
     */
    @Override
    public String genarateClosing() {
        return "Thank you for your continued trust in us";
    }

    /**
     * Generates a signature line for emails intended for frequent customers.
     * @return A String containing the signature for the email.
     */
    @Override
    public String genarateSign() {
        return "Best regards, Frequent Customer Manager";
    }
}