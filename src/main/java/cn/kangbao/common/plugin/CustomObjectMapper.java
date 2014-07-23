/**
 * 
 */
package cn.kangbao.common.plugin;

import java.text.SimpleDateFormat;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig.Feature;

/**
 * <Description>用于在spring-servlet.xml中的注解，翻译日期格式到前台 <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年7月22日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.common.plugin <br>
 */

public class CustomObjectMapper extends ObjectMapper {
    public CustomObjectMapper() {
        super();
        configure(Feature.WRITE_DATES_AS_TIMESTAMPS, false);
        setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    }
}
