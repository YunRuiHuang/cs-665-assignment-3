/**
 * Name: Yunrui Huang
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/27/2024
 * File Name: FrequentCustomer.java
 * Description: This class defines a Frequent customer who can create various types of emails.
 */
package edu.bu.met.cs665.hw3;

/**
 * This is the FrequentCustomer class.
 * This class extends the Customer class and provides a specific implementation
 * for creating emails based on the type specified.
 */
public class FrequentCustomer extends Customer {
    private String recipient;

    /**
     * Constructs a FrequentCustomer object with the specified recipient.
     * @param recipient The recipient's email address.
     */
    public FrequentCustomer(String recipient) {
        this.recipient = recipient;
    }

    /**
     * Creates an email based on the specified type and body content.
     * @param body The content of the email body.
     * @param type The type of email to create (contact, notify, advertise).
     * @return The Email object created based on the specified type.
     */
    @Override
    Email createEmail(String body, String type) {
        Email email = null;
        Generator generator = new FrequentGenerator();

        if(type.equals("contact")){
            email = new ContactEmail(generator);
            email.setRecipient(this.recipient);
            email.setBody(body);
        }else if(type.equals("notify")){
            email = new NotificationEmail(generator);
            email.setRecipient(this.recipient);
            email.setBody(body);
        }else if(type.equals("advertise")){
            email = new AdvertiseEmail(generator);
            email.setRecipient(this.recipient);
            email.setBody(body);
        }

        return email;
    }
}