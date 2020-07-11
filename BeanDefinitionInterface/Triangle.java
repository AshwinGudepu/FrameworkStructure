package BeanDefinitionInterface;

public class Triangle {

    public Point pointA;
    public Point pointB;
    public Point pointC;

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
}
