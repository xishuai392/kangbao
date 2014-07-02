package cn.kangbao.common.util;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 */

public class MessageResourceHelper {
    private static Locale locale = Locale.CHINA;

    private static ResourceBundleMessageSource resource = new ResourceBundleMessageSource();

    private MessageResourceHelper() {
    }

    private static Map<String, String> map = new HashMap<String, String>();

    static {
        // 可以在这里增加多个配置文件
        resource.setBasenames(FWConstants.CONFIG_PROPERTIES, FWConstants.ERORR_CODE_PROPERTIES_BASENAME, FWConstants.FW_ERORR_CODE_PROPERTIES_BASENAME);
        resource.setDefaultEncoding(FWConstants.UTF_8);
    }

    /**
     * Description: 得到message <br>
     *
     * @param key <br>
     * @return <br>
     * @author yan.qicui <br>
     * @taskId <br>
     */
    public static String getMessage(String key) {
        String resStr = map.get(key);
        if (StringUtils.isNotEmpty(resStr)) {
            return resStr;
        }
        resStr = getMessage(key, null);
        map.put(key, resStr);

        return resStr;
    }

    public static String getMessage(String key, Object[] args) {
        return getMessage(key, args, "");
    }

    public static String getMessage(String key, Object[] args, String defaultMessage) {
        return getMessage(key, args, defaultMessage, locale);
    }

    public static String getMessage(String key, Object[] args, String defaultMessage, Locale locale) {
        return resource.getMessage(key, args, defaultMessage, locale);
    }

    /**
     * Description: 清空缓存<br>
     *
     * @author yan.qicui <br>
     * @taskId <br>
     * <br>
     */
    public static void clear() {
        map.clear();
    }

}
