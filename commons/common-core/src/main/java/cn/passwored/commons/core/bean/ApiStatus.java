package cn.passwored.commons.core.bean;

/**
 * Project：passworedCloud
 * Description：API调用返回状态
 * Date：2021-08-25 01:34
 * Author wangke
 */
public class ApiStatus {

    /**
     * （成功） 服务器已成功处理了请求
     */
    public static final int SC_OK = 200;

    /**
     * （错误请求） 服务器不理解请求的语法
     */
    public static final int SC_BAD_REQUEST = 400;
    /**
     * （未授权） 请求要求身份验证
     */
    public static final int SC_UNAUTHORIZED = 401;
    /**
     * （禁止） 服务器拒绝请求
     */
    public static final int SC_FORBIDDEN = 403;
    /**
     * （未找到） 服务器找不到请求的网页
     */
    public static final int SC_NOT_FOUND = 404;

    /**
     * （服务器内部错误） 服务器遇到错误，无法完成请求
     */
    public static final int SC_INTERNAL_SERVER_ERROR = 500;

    /**
     * （常规服务访问错误） 常规服务访问错误，无法完成请求
     */
    public static final int SC_COMMON_SERVICE_ERROR = 5001;

    /**
     * 访问服务错误，无法完成请求
     */
    public static final int SC_FEIGN_SERVICE_ERROR = 5002;
}
