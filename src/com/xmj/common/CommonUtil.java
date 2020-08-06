package com.xmj.common;

public class CommonUtil {
    public static String getRandomEnglishWord(int length) {
        StringBuilder randomStr = new StringBuilder();

        for(int i = 0; i < length; ++i) {
            if ((int)(Math.random() * 2.0D) == 1) {
                randomStr.append((char)((int)(Math.random() * 26.0D + 65.0D)));
            } else {
                randomStr.append((char)((int)(Math.random() * 26.0D + 97.0D)));
            }
        }

        return randomStr.toString();
    }

    public static String getUpperWord(int length) {
        StringBuilder randomStr = new StringBuilder();

        for(int i = 0; i < length; ++i) {
            randomStr.append((char)((int)(Math.random() * 26.0D + 65.0D)));
        }

        return randomStr.toString();
    }

    public static String getRandomNumber(int length) {
        StringBuilder randomStr = new StringBuilder();

        for(int i = 0; i < length; ++i) {
            randomStr.append("" + (int)(Math.random() * 10.0D));
        }

        return randomStr.toString();
    }

    public static String getRandomMixWordAndNum(int length) {
        StringBuilder randomStr = new StringBuilder();

        for(int i = 0; i < length; ++i) {
            if ((int)(Math.random() * 2.0D) == 1) {
                randomStr.append("" + (int)(Math.random() * 10.0D));
            } else if ((int)(Math.random() * 2.0D) == 1) {
                randomStr.append((char)((int)(Math.random() * 26.0D + 97.0D)));
            } else {
                randomStr.append((char)((int)(Math.random() * 26.0D + 65.0D)));
            }
        }

        return randomStr.toString();
    }
}
