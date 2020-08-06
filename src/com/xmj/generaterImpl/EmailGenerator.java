package com.xmj.generaterImpl;

import com.xmj.common.CommonUtil;
import com.xmj.generaters.Generator;

public class EmailGenerator implements Generator {
    private String[] tail = {"@hb.com","@gaga.com"};

    @Override
    public String generateText() {
        int random= (int) (Math.random()*tail.length);
        return CommonUtil.getRandomNumber(3)+CommonUtil.getRandomEnglishWord(3)+tail[random];
    }
}
