package application.utils;

import java.util.Random;

public class Utils {
    public static final String KEY = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

    public static final String randomID() {

        int len = new Random().nextInt(13);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(KEY.charAt(new Random().nextInt(KEY.length())));
        }
        return sb.toString();
    }
}
