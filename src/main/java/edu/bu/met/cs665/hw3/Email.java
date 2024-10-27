/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: Email.java
 * Description: This class defines an Abstract method to generate the email content.
 */
package edu.bu.met.cs665.hw3;

/**
 * This is the Email class.
 * This class serves as a base for specific types of emails, defining the
 * structure and behavior for generating emails.
 */
public abstract class Email {
    String recipient;
    String title;
    String greeting;
    String body;
    String closing;
    String sign;

    /**
     * Abstract method to generate the email content.
     * This method must be implemented by subclasses to define
     * how the email is created.
     */
    abstract void generatEmail();

    /**
     * Sets the recipient of the email.
     * @param recipient The email address of the recipient.
     */
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    /**
     * Sets the body content of the email.
     * @param body The main content of the email.
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * Returns the recipient of the email.
     * @return The recipient's email address as a String.
     */
    public String getRecipient() {
        return recipient;
    }

    /**
     * Returns the title of the email.
     * @return The title of the email as a String.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the greeting line of the email.
     * @return The greeting as a String.
     */
    public String getGreeting() {
        return greeting;
    }

    /**
     * Returns the body content of the email.
     * @return The body of the email as a String.
     */
    public String getBody() {
        return body;
    }

    /**
     * Returns the closing line of the email.
     * @return The closing as a String.
     */
    public String getClosing() {
        return closing;
    }

    /**
     * Returns the signature line of the email.
     * @return The signature as a String.
     */
    public String getSign() {
        return sign;
    }
}
