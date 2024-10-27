/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: Generator.java
 * Description: This class defines a method for generating various components of an email.
 */
package edu.bu.met.cs665.hw3;

/**
 * This is the Generator class
 * Any class implementing this interface must provide
 * specific implementations for generating these elements.
 */
public interface Generator {

    /**
     * Generates a greeting line for an email.
     * @return A String representing the greeting.
     */
    public String genarateGreeting();

    /**
     * Generates a closing line for an email.
     * @return A String representing the closing.
     */
    public String genarateClosing();

    /**
     * Generates a signature line for an email.
     * @return A String representing the signature.
     */
    public String genarateSign();
}
