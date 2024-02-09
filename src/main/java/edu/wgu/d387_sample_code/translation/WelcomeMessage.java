package edu.wgu.d387_sample_code.translation;


import java.util.Locale;
import java.util.ResourceBundle;

public class WelcomeMessage implements Runnable{
    Locale locale;
    String message;

    public WelcomeMessage (Locale locale) {
        this.locale = locale;
    }
    public String getMessage() {
        if (message == null) {
            ResourceBundle bundle = ResourceBundle.getBundle("welcome", locale);
            message = bundle.getString("welcomeMessage");
        }
        return message;
    }
    @Override
    public void run() {
        System.out.println(getMessage());
    }
}
