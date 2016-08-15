package com.trons.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Base64;
import java.util.Random;
import java.util.UUID;

/**
 * Created by trons on 16-7-10.
 */
public class Utils {

    private static Random ra;

    private static Logger logger = LoggerFactory.getLogger(Utils.class);

    public static long createTimeStamp() {
        return System.currentTimeMillis();
    }

    public static String createUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String createVerifyCode() {
        if (ra == null)
            ra = new Random();
        StringBuilder vc = new StringBuilder();
        for (int i = 0; i <= 3; i++) {
            vc.append(ra.nextInt(10));
        }
        return vc.toString();
    }

    public static String createEmailCode() {
        return Base64.getEncoder()
                .encodeToString(
                        createUUID().getBytes());
    }
}
