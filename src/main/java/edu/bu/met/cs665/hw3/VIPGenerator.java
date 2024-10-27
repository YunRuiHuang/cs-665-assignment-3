/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: VIPGenerator.java
 * Description: This class defines a method for generate VIP customers email components.
 */
package edu.bu.met.cs665.hw3;

/**
 * This is the VIPGenerator class
 * This class implements the Generator interface and provides specific
 * implementations for generating greetings, closings, and signatures
 * intended for communications with VIP customers.
 */
public class VIPGenerator implements Generator{

    /**
     * Generates a greeting for VIP customers.
     * @return A String containing the greeting for the email.
     */
    @Override
    public String genarateGreeting() {
        return "Dear VIP Customer";
    }

    /**
     * Generates a closing line for emails directed at VIP customers
     * @return A String containing the closing statement for the email.
     */
    @Override
    public String genarateClosing() {
        return "Thank you for being a valued VIP customer";
    }

    /**
     * Generates a signature line for emails intended for VIP customers.
     * @return A String containing the signature for the email.
     */
    @Override
    public String genarateSign() {
        return "Best regards, VIP Customer Manager";
    }
}