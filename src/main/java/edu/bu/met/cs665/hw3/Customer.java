/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: Customer.java
 * Description: This class defines an abstract Customer who can create and send emails.
 */
package edu.bu.met.cs665.hw3;

/**
 * This is the Customer class.
 * This class defines the structure for customer-specific email
 * behavior, allowing subclasses to implement the method for creating
 * specific types of emails.
 */
public abstract class Customer {

    /**
     * Abstract method to create an Email object.
     * Subclasses must implement this method to define how
     * an email is generated based on the provided body and type.
     *
     * @param body The main content of the email.
     * @param type The type of email to create (e.g., contact, notification).
     * @return An Email object created based on the specified type.
     */
    abstract Email createEmail(String body, String type);

    /**
     * Sends an email by generating it and invoking its generation method.
     * This method first generates the email, then calls the method to
     * create the actual email content.
     *
     * @param body The main content of the email.
     * @param type The type of email to send.
     * @return The generated Email object after it has been created and processed.
     */
    public Email sendEmail(String body, String type){
        System.out.println("Generating Email...");
        Email email = createEmail(body, type);
        email.generatEmail();
        return email;
    }
}
