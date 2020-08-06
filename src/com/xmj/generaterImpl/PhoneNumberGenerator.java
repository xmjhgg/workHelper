package com.xmj.generaterImpl;

import com.xmj.common.CommonUtil;
import com.xmj.generaters.Generator;

public class PhoneNumberGenerator implements Generator {
    private static String[] phonePreFix = {"132","159","171"};

    @Override
    public String generateText() {
        int random= (int) (Math.random()*phonePreFix.length);
        String prefix=phonePreFix[random];
        return prefix+CommonUtil.getRandomNumber(8);
    }
}
