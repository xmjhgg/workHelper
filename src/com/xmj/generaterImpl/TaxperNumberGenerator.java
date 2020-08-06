package com.xmj.generaterImpl;

import com.xmj.common.CommonUtil;
import com.xmj.generaters.Generator;

public class TaxperNumberGenerator implements Generator {

    @Override
    public String generateText() {
        return CommonUtil.getUpperWord(1)+CommonUtil.getRandomNumber(17);
    }
}
