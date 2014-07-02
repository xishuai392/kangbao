package cn.kangbao.common.util;

import java.text.SimpleDateFormat;

public class DateTimeHelper {

    private static SimpleDateFormat df_yyyy;

    /**
     * 获取 yyyy时间格式format
     *
     * @return
     */
    public static SimpleDateFormat getFormat_yyyy() {
        if (df_yyyy == null) {
            df_yyyy = new SimpleDateFormat("yyyy");
        }
        return df_yyyy;
    }

    private static SimpleDateFormat df_MM;

    /**
     * 获取MM时间格式format
     *
     * @return
     */
    public static SimpleDateFormat getFormat_MM() {
        if (df_MM == null) {
            df_MM = new SimpleDateFormat("MM");
        }
        return df_MM;
    }

    private static SimpleDateFormat df_yyyyMMdd;

    /**
     * 获取 yyyyMMdd时间格式format
     *
     * @return
     */
    public static SimpleDateFormat getFromat_yyyyMMdd() {
        if (df_yyyyMMdd == null) {
            df_yyyyMMdd = new SimpleDateFormat("yyyyMMdd");
        }
        return df_yyyyMMdd;
    }

    private static SimpleDateFormat df_yyyyMMddhhmmss;

    /**
     * 获取 yyyyMMddhhmmss时间格式format
     *
     * @return
     */
    public static SimpleDateFormat getFormat_yyyyMMddhhmmss() {
        if (df_yyyyMMddhhmmss == null) {
            df_yyyyMMddhhmmss = new SimpleDateFormat("yyyyMMddHHmmss");
        }
        return df_yyyyMMddhhmmss;
    }

    /**
     * 获取 yyyyMMddhhmmss时间格式format
     *
     * @return
     */
    private static SimpleDateFormat df_yyyyMMddhhmmssSSS;

    public static SimpleDateFormat getFormat_yyyyMMddhhmmssSSS() {
        if (df_yyyyMMddhhmmssSSS == null) {
            df_yyyyMMddhhmmssSSS = new SimpleDateFormat("yyyyMMddHHmmssSSS");
        }
        return df_yyyyMMddhhmmssSSS;
    }

    private static SimpleDateFormat df_yyyy_MMdd_HHmmss;

    /**
     * 获取 yyyy-MM-dd HH:mm:ss.SSS时间格式format
     *
     * @return
     */
    public static SimpleDateFormat getFormat_yyyy_MM_ddHHmmss() {
        if (df_yyyy_MMdd_HHmmss == null) {
            df_yyyy_MMdd_HHmmss = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        }
        return df_yyyy_MMdd_HHmmss;
    }

    /**
     * 获取 yyyy-MM-dd HH:mm:ss.SSS时间格式format
     *
     * @return
     */
    private static SimpleDateFormat df_yyyy_MMdd_hhmmss;

    public static SimpleDateFormat getFormat_yyyy_MM_ddhhmmss() {
        if (df_yyyy_MMdd_hhmmss == null) {
            df_yyyy_MMdd_hhmmss = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        }
        return df_yyyy_MMdd_hhmmss;
    }

    /**
     * 获取 16-4月 -13 03.29.29.841000 下午时间格式format
     *
     * @return
     */
    private static SimpleDateFormat dd_M_yy_KKmmss_a;

    public static SimpleDateFormat getFormat_dd_M_yy_KKmmss_a() {
        if (dd_M_yy_KKmmss_a == null) {
            dd_M_yy_KKmmss_a = new SimpleDateFormat("dd-M月 -yy hh:mm:ss.SSSSSS a");
        }
        return dd_M_yy_KKmmss_a;
    }
}
