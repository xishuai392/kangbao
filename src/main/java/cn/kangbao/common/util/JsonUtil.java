package cn.kangbao.common.util;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.SerializationConfig;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.type.TypeReference;

import cn.kangbao.common.exception.SysException;
import cn.kangbao.common.log.LoggerManager;

public class JsonUtil {

    public static final LoggerManager logger = LoggerManager
            .getLogger(JsonUtil.class);

    /**
     * Object——>JSON
     * 
     * @param obj
     * @param clazz
     * @return
     */
    public static String serialize(Object obj, Class clazz) {
        String serialValue = "";
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerSubtypes(clazz);
            serialValue = mapper.writeValueAsString(obj);
        }
        catch (Exception e) {
            throw new SysException(e, "JsonUtil序列化出错");
        }
        return serialValue;
    }

    /**
     * JSON——>Object
     * 
     * @param obj
     * @param clazz
     * @return
     */
    public static <T> Object deserialize(String json, Class<T> clazz) {
        T o = null;
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.registerSubtypes(clazz);
            o = mapper.readValue(json, clazz);
        }
        catch (Exception e) {
            throw new SysException(e, "JsonUtil反序列化" + json + "出错");
        }
        return o;
    }

    private static ObjectMapper objectMapper = new ObjectMapper();

    private static ObjectMapper agentObjectMapper = new ObjectMapper();

    // 指定日期类型的格式化
    static {
        objectMapper
                .setDateFormat(DateHelper.SIMPLE_DATE_FORMAT_yyyy_MMdd_HHmmss);

        agentObjectMapper
                .configure(
                        DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES,
                        false);
        agentObjectMapper.configure(
                SerializationConfig.Feature.WRITE_DATES_AS_TIMESTAMPS, false);
        agentObjectMapper.getSerializationConfig().setDateFormat(
                new SimpleDateFormat("yyyyMMddHHmmssS"));
        // agentObjectMapper.getSerializationConfig().withDateFormat(new SimpleDateFormat("yyyyMMddHHmmssS"));
        agentObjectMapper.getDeserializationConfig().withDateFormat(
                new SimpleDateFormat("yyyyMMddHHmmssS"));
    }

    /**
     * 字符串转为bean
     * 
     * @param content
     * @param valueType
     * @return
     */
    public static <T> T toAgentBean(String content, Class<T> valueType) {
        try {
            return agentObjectMapper.readValue(content, valueType);
        }
        catch (Exception e) {
            logger.error(e);
        }

        return null;
    }

    /**
     * 字符串转为bean
     * 
     * @param content
     * @param valueType
     * @return
     */
    public static <T> T toBean(String content, Class<T> valueType) {
        try {
            return objectMapper.readValue(content, valueType);
        }
        catch (Exception e) {
            logger.error(e);
        }

        return null;
    }

    /**
     * 字符串转为List
     * 
     * @param object
     * @param T
     * @return
     */
    public static <T> List<T> toList(String content, Class<T> T) {
        try {
            JavaType javaType = objectMapper.getTypeFactory()
                    .constructParametricType(List.class, T);
            return objectMapper.readValue(content, javaType);
        }
        catch (Exception e) {
            logger.error(e);
        }

        return null;
    }

    /**
     * 字符串转为Array
     * 
     * @param object
     * @param T
     * @return
     */
    public static <T> T[] toArray(String content, Class<T> T) {
        try {
            List<T> list = JsonUtil.toList(content, T);
            @SuppressWarnings("unchecked")
            T[] a = (T[]) java.lang.reflect.Array.newInstance(T, list.size());
            return list.toArray(a);
        }
        catch (Exception e) {
            logger.error(e);
        }

        return null;
    }

    /**
     * List串转为Array
     * 
     * @param list
     * @param T
     * @return
     */
    public static <T> T[] toArray(List<T> list, Class<T> T) {
        try {
            @SuppressWarnings("unchecked")
            T[] a = (T[]) java.lang.reflect.Array.newInstance(T, list.size());
            return list.toArray(a);
        }
        catch (Exception e) {
            logger.error(e);
        }

        return null;
    }

    /**
     * 字符串转为Map<String, Object>
     * 
     * @param content
     * @return
     */
    public static Map<String, Object> toMap(String content) {
        try {
            return objectMapper.readValue(content,
                    new TypeReference<Map<String, Object>>() {
                    });
        }
        catch (Exception e) {
            logger.error(e);
        }

        return null;
    }

    /**
     * 对象转为Map<String, Object>
     * 
     * @param content
     * @return
     */
    public static Map<String, Object> toMap(Object object) {
        try {
            return objectMapper.convertValue(object,
                    new TypeReference<Map<String, Object>>() {
                    });
        }
        catch (Exception e) {
            logger.error(e);
        }

        return null;
    }

    public static <T, V> Map<T, V> toJavaMap(String jsonString,
            Class<T> keyClass, Class<V> valueClass) throws Exception {
        return objectMapper.readValue(jsonString, objectMapper.getTypeFactory()
                .constructMapLikeType(Map.class, keyClass, valueClass));
    }

    /**
     * 把JavaBean转换为json字符串 <br>
     * 普通对象转换： toJson(Student) <br>
     * List转换：toJson(List) <br>
     * Map转换:toJson(Map) <br>
     * 我们发现不管什么类型，都可以直接传入这个方法
     * 
     * @param object JavaBean对象
     * @return json字符串
     */
    public static String toJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        }
        catch (Exception e) {
            logger.error(e);
        }

        return null;
    }

    public static String toAgentJson(Object object) {
        try {
            return agentObjectMapper.writeValueAsString(object);
        }
        catch (Exception e) {
            logger.error(e);
        }

        return null;
    }

    /**
     * @param response
     * @param list 要输出的数据
     * @param idKey tree的id字段,可以是多个字段的组合逗号分割
     * @param textKey tree的text
     * @param cssKey tree的图标样式
     * @param requestTreeNode 传入的tree参数对象
     * @throws JSONException
     */

    /**
     * 输出
     * 
     * @param response
     * @param map
     */
    public static void writeJson(HttpServletResponse response, Map<?, ?> map) {
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        PrintWriter print = null;
        try {
            print = response.getWriter();
        }
        catch (IOException e) {
            logger.error(e);
        }
        print.write(toJson(map).toString());
    }

    /**
     * 输出
     * 
     * @param response
     * @param map
     */
    public static void writeJson(HttpServletResponse response, Object object) {
        response.setContentType("application/json");
        response.setCharacterEncoding(FrameWorkConstants.UTF_8_ENCODING);
        PrintWriter print = null;
        try {
            print = response.getWriter();
        }
        catch (IOException e) {
            logger.error(e);
        }
        print.write(toJson(object).toString());
    }

}
