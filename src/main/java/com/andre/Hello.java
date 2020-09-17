package com.andre;

import org.apache.commons.lang3.StringUtils;

public class Hello {
    public static void main(String[] args) {
        boolean rs = StringUtils.isNumeric("Hello anh tai");
        System.out.println(rs);
    }
}
