/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EmailNotification;

import Business.WorkQueue.ProcurementOrderRequest;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author parkh
 */
public class SendEmailNotification {

    Properties emailProperties;
    Session mailSession;
    MimeMessage emailMessage;
    ProcurementOrderRequest request;

    public void sendEmail(String email, ProcurementOrderRequest request) throws AddressException,MessagingException{
        SendEmailNotification javaEmail = new SendEmailNotification();
        javaEmail.setMailServerProperties();
	javaEmail.createEmailMessage(email, request);
	javaEmail.sendEmailMessage();
    }

    public void setMailServerProperties() {

		String emailPort = "587";//gmail's smtp port

		emailProperties = System.getProperties();
		emailProperties.put("mail.smtp.starttls.enable", "true");
		emailProperties.put("mail.smtp.port", emailPort);
		emailProperties.put("mail.smtp.auth", "true");
		emailProperties.put("mail.debug", "false");
		emailProperties.put("mail.smtp.auth", "true");
		emailProperties.put("mail.smtp.EnableSSL.enable","true");

		emailProperties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		emailProperties.setProperty("mail.smtp.socketFactory.fallbac k", "false");
		emailProperties.setProperty("mail.smtp.port", "465");
		emailProperties.setProperty("mail.smtp.socketFactory.port", "465");

	}

	public void createEmailMessage(String emailAddress, ProcurementOrderRequest request) throws AddressException, MessagingException {
		String emailSubject = "Your order has been Initiated";
                String emailBody =  "Hello, Your order details as per your request is as follows: <p><table style=\"border:1px solid black;\"><tr><td><b>Category</b></td><td><b>Item</b</td><td><b>Quantity</b</td></tr><tr><td>"+request.getCategory()+"</td><td>"+request.getItem()+"</td><td>"+request.getQuantity()+"</td></tr></table><p> Thank You!";

		mailSession = Session.getDefaultInstance(emailProperties, null);
		emailMessage = new MimeMessage(mailSession);
                emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(emailAddress));

		emailMessage.setSubject(emailSubject);
		emailMessage.setContent(emailBody, "text/html");//for a html email

	}

	public void sendEmailMessage() throws AddressException, MessagingException {

		String emailHost = "smtp.gmail.com";
		String fromUser = "neuaedproject2018";//just the id alone without @gmail.com
		String fromUserEmailPassword = "bruteforce2018";

                Transport transport = mailSession.getTransport("smtp");

		transport.connect(emailHost, fromUser, fromUserEmailPassword);
		transport.sendMessage(emailMessage, emailMessage.getAllRecipients());
		transport.close();
		System.out.println("Email sent successfully.");
	}
}
