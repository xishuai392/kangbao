package cn.kangbao.common.util;

import java.util.Properties;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * 发送邮件辅助类
 */
public class SendMailHelper {

    private String message;

    public String getMessage() {
        return this.message;
    }

    // [start]属性设置
    private JavaMailSender javaMailSender;

    /**
     * 接收者地址
     */
    private String sendTo;

    /**
     * 发送者地址
     */
    private String sendFrom;

    public String getSendTo() {
        return sendTo;
    }

    public JavaMailSender getJavaMailSender() {
        return javaMailSender;
    }

    public void setJavaMailSender(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    public SendMailHelper() {

    }

    public SendMailHelper(String host, int port, String username,
            String password) {
        JavaMailSenderImpl javaMailSenderImp = new JavaMailSenderImpl();
        javaMailSenderImp.setHost(host);
        javaMailSenderImp.setPort(port);
        javaMailSenderImp.setUsername(username);
        javaMailSenderImp.setPassword(password);
        Properties props = new Properties();
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("ssl.SocketFactory.provider",
                "com.hollycrm.service.ticket.util.DNESSLSocketFactory");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.timeout", "25000");
        props.setProperty("mail.smtp.localhost", "localHostAdress");
        javaMailSenderImp.setJavaMailProperties(props);

        sendFrom = username;
        sendTo = username;
        this.javaMailSender = javaMailSenderImp;
    }

    public SendMailHelper(String host, String username, String password) {
        JavaMailSenderImpl javaMailSenderImp = new JavaMailSenderImpl();
        javaMailSenderImp.setHost(host);
        javaMailSenderImp.setUsername(username);
        javaMailSenderImp.setPassword(password);
        Properties props = new Properties();
        props.setProperty("mail.smtp.auth", "true");
        props.setProperty("mail.smtp.starttls.enable", "true");
        props.setProperty("mail.smtp.timeout", "25000");
        props.setProperty("mail.smtp.localhost", "localHostAdress");
        javaMailSenderImp.setJavaMailProperties(props);

        sendFrom = username;
        sendTo = username;
        this.javaMailSender = javaMailSenderImp;
    }

    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    public String getSendFrom() {
        return sendFrom;
    }

    public void setSendFrom(String sendFrom) {
        this.sendFrom = sendFrom;
    }

    // [end]

    // [start]发送普通邮件

    /**
     * 发送普通邮件
     * 
     * @parem sendSubject 主题
     * @parem sendText 内容
     */
    public Boolean send(String sendSubject, String sendText) {
        SimpleMailMessage mail = new SimpleMailMessage();
        try {
            mail.setTo(sendTo);
            mail.setFrom(sendFrom);
            mail.setSubject(sendSubject);
            mail.setText(sendText);
            javaMailSender.send(mail);
            return true;
        }
        catch (Exception e) {
            e.printStackTrace();
            this.message = e.getMessage();
            return false;
        }
    }

    /**
     * 发送普通邮件组
     * 
     * @parem sendSubject 主题
     * @parem sendText 内容
     * @parem sendToList 接收者群组
     */
    public Boolean send(String sendSubject, String sendText, String[] sendToList) {

        SimpleMailMessage mail = new SimpleMailMessage();
        try {
            mail.setFrom(sendFrom);
            mail.setSubject(sendSubject);
            mail.setText(sendText);
            for (String sendTo : sendToList) {
                mail.setTo(sendTo);
                javaMailSender.send(mail);
            }
            return true;
        }
        catch (Exception e) {
            this.message = e.getMessage();
            return false;
        }
    }

    // [end]
    public static void main(String[] args) {

        SendMailHelper sendMailHelper = new SendMailHelper("smtp.163.com", 25,
                "username", "password");
        // sendMailHelper.setSendTo("");
        sendMailHelper.send("Test", "发送邮件");
    }
}
