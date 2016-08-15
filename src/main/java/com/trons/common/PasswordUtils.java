package com.trons.common;

import com.trons.exception.UnknowException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by trons on 16-8-14.
 * TIME: 上午10:14
 */
public class PasswordUtils {

    private static final String SALT = "wxXlk1OfXjHgM9VnkAiQ";
    private static Logger logger = LoggerFactory.getLogger(PasswordUtils.class.getName());

    public static String encryption(String origin) throws UnknowException {
        /**
         * 缺少算法
         */
        try {
            String src = SALT + origin;
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            byte[] result = md5.digest(origin.getBytes());
            return bytesToHexString(result);
        } catch (NoSuchAlgorithmException e) {
            logger.error(e.toString());
            throw new UnknowException();
        }
    }

    private static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }
}
