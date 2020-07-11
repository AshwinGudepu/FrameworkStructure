package BeanPostProcessorExample;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("Step1-->BeforeInitialization--> : " + beanName);
        return bean;  // you can return any other object as well
    }
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        System.out.println("Step4-->AfterInitialization : " + beanName);
        return bean;  // you can return any other object as well
    }

    public void drawShape(){
        System.out.println("****Draw Triangle****");
    }
}
