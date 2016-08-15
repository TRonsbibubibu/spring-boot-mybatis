package com.trons.common;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by trons on 16-7-13.
 */
public class Validator {

    public static boolean validatorEmail(String email) {
        String pattern = "^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$";

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(email);
        return matcher.matches();
    }

    public static boolean validatorMobile(String mobile) {
        String pattern = "^(13[0-9]|14[5|7]|15[0|1|2|3|5|6|7|8|9]|18[0|1|2|3|5|6|7|8|9])\\d{8}$";

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(mobile);
        return matcher.matches();
    }

    public static boolean validatorClient(String client) {
        List<String> allClients = new ArrayList<String>() {{
            add("MOBILE");
            add("WEB");
        }};
        return allClients.contains(client);
    }

    public static boolean validatorType(String type) {
        List<String> allTypes = new ArrayList<String>() {{
            add("REGISTER");
            add("SHARE");
            add("FORGET");
        }};
        return allTypes.contains(type);
    }
}
