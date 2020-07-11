package SetterInjections;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {

    public Point pointA;
    public Point pointB;
    public Point pointC;
    private ApplicationContext applicationContext;

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }

    public void drawShape() {
        System.out.println("Point A-->" + pointA.getX());
        System.out.println("Point A-->" + pointA.getY());

        System.out.println("Point B-->" + pointB.getX());
        System.out.println("Point B-->" + pointB.getY());

        System.out.println("Point C-->" + pointC.getX());
        System.out.println("Point C-->" + pointC.getY());
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
       // this.applicationContext=applicationContext;
    }

    public void setBeanName(String s) {
        System.out.println("Bean Name----------->"+s);
    }
}
