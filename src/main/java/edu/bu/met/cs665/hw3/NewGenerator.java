/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: NewGenerator.java
 * Description: This class defines a method for generate new customers email components.
 */
package edu.bu.met.cs665.hw3;

/**
 * This is the NewGenerator class
 * This class implements the Generator interface and provides specific
 * implementations for generating greetings, closings, and signatures
 * intended for communications with new customers.
 */
public class NewGenerator implements Generator{

    /**
     * Generates a greeting for new customers.
     * @return A String containing the greeting for the email.
     */
    @Override
    public String genarateGreeting() {
        return "Dear New Customer";
    }

    /**
     * Generates a closing line for emails directed at new customers.
     * @return A String containing the closing statement for the email.
     */
    @Override
    public String genarateClosing() {
        return "Thank you for choosing us";
    }

    /**
     * Generates a signature line for emails intended for new customers.
     * @return A String containing the signature for the email.
     */
    @Override
    public String genarateSign() {
        return "Best regards, New Customer Manager";
    }
}