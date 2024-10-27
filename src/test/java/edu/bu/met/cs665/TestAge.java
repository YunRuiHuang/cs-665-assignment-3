package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.hw3.*;
import org.junit.Test;

/**
 * Write some Unit tests for your program like the examples below.
 */

public class TestAge {

    public TestAge() {
    }

    @Test
    public void testRun(){
        Email email = null;
        Customer customer = new BusinessCustomer("business@test.com");
        email = customer.sendEmail("massage body","contact");

        assertEquals("business@test.com", email.getRecipient());
        assertEquals("Contact Email", email.getTitle());
        assertEquals("Dear Business Customer", email.getGreeting());
        assertEquals("massage body", email.getBody());
        assertEquals("Thank you for your business", email.getClosing());
        assertEquals("Best regards, Business Customer Manager", email.getSign());
    }

    @Test
    public void testEmailType(){
        Email email = null;
        Customer customer = new BusinessCustomer("business@test.com");
        email = customer.sendEmail("massage body","contact");
        assertEquals("Contact Email", email.getTitle());
        email = customer.sendEmail("massage body","notify");
        assertEquals("Notify Email", email.getTitle());
        email = customer.sendEmail("massage body","advertise");
        assertEquals("Advertise Email", email.getTitle());
    }

    @Test
    public void testCustomerType(){
        Email email = null;
        Customer businessCustomer = new BusinessCustomer("business@test.com");
        Customer returningCustomer = new ReturningCustomer("returning@test.com");
        Customer frequentCustomer = new FrequentCustomer("frequent@test.com");
        Customer newCustomer = new NewCustomer("new@test.com");
        Customer vipCustomer = new VIPCustomer("vip@test.com");

        email = businessCustomer.sendEmail("massage body","contact");
        assertEquals("business@test.com", email.getRecipient());
        assertEquals("Dear Business Customer", email.getGreeting());
        assertEquals("Thank you for your business", email.getClosing());
        assertEquals("Best regards, Business Customer Manager", email.getSign());

        email = returningCustomer.sendEmail("massage body","contact");
        assertEquals("returning@test.com", email.getRecipient());
        assertEquals("Dear Returning Customer", email.getGreeting());
        assertEquals("Welcome back! We're excited to continue supporting your needs", email.getClosing());
        assertEquals("Best regards, Returning Customer Manager", email.getSign());

        email = frequentCustomer.sendEmail("massage body","contact");
        assertEquals("frequent@test.com", email.getRecipient());
        assertEquals("Dear Frequent Customer", email.getGreeting());
        assertEquals("Thank you for your continued trust in us", email.getClosing());
        assertEquals("Best regards, Frequent Customer Manager", email.getSign());

        email = newCustomer.sendEmail("massage body","contact");
        assertEquals("new@test.com", email.getRecipient());
        assertEquals("Dear New Customer", email.getGreeting());
        assertEquals("Thank you for choosing us", email.getClosing());
        assertEquals("Best regards, New Customer Manager", email.getSign());

        email = vipCustomer.sendEmail("massage body","contact");
        assertEquals("vip@test.com", email.getRecipient());
        assertEquals("Dear VIP Customer", email.getGreeting());
        assertEquals("Thank you for being a valued VIP customer", email.getClosing());
        assertEquals("Best regards, VIP Customer Manager", email.getSign());

    }

    @Test
    public void testGenerator(){
        Email email = null;
        Customer customer1 = new BusinessCustomer("business1@test.com");
        Customer customer2 = new BusinessCustomer("business2@test.com");

        email = customer1.sendEmail("massage for the business1","contact");
        assertEquals("business1@test.com", email.getRecipient());
        assertEquals("Contact Email", email.getTitle());
        assertEquals("Dear Business Customer", email.getGreeting());
        assertEquals("massage for the business1", email.getBody());
        assertEquals("Thank you for your business", email.getClosing());
        assertEquals("Best regards, Business Customer Manager", email.getSign());

        email = customer2.sendEmail("massage for the business2","notify");
        assertEquals("business2@test.com", email.getRecipient());
        assertEquals("Notify Email", email.getTitle());
        assertEquals("Dear Business Customer", email.getGreeting());
        assertEquals("massage for the business2", email.getBody());
        assertEquals("Thank you for your business", email.getClosing());
        assertEquals("Best regards, Business Customer Manager", email.getSign());


    }


}
