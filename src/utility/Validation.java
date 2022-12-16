package utility;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Validation 
{
    
    public Boolean StringTextFieldValidationIsNotNull(String textFieldValue)
    {
        String regex = "[a-zA-Z]+";
        Pattern p = Pattern.compile(regex);
        if (textFieldValue == null) {
            return false;
        }
        Matcher m = p.matcher(textFieldValue);
        return m.matches();
    }
    
    public Boolean PhoneNumberTextFieldValidationIsNotNull(String textFieldValue)
    {
        String regex = "^\\d{10}$";
        Pattern pattern = Pattern.compile(regex);
        
        if (textFieldValue == null) {
            return false;
        }
        
        Matcher matcher = pattern.matcher(textFieldValue);
        return matcher.matches();
    }
    
    //
    //The following restrictions are imposed in the email address' local part by using this regex:
    //
    //It allows numeric values from 0 to 9.
    //Both uppercase and lowercase letters from a to z are allowed.
    //Allowed are underscore “_”, hyphen “-“, and dot “.”
    //Dot isn't allowed at the start and end of the local part.
    //Consecutive dots aren't allowed.
    //For the local part, a maximum of 64 characters are allowed.
    
    //    Restrictions for the domain part in this regular expression include:
    //    It allows numeric values from 0 to 9.
    //We allow both uppercase and lowercase letters from a to z.
    //Hyphen “-” and dot “.” aren't allowed at the start and end of the domain part.
    //No consecutive dots.
    
    public Boolean emailTextFieldValidation(String textFieldValue)
    {
        String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regex);
        
        if (textFieldValue == null) {
            return false;
        }
        
        Matcher matcher = pattern.matcher(textFieldValue);
        return matcher.matches();
    }
    
    public int compareTwoDates(String inputDate)
    {
        int result = 2; 
        try
        {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date date = new Date();

            String currDate = sdf.format(date);
            System.out.println(sdf.format(date)); 
            
            Date date1 = sdf.parse(inputDate);
            Date date2 = sdf.parse(currDate);

            result = date1.compareTo(date2);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("result: " + result);
        return result;
    }
    
//    public static void main(String args[])
//    {
//        Validation validation = new Validation();
//        String textFieldValue = "hfghdhaa";
//        
//        if(validation.StringTextFieldValidationIsNotNull(textFieldValue))
//        {
//            System.out.println("true");
//        }
//        else
//        {
//            System.out.println("false");
//        }
//    }
}
