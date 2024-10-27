/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: ReturningGenerator.java
 * Description: This class defines a method for generate returning customers email components.
 */
package edu.bu.met.cs665.hw3;

/**
 * This is the ReturningGenerator class
 * This class implements the Generator interface and provides specific
 * implementations for generating greetings, closings, and signatures
 * intended for communications with returning customers.
 */
public class ReturningGenerator implements Generator{

    /**
     * Generates a greeting for returning customers.
     * @return A String containing the greeting for the email.
     */
    @Override
    public String genarateGreeting() {
        return "Dear Returning Customer";
    }

    /**
     * Generates a closing line for emails directed at returning customers.
     * @return A String containing the closing statement for the email.
     */
    @Override
    public String genarateClosing() {
        return "Welcome back! We're excited to continue supporting your needs";
    }

    /**
     * Generates a signature line for emails intended for returning customers.
     * @return A String containing the signature for the email.
     */
    @Override
    public String genarateSign() {
        return "Best regards, Returning Customer Manager";
    }
}
