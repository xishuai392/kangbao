package cn.kangbao.common.util;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.support.ResourceBundleMessageSource;

/**
 * <Description>消息资源管理器 <br>
 * 
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年4月15日 <br>
 * @see com.ztesoft.framework.util <br>
 * @since V1.0<br>
 */

public class MessageResourceHelper {
    private static Locale locale = Locale.CHINA;

    private static ResourceBundleMessageSource resource = new ResourceBundleMessageSource();

    private MessageResourceHelper() {
    }

    private static Map<String, String> map = new HashMap<String, String>();

    static {
        // 可以在这里增加多个配置文件
        resource.setBasenames(FrameWorkConstants.CONFIG_PROPERTIES,
                FrameWorkConstants.ERORR_CODE_PROPERTIES_BASENAME);
        resource.setDefaultEncoding(FrameWorkConstants.UTF_8_ENCODING);
    }

    /**
     * Description: 得到message <br>
     * 
     * @param key <br>
     * @return <br>
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

    public static String getMessage(String key, Object[] args,
            String defaultMessage) {
        return getMessage(key, args, defaultMessage, locale);
    }

    public static String getMessage(String key, Object[] args,
            String defaultMessage, Locale locale) {
        return resource.getMessage(key, args, defaultMessage, locale);
    }

    /**
     * Description: 清空缓存<br>
     */
    public static void clear() {
        map.clear();
    }

    public static void main(String[] args) {
        System.out.println(MessageResourceHelper.getMessage("test"));
    }

}
