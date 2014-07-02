package cn.kangbao.common.util;

import java.io.UnsupportedEncodingException;

import org.apache.commons.lang.StringUtils;

public class HtmlHelper {
    /**
     * @param str 需要解码的字符串
     * @return
     */
    public static String enCodeStr(String str) {
        if (StringUtils.isBlank(str)) {
            return null;
        }
        try {
            return new String(str.getBytes("iso-8859-1"), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
