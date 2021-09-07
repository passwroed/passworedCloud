package cn.passwored.context;

import org.springframework.context.ApplicationContext;

/**
 * Project：passworedCloud
 * Description：
 * Date：2021-08-30 10:44
 * Author wangke
 */
public class BaseContext {
    private static ApplicationContext context;

    public static void setContext(ApplicationContext applicationContext) {
        context = applicationContext;
    }

    public static Object getBean(String beanName) {
        if (context == null) {
            return null;
        }
        return context.getBean(beanName);
    }

    public static <T> T getBean(Class<T> t) {
        if (context == null) {
            return null;
        }
        return context.getBean(t);
    }
}
