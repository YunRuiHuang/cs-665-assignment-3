/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: BusinessGenerator.java
 * Description: This class defines a method for generate business-related email components.
 */
package edu.bu.met.cs665.hw3;

/**
 * This is the BusinessGenerator class
 * This class implements the Generator interface and provides
 * specific implementations for generating greetings, closings,
 * and signatures tailored for business emails.
 */
public class BusinessGenerator implements Generator{

    /**
     * Generates a greeting for business customers.
     * @return A String containing the greeting for the email.
     */
    @Override
    public String genarateGreeting() {
        return "Dear Business Customer";
    }

    /**
     * Generates a closing line for business emails.
     * @return A String containing the closing statement for the email.
     */
    @Override
    public String genarateClosing() {
        return "Thank you for your business";
    }

    /**
     * Generates a signature line for business emails.
     * @return A String containing the signature for the email.
     */
    @Override
    public String genarateSign() {
        return "Best regards, Business Customer Manager";
    }
}
