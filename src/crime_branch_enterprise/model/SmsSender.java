/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crime_branch_enterprise.model;
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

/**
 *
 * @author ASUS
 */
public class SmsSender {
    // Find your Account Sid and Auth Token at twilio.com/console
    public static final String ACCOUNT_SID =
            "ACd59f936aaf4129501f2dd2cb79e802bf";
    public static final String AUTH_TOKEN =
            "e2cfbec1a53ce30e6275b5f634accedf";





  public static boolean sendSms(String toPhone, String msg) {
       boolean isSent = true;
       
       try {
            System.out.println("Start");
            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            System.out.println(toPhone);
            System.out.println(msg);
            System.out.println("Start");
            
            Message message = Message
                .creator(new com.twilio.type.PhoneNumber("+1"+ toPhone), // to
                        new com.twilio.type.PhoneNumber("+12183929836"), // from
                        msg)
                .create();
            System.out.println("end");
            System.out.println(message.getSid());
           } catch(Exception e) {
               System.out.println(e);
               isSent=false;
       }
       
       return isSent;
        
    }
    
}
