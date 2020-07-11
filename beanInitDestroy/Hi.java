package beanInitDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Hi implements DisposableBean, InitializingBean {

    public void destroy() throws Exception {
        System.out.println("Say Hi Destroyed from Hello Class");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("Say Hi from Init Class");
    }
}
