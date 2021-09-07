package cn.passwored.listener;

import cn.passwored.context.BaseContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * Project：passworedCloud
 * Description：
 * Date：2021-08-30 10:43
 * Author wangke
 */
public class BaseContextListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        BaseContext.setContext(event.getApplicationContext());
    }
}
