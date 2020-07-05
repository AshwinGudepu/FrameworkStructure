package ExampleAutowiredByType;

public class Human {

    public Heart heartObject;

    public void setHeartObject(Heart heartObject) {
        this.heartObject = heartObject;
    }

    public void startPumping(){
        if(heartObject!=null){
            heartObject.pump();
        }else{
            System.out.println("You are dead");
        }
    }

}
