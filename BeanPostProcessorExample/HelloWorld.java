package BeanPostProcessorExample;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class HelloWorld implements InitializingBean {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void init() {
        System.out.println("Step3-->Bean is going through init.");
    }

    public void destroy() {
        System.out.println("Bean will destroy now.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("STEP2-->Initializing Bean property");
    }


    @PostConstruct
    public void startInitMethod(){
        System.out.println("Post Construct--Starting the Init Method");
    }

    @PreDestroy
    public void destroyInitMethod(){
        System.out.println("PreDestroy--Destroy the Init Method");
    }
}
