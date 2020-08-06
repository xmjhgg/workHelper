package com.xmj.generaterImpl;

import com.xmj.common.CommonUtil;
import com.xmj.generaters.Generator;

public class BankAccountGenerator implements Generator {

    @Override
    public String generateText() {
        return "6"+CommonUtil.getRandomNumber(15);
    }
}
