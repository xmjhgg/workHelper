package com.xmj.generaterImpl;

import com.xmj.common.CommonUtil;
import com.xmj.generaters.Generator;


public class RandomNumber32Generator implements Generator {

    @Override
    public String generateText() {
        return CommonUtil.getRandomMixWordAndNum(32);
    }
}
